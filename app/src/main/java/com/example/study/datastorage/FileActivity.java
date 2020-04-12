package com.example.study.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.study.R;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileActivity extends AppCompatActivity {

    private EditText mEtname;
    private Button mbtnsave;
    private Button mbtnshow;
    private TextView mtvshow;
    private final String mFilename = "test.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_file );
        mEtname = findViewById( R.id.et_name );
        mbtnsave = findViewById( R.id.btn_save );
        mbtnshow = findViewById( R.id.btn_show );
        mtvshow = findViewById( R.id.tv_show );

        mbtnsave.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save(mEtname.getText().toString().trim());
            }
        } );

        mbtnsave.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtvshow.setText(read());
            }
        } );
    }

    private void save(String content){
        FileOutputStream fileoutputstream = null;
        try {
            fileoutputstream = openFileOutput( mFilename, MODE_PRIVATE );
            fileoutputstream.write( content.getBytes() );
//            fileoutputstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileoutputstream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String read(){
        FileInputStream fileinputstream = null;
        try {
            fileinputstream = openFileInput( mFilename );
            byte [] buff = new byte[1024];
            StringBuilder sb = new StringBuilder("");
            int len = 0;
            while ((len = fileinputstream.read(buff))>0){
                sb.append( new String(buff,0,len) );
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}

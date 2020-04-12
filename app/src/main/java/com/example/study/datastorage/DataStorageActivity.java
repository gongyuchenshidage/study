package com.example.study.datastorage;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.study.MainActivity;
import com.example.study.R;
import com.example.study.UIActivity;

public class DataStorageActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_data_storage );
        mFile = findViewById( R.id.btn_file );
        mFile.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_file:
                intent = new Intent( DataStorageActivity.this, FileActivity.class );
                break;
//            case R.id.btn_data:
//                intent = new Intent(MainActivity.this,DataStorageActivity.class);
//                break;
        }
        startActivity(intent);
    }
}

package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.study.datastorage.DataStorageActivity;

import util.ToastUtil;

public class MainActivity extends AppCompatActivity {


    private Button mbtnUI,mbtnData,mbtnEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_src );
        mbtnUI = findViewById( R.id.btn_ui );
        mbtnData = findViewById( R.id.btn_data );
        mbtnEvent = findViewById( R.id.btn_event );
        OnClick onClick = new OnClick();
        mbtnUI.setOnClickListener(onClick);
        mbtnData.setOnClickListener(onClick);
        mbtnEvent.setOnClickListener( onClick );

    }
    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_ui:
                    intent = new Intent(MainActivity.this,UIActivity.class);
                    ToastUtil.showMsg( MainActivity.this," github hello" );
                    break;
                case R.id.btn_data:
                    intent = new Intent(MainActivity.this,DataStorageActivity.class);
                    break;
                case R.id.btn_event:
                    intent = new Intent(MainActivity.this,EventActivity.class);
            }
            startActivity(intent);
        }
    }


}
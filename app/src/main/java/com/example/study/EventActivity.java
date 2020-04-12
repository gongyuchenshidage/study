package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EventActivity extends AppCompatActivity {

    private View mBtnEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_event );
        mBtnEvent = findViewById( R.id.btn1 );
        mBtnEvent.setOnClickListener( new Onclick() );

    }
    //内部类
    class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn1:
                    Toast.makeText( EventActivity.this,"click...",Toast.LENGTH_SHORT );
            }
        }
    }
}

package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mtv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_text_view );
        mtv4 = findViewById( R.id.tv3 );
        mtv4.getPaint().setFlags( Paint.STRIKE_THRU_TEXT_FLAG );//中划线
        mtv4.getPaint().setAntiAlias( true );//去除锯齿
    }
}

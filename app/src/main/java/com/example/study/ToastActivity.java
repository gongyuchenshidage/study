package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import util.ToastUtil;

public class ToastActivity extends AppCompatActivity {
    private Button mBtnToast1,mBtnToast2,mBtnToast3,mBtnToast4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.layout_toast );
        mBtnToast1 = findViewById( R.id.btn_toast_1 );
        mBtnToast2 = findViewById( R.id.btn_toast_2 );
        mBtnToast3 = findViewById( R.id.btn_toast_3 );
        mBtnToast4 = findViewById( R.id.btn_toast_4 );
        mBtnToast1.setOnClickListener( new Onclick() );
        mBtnToast2.setOnClickListener( new Onclick() );
        mBtnToast3.setOnClickListener( new Onclick() );
        mBtnToast4.setOnClickListener( new Onclick() );
    }
    class Onclick implements View.OnClickListener{
        //重写onClick方法
        //静态方法无法引用非静态的方法
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_toast_1:
                    Toast.makeText(getApplicationContext(),"普通Toast",Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_toast_2:
                    Toast toastcenter = Toast.makeText(getApplicationContext(),"居中Toast",Toast.LENGTH_LONG);
                    toastcenter.setGravity( Gravity.CENTER,0,0 );
                    toastcenter.show();
                    break;
                case R.id.btn_toast_3:
                    Toast toastcustom = new Toast( getApplicationContext() );
                    LayoutInflater inflater = LayoutInflater.from( ToastActivity.this);
//                    下面的返回值为View
                    View view = inflater.inflate( R.layout.layout_toast,null);
                    ImageView imageView = view.findViewById(R.id.tv_toast );
                    TextView textView = view.findViewById( R.id.iv_toast );
                    imageView.setImageResource( R.drawable.a );
                    textView.setText( "自定义Toast" );
                    toastcustom.setView(view);
                    toastcustom.show();
                    break;
                case R.id.btn_toast_4:
                    ToastUtil.showMsg(getApplicationContext(),"包装过的Toast");
                    break;
            }

        }
    }
}

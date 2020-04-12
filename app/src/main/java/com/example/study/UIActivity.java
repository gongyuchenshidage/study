package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UIActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnLifeCycle;
    private Button mBtnJump;
    private Button mBtnFragment;
    private Button mBtnRv;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnProgress;
    private Button mBtnCustomDialog;
    private Button mBtnPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_u_i );
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtnButton = (Button) findViewById(R.id.btn_button);
        mBtnEditText = (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton = (Button) findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = (Button) findViewById(R.id.btn_checkbox);
        mBtnImageView = (Button) findViewById(R.id.btn_imageview);
        mBtnListView = (Button) findViewById(R.id.btn_listview);
        mBtnGridView = (Button) findViewById(R.id.btn_gridview);
        mBtnLifeCycle = (Button) findViewById(R.id.btn_lifecycle);
        mBtnJump = (Button) findViewById(R.id.btn_jump);
        mBtnFragment = (Button) findViewById(R.id.btn_fragment);
        mBtnRv = (Button) findViewById(R.id.btn_recyclerview);
        mBtnWebView = (Button) findViewById(R.id.btn_webview);
        mBtnToast = (Button) findViewById(R.id.btn_toast);
        mBtnDialog = (Button) findViewById(R.id.btn_dialog);
        mBtnProgress = (Button) findViewById(R.id.btn_progress);
        mBtnCustomDialog = (Button) findViewById(R.id.btn_custom_dialog);
        mBtnPop = (Button) findViewById(R.id.btn_pop);
        setListeners();
    }
    private void setListeners() {
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnLifeCycle.setOnClickListener(onClick);
        mBtnJump.setOnClickListener(onClick);
        mBtnFragment.setOnClickListener(onClick);
        mBtnRv.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDialog.setOnClickListener(onClick);
        mBtnProgress.setOnClickListener(onClick);
        mBtnCustomDialog.setOnClickListener(onClick);
        mBtnPop.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_textview:
                    //跳转到TextView演示界面
                    intent = new Intent(UIActivity.this, TextViewActivity.class);
                    break;
//                case R.id.btn_button:
//                    //跳转到Button演示界面
//                    intent = new Intent(UIActivity.this, ButtonActivity.class);
//                    break;
//                case R.id.btn_edittext:
//                    //跳转到EditText演示界面
//                    intent = new Intent(UIActivity.this, EditTextActivity.class);
//                    break;
//                case R.id.btn_radiobutton:
//                    //跳转到RadioButton演示界面
//                    intent = new Intent(UIActivity.this, RadioButtonActivity.class);
//                    break;
//                case R.id.btn_checkbox:
//                    //跳转到CheckBox演示界面
//                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
//                    break;
//                case R.id.btn_imageview:
//                    //跳转到ImageView演示界面
//                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
//                    break;
//                case R.id.btn_listview:
//                    //跳转到ListView演示界面
//                    intent = new Intent(UIActivity.this, ListViewActivity.class);
//                    break;
//                case R.id.btn_gridview:
//                    //跳转到GridView演示界面
//                    intent = new Intent(UIActivity.this, GridViewActivity.class);
//                    break;
//                case R.id.btn_lifecycle:
//                    //跳转到LifeCycle演示界面
//                    intent = new Intent(UIActivity.this, LifeCycleActivity.class);
//                    break;
//                case R.id.btn_jump:
//                    //跳转到AActivity演示界面
//                    intent = new Intent(UIActivity.this, AActivity.class);
//                    break;
//                case R.id.btn_fragment:
//                    //跳转到Fragment演示界面
//                    intent = new Intent(UIActivity.this, ContainerActivity.class);
//                    break;
//                case R.id.btn_recyclerview:
//                    //跳转到RecyclerView演示界面
//                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
//                    break;
                case R.id.btn_webview:
                    //跳转到WebView演示界面
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    //跳转到Toast演示界面
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    //跳转到Dialog演示界面
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    break;
//                case R.id.btn_progress:
//                    //跳转到Progress演示界面
//                    intent = new Intent(UIActivity.this, ProgressActivity.class);
//                    break;
//                case R.id.btn_custom_dialog:
//                    //跳转到自定义Dialog演示界面
//                    intent = new Intent(UIActivity.this, CustomDialogActivity.class);
//                    break;
//                case R.id.btn_pop:
//                    //跳转到PopupWindow演示界面
//                    intent = new Intent(UIActivity.this, PopupWindowActivity.class);
//                    break;
            }
            startActivity(intent);
        }
    }
}

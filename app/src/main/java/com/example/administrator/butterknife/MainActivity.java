package com.example.administrator.butterknife;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity {
//    @BindView(R.id.button1)Button mButton1;
//    @BindView(R.id.button2)Button mButton2;
    @BindView(R.id.text1)TextView mTextView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.button1)
    public void onClick(){
        Toast.makeText(this,"button1",Toast.LENGTH_SHORT).show();
    }
    @OnClick({R.id.button1,R.id.button2})
    public void OnClick(Button button){
        switch (button.getId()){
            case R.id.button1:
                Toast.makeText(this,"button1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this,"button2",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this,"点击无效",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

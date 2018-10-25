package com.mmj.www.myeventcodeimplements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Button btn;
    Button btn1;
    Button btn2;
    Button btn3;
    TextView text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);//java의 Button에 xml의 버튼을 연결시킴
        btn1.setOnClickListener(this);//버튼에 이벤트리스너를 연결시킴
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        text5 = (TextView) findViewById(R.id.text5);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        String text;
//        if (view.getId()==R.id.btn1){
//            text = ((Button)view).getText().toString();
//           Toast.makeText(this,((Button)view).getText(),Toast.LENGTH_SHORT).show();
                switch (id){
                   case R.id.btn1:
                       text = ((Button)view).getText().toString();
                       break;
                   case R.id.btn2:
                       text = ((Button)view).getText().toString();
                       break;
                   case R.id.btn3:
                       text = ((Button)view).getText().toString();
                       break;
                   default: text = "noting!";
        }
        text5.setText(text);
    }
}

package com.cal.vj.cal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        Log.d("Activity Lifecycle","onCreate Called");



//        test = findViewById(R.id.button);
//
//        test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(MainActivity.this,"asss",Toast.LENGTH_LONG).show();
//                Intent page2 = new Intent(MainActivity.this, Page2.class );
//                startActivity(page2);
//                finish();
//
//            }
//        });
    }

    public void clear(View v){
        TextView tv1 = (TextView)findViewById(R.id.answer);
        tv1.setText("");
    }

    public void setNumber(View v){
        TextView tv1 = (TextView)findViewById(R.id.answer);
        switch(v.getId())
        {
            case R.id.one:
                tv1.append("1");
                break;
            case R.id.two:
                tv1.append("2");
                break;
            case R.id.three:
                tv1.append("3");
                break;
            case R.id.four:
                tv1.append("4");
                break;
            case R.id.five:
                tv1.append("5");
                break;
            case R.id.six:
                tv1.append("6");
                break;
            case R.id.seven:
                tv1.append("7");
                break;
            case R.id.eight:
                tv1.append("8");
                break;
            case R.id.nine:
                tv1.append("9");
                break;
            case R.id.zero:
                tv1.append("0");
                break;
            case R.id.plus:
                tv1.append("+");
                break;
            case R.id.minus:
                tv1.append("-");
                break;
            case R.id.multiply:
                tv1.append("*");
                break;
            case R.id.divide:
                tv1.append("/");
                break;
            case R.id.enter:
                
                break;
            default:
                throw new RuntimeException("Unknow button ID");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Lifecycle","onStart Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Lifecycle","onRestart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Lifecycle","onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Lifecycle","onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Lifecycle","onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Lifecycle","onDestroy Called");
    }
}

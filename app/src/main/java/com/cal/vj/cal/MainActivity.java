package com.cal.vj.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num1,num2;
    int op = 0;
    int plus = 0, mul = 0, div =0,min=0;
    int result;
    String val;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        Log.d("Activity Lifecycle","onCreate Called");

        try{
            init();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void init() {
        tv1 = findViewById(R.id.answer);
    }


    public void clear(View v){
        tv1.setText("");
        op = 0;
        plus = 0;
        mul = 0;
        min = 0;
        div = 0;
        result = 0;
    }

    public void setNumber(View v){
        if (op == 0){
            switch(v.getId())
            {
                case R.id.one:
                    tv1.append(""+1);
                    break;
                case R.id.two:
                    tv1.append(""+2);
                    break;
                case R.id.three:
                    tv1.append(""+3);
                    break;
                case R.id.four:
                    tv1.append(""+4);
                    break;
                case R.id.five:
                    tv1.append(""+5);
                    break;
                case R.id.six:
                    tv1.append(""+6);
                    break;
                case R.id.seven:
                    tv1.append(""+7);
                    break;
                case R.id.eight:
                    tv1.append(""+8);
                    break;
                case R.id.nine:
                    tv1.append(""+9);
                    break;
                case R.id.zero:
                    tv1.append(""+0);
                    break;
                default:
                    throw new RuntimeException("Unknow button ID");
            }
        }

        if (op == 1){
            switch(v.getId())
            {
                case R.id.one:
                    tv1.append(""+1);
                    break;
                case R.id.two:
                    tv1.append(""+2);
                    break;
                case R.id.three:
                    tv1.append(""+3);
                    break;
                case R.id.four:
                    tv1.append(""+4);
                    break;
                case R.id.five:
                    tv1.append(""+5);
                    break;
                case R.id.six:
                    tv1.append(""+6);
                    break;
                case R.id.seven:
                    tv1.append(""+7);
                    break;
                case R.id.eight:
                    tv1.append(""+8);
                    break;
                case R.id.nine:
                    tv1.append(""+9);
                    break;
                case R.id.zero:
                    tv1.append(""+0);
                    break;
                default:
                    throw new RuntimeException("Unknow button ID");
            }
        }

    }

    public void opPlus(View v){
        if (plus != 1 && op != 1) {
            switch (v.getId()){
                case R.id.plus:
                    num1 = Integer.parseInt(tv1.getText().toString()) ;
                    tv1.append("+");
                    plus = 1;
                    op = 1;
                    break;

                default:
                    throw new RuntimeException("Unknow button ID");
            }
        }else {
            Toast.makeText(MainActivity.this," Opperator used",Toast.LENGTH_SHORT).show();
        }
    }

    public void opMul(View v){
        if (mul != 1 && op != 1) {
            switch (v.getId()){
                case R.id.multiply:
                    num1 = Integer.parseInt(tv1.getText().toString());
                    tv1.append("*");
                    mul = 1;
                    op = 1;
                    break;

                default:
                    throw new RuntimeException("Unknow button ID");
            }
        }else {
            Toast.makeText(MainActivity.this," Opperator used",Toast.LENGTH_LONG).show();
        }
    }

    public void opDiv(View v){
        if (div != 1 && op != 1) {
            switch (v.getId()){
                case R.id.divide:
                    num1 = Integer.parseInt(tv1.getText().toString());
                    tv1.append("/");
                    div = 1;
                    op = 1;
                    break;

                default:
                    throw new RuntimeException("Unknow button ID");
            }
        }else {
            Toast.makeText(MainActivity.this," Opperator used",Toast.LENGTH_LONG).show();
        }
    }

    public void opSub(View v){
        if (min != 1 && op != 1) {
            switch (v.getId()){
                case R.id.minus:
                    num1 = Integer.parseInt(tv1.getText().toString());
                    tv1.append("-");
                    min = 1;
                    op = 1;
                    break;

                default:
                    throw new RuntimeException("Unknow button ID");
            }
        }else {
            Toast.makeText(MainActivity.this," Opperator used",Toast.LENGTH_LONG).show();
        }
    }

    public void onEnter(View v){
        if (plus == 1){

            val = tv1.getText().toString();
            num2 = Integer.parseInt( val.substring(val.lastIndexOf("+") + 1) ) ;

            result = num1 + num2;
            tv1.setText(""+result);
            plus = 0;
            op = 0;
            num1 = result;
        }
        if (mul == 1){

            val = tv1.getText().toString();
            num2 = Integer.parseInt( val.substring(val.lastIndexOf("*") + 1) ) ;

            result = num1 * num2;
            tv1.setText(""+result);
            mul = 0;
            op = 0;
            num1 = result;
        }
        if (div == 1){
            val = tv1.getText().toString();
            num2 = Integer.parseInt( val.substring(val.lastIndexOf("/") + 1) ) ;
            result = num1 / num2;
            tv1.setText(""+result);
            div = 0;
            op = 0;
            num1 = result;
        }
        if (min == 1){
            val = tv1.getText().toString();
            num2 = Integer.parseInt( val.substring(val.lastIndexOf("-") + 1) ) ;
            result = num1 - num2;
            tv1.setText(""+result);
            min = 0;
            op = 0;
            num1 = result;
        }
    }







//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d("Activity Lifecycle","onStart Called");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d("Activity Lifecycle","onRestart Called");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d("Activity Lifecycle","onResume Called");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("Activity Lifecycle","onPause Called");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d("Activity Lifecycle","onStop Called");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("Activity Lifecycle","onDestroy Called");
//    }
}

package com.cal.vj.cal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity Lifecycle","onCreate Called");

        test = findViewById(R.id.button);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"asss",Toast.LENGTH_LONG).show();
                Intent page2 = new Intent(MainActivity.this, Page2.class );
                startActivity(page2);
                finish();

            }
        });
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

package com.example.cossb.myapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("mylog", "OnCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("mylog", "OnStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("mylog", "OnResume");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("mylog", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("mylog", "OnStop");
    }

    @Override
    protected void onDestroy() {
        Log.e("mylog", "OnDestroy");
        super.onDestroy();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("mylog", "OnRestart");
    }

    public void click(View view){
        Intent intent = new Intent(this, Main2Activity.class);

}

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);




    }

    public MainActivity() {
    }
}


package com.hy.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

     private static final String TAG = "Main2Activity";

     TextView text;
     StringBuilder stringBuilder;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          Log.e(TAG, "---->----onCreate---->-----");
          setContentView(R.layout.activity_main2);

          stringBuilder = new StringBuilder();
          text = (TextView) findViewById(R.id.text);
          text.setText(stringBuilder.append("\nonCreate\n"));

          findViewById(R.id.backBtn).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.putExtra("data", "---BACK---");
                    setResult(RESULT_OK, intent);
                    finish();
               }
          });
     }

     @Override
     protected void onStart() {
          super.onStart();
          Log.e(TAG, "---->----onStart---->-----");
          text.setText(stringBuilder.append("\nonStart\n"));
     }

     @Override
     protected void onResume() {
          super.onResume();
          Log.e(TAG, "---->----onResume---->-----");
          text.setText(stringBuilder.append("\nonResume\n"));
     }

     @Override
     protected void onPause() {
          super.onPause();
          Log.e(TAG, "---->----onPause---->-----");
          text.setText(stringBuilder.append("\nonPause\n"));
     }

     @Override
     protected void onStop() {
          super.onStop();
          Log.e(TAG, "---->----onStop---->-----");
          text.setText(stringBuilder.append("\nonStop\n"));
     }

     @Override
     protected void onDestroy() {
          super.onDestroy();
          Log.e(TAG, "---->----onDestroy---->-----");
          text.setText(stringBuilder.append("\nonDestroy\n"));
     }

     @Override
     protected void onRestart() {
          super.onRestart();
          Log.e(TAG, "---->----onRestart---->-----");
          text.setText(stringBuilder.append("\nonRestart\n"));
     }
}

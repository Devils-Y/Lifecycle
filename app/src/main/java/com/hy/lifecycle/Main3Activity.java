package com.hy.lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

     private static final String TAG = "Main3Activity";

     TextView textView;
     StringBuilder stringBuilder;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          Log.e(TAG, "----->----onCreate---->----");
          setContentView(R.layout.activity_main3);

          stringBuilder = new StringBuilder();
          textView = (TextView) findViewById(R.id.text);
          textView.setText(stringBuilder.append("\nonCreate\n"));

          findViewById(R.id.backBtn).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                    finish();
               }
          });
     }

     @Override
     protected void onStart() {
          super.onStart();
          Log.e(TAG, "----->----onStart---->----");
          textView.setText(stringBuilder.append("\nonStart\n"));
     }

     @Override
     protected void onResume() {
          super.onResume();
          Log.e(TAG, "----->----onResume---->----");
          textView.setText(stringBuilder.append("\nonResume\n"));
     }

     @Override
     protected void onRestart() {
          super.onRestart();
          Log.e(TAG, "----->----onRestart---->----");
          textView.setText(stringBuilder.append("\nonRestart\n"));
     }

     @Override
     protected void onPause() {
          super.onPause();
          Log.e(TAG, "----->----onPause---->----");
          textView.setText(stringBuilder.append("\nonPause\n"));
     }

     @Override
     protected void onStop() {
          super.onStop();
          Log.e(TAG, "----->----onStop---->----");
          textView.setText(stringBuilder.append("\nonStop\n"));
     }

     @Override
     protected void onDestroy() {
          super.onDestroy();
          Log.e(TAG, "----->----onDestroy---->----");
          textView.setText(stringBuilder.append("\nonDestroy\n"));
     }
}

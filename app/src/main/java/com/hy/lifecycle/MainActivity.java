package com.hy.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     private static final String TAG = "MainActivity";

     private static final int REQUESTCODE = 1000;

     TextView textView;
     StringBuilder stringBuilder;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          Log.e(TAG, "----->----onCreate---->----");
          setContentView(R.layout.activity_main);

          stringBuilder = new StringBuilder();
          textView = (TextView) findViewById(R.id.text);
          textView.setText(stringBuilder.append("\nonCreate\n"));

          findViewById(R.id.toBtn).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
//                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    startActivityForResult(new Intent(MainActivity.this, Main2Activity.class), REQUESTCODE);
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

     @Override
     protected void onActivityResult(int requestCode, int resultCode, Intent data) {
          super.onActivityResult(requestCode, resultCode, data);
          if (requestCode == REQUESTCODE && resultCode == RESULT_OK) {
               textView.setText(stringBuilder.append(data.getStringExtra("data")));
          }
     }
}

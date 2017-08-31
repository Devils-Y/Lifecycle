package com.hy.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

     private static final String TAG = "MainActivity";

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          Log.e(TAG, "----->----onCreate---->----");
          setContentView(R.layout.activity_main);

          findViewById(R.id.toBtn).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
               }
          });
     }

     @Override
     protected void onStart() {
          super.onStart();
          Log.e(TAG, "----->----onStart---->----");
     }

     @Override
     protected void onResume() {
          super.onResume();
          Log.e(TAG, "----->----onResume---->----");
     }

     @Override
     protected void onRestart() {
          super.onRestart();
          Log.e(TAG, "----->----onRestart---->----");
     }

     @Override
     protected void onPause() {
          super.onPause();
          Log.e(TAG, "----->----onPause---->----");
     }

     @Override
     protected void onStop() {
          super.onStop();
          Log.e(TAG, "----->----onStop---->----");
     }

     @Override
     protected void onDestroy() {
          super.onDestroy();
          Log.e(TAG, "----->----onDestroy---->----");
     }
}

package com.hy.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_home);

          findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                    startActivity(new Intent(HomeActivity.this, MainActivity.class));
               }
          });

          findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                    startActivity(new Intent(HomeActivity.this, Main3Activity.class));
               }
          });

          findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                    startActivity(new Intent(HomeActivity.this, Main4Activity.class));
               }
          });
     }
}

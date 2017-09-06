package com.hy.lifecycle;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

     Main4FragmentOne main4FragmentOne;
     Main4FragmentTwo main4FragmentTwo;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main4);

          main4FragmentOne = new Main4FragmentOne();
          main4FragmentTwo = new Main4FragmentTwo();

          FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
          fragmentTransaction.replace(R.id.container, main4FragmentOne);
          fragmentTransaction.commitAllowingStateLoss();

          //为Main4FragmentOne添加点击事件
          main4FragmentOne.setOnButtonClick(new Main4FragmentOne.OnButtonClick() {
               @Override
               public void onButtonClick(View view) {
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.container, main4FragmentTwo);
                    fragmentTransaction.commitAllowingStateLoss();
               }
          });

          main4FragmentTwo.setOnButtonClick(new Main4FragmentTwo.OnButtonClick() {
               @Override
               public void onButtonClick(View view) {
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.container, main4FragmentOne);
                    fragmentTransaction.commitAllowingStateLoss();
               }
          });
     }
}

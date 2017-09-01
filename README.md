##Android生命周期的研究

    进入MainActivity时,生命周期执行顺序为:

onCreate(MainActivity)

onStart(MainActivity)

onResume(MainActivity)

    当点击"新页面"按钮后,生命周期执行顺序为:

onPause(MainActivity)

 **onCreate(Main2Activity)*

 **onStart(Main2Activity)*

 **onResume(Main2Activity)*
 
onStop(MainActivity)

    当点击"BACK"按钮后,生命周期执行顺序为:
    
 **onPause(Main2Activity)*

onRestart(MainActivity)

onStart(MainActivity)

onResume(MainActivity)

 **onStop(Main2Activity)*
 
 **onDestroy(Main2Activity)*
 
 


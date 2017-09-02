##Android生命周期的研究

 ###MainActivity跳转到Main2Activity，再返回的生命周期

    进入MainActivity时,生命周期执行顺序为:

onCreate(MainActivity)

onStart(MainActivity)

onResume(MainActivity)

![](https://github.com/huxiaozi/Lifecycle/blob/master/app/art/MainActivity_in.png)

    当点击"新页面"按钮后,生命周期执行顺序为:

onPause(MainActivity)

 **onCreate(Main2Activity)*

 **onStart(Main2Activity)*

 **onResume(Main2Activity)*
 
onStop(MainActivity)

![](https://github.com/huxiaozi/Lifecycle/blob/master/app/art/Main2Activity_in.png)

    当点击"BACK"按钮后,生命周期执行顺序为:
    
 **onPause(Main2Activity)*

onRestart(MainActivity)

onStart(MainActivity)

onResume(MainActivity)

 **onStop(Main2Activity)*
 
 **onDestroy(Main2Activity)*
 
 ![](https://github.com/huxiaozi/Lifecycle/blob/master/app/art/Main2Activity_back.png)
 
###总结后如下图所示
 
 ![](https://github.com/huxiaozi/Lifecycle/blob/master/app/art/Activity_lifeCycle.png)
 


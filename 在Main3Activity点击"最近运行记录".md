    进入Main3Activity时,生命周期执行顺序为:

onCreate(MainActivity)

onStart(MainActivity)

onResume(MainActivity)

![](https://github.com/huxiaozi/Lifecycle/blob/master/app/art/MainActivity_in.png)

    当点击"最近运行记录"按钮后,生命周期执行顺序为:
    
onPause(MainActivity)

onStop(MainActivity)

![](https://github.com/huxiaozi/Lifecycle/blob/master/app/art/Running_record.png)

##总结后如下图所示

![](https://github.com/huxiaozi/Lifecycle/blob/master/app/art/Running_record.png)
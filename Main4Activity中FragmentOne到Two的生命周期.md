    进入Main4Activity时,Main4FragmentOne生命周期执行顺序为:

onAttach(Main4FragmentOne)

onCreate(Main4FragmentOne)

onCreateView(Main4FragmentOne)

onActivityCreated(Main4FragmentOne)

onStart(Main4FragmentOne)

onResume(Main4FragmentOne)

    当点击"下一个Fragment"按钮后,生命周期执行顺序为:

 **onAttach(Main4FragmentTwo)*

 **onCreate(Main4FragmentTwo)*

onPause(Main4FragmentOne)
 
onStop(Main4FragmentOne)

onDestroyView(Main4FragmentOne)
 
onDestroy(Main4FragmentOne)

onDetach(Main4FragmentOne)

 **onCreateView(Main4FragmentTwo)*

 **onActivityCreated(Main4FragmentTwo)*

 **onStart(Main4FragmentTwo)*

 **onResume(Main4FragmentTwo)*
 
##总结后如下图所示
    
    注意:当进入第二个Fragment时，并不是如Activity一样，
         直接执行第一个Fragemnt的onPause方法，而是先执行
         第二个Fragment里的onAttach和onCreate方法后
         再执行第一个Fragemnt的onPause方法。
 
 ![](https://github.com/huxiaozi/Lifecycle/blob/master/app/art/Fragment_replace_lifeCycle.png)
 
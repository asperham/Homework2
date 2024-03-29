## View Pager

# Introduction
View pager is a layout manager that allows the user to slide left and right through pages of data. For example, on the home screen, it allows the user to slide from left to right to another screen showing several applications that the use can open. View Pager is most often used with fragment, which it uses to supply and manage the lifecycle of the pages. There are also FragmentPagerAdapter and FragmentStatePagerAdapter which are adapter classes that view pager most commonly uses. View pager is most commonly used to simply slide from one screen to another. However, viewPager has a lot of options when it comes to UI design. ViewPager has a zoom-out page transformer that zooms the current view out before transitioning the next view. This can make the UI look for sharp and appealing to users. There is also a depth page transformer that has the child view under the current view. When the current view slides off the screen, the child view will rise from under the current view. There also exists several third-party libraries that can be used with viewPager. For example, ViewPagerTransforms library has more options such as a rotating transition from views. You can also construct your own transformers if the ones that do exists don’t fit the needs of your application. With view pager, you can use also use tabs rather than sliding to display another view and view transformers will also work with this option. 

# History
View pager was introduced in version 22.1.0 which was released on April 2015. View pager is part of the Maven artifact com.android.support:viewpager:28.0.0-alpha1 and can be found in java.lang.Object -> android.view.View -> android.view.ViewGroup -> android.support.v4.view.ViewPager. This package was part of API 4 and can be used API 4+. 

# Major methods/attributes 
Some of the major public methods are used to control several aspects of the view pager. addFocuasables(ArrayList<View> Views, int direction, int focusableMode) is used to make the current page (views) focusable. addOnPageChangeListener (ViewPager.OnPageChangeListener listener) adds a listener that will be invoked when ViewPager changes. addTouchables (ArrayList<View> views) makes the current view (VIews) have touchable elements. arrowScroll (int direction) is a scroll handler that response to a left or right arrow click. beingFakeDrag is used to synchronize the motion between two screens. The viewPager controls the snapping and fling behavior. This essentially allows you so slide to another screen rather than press a button to get to the adjacent screen. You can also use endFakeDrag() to preform scrolling from a key event. getAdapter() is useful as it returns the current adapter such as FragmentPagerAdapter, or FragmentStatePagerAdapter. setAdapter(PagerAdapter adapter) is used to set the current adapter for the page.  getOffscrenPageLimit() is used to get the number of pages that will be present on either side of the current screen. They all have an idle state that defaults to 1. These are public methods are more significant to control viewPager as it allows you to control page events. An important Protected methods are also used with viewPager. canScroll(view, Boolean checkV, int dx, int x, int y) is used to test the scroll inside child views (view) of the current view pager. All of the other private methods are used to test views and are not necessarily necessarily used as much as the other methods mentioned above

# Code 
The app can be found at: https://github.com/asperham/Homework2/tree/master/ViewPager 

# References
ViewPager  :   Android Developers. (n.d.). Retrieved December 5, 2019, from https://developer.android.com/reference/android/support/v4/view/ViewPager. 

Slide between fragments using ViewPager  :   Android Developers. (n.d.). Retrieved December 5, 2019, from https://developer.android.com/training/animation/screen-slide. 



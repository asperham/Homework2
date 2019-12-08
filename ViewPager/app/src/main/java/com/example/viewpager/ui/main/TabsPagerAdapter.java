package com.example.viewpager.ui.main;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.viewpager.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

  @StringRes
  private static final int[] TAB_TITLES =
      new int[] { R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3 };
  private final Context mContext;

  public TabsPagerAdapter(Context context, FragmentManager fm) {
    super(fm);
    mContext = context;
  }

  @Override
  //changes position based in input
  public Fragment getItem(int position) {
    switch (position) {
      case 0:
        return Tab1.newInstance();
      case 1:
        return Tab2.newInstance();
      case 2:
        return Tab3.newInstance();
      default:
        return null;
    }
  }

  @Nullable
  @Override
  //return title of view
  public CharSequence getPageTitle(int position) {
    return mContext.getResources().getString(TAB_TITLES[position]);
  }

  @Override
  //getting the count of total views
  public int getCount() {
    // Show 3 total pages.
    return 3;
  }
}
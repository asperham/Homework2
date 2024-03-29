package com.example.viewpager.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
//array list for fragments
  private MutableLiveData<String> mTitle = new MutableLiveData<>();
//changing text based in view
  private LiveData<String> mText = Transformations.map(mTitle, new Function<String, String>() {
    @Override
    public String apply(String input) {
      return input;
    }
  });
 //setting index
  public void setIndex(String index) {
    mTitle.setValue(index);
  }
  //array for current data
  public LiveData<String> getText() {
    return mText;
  }
}
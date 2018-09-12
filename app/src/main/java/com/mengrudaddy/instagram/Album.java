package com.mengrudaddy.instagram;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.mengrudaddy.instagram.utils.BottomSwitchHelper;

public class Album extends AppCompatActivity{
    private static final String TAG = "Photo";
    private static final int ACTIVITY_NUM=0;
    private Context context=Album.this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        setUpBottomSwitchView();
        //overridePendingTransition(R.anim.slide_left, R.anim.slide_right);


    }

    public void close(View view) {
        finish();

    }
    private void setUpBottomSwitchView(){
        BottomNavigationViewEx bt_switch = findViewById(R.id.bottom_switch);
        Log.d(TAG, "setUpBottomSwitchView: "+bt_switch);
        //BottomSwitchHelper.setUp(bt_switch);
        BottomSwitchHelper.SwitchEnable(context,bt_switch);
        Menu menu = bt_switch.getMenu();
        MenuItem mItem = menu.getItem(ACTIVITY_NUM);
        mItem.setChecked(true) ;
    }
}

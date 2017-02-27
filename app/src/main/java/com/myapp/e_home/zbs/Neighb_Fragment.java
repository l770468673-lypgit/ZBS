package com.myapp.e_home.zbs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * @
 * @类名称: ${type_name}
 * @类描述: ${todo}
 * @创建人：
 * @创建时间：${date} ${time}
 * @备注：
 */
public class Neighb_Fragment extends Fragment implements View.OnClickListener {

    private static final String TAG = "Neighb_Fragment";
    private LinearLayout neighbour_rgb,cleancash;   // radiogroup

     public static TextView user_own_setting_name;

    private LinearLayout opendoorRecord;
    private LinearLayout keymessage;
    private LinearLayout checkupdate;
    //  private LinearLayout tellsetting;
    private LinearLayout abouthelp;
    //  private LinearLayout onlysetting;
    private Intent mOnenintent;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.neighbfragment, container, false);

        initView(inflate);


        return inflate;
    }


    private void initView(View view) {

         cleancash = (LinearLayout) view.findViewById(R.id.cleancash);
        cleancash.setOnClickListener(this);

        user_own_setting_name = (TextView) view.findViewById(R.id.user_own_setting_name);


        opendoorRecord = (LinearLayout) view.findViewById(R.id.opendoorRecord);
        checkupdate = (LinearLayout) view.findViewById(R.id.checkupdate);
        keymessage = (LinearLayout) view.findViewById(R.id.keymessage);
        //  tellsetting = (LinearLayout) view.findViewById(R.id.tellsetting);
        abouthelp = (LinearLayout) view.findViewById(R.id.abouthelp);

        opendoorRecord.setOnClickListener(this);
        keymessage.setOnClickListener(this);
        //   tellsetting.setOnClickListener(this);
        abouthelp.setOnClickListener(this);
        checkupdate.setOnClickListener(this);
        //       onlysetting.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        int checkedId = v.getId();
        switch (checkedId) {


        }
    }



}

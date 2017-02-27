package com.myapp.e_home.zbs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;






/**
 * @
 * @类名称: ${type_name}
 * @类描述: ${todo}
 * @创建人：
 * @创建时间：${date} ${time}
 * @备注：
 */
public class Home_Fragment extends Fragment implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    private static final String TAG = "Home_Fragment";



     private TabLayout hometab;
     private ViewPager home_message_vvp;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.homefragment, container, false);

         // 控件初始化
        initview(inflate);

        return inflate;
    }



    private void initview(View view) {


        home_message_vvp = (ViewPager) view.findViewById(R.id.home_message_vvp);
        hometab = (TabLayout) view.findViewById(R.id.hometab);
         List<String> tablist = new ArrayList<>();
        tablist.add("回放");
        tablist.add("热门");
        tablist.add("更新");

        List<Fragment> fragmentslist = new ArrayList<>();
        fragmentslist.add(Punlic_messageFragment.newInstance());
        fragmentslist.add(Private_messageFragment.newInstance());
        fragmentslist.add(Search_messageFragment.newInstance());


        Home_MessageAdapter adapter = new Home_MessageAdapter(getActivity(), fragmentslist, tablist);

        home_message_vvp.setAdapter(adapter);

        home_message_vvp.setOffscreenPageLimit(2);
        home_message_vvp.setCurrentItem(0);
        // 协同布局
        hometab.setupWithViewPager(home_message_vvp);
        hometab.setTabsFromPagerAdapter(adapter);

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {


        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {

        }
    }




}

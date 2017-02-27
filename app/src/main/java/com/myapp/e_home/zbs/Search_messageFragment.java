package com.myapp.e_home.zbs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * @
 * @类名称: ${}
 * @类描述: ${type_name}
 * @创建人： Lyp
 * @创建时间：${date} ${time}
 * @备注：
 */
public class Search_messageFragment extends Fragment {
    private static final String TAG = "Punlic_messageFragment";

    private ListView publicmessage;

    private TextView message_list_textnull;

    public static Fragment newInstance() {

        Bundle args = new Bundle();
        Search_messageFragment fragment = new Search_messageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.searchmessage, container, false);
        init(inflate);


        return inflate;

    }



    private void init(View inflate) {
        publicmessage = (ListView) inflate.findViewById(R.id.publicmessage);
        message_list_textnull = (TextView) inflate.findViewById(R.id.message_list_textnull);
    //    publicmessage.setEmptyView(inflate.findViewById(R.id.message_list_textnull));
    }

}

package com.example.safeguard.MainHome.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.safeguard.R;

import org.w3c.dom.Text;

public class HomeAdaper extends BaseAdapter {
    int[] iamgeId = {R.drawable.safe,R.drawable.callmsgsafe,R.drawable.app,R.drawable.trojan,R.drawable.sysoptimize
            ,R.drawable.taskmanager,R.drawable.netmanager,R.drawable.atools,R.drawable.settings};

    String[] names={"手机防盗","通讯卫士","软件管家","手机杀毒","缓存清理",
            "进程管理","流量统计","高级工具","设置中心"};

    private Context context;
    public HomeAdaper(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 9;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context,R.layout.item_home,null);
        ImageView iv_icon = (ImageView)view.findViewById(R.id.iv_icon);
        TextView tv_name = (TextView)view.findViewById(R.id.tv_name);
        iv_icon.setImageResource(iamgeId[position]);
        tv_name.setText(names[position]);
        return view;

    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}

package com.example.administrator.msplayer.online;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.msplayer.BaseFragment;
import com.example.administrator.msplayer.MainActivity;
import com.example.administrator.msplayer.R;

/**
 * Created by Administrator on 2016/6/3.
 */
public class OnlineFragment extends BaseFragment {
    private static final int OnlineFragmentIndex = 1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_online,container,false);
        v.setBackgroundResource(BG_IDS[OnlineFragmentIndex]);
        return v;
    }
    public static OnlineFragment newInstance(String title) {
        OnlineFragment f = new OnlineFragment();
        Bundle b = new Bundle();
        b.putString(MainActivity.FRAGMENT_TITLE, title);
        f.setArguments(b);
        return f;
    }
    /**
     * 提供当前Fragment的主色调的Bitmap对象,供Palette解析颜色
     *
     * @return
     */
    public static int getBackgroundBitmapPosition(int selectViewPagerItem) {
        return BG_IDS[selectViewPagerItem];
    }

}

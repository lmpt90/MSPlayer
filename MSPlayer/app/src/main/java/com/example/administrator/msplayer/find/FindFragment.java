package com.example.administrator.msplayer.find;

import android.graphics.Bitmap;
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
public class FindFragment extends BaseFragment {
    private static final int FindFragmentIndex = 2;
    private String title = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        title = getArguments().getString(MainActivity.FRAGMENT_TITLE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View parent = inflater.inflate(R.layout.fragment_find, container, false);
        parent.setBackgroundResource(BG_IDS[FindFragmentIndex]);
        return parent;
    }

    public static FindFragment newInstance(String title) {
        FindFragment f = new FindFragment();
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

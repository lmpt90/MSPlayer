package com.example.administrator.msplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/6/3.
 */
public class BaseFragment extends Fragment{
    public static final int BG_IDS[] = {R.mipmap.bg1,R.mipmap.bg2,R.mipmap.bg3};
    private static final String ARG_POSITION = "position";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return super.onCreateView(inflater, container, savedInstanceState);
    }
    public static BaseFragment newInstance(int position) {
        BaseFragment f = new BaseFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }
//    public interface ColorSwitch{
//        public int getBg(int position);
//    }
    /**
     * 提供当前Fragment的主色调的Bitmap对象,供Palette解析颜色
     *
     * @return
     */
    public static int getBackgroundBitmapPosition(int selectViewPagerItem) {
        return 0;
    }

}

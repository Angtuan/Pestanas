package com.example.espi.app;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    List<FragmentPageDefinition> _items;

    public ViewPagerAdapter(FragmentManager fm, List<FragmentPageDefinition> items) {
        super(fm);
        this._items = items;
    }

    @Override
    public Fragment getItem(int position) {
        return this._items.get(position).get_fragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this._items.get(position).get_title();
    }

    @Override
    public int getCount() {
        return this._items.size();
    }
}


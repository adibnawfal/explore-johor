package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TopAttractionsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new ShoppingMallsFragment();
            case 3:
                return new EventsFragment();
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_top_attractions);
            case 1:
                return mContext.getString(R.string.category_retaurants);
            case 2:
                return mContext.getString(R.string.category_shopping_malls);
            case 3:
                return mContext.getString(R.string.category_events);
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 4;
    }
}

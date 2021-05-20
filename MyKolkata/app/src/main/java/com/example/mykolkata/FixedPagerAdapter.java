package com.example.mykolkata;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FixedPagerAdapter extends FragmentStateAdapter {
    public FixedPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new ActivitiesFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new RestaurantsFragment();
            default:
                return new TopAttractionsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}

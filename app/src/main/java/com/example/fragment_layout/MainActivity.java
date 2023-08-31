package com.example.fragment_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fragment_layout.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Pager_Adapter adapter = new Pager_Adapter(getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;

        adapter.addFragment(new Fragment_One(),"Tab-1");
        adapter.addFragment(new Fragment_Two(),"Tab-2");
        adapter.addFragment(new Fragment_Three(),"Tab-3");

        viewPager.setAdapter(adapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
    }
}
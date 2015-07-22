package io.dragh.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageButton;

import io.dragh.myapplication.fragments.AmigosFragment;
import io.dragh.myapplication.fragments.Destacados;
import io.dragh.myapplication.fragments.ProfileFragment;


public class MyMusic extends Activity implements ActionBar.TabListener {

    private Fragment[] fragments = new Fragment[]{
            new Destacados(),
            new AmigosFragment(),
            new ProfileFragment()
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        setTabs();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        for (Fragment f : fragments)
            fragmentTransaction.add(R.id.main_music, f).hide(f);

        fragmentTransaction.show(fragments[0]).commit();

        ImageButton imageButton = (ImageButton) findViewById(R.id.fab_1);
        imageButton.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                int size = getResources().getDimensionPixelSize(R.dimen.fab_size);
                outline.setOval(0, 0, size, size);
            }
        });

    }

    private void setTabs(){
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("Destacados").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Amigos").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Perfil").setTabListener(this));
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        for (Fragment f : fragments)
            ft.hide(f);
        ft.show(fragments[tab.getPosition()]);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}

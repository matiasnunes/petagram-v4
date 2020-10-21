package com.mnunes.petagram;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.mnunes.petagram.adapter.PageAdapter;
import com.mnunes.petagram.fragment.PerfilFragment;
import com.mnunes.petagram.fragment.RecyclerViewFragment;
import com.mnunes.petagram.pojo.ActivityAcercaDe;
import com.mnunes.petagram.pojo.ActivityContacto;
import com.mnunes.petagram.pojo.MascotasLiked;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        setUpViewPager();


        if ( toolbar == null )
        {
            setSupportActionBar(toolbar);
        }

    }

    private ArrayList<Fragment> agregarFragments() {

        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add( new RecyclerViewFragment());
        fragments.add( new PerfilFragment());
        return fragments;
    }
    private void setUpViewPager() {
        viewPager.setAdapter(new PageAdapter( getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_lista);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_perfil);
    }



    public void verMascotasLiked( View v ){
        Intent intent = new Intent(this, MascotasLiked.class );
        startActivity( intent );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent i;
        switch (item.getItemId())
        {
            case R.id.menuContacto:

                i = new Intent(this, ActivityContacto.class );
                startActivity(i);
                break;

            case R.id.menuAcercaDe:
                i = new Intent(this, ActivityAcercaDe.class );
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
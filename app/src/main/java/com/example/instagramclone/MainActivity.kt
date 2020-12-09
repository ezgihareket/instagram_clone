package com.example.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.example.instagramclone.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }

        val bottomNavigation: AHBottomNavigation = findViewById(R.id.bottom_navigation)

        val tabHome =AHBottomNavigationItem( "",R.drawable.ic_home,R.color.colorPrimary)
        val tabSearch= AHBottomNavigationItem("", R.drawable.ic_search, R.color.colorPrimary)
        val tabAdd =AHBottomNavigationItem("", R.drawable.ic_add_box, R.color.colorPrimary)
        val tabLike=AHBottomNavigationItem("", R.drawable.ic_favorite,R.color.colorPrimary)
        val tabProfile =AHBottomNavigationItem("",R.drawable.ic_perm_identity,R.color.colorPrimary)

        bottomNavigation.addItem(tabHome);
        bottomNavigation.addItem(tabSearch);
        bottomNavigation.addItem(tabAdd);
        bottomNavigation.addItem(tabLike);
        bottomNavigation.addItem(tabProfile);

    }
}
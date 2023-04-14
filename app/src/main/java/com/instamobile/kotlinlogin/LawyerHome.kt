package com.instamobile.kotlinlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.navigation.NavigationView

class LawyerHome : AppCompatActivity() {private lateinit var appToolBar: Toolbar

    private lateinit var drawerLayout: DrawerLayout

    private lateinit var navController: NavController

    private lateinit var navView: NavigationView

    private lateinit var headerView: View


    private lateinit var usernameHeader: TextView

    private lateinit var levelHeader: TextView

    private lateinit var logout: TextView

    private lateinit var badgeDrawable: BadgeDrawable

    private lateinit var navHostFragment: NavHostFragment

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lawyer_home)
        appToolBar = findViewById(R.id.mainToolBar)
        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)
        logout = findViewById(R.id.logout)
        logout.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        navController = navHostFragment.navController

        setSupportActionBar(appToolBar)

        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)

        setupActionBarWithNavController(navController, appBarConfiguration)

        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)

        drawerLayout.addDrawerListener(actionBarDrawerToggle)

        actionBarDrawerToggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setupWithNavController(navController)

        headerView = navView.getHeaderView(0)

        usernameHeader = headerView.findViewById(R.id.usernameHeader)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_bar_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }
}
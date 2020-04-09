package com.tysjkj.photo_home.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.navOptions
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tysjkj.photo_home.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenuView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var navHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment
        var navController = navHostFragment.navController
        initWidget()
        initBottomNavigationView(bottomNavigationMenuView,navController)
        var itemUser = bottomNavigationMenuView.findViewById<View>(R.id.user)
        var itemrecommend = bottomNavigationMenuView.findViewById<View>(R.id.recommend)
        itemUser .setOnClickListener {
            val navOption = navOptions {
                anim{
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                }
            }
            val bundle = Bundle()
            bundle.putString("name","Sustain")
            findNavController(my_nav_host_fragment).navigate(R.id.recommendFragment,bundle,navOption)
        }

        itemrecommend .setOnClickListener {
            val navOption = navOptions {
                anim{
                    enter = R.anim.slide_in_left
                    exit = R.anim.slide_out_right
                }
            }
            val bundle = Bundle()
            bundle.putString("name","Sustain")
            findNavController(my_nav_host_fragment).navigate(R.id.userFragment2,bundle,navOption)
        }

    }

    private fun initWidget() {
        bottomNavigationMenuView = findViewById(R.id.navigation_view)
    }

    private fun initBottomNavigationView(
        bottomNavigationMenuView: BottomNavigationView,
        navController: NavController
    ) {
        bottomNavigationMenuView.setupWithNavController(navController)
    }


}

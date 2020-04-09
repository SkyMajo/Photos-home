package com.tysjkj.photo_home.Splash

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

import com.tysjkj.photo_home.R
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_welcome, container, false)
        var tvLogin = view.findViewById<TextView>(R.id.tv_login)
        tvLogin.setOnClickListener {
            val navOption = navOptions {
                anim{
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
            }
            val bundle = Bundle()
            bundle.putString("name","Sustain")
            findNavController().navigate(R.id.loginFragment,bundle,navOption)
        }
        var tvRegister = view.findViewById<TextView>(R.id.tv_register)
        tvRegister.setOnClickListener {
            val navOption = navOptions {
                anim{
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
            }
            val bundle = Bundle()
            bundle.putString("name","Sustain")
            findNavController().navigate(R.id.registerFragment,bundle,navOption)
        }
        return view
    }
}

package com.tysjkj.photo_home.Splash

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.tysjkj.photo_home.Home.MainActivity

import com.tysjkj.photo_home.R

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_login, container, false)
        var tvLogin = view.findViewById<TextView>(R.id.tv_login)
        tvLogin.setOnClickListener {
            startActivity(Intent(activity,MainActivity::class.java))
            activity!!.finish()
        }
        return view
    }

}

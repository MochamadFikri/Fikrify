package com.example.fikrify

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_w3.*
import android.widget.Button
import kotlinx.android.synthetic.*

/**
 * A simple [Fragment] subclass.
 */
class Fragment_w3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return  inflater.inflate(R.layout.fragment_w3, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_lanjut.setOnClickListener {
            val intent = Intent(getActivity(),Home::class.java)
            startActivity(intent)
        }
    }

}

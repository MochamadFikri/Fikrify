package com.example.fikrify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.*
import kotlinx.android.synthetic.main.fragment_daily.*
import kotlinx.android.synthetic.main.fragment_daily.recycle
import kotlinx.android.synthetic.main.fragment_daily.view.*


class Fragment_daily : Fragment() {

    private val hobi_saya = listOf(
        Hobi("Tidur", "Demi kebutuhan jasmani supaya sehat dan kuat"),
        Hobi("Belajar", "Supaya pintar seperti Pak Albert Enstein"),
        Hobi("Mandi", "Supaya badan tetap segar bugar mantap jasa"),
        Hobi("Meminum Coklat Hangat", "Minum coklat hangat di tengah badai sambil main tiktaktuk"),
        Hobi("Bermain Tiktaktuk", "Bermain tiktaktuk di tengah badai sambil minum coklat hangat"),
        Hobi("Nonton Kartun Jepang", "Nonton kartun jepang bertema Isekai"),
        Hobi("Main Game Browser", "Bermain game granbluefantasy bersama rekan-rekan skyfarer seperjuangan"),
        Hobi("Baca Buku", "Baca buku kebanyakan Novel genre mistery")
    )

    private val teman_saya = listOf(
        Teman("Iqbal", "Cikarang"),
        Teman("Muiz", "Bandung"),
        Teman("Pukis", "Bandung"),
        Teman("Agung","Pangandaran"),
        Teman("Depi","Bandung")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_daily, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycle.apply{

            layoutManager = LinearLayoutManager(activity)

            adapter = ListAdapter(hobi_saya)
        }
        recycle2.apply{
            layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL, false)


            adapter = ListAdapter2(teman_saya)
        }
    }
    companion object {
        fun newInstance(): Fragment_daily = Fragment_daily()
    }

}


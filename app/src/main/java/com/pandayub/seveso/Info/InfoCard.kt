package com.pandayub.seveso.Info

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.button.MaterialButton
import com.pandayub.seveso.LoginActivity
import com.pandayub.seveso.R
import com.pandayub.seveso.SignUp.SignUpActivity
import kotlinx.android.synthetic.main.fragment_info_card.*

private var ARG_PARAM1: String = ""
private var ARG_PARAM2: String = ""
private var ARG_PARAM3: String = ""
private var ARG_PARAM4: Int = 1

class InfoCard: Fragment(){
    private var param1: Int = 0
    private var param2: String = ""
    private var param3: String = ""
    private var param4: Int = 1
    private lateinit var horizontalLayoutManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = context!!.resources.getIdentifier(ARG_PARAM1, "drawable", context!!.packageName)
            param2 = ARG_PARAM2
            param3 = ARG_PARAM3
            param4 = context!!.resources.getIdentifier("startup_info_pg$ARG_PARAM4", "drawable", context!!.packageName)
        }
    }

    private fun goBlack(startup_info_pg: MaterialButton){
        startup_info_pg.background = ContextCompat.getDrawable(this.context!!, R.color.black)
    }
    private fun goGrey(startup_info_pg: MaterialButton){
        startup_info_pg.background = ContextCompat.getDrawable(this.context!!,R.color.grey)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_info_card, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        startup_info_img.setImageResource(context!!.resources.getIdentifier(ARG_PARAM1, "drawable", context!!.packageName))
        startup_info_subtitle.text = ARG_PARAM2
        startup_info_txt.text = ARG_PARAM3
        when (param4) {
            0 -> {
                goGrey(startup_info_pg1)
                goBlack(startup_info_pg2)
                goBlack(startup_info_pg3)
                startup_info_done.visibility = View.GONE
            }
            1 -> {
                goBlack(startup_info_pg1)
                goGrey(startup_info_pg2)
                goBlack(startup_info_pg3)
                startup_info_done.visibility = View.GONE
            }
            2 -> {
                goBlack(startup_info_pg1)
                goBlack(startup_info_pg2)
                goGrey(startup_info_pg3)
                startup_info_done.visibility = View.VISIBLE
                startup_info_done.setOnClickListener {
                    fun onClick(v: View?) {
                        val intent = Intent(activity, LoginActivity::class.java)
                        startActivity(intent)
                    }
                }
            }
            else -> {
                goBlack(startup_info_pg1)
                goBlack(startup_info_pg2)
                goBlack(startup_info_pg3)
                startup_info_done.visibility = View.GONE
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        horizontalLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment FoodCard.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(infoData: InfoData, position: Int) =
            InfoCard().apply {
                ARG_PARAM1 = infoData.getImageData()
                ARG_PARAM2 = infoData.getSubtData()
                ARG_PARAM3 = infoData.getTextData()
                ARG_PARAM4 = position
                Log.d("InfoCard.newInstance()", "$ARG_PARAM1 $ARG_PARAM2 $ARG_PARAM3 $ARG_PARAM4")

            }
    }
}
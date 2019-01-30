package com.pandayub.seveso

import InfoData
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_info_card.*

private var ARG_PARAM1: String = ""
private var ARG_PARAM2: String = ""
private var ARG_PARAM3: String = ""
private var ARG_PARAM4: Int = 1

class InfoCard: Fragment(){
    private var listener: OnFragmentInteractionListener? = null
    private var param1: Int = 0
    private var param2: String = ""
    private var param3: String = ""
    private var param4: Int = 1
    private lateinit var horizontalLayoutManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = context!!.resources.getIdentifier(ARG_PARAM1, "drawable", context!!.packageName);
            param2 = ARG_PARAM2
            param3 = ARG_PARAM3
            param4 = ARG_PARAM4
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_info_card, container, false)
        startup_info_img.setImageResource(param1)
        startup_info_subtitle.text = param2
        startup_info_txt.text = param3

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        horizontalLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun changeToProfile(profile: MutableMap<String, Any>?, authorID: String)

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

            }
    }
}
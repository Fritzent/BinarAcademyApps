package com.example.binaracademyapps

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.BundleCompat
import androidx.core.content.ContextCompat
import androidx.emoji.text.EmojiCompat
import androidx.emoji.text.FontRequestEmojiCompatConfig
import kotlinx.android.synthetic.main.fragment_faq_fragment.*
import kotlinx.android.synthetic.main.fragment_faq_fragment.view.*
import kotlinx.android.synthetic.main.fragment_faq_fragment.view.userMessageType

class FaqFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.fragment_faq_fragment, container, false)

        view.btn_back_menu.setOnClickListener {
            startActivity(Intent(view.context, MainActivity::class.java))
        }

        view.btn_emot

        //TODO NOTE: Ini bagian untuk mengatur perubahan icon send message di menu ask
        view.userMessageType.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
//                val textMessage = userMessageType.text.toString()
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                view.btn_send_message.setImageDrawable(ContextCompat.getDrawable(view.context,R.drawable.ic_mic))
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(start == 0 ){
                    view.btn_send_message.setImageDrawable(ContextCompat.getDrawable(view.context,R.drawable.ic_mic))
                }else {
                    view.btn_send_message.setImageDrawable(ContextCompat.getDrawable(view.context,R.drawable.ic_send_message))
                }
            }
        })

        return view
    }

    companion object {
        fun newInstance(): FaqFragment{
            val fragment = FaqFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

//    private fun arrowBackMenu(){
//        btn_back_menu.setOnClickListener {
//            val backIntent = Intent(view?.context,BerandaFragment::class.java)
//            startActivity(backIntent)
//        }
//    }
}
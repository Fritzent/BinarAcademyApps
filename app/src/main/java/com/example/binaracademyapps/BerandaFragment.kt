package com.example.binaracademyapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_beranda_fragment.*
import kotlinx.android.synthetic.main.fragment_beranda_fragment.view.*

//import kotlinx.android.synthetic.main.fragment_beranda_fragment.*

class BerandaFragment : Fragment() {

    private val listFirstMenus = listOf(
        MenuList(menuFirstName = "Academy", menuSecondName = "For Student", imageMenu = "https://www.freepik.com/free-icon/graduate-cap_792126.htm#page=1&query=graduation&position=1"),
        MenuList(menuFirstName = "Career Hub", menuSecondName = "For Career Seeker", imageMenu = "https://www.freepik.com/free-icon/office-briefcase_770003.htm#page=1&query=office%20bag&position=1"),
        MenuList(menuFirstName = "Retrospekt", menuSecondName = "For Registrant", imageMenu= "https://www.freepik.com/free-icon/hospital-s-computer_767658.htm#query=Registrant&position=2")
    )
    private val menuAdapter = Adapter(listFirstMenus)

    private val storieListMenu : List<StorieList> = listOf(
        StorieList("Satrio: A rebel who almost failed as a product manager at Binar Academy","20/02/2019","https://cdn-images-1.medium.com/max/400/1*jhqGUx_79qxmCo9geAmkkA.png"),
        StorieList("Fantastic data and where to find them","16/02/2019","https://cdn-images-1.medium.com/max/400/0*pigKPv2FzDukWNqJ"),
        StorieList("Look who's dominating the Hack of Thrones","16/02/2019","https://cdn-images-1.medium.com/max/400/1*qmPOjk0qyRtOQxicwurW_Q.jpeg"),
        StorieList("Mobile App Automation Basic Testing using Appium,Java, and Cucumber","08/12/2018","https://cdn-images-1.medium.com/max/400/1*Xp24SeoI4POuwMqrhXtzRQ.jpeg"),
        StorieList("From Binar to Become Developer","4/12/2018","https://cdn-images-1.medium.com/max/400/1*tFqL4qUiv-QH3BvHTAoD7A.jpeg")
    )

    private val storieAdapter = StorieListAdapter(storieListMenu)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view: View = inflater!!.inflate(R.layout.fragment_beranda_fragment, container, false)

        view.BinarMainMenu.apply {
            adapter = menuAdapter
        }

        view.storiesRecylerView.apply {
            adapter = storieAdapter
        }
//        BinarMainMenu.apply {
//            adapter = menuAdapter
//        }
//
//        storiesRecylerView.apply {
//            adapter = storieAdapter
//        }

        return view
    }

    companion object {
        fun newInstance() : BerandaFragment{
            val fragment = BerandaFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}
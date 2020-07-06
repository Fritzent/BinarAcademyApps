package com.example.binaracademyapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BinarMainMenu.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = menuAdapter
        }

        storiesRecylerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL,false)
            adapter = storieAdapter
        }
    }

}


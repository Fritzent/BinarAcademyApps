package com.example.binaracademyapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val listFirstMenus = listOf(
        MenuList(menuFirstName = "Academy", menuSecondName = "For Student", imageMenu = "https://www.freepik.com/free-icon/graduate-cap_792126.htm#page=1&query=graduation&position=1"),
        MenuList(menuFirstName = "Career Hub", menuSecondName = "For Career Seeker", imageMenu = "https://www.freepik.com/free-icon/office-briefcase_770003.htm#page=1&query=office%20bag&position=1"),
        MenuList(menuFirstName = "Retrospekt", menuSecondName = "For Registrant", imageMenu= "https://www.freepik.com/free-icon/hospital-s-computer_767658.htm#query=Registrant&position=2")
    )
    private val menuAdapter = Adapter(listFirstMenus)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BinarMainMenu.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = menuAdapter
        }
    }
}


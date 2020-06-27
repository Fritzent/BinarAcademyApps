package com.example.binaracademyapps

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listfirstmenus = listOf(
        MainMenu(menuFirstName = "Academy", menuSecondName = "For Student", imageMenu = "https://www.freepik.com/free-icon/graduate-cap_792126.htm#page=1&query=graduation&position=1"),
        MainMenu(menuFirstName = "Career Hub", menuSecondName = "For Career Seeker", imageMenu = "https://www.freepik.com/free-icon/office-briefcase_770003.htm#page=1&query=office%20bag&position=1"),
        MainMenu(menuFirstName = "Retrospekt", menuSecondName = "For Registrant", imageMenu= "https://www.freepik.com/free-icon/hospital-s-computer_767658.htm#query=Registrant&position=2")
//        MainMenu(menuFirstName = "B-Blog", menuSecondName = "For Binar Blog", imageMenu= "https://www.freepik.com/free-icon/hospital-s-computer_767658.htm#query=Registrant&position=2")
//        MainMenu("Academy", "For Student"),
//        MainMenu("Career Hub", "For Career Seeker"),
//        MainMenu("Retrospekt", "For Registrant")
    )
    val list = ArrayList<MainMenu>(listfirstmenus)
    val menuAdapter = Adapter(listfirstmenus)

//    val listfirstmenus = arrayOf( "Academy", "Career Hub", "Retrospekt")
//    val listsecondmenus = arrayOf("For Student","For Career Seeker","For Registrant")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BinarMainMenu.apply {
//            BinarMainMenu.setHasFixedSize(true)
//            BinarMainMenu.layoutManager = LinearLayoutManager(this@MainActivity)
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = menuAdapter
        }
        //note : need fix in the xml styling (study to use card view next )
    }
}


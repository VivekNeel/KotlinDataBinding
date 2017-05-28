package com.example.databinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.databinding.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity()  {

    var listOfSchool: ArrayList<School> = ArrayList();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var activityMainDataBinding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainDataBinding.recylcerView.layoutManager = LinearLayoutManager(this)
        activityMainDataBinding.recylcerView.setHasFixedSize(true)
        activityMainDataBinding.recylcerView.adapter = SchoolAdapter(buildDummySchoolList())
    }

    fun buildDummySchoolList() : ArrayList<School>{
        var x : Int = 10;
        do {
            var school : School = School("mahaveer" , Random().nextInt().toString())
            listOfSchool.add(school)
            x--;
        }while (x > 0)
        return listOfSchool
    }
}

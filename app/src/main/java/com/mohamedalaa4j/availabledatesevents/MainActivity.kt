package com.mohamedalaa4j.availabledatesevents

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.applandeo.materialcalendarview.CalendarDay
import com.applandeo.materialcalendarview.EventDay
import com.applandeo.materialcalendarview.listeners.OnDayClickListener
import com.mohamedalaa4j.availabledatesevents.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.calendarView.setSelectionBackground(R.drawable.custom_calender_background)

        binding.calendarView.setOnDayClickListener(
            object : OnDayClickListener {
                override fun onDayClick(eventDay: EventDay) {
                    val day = eventDay.calendar.get(Calendar.DAY_OF_MONTH)
                    val month = eventDay.calendar.get(Calendar.MONTH) + 1
                    val year = eventDay.calendar.get(Calendar.YEAR)
//                    Toast.makeText(this@MainActivity, year.toString(), Toast.LENGTH_SHORT).show()
                    Log.e("eventDay", year.toString())
                }

            }
        )
    }

}
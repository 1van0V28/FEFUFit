package com.example.fefufit.features.activities_list

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager

class ActivitiesUsersListFragment: ActivitiesBaseListFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = listOf(
            ActivityItem.DateHeader("Вчера"),
            ActivityItem.ActivityEntry(
                "14.32 км",
                "2 часа 46 минут",
                "Серфинг",
                "14 часов назад",
                user = "@van_darkholme"

            ),
            ActivityItem.ActivityEntry(
                "228 м",
                "14 часов 48 минут",
                "Качели",
                "14 часов назад",
                user = "@techniquepasha"
            ),
            ActivityItem.ActivityEntry(
                "10 км",
                "1 час 10 минут",
                "Езда на кадилак",
                "14 часов назад",
                user = "@morgen_shtern"
            )
        )

        super.adapter = ActivityAdapter(false, data) {
            super.onActivityClick()
        }

        super.binding.rvActivitiesList.layoutManager = LinearLayoutManager(requireContext())
        super.binding.rvActivitiesList.adapter = super.adapter
    }
}
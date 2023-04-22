package com.islandparadise14.mintable_khoa.tableinterface

import com.islandparadise14.mintable_khoa.model.ScheduleEntity

interface OnScheduleClickListener {
    fun scheduleClicked(entity: ScheduleEntity)
}
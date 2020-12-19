package com.stylingandroid.material.timepicker

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import java.time.LocalTime

class TimePickerViewModel : ViewModel() {

    fun currentTime(): LocalTime = LocalTime.now()

    private val _selectedTime = MutableLiveData<Pair<Int, Int>>()
    val selectedTime: LiveData<Pair<Int, Int>> = _selectedTime

    fun setSelectedTime(hour: Int, minute: Int) {
        _selectedTime.value = hour to minute
    }

    private val _inputMode = MutableLiveData(MaterialTimePicker.INPUT_MODE_CLOCK)
    val inputMode: LiveData<Int> = _inputMode

    fun setInputType(@MaterialDatePicker.InputMode inputMode: Int) {
        _inputMode.value = inputMode
    }
}

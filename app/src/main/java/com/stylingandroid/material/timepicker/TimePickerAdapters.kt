package com.stylingandroid.material.timepicker

import androidx.databinding.BindingAdapter
import com.google.android.material.textview.MaterialTextView
import com.google.android.material.timepicker.MaterialTimePicker

@BindingAdapter("timeSelected")
fun timeSelected(view: MaterialTextView, selectedTime: Pair<Int, Int>?) {
    view.text = selectedTime?.let { (hour, minute) ->
        view.resources.getString(R.string.time_selected, hour, minute)
    } ?: view.resources.getString(R.string.time_not_selected)
}

@BindingAdapter("inputMode")
fun inputMode(view: MaterialTextView, inputMode: Int) {
    view.text = view.resources.getText(
        if (inputMode == MaterialTimePicker.INPUT_MODE_CLOCK) {
            R.string.input_mode_clock
        } else {
            R.string.input_mode_keyboard
        }
    )
}

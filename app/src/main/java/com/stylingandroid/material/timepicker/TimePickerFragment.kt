package com.stylingandroid.material.timepicker

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.MaterialTimePicker.INPUT_MODE_CLOCK
import com.stylingandroid.material.timepicker.databinding.TimePickerFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TimePickerFragment : Fragment(R.layout.time_picker_fragment) {

    private val viewModel: TimePickerViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        TimePickerFragmentBinding.bind(view).also { binding ->
            binding.lifecycleOwner = this
            binding.viewModel = viewModel
            binding.showTimepicker.setOnClickListener {
                val currentTime = viewModel.currentTime()
                MaterialTimePicker.Builder()
                    .setHour(currentTime.hour)
                    .setMinute(currentTime.minute)
                    .setTitleText(R.string.app_name)
                    .setInputMode(viewModel.inputMode.value ?: INPUT_MODE_CLOCK)
                    .build()
                    .apply {
                        addOnPositiveButtonClickListener {
                            viewModel.setSelectedTime(hour, minute)
                        }
                        addOnDismissListener {
                            viewModel.setInputType(inputMode)
                        }
                    }
                    .show(parentFragmentManager, "")
            }
        }
    }
}

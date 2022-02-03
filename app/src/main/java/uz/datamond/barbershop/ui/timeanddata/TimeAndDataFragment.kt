package uz.datamond.barbershop.ui.timeanddata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import uz.datamond.barbershop.databinding.FragmentTimeAndDataBinding

class TimeAndDataFragment : Fragment() {

    private lateinit var binding: FragmentTimeAndDataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTimeAndDataBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    binding.calendarView.setOnDateChangeListener { calendarView, i, i2, i3 ->  }
Toast.makeText(context,"Selected data",Toast.LENGTH_SHORT).show()
    }

}
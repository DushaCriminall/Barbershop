package uz.datamond.barbershop.ui.timeanddata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

}
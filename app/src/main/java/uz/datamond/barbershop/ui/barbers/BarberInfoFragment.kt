package uz.datamond.barbershop.ui.barbers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.datamond.barbershop.databinding.FragmentBarberInfoBinding

class BarberInfoFragment : Fragment() {

    private lateinit var binding: FragmentBarberInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBarberInfoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}
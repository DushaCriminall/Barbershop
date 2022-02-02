package uz.datamond.barbershop.ui.barbers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.datamond.barbershop.R
import uz.datamond.barbershop.databinding.FragmentBarbersBinding

class BarbersFragment : Fragment() {

    private lateinit var binding: FragmentBarbersBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentBarbersBinding.inflate(layoutInflater, container, false)

        binding.tvAaa.setOnClickListener {
            findNavController().navigate(R.id.navigation_barber_info)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
package uz.datamond.barbershop.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.datamond.barbershop.R
import uz.datamond.barbershop.databinding.FragmentIntroductionBinding

class IntroductionFragment : Fragment() {

    private lateinit var binding: FragmentIntroductionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIntroductionBinding.inflate(layoutInflater, container, false)

        binding.logInButton.setOnClickListener {
            findNavController().navigate(R.id.navigation_auth)
        }
        binding.registerButton.setOnClickListener {
            findNavController().navigate(R.id.navigation_sms_code)
        }
        return binding.root
    }
}
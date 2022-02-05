package uz.datamond.barbershop.ui.auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.datamond.barbershop.MainActivity
import uz.datamond.barbershop.databinding.FragmentAuthSmsCodeBinding

class AuthSmsCodeFragment : Fragment() {

    private lateinit var binding: FragmentAuthSmsCodeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthSmsCodeBinding.inflate(layoutInflater, container, false)

        binding.tv.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }
}

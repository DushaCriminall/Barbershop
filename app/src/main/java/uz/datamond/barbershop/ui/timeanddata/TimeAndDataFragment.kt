package uz.datamond.barbershop.ui.timeanddata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import uz.datamond.barbershop.databinding.FragmentTimeAndDataBinding

class TimeAndDataFragment : Fragment() {

    private var _binding: FragmentTimeAndDataBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerViewAdapterOperatorsServices: RecyclerViewAdapterTimes


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recyclerViewAdapterOperatorsServices =
            RecyclerViewAdapterTimes(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTimeAndDataBinding.inflate(layoutInflater, container, false)

        val layoutManager =
            GridLayoutManager(requireContext(), 3, GridLayoutManager.VERTICAL, false)
        binding.rvTime.adapter = recyclerViewAdapterOperatorsServices
        binding.rvTime.layoutManager = layoutManager

        return binding.root
    }

}
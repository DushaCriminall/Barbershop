package uz.datamond.barbershop.ui.barbers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.GridLayoutManager
import uz.datamond.barbershop.databinding.FragmentBarberInfoBinding
import uz.umbrellasoft.nomerbor.utils.SpaceItemDecorationForHeader
import uz.umbrellasoft.nomerbor.utils.convertDpToPixel

class BarberInfoFragment : Fragment() {
    private var _binding: FragmentBarberInfoBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerViewAdapterBarberServices: RecyclerViewAdapterBarberServices
    private lateinit var recyclerViewAdapterBarberInfo: RecyclerViewAdapterBarberInfo


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recyclerViewAdapterBarberServices =
            RecyclerViewAdapterBarberServices()
        recyclerViewAdapterBarberInfo = RecyclerViewAdapterBarberInfo()

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBarberInfoBinding.inflate(inflater, container, false)

        val layoutManager =
            GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return when (position) {
                    0 -> 2
                    else -> 1
                }
            }

        }

        binding.recyclerViewServices.layoutManager = layoutManager
        binding.recyclerViewServices.addItemDecoration(
            SpaceItemDecorationForHeader(
                convertDpToPixel(8), horizontal = false, grid = true, span = 2
            )
        )
        val concatAdapter =
            ConcatAdapter(recyclerViewAdapterBarberInfo, recyclerViewAdapterBarberServices)
        binding.recyclerViewServices.adapter = concatAdapter

        return binding.root
    }

}
package uz.datamond.barbershop.ui.timeanddata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.datamond.barbershop.R
import uz.datamond.barbershop.databinding.FragmentTimeAndDataBinding

class TimeAndDataFragment : Fragment() {

    private lateinit var binding: FragmentTimeAndDataBinding

    val textList = ArrayList<TimeModel>()

    private var recyclerView: RecyclerView? = null

    private lateinit var adapter: TimeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTimeAndDataBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.calendarView.setOnDateChangeListener { calendarView, i, i2, i3 -> }
        Toast.makeText(context, "Selected data", Toast.LENGTH_SHORT).show()


        getItemsList2()
        setRecyclerview()


        recyclerView?.adapter = adapter
        recyclerView = view.findViewById(R.id.rv_time)
        recyclerView?.layoutManager =
            GridLayoutManager(context, 3)
        adapter = TimeAdapter(getItemsList2())
        recyclerView?.adapter = adapter


    }


        private fun setRecyclerview() {
            recyclerView?.setHasFixedSize(true)
            recyclerView?.layoutManager = GridLayoutManager(context, 3)
            recyclerView?.adapter = adapter
    }


    private fun getItemsList2(): ArrayList<TimeModel> {
        val list = ArrayList<TimeModel>()
        list.add(TimeModel("09:00"))
        list.add(TimeModel("09:30"))
        list.add(TimeModel("10:00"))
        list.add(TimeModel("10:30"))
        list.add(TimeModel("11:30"))
        list.add(TimeModel("12:00"))

        return list
    }


}
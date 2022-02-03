package uz.datamond.barbershop.ui.timeanddata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.datamond.barbershop.R

class TimeAdapter(private var list: ArrayList<TimeModel>) :
    RecyclerView.Adapter<TimeAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.time_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val List = list[position]
        holder.tv_categories.setText(List.time)

        holder.itemView.setOnClickListener {
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tv_categories = itemView.findViewById<TextView>(R.id.tv_time)
    }

}
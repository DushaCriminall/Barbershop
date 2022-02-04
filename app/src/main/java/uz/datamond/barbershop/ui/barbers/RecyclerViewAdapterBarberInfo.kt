package uz.datamond.barbershop.ui.barbers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.datamond.barbershop.databinding.BarberServiceBinding

class RecyclerViewAdapterBarberInfo () :
    RecyclerView.Adapter<RecyclerViewAdapterBarberInfo.ViewHolder>() {
    private var list = ArrayList<BarberServiceModel>()
    inner class ViewHolder(var binding: BarberServiceBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(d:BarberServiceModel) {
            binding.tvBarberService.text = d.service
            binding.tvServiceTime.text = d.time
            binding.tvPrice.text = d.price
        }

//        init {
//            itemView.setOnClickListener {
//                onItemClick?.invoke(list[adapterPosition])
//            }
//        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = BarberServiceBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        return holder.bind(list[position])
    }
}
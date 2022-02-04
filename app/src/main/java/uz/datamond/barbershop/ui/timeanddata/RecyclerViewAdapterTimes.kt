package uz.datamond.barbershop.ui.timeanddata

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.datamond.barbershop.data.MockData
import uz.datamond.barbershop.databinding.TimeListBinding

class RecyclerViewAdapterTimes(val context: Context) :
    RecyclerView.Adapter<RecyclerViewAdapterTimes.ViewHolder>() {
    var onItemClick: ((MockData.MobileOperatorsServices) -> Unit)? = null
    val list = MockData.getMobileOperatorsServices(context)

    fun updateIconsColor() {
        notifyDataSetChanged()
    }

    inner class ViewHolder(var binding: TimeListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(d: MockData.MobileOperatorsServices) {
            binding.tvTime.text = d.time
        }

        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(list[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = TimeListBinding.inflate(
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
package uz.datamond.barbershop.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.datamond.barbershop.databinding.ListItemBinding
import uz.datamond.barbershop.network.model.ListModel


class BarberListAdapter : RecyclerView.Adapter<BarberListAdapter.ViewHolder>() {

    var list = ArrayList<ListModel>()

    var onItemClick: ((ticket: ListModel) -> Unit)? = null

    fun updateList(list: ArrayList<ListModel>) {
        this.list.clear()
        this.list = list
        notifyDataSetChanged()
    }

    inner class ViewHolder(var binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ListModel) {
            binding.tvDesc.text = data.title
            binding.ivVar.setImageResource(data.img)

        }

//        init {
//            itemView.setOnClickListener {
//                onItemClick?.invoke(list[bindingAdapterPosition])
//            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val bind = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(bind)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val driverInfo = list.get(position)
        holder.binding.tvTitle.text = driverInfo.title
        holder.binding.ivVar.setImageResource(driverInfo.img ) }

    override fun getItemCount(): Int {
        return list.size
    }

}

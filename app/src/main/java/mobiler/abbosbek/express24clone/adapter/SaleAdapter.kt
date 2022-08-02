package mobiler.abbosbek.express24clone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mobiler.abbosbek.express24clone.databinding.SaleItemLayoutBinding
import mobiler.abbosbek.express24clone.model.SaleModel

class SaleAdapter(val items : List<SaleModel>) : RecyclerView.Adapter<SaleAdapter.ItemHolder>() {
    inner class ItemHolder(val binding:SaleItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(SaleItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        holder.binding.imgSale.setImageResource(items[position].img)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
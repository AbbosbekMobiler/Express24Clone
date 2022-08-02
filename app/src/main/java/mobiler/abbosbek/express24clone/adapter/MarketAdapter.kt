package mobiler.abbosbek.express24clone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mobiler.abbosbek.express24clone.databinding.MarketItemLayoutBinding
import mobiler.abbosbek.express24clone.databinding.SaleItemLayoutBinding
import mobiler.abbosbek.express24clone.model.MarketModel
import mobiler.abbosbek.express24clone.model.SaleModel

class MarketAdapter(val items : List<MarketModel>) : RecyclerView.Adapter<MarketAdapter.ItemHolder>() {
    inner class ItemHolder(val binding:MarketItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(MarketItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.binding.imgMarket.setImageResource(items[position].img)
        holder.binding.tvMarketName.text = items[position].title
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
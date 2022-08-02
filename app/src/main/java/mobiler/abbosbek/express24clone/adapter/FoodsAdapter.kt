package mobiler.abbosbek.express24clone.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mobiler.abbosbek.express24clone.R
import mobiler.abbosbek.express24clone.databinding.FoodsItemLayoutBinding
import mobiler.abbosbek.express24clone.databinding.MarketItemLayoutBinding
import mobiler.abbosbek.express24clone.databinding.SaleItemLayoutBinding
import mobiler.abbosbek.express24clone.model.FoodsModel
import mobiler.abbosbek.express24clone.model.MarketModel
import mobiler.abbosbek.express24clone.model.SaleModel
import mobiler.abbosbek.express24clone.screen.FoodDetailActivity
import mobiler.abbosbek.express24clone.utils.Constants

class FoodsAdapter(val items : List<FoodsModel>) : RecyclerView.Adapter<FoodsAdapter.ItemHolder>() {


    inner class ItemHolder(val binding:FoodsItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(FoodsItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        val item = items[position]

        holder.binding.imgFood.setImageResource(items[position].img)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,FoodDetailActivity::class.java)
            intent.putExtra(Constants.FOOD_EXTRA,item)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }
}
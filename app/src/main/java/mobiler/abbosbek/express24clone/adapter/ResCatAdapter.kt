package mobiler.abbosbek.express24clone.adapter

import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mobiler.abbosbek.express24clone.databinding.*
import mobiler.abbosbek.express24clone.model.MarketModel
import mobiler.abbosbek.express24clone.model.ResCatModel
import mobiler.abbosbek.express24clone.model.SaleModel

class ResCatAdapter(val items : List<ResCatModel>) : RecyclerView.Adapter<ResCatAdapter.ItemHolder>() {
    inner class ItemHolder(val binding:RestaurantCategoryItemBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(RestaurantCategoryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        holder.binding.resCatTitle.text = items[position].title
        if (items[position].id == 0){
            holder.binding.resCatFavorite.visibility = View.VISIBLE
        }else{
            holder.binding.resCatFavorite.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
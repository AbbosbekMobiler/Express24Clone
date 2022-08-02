package mobiler.abbosbek.express24clone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mobiler.abbosbek.express24clone.R
import mobiler.abbosbek.express24clone.adapter.*
import mobiler.abbosbek.express24clone.databinding.FragmentHomeBinding
import mobiler.abbosbek.express24clone.model.FoodsModel
import mobiler.abbosbek.express24clone.model.MarketModel
import mobiler.abbosbek.express24clone.model.ResCatModel
import mobiler.abbosbek.express24clone.model.SaleModel

class HomeFragment : Fragment() {
    
    lateinit var binding: FragmentHomeBinding

    val saleList = listOf(
        SaleModel(R.drawable.chegirma1),
        SaleModel(R.drawable.chegirma2),
        SaleModel(R.drawable.chegirma3),
        SaleModel(R.drawable.chegirma4),
        SaleModel(R.drawable.chegirma5),
        SaleModel(R.drawable.chegirma3),
        SaleModel(R.drawable.chegirma2),
        SaleModel(R.drawable.chegirma4),
        SaleModel(R.drawable.chegirma1),
    )

    val marketList = listOf(
        MarketModel(R.drawable.img_korzinka,"Korzinka.uz"),
        MarketModel(R.drawable.butcoin_image,"Butcoin Gastromarket"),
        MarketModel(R.drawable.img_yves,"Yves Rocher"),
        MarketModel(R.drawable.img_sahovat_broiler,"Sahovat Broiler"),
        MarketModel(R.drawable.img_loccitane,"L'Occitane"),
        MarketModel(R.drawable.img_tchibo_coffe,"Tchibo Coffe Service"),
        MarketModel(R.drawable.img_zooplaneta,"Zooplaneta"),
        MarketModel(R.drawable.img_loaf,"The loaf"),
        MarketModel(R.drawable.image_makro,"Makro supermarket"),
    )

    val restaurantList = listOf(
        ResCatModel(0,R.drawable.ic_favorite_res,"Tanlanganlar"),
        ResCatModel(1,R.drawable.ic_favorite_res,"Yangilari"),
        ResCatModel(2,R.drawable.ic_favorite_res,"Fast Food"),
        ResCatModel(3,R.drawable.ic_favorite_res,"Milliy Taomlar"),
        ResCatModel(4,R.drawable.ic_favorite_res,"Osiyo taomlari"),
        ResCatModel(5,R.drawable.ic_favorite_res,"Kafe"),
        ResCatModel(6,R.drawable.ic_favorite_res,"Evropa taomlari"),
        ResCatModel(7,R.drawable.ic_favorite_res,"Barbekyu"),
        ResCatModel(8,R.drawable.ic_favorite_res,"Mahsulotlar"),
        ResCatModel(9,R.drawable.ic_favorite_res,"Muzqaymoqlar")
    )

    val foodsList = listOf(
        FoodsModel(R.drawable.lavash),
        FoodsModel(R.drawable.kfc),
        FoodsModel(R.drawable.fast_food3),
        FoodsModel(R.drawable.fast_food4),
        FoodsModel(R.drawable.fast_food5),
        FoodsModel(R.drawable.lavash),
        FoodsModel(R.drawable.pizza),
        FoodsModel(R.drawable.max_way),
        FoodsModel(R.drawable.lavash),
        FoodsModel(R.drawable.kfc),
        FoodsModel(R.drawable.fast_food3),
        FoodsModel(R.drawable.fast_food4),
        FoodsModel(R.drawable.fast_food5),
        FoodsModel(R.drawable.lavash),
        FoodsModel(R.drawable.pizza),
        FoodsModel(R.drawable.max_way)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recSale.layoutManager = LinearLayoutManager(requireActivity(),RecyclerView.HORIZONTAL,false)
        binding.recSale.adapter = SaleAdapter(saleList)

        binding.recMarket.layoutManager = LinearLayoutManager(requireActivity(),RecyclerView.HORIZONTAL,false)
        binding.recMarket.adapter = MarketAdapter(marketList)

        binding.recRestaurantCategory.layoutManager = LinearLayoutManager(requireActivity(),RecyclerView.HORIZONTAL,false)
        binding.recRestaurantCategory.adapter = ResCatAdapter(restaurantList)

        binding.recyclerFoods.layoutManager = LinearLayoutManager(requireActivity())
        binding.recyclerFoods.adapter = FoodsAdapter(foodsList)

    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}
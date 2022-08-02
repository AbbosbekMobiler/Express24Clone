package mobiler.abbosbek.express24clone.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mobiler.abbosbek.express24clone.R
import mobiler.abbosbek.express24clone.databinding.ActivityFoodDetailBinding
import mobiler.abbosbek.express24clone.model.FoodsModel
import mobiler.abbosbek.express24clone.utils.Constants

class FoodDetailActivity : AppCompatActivity() {

    lateinit var binding:ActivityFoodDetailBinding

    lateinit var item : FoodsModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        item = intent.getSerializableExtra(Constants.FOOD_EXTRA) as FoodsModel

        binding.imgFoodDetail.setImageResource(item.img)

    }
}
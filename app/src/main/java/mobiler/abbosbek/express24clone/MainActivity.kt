package mobiler.abbosbek.express24clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import mobiler.abbosbek.express24clone.databinding.ActivityMainBinding
import mobiler.abbosbek.express24clone.fragments.CartFragment
import mobiler.abbosbek.express24clone.fragments.HomeFragment
import mobiler.abbosbek.express24clone.fragments.ProfileFragment
import mobiler.abbosbek.express24clone.fragments.SearchFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val homeFragment = HomeFragment.newInstance()
    val searchFragment = SearchFragment.newInstance()
    val cartFragment = CartFragment.newInstance()
    val profileFragment = ProfileFragment.newInstance()
    var activityFragment : Fragment = homeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.flContainer,homeFragment,homeFragment.tag).hide(homeFragment).commit()
        supportFragmentManager.beginTransaction().add(R.id.flContainer,searchFragment,searchFragment.tag).hide(searchFragment).commit()
        supportFragmentManager.beginTransaction().add(R.id.flContainer,cartFragment,cartFragment.tag).hide(cartFragment).commit()
        supportFragmentManager.beginTransaction().add(R.id.flContainer,profileFragment,profileFragment.tag).hide(profileFragment).commit()

        supportFragmentManager.beginTransaction().show(activityFragment).commit()

        binding.bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.ActionHome -> {
                    supportFragmentManager.beginTransaction().hide(activityFragment).show(homeFragment).commit()
                    activityFragment = homeFragment
                }
                R.id.ActionSearch -> {
                    supportFragmentManager.beginTransaction().hide(activityFragment).show(searchFragment).commit()
                    activityFragment = searchFragment
                }
                R.id.ActionCart -> {
                    supportFragmentManager.beginTransaction().hide(activityFragment).show(cartFragment).commit()
                    activityFragment = cartFragment
                }
                R.id.ActionProfile -> {
                    supportFragmentManager.beginTransaction().hide(activityFragment).show(profileFragment).commit()
                    activityFragment = profileFragment
                }
            }
            true
        }

    }
}
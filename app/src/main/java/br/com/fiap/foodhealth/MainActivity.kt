package br.com.fiap.foodhealth

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import br.com.fiap.foodhealth.databinding.ActivityMainBinding
import br.com.fiap.foodhealth.fragments.ImcFragment
import br.com.fiap.foodhealth.fragments.ListFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val ImcFragment = ImcFragment()
    private val ListFragment = ListFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(ImcFragment)

        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_bmi -> replaceFragment(ImcFragment)
                R.id.ic_list -> replaceFragment(ListFragment)
            }
            true
        }


    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container,fragment)
        transaction.commit()
    }
}
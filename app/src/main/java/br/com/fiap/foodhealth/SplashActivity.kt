package br.com.fiap.foodhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import br.com.fiap.foodhealth.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Tirar a actionBar
        supportActionBar?.hide()

        //Animação
        binding.clSplash.animate().setDuration(1500).alpha(1f).withEndAction{
            val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }



}
package uz.gita.newinfoapp.Adapter

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import uz.gita.newinfoapp.R
import uz.gita.newinfoapp.countryMvp.CountryActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)

        Handler().postDelayed({
            startActivity(
                Intent(this, CountryActivity::class.java)
            )
            finish()
        }, 3000)

    }
}
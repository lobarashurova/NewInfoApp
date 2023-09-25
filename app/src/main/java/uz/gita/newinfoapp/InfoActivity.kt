package uz.gita.newinfoapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import uz.gita.newinfoapp.Data.DataCountry

class InfoActivity : AppCompatActivity() {
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val item = intent.getSerializableExtra("itemCountry") as DataCountry

        findViewById<ImageView>(R.id.img_country).setImageResource(item.image2)
        findViewById<TextView>(R.id.tv_country).text = item.country_name
        findViewById<TextView>(R.id.tv_location).text = item.location_name
        findViewById<TextView>(R.id.tv_info).text = item.information
//        findViewById<ImageView>(R.id.back_btn).setOnClickListener {
//            finish()
//        }

        findViewById<Toolbar>(R.id.toolbar).collapseIcon

    }
}
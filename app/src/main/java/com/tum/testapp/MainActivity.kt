package com.tum.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  fun toastMe(view: View) {
    val myToast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT)
    myToast.show()
  }

  fun countToastClick(view: View){
    val countString = counterText.text.toString()
    var count: Int = countString.toInt()
    count++
    counterText.text= count.toString()
  }
}

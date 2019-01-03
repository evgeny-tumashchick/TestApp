package com.tum.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

  companion object {
    const val TOTAL_COUNT = "total_count"
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)
    showRandomNumber()
  }

  fun showRandomNumber() {
    val count = intent.getIntExtra(TOTAL_COUNT, 0)
    var randomInt = 0
    if (count > 0) {
      randomInt = Random.nextInt(count + 1)
    }
    textViewRandom.text = randomInt.toString()
    randomHeading.text = getString(R.string.random_heading_text, count)
  }
}

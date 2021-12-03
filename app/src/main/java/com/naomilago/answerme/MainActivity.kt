package com.naomilago.answerme

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

  val result = arrayOf("Yes", "No", "Maybe", "Not at all", "Of course")
  val random = Random.Default

  @SuppressLint("SetTextI18n")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    Submit.setOnClickListener {
      if (Question.text.isEmpty()) {
        Answer.text = "Ask a question!"
      } else {
        val index = random.nextInt(5)
        Answer.text = result[index]
      }
    }

  }
}
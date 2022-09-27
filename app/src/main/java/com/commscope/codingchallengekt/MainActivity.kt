package com.commscope.codingchallengekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.commscope.codingchallengekt.databinding.ActivityMainBinding
import com.commscope.codingchallengekt.utils.*
import com.commscope.codingchallengekt.utils.calculatePiUtil
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.toastBtn.setOnClickListener(this)
        binding.shwIm.setOnClickListener(this)
        binding.btnBook.setOnClickListener(this)
    }

    fun validate(view: View) {
        val input = binding.etInput.text.toString()
        val isValid = validatePassword(input)
        if(validatePassword(isValid.toString()))
        {
            showToast(this,"valide")
        }
    }

    fun calculatePi(view: View) {
        binding.btnCalculatePi.hide()
        binding.spinnerCalculatePi.show()

        binding.tvPiResult.text = "Calculating..."

        val pi = calculatePiUtil()
        binding.tvPiResult.text = pi.toString()
        binding.spinnerCalculatePi.hide()
        binding.btnCalculatePi.show()
    }

    override fun onClick(p0: View?)
    {
        when(p0?.id)
        {
            R.id.toastBtn->
            {
                showToast(this,"hello world..!")
            }
            R.id.shwIm->
            {
             showImage()
            }
            R.id.btnBook->
            {
                startActivity(Intent(this,BooksActivity::class.java))
            }
        }
    }

    private fun showImage()
    {

        startActivity(Intent(this,ImageActivity::class.java))

    }
}


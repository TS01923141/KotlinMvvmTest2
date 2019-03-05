package com.example.biji.kotlinmvvmtest2.view

import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biji.kotlinmvvmtest2.R
import com.example.biji.kotlinmvvmtest2.databinding.ActivityAnimalBinding
import com.example.biji.kotlinmvvmtest2.model.Animal
import com.example.biji.kotlinmvvmtest2.viewmodel.AnimalViewModel

class AnimalActivity : AppCompatActivity() {

    lateinit var mBinding : ActivityAnimalBinding
    lateinit var mViewModel : AnimalViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_animal)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_animal)
        //model
        val animal = Animal("dog", 0)
        //ViewModel
        mViewModel = AnimalViewModel(animal)
        //binding
        mBinding.vm = mViewModel
    }
}

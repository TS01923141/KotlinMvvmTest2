package com.example.biji.kotlinmvvmtest2.viewmodel

import androidx.databinding.ObservableField
import com.example.biji.kotlinmvvmtest2.model.Animal

/**
 * Created by biji on 2019/3/4.
 */

class AnimalViewModel(val animal : Animal){
    //data
    val info = ObservableField<String>("${animal.name} 叫了 ${animal.shoutCount} 聲")
    //binding
    fun shout(){
        animal.shoutCount++
        info.set("${animal.name} 叫了 ${animal.shoutCount} 聲")
    }
}

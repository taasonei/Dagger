package ru.otus.daggerhomework

import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

@FragmentScope
class ViewModelReceiver @Inject constructor(
    private val context: Context,
    private val color: MutableLiveData<Int>
) {

    fun observeColors(): LiveData<Int> {
        if (context !is Application) throw RuntimeException("Здесь нужен контекст апликейшена")
        Toast.makeText(context, "Color received", Toast.LENGTH_LONG).show()
        return color
    }
}

package com.dicoding.tourismapp.core.ui

import androidx.lifecycle.*
import com.dicoding.tourismapp.core.domain.usecase.*
import com.dicoding.tourismapp.detail.*
import com.dicoding.tourismapp.di.*
import com.dicoding.tourismapp.favorite.*
import com.dicoding.tourismapp.home.*
import javax.inject.*


@AppScope
class ViewModelFactory @Inject constructor(
    private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val creator = creators[modelClass] ?: creators.entries.firstOrNull {
            modelClass.isAssignableFrom(it.key)
        }?.value ?: throw IllegalArgumentException("unknown model class $modelClass")
        return creator.get() as T
    }
}
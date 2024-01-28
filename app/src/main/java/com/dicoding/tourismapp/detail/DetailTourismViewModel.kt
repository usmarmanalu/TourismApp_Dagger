package com.dicoding.tourismapp.detail

import androidx.lifecycle.*
import com.dicoding.tourismapp.core.domain.model.*
import com.dicoding.tourismapp.core.domain.usecase.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.*

@HiltViewModel
class DetailTourismViewModel @Inject constructor(private val tourismUseCase: TourismUseCase) :
    ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus: Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}


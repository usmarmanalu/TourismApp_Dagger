package com.dicoding.tourismapp.home

import androidx.lifecycle.*
import com.dicoding.tourismapp.core.domain.usecase.*
import javax.inject.*

class HomeViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}


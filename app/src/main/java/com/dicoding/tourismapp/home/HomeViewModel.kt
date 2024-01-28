package com.dicoding.tourismapp.home

import androidx.lifecycle.*
import com.dicoding.tourismapp.core.domain.usecase.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.*

@HiltViewModel
class HomeViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}


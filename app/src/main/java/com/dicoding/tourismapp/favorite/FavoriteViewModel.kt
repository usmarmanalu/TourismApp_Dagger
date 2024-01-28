package com.dicoding.tourismapp.favorite

import androidx.lifecycle.*
import com.dicoding.tourismapp.core.domain.usecase.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.*

@HiltViewModel
class FavoriteViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()
}


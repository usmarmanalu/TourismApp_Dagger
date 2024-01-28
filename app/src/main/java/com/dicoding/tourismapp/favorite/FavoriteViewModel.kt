package com.dicoding.tourismapp.favorite

import androidx.lifecycle.*
import com.dicoding.tourismapp.core.domain.usecase.*
import javax.inject.*

class FavoriteViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()
}


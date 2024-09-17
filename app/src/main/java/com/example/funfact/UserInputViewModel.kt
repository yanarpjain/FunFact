package com.example.funfact

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.funfact.data.UserDataUiEvents
import com.example.funfact.data.UserInputScreenState

class UserInputViewModel : ViewModel() {

    var uiState= mutableStateOf(UserInputScreenState())


    fun onEvent(event: UserDataUiEvents){
        when(event)
        {
            is UserDataUiEvents.UserNameEntered ->{
                uiState.value = uiState.value.copy(

                    nameEntered = event.name
                )
            }
            is UserDataUiEvents.AnimalSelected ->{
                uiState.value = uiState.value.copy(

                    animalSelected = event.animalvalue
                )
            }
        }

    }

}
package com.example.funfact.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.funfact.UserInputViewModel
import com.example.funfact.data.UserDataUiEvents
import com.example.funfact.ui.TextComponent
import com.example.funfact.ui.TextFieldComponent
import com.example.funfact.ui.TopBar

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface( modifier= Modifier.fillMaxSize()) {
    Column(
        modifier= Modifier
            .fillMaxWidth()
            .padding(18.dp)
    )
    {
        TopBar(value = "Hi There \uD83D\uDE0A")
        TextComponent(textValue = "Lets learn about you!!", textSize = 24.sp)

        Spacer(modifier = Modifier.size(20.dp))
        TextComponent(textValue = "This app will prepare a page by input provided by you!!", textSize = 18.sp)

        Spacer(modifier = Modifier.size(60.dp))

        TextComponent(textValue = "Name", textSize = 18.sp)
        Spacer(modifier = Modifier.size(10.dp))

        TextFieldComponent(onTextChange = {
            userInputViewModel.onEvent(
                UserDataUiEvents.UserNameEntered(it)
            )
        })
        Spacer(modifier = Modifier.size(20.dp))

        TextComponent(textValue = "What do you like", textSize = 18.sp)
    }
    }
}

@Preview
@Composable
fun UserInputScreenPreview(){
    UserInputScreen(UserInputViewModel())
}
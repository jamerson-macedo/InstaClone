package com.example.instaclone.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instaclone.R
import com.example.instaclone.ui.theme.gray
import com.example.instaclone.ui.theme.gray_text

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    val maxLength = 110
    val instalabel = stringResource(id = R.string.insta_label)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = instalabel,

            modifier = Modifier
                .padding(bottom = 25.dp),
            style = MaterialTheme.typography.headlineLarge
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            placeholder = {
                Text(
                    text = "Numero de telefone, Email ou Nome de Usuario",
                    style = TextStyle(
                        textAlign = TextAlign.Center,
                        color = gray_text
                    )
                )
            },
            colors = TextFieldDefaults.textFieldColors(containerColor = gray),

            )

        OutlinedTextField(
            value = senha,
            onValueChange = { senha = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            placeholder = {
                Text(
                    text = "senha",
                    style = TextStyle(
                        textAlign = TextAlign.Center,
                        color = gray_text
                    )
                )
            },
            colors = TextFieldDefaults.textFieldColors(containerColor = gray),

            )
        Button(
            onClick = {
                // Lógica de login aqui
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp).padding(horizontal = 20.dp),
        ) {
            Text(text = "Entrar")
        }
        Text(text = "Esqueceu seus dados de login? obtenha ajuda ao entrar")
        Divider(
            color = MaterialTheme.colorScheme.onSurface,
            thickness = 2.dp,
            modifier = Modifier.padding(top = 20.dp)
        )
    }


}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {

    LoginScreen()
}
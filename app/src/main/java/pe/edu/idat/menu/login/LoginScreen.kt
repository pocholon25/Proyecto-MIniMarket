package pe.edu.idat.menu.login

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import pe.edu.idat.menu.Screens

@Composable
fun LoginScreen(onLoginSuccess: () -> Unit,navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login", style = MaterialTheme.typography.bodyLarge)
        // Aquí añadirás los TextFields y Buttons para el login
        Button(onClick = {
            onLoginSuccess()
            navController.navigate(Screens.Home.screens)
        }) {
            Text("Login")
        }
        Spacer(modifier = Modifier.height(16.dp))
        TextButton(onClick = {
            navController.navigate(Screens.CreateAccount.screens)
        }) {
            Text("Create New Account")
        }
        TextButton(onClick = {
            navController.navigate(Screens.ForgotPassword.screens)
        }) {
            Text("Forgot Password")
        }
    }
}

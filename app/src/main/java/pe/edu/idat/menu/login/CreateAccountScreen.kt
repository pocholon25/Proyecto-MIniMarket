package pe.edu.idat.menu.login

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CreateAccountScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Create Account", style = MaterialTheme.typography.bodyLarge)
        // Aquí añadirás los TextFields y Buttons para crear una nueva cuenta
        Button(onClick = {
            navController.popBackStack() // Volver al login
        }) {
            Text("Create Account")
        }
    }
}

package pe.edu.idat.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import pe.edu.idat.menu.model.Mascota
import pe.edu.idat.menu.ui.theme.Pink40

@Composable
fun Home(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                shape = MaterialTheme.shapes.large,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    EjemploRecyclerViewItems()
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = buildAnnotatedString {
                            append("Ver Todos")
                            addStyle(
                                style = SpanStyle(
                                    color = Color.Blue,
                                    textDecoration = TextDecoration.Underline
                                ),
                                start = 0,
                                end = "Ver Todos".length
                            )
                        },
                        modifier = Modifier.clickable {
                            navController.navigate(Screens.ViewAll.screens)
                        }.align(Alignment.End),
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}
@Composable
fun EjemploRecyclerViewItems() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()  // Ocupa todo el ancho
            .fillMaxHeight(fraction = 0.33f)  // Ocupa un tercio de la altura
    ) {
        items(listarMascotas()) { mascota ->
            itemMascota(mascota = mascota)
        }
    }
}

@Composable
fun itemMascota(mascota: Mascota) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        shape = MaterialTheme.shapes.large,
        modifier = Modifier
            .width(150.dp)  // Ajusta el ancho de cada tarjeta
            .height(200.dp)  // Ajusta la altura de cada tarjeta
            .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = mascota.imagen),
                contentDescription = "",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(top = 5.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = mascota.nombre, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = mascota.rasa)
            }
        }
    }
}

fun listarMascotas(): List<Mascota> {
    return listOf(
        Mascota("Bella", "KienSabe", 3, R.drawable.relojonejpeg),
        Mascota("petito", "KienSabe", 4, R.drawable.relojtwo),
        Mascota("yompian", "KienSabe", 6, R.drawable.relojthree),
        Mascota("argos", "KienSabe", 6, R.drawable.relojfour),
        Mascota("jose", "KienSabe", 3, R.drawable.relojfive),
        Mascota("Bella", "KienSabe", 3, R.drawable.relojonejpeg),
        Mascota("petito", "KienSabe", 4, R.drawable.relojtwo),
        Mascota("yompian", "KienSabe", 6, R.drawable.relojthree),
        Mascota("argos", "KienSabe", 6, R.drawable.relojfour),
        Mascota("jose", "KienSabe", 3, R.drawable.relojfive)
    )
}


package pe.edu.idat.menu.model

import androidx.annotation.DrawableRes

data class Mascota(var nombre: String, val rasa: String, val anios: Int, @DrawableRes var imagen: Int)

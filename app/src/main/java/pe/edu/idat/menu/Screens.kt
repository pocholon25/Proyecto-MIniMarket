package pe.edu.idat.menu

sealed class Screens(val screens: String) {
    data object  Home : Screens("home")
    data object  Profile : Screens("profile")
    data object  Settings : Screens("settings")
    data object LoginScreen: Screens("loginscreen")
    data object CreateAccount : Screens("createAccount")
    data object ForgotPassword : Screens("forgotPassword")
    data object ViewAll : Screens("ViewAll")
}
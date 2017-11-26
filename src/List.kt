val farbe = arrayListOf<String>("Gelb", "Rot", "Blau")
fun main(args: Array<String>) {
    //Ausgabe ganze Liste
    ausgabeListe(farbe)
    //Ausgabe Farbe Gelb
    println(ausgabeElement(farbe, "Gelb"))
    //Ausgabe gewählte Farbe
    wahlAusgabeElement()
    //Aufgabe4
    auswahlmenu()
}

fun ausgabeListe(farbe: ArrayList<String>) {
    println(farbe)
}

fun ausgabeElement(farbe: ArrayList<String>, nameOfElement: String): String {
    var result = "Element nicht vorhanden"
    for (einText in farbe) {
        if (einText == nameOfElement) {
            result = einText
        }
    }
    return result
}

fun wahlAusgabeElement() {
    var result = "Element nicht vorhanden"
    while (result == "Element nicht vorhanden") {
        println("Bitte Farbe eingeben: ")
        val input = readLine()
        if (input != null) {
            result = ausgabeElement(farbe, input)
        }
        println(result)
    }
}

fun auswahlmenu() {
    println("Wähle folgende Option:\n" + "1: Neue Farbe hinzufügen\n" + "2: Wähle Farbe\n" + "3: Alle Farben Ausgeben\n")
    val input = readLine()
    when (input) {
        "1" -> elementDazugeben()
        "2" -> wahlAusgabeElement()
        "3" -> erweiterteAusgabeListe(farbe)
        else -> println("Falsche Eingabe")
    }
    auswahlmenu()
}

fun elementDazugeben() {
    println("Neue Farbe bitte eingeben:")
    val inputElement = readLine()
    if (inputElement != null) {
        farbe.add(inputElement)
    }
    println("Farbe $inputElement wurde hinzugefügt!")
}

fun erweiterteAusgabeListe(farbe: ArrayList<String>) {
    for (einText in farbe) {
        println(einText)
    }
}

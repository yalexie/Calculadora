package cr.ac.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression


class MainActivity : AppCompatActivity() {

    var espacio: TextView? = null
    var n1: Double = 0.0
    var n2: Double = 0.0
    var cantNum: Int = 0
    var resultado: Double = 0.0
    var obtenerN1: String = ""
    var obtenerN2: String = ""
    var operacion: Char = ' '

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        espacio = findViewById(R.id.espacio)

        val buttonC: Button = findViewById(R.id.buttonC)
        buttonC.setOnClickListener{ Clear()}

        val buttonPorcentaje: Button = findViewById(R.id.buttonPorcentaje)
        buttonPorcentaje.setOnClickListener{ClickPorcentaje()}

        val buttonDivide: Button = findViewById(R.id.buttonDivide)
        buttonDivide.setOnClickListener{ClickDivide()}

        val buttonSiete: Button = findViewById(R.id.buttonSiete)
        buttonSiete.setOnClickListener{ ClickSiete()}

        val buttonOcho: Button = findViewById(R.id.buttonOcho)
        buttonOcho.setOnClickListener{ ClickOcho()}

        val buttonNueve: Button = findViewById(R.id.buttonNueve)
        buttonNueve.setOnClickListener{ ClickNueve()}

        val buttonMultiplica: Button = findViewById(R.id.buttonMultiplica)
        buttonMultiplica.setOnClickListener{ ClickMultiplica() }

        val buttonCuatro: Button = findViewById(R.id.buttonCuatro)
        buttonCuatro.setOnClickListener{ ClickCuatro()}

        val buttonCinco: Button = findViewById(R.id.buttonCinco)
        buttonCinco.setOnClickListener{ ClickCinco() }

        val buttonSeis: Button = findViewById(R.id.buttonSeis)
        buttonSeis.setOnClickListener{ ClickSeis() }

        val buttonResta: Button = findViewById(R.id.buttonResta)
        buttonResta.setOnClickListener{ ClickResta() }

        val buttonUno: Button = findViewById(R.id.buttonUno)
        buttonUno.setOnClickListener{ ClickUno() }

        val buttonDos: Button = findViewById(R.id.buttonDos)
        buttonDos.setOnClickListener{ ClickDos() }

        val buttonTres: Button = findViewById(R.id.buttonTres)
        buttonTres.setOnClickListener{ ClickTres() }

        val buttonSuma: Button = findViewById(R.id.buttonSuma)
        buttonSuma.setOnClickListener{ ClickSuma() }

        val buttonCero: Button = findViewById(R.id.buttonCero)
        buttonCero.setOnClickListener{ ClickCero() }

        val buttonPunto: Button = findViewById(R.id.buttonPunto)
        buttonPunto.setOnClickListener{ ClickPunto() }

        val buttonIgual: Button = findViewById(R.id.buttonIgual)
        buttonIgual.setOnClickListener{ ClickIgual() }

    }

    private fun ClickCero() {
        if (cantNum == 0) {
            if (n1 == 0.0) {
                obtenerN1 = "0"
                espacio?.text = "0"
            } else {
                obtenerN1 += "0"
                espacio?.append("0")
            }
            n1 = obtenerN1.toDouble()
        } else {
            obtenerN2 += "0"
            n2 = obtenerN2.toDouble()
            espacio?.append("0")
        }
    }

    private fun ClickUno() {
        if (cantNum == 0) {

            if (n1 == 0.0) {
                obtenerN1 = "1"
                espacio?.text = "1"
            } else {
                obtenerN1 += "1"
                espacio?.append("1")
            }
            n1 = obtenerN1.toDouble()
        } else {
            obtenerN2 += "1"
            n2 = obtenerN2.toDouble()
            espacio?.append("1")
        }
    }

    private fun ClickDos() {
        if (cantNum == 0) {

            if (n1 == 0.0) {
                obtenerN1 = "2"
                espacio?.text = "2"
            } else {
                obtenerN1 += "2"
                espacio?.append("2")
            }
            n1 = obtenerN1.toDouble()
        } else {
            obtenerN2 += "2"
            n2 = obtenerN2.toDouble()
            espacio?.append("2")
        }
    }

    private fun ClickTres() {
        if (cantNum == 0) {
            if (n1 == 0.0) {
                obtenerN1 = "3"
                espacio?.text = "3"
            } else {
                obtenerN1 += "3"
                espacio?.append("3")
            }
            n1 = obtenerN1.toDouble()
        } else {
            obtenerN2 += "3"
            n2 = obtenerN2.toDouble()
            espacio?.append("3")
        }
    }

    private fun ClickCuatro() {
        if (cantNum == 0) {
            if (n1 == 0.0) {
                obtenerN1 = "4"
                espacio?.text = "4"
            } else {
                obtenerN1 += "4"
                espacio?.append("4")
            }
            n1 = obtenerN1.toDouble()
        } else {
            obtenerN2 += "4"
            n2 = obtenerN2.toDouble()
            espacio?.append("4")
        }
    }

    private fun ClickCinco() {
        if (cantNum == 0) {
            if (n1 == 0.0) {
                obtenerN1 = "5"
                espacio?.text = "5"
            } else {
                obtenerN1 += "5"
                espacio?.append("5")
            }
            n1 = obtenerN1.toDouble()
        } else {
            obtenerN2 += "5"
            n2 = obtenerN2.toDouble()
            espacio?.append("5")
        }
    }

    private fun ClickSeis() {
        if (cantNum == 0) {
            if (n1 == 0.0) {
                obtenerN1 = "6"
                espacio?.text = "6"
            } else {
                obtenerN1 += "6"
                espacio?.append("6")
            }
            n1 = obtenerN1.toDouble()
        } else {
            obtenerN2 += "6"
            n2 = obtenerN2.toDouble()
            espacio?.append("6")
        }
    }

    private fun ClickSiete() {

        if (cantNum == 0) {
            if (n1 == 0.0) {
                obtenerN1 = "7"
                espacio?.text = "7"
            } else {
                obtenerN1 += "7"
                espacio?.append("7")
            }
            n1 = obtenerN1.toDouble()
        } else {
            obtenerN2 += "7"
            n2 = obtenerN2.toDouble()
            espacio?.append("7")
        }
    }

    private fun ClickOcho() {
        if (cantNum == 0) {
            if (n1 == 0.0) {
                obtenerN1 = "8"
                espacio?.text = "8"
            } else {
                obtenerN1 += "8"
                espacio?.append("8")
            }
            n1 = obtenerN1.toDouble()
        } else {
            obtenerN2 += "8"
            n2 = obtenerN2.toDouble()
            espacio?.append("8")
        }
    }

    private fun ClickNueve() {
        if (cantNum == 0) {
            if (n1 == 0.0) {
                obtenerN1 = "9"
                espacio?.text = "9"
            } else {
                obtenerN1 += "9"
                espacio?.append("9")
            }
            n1 = obtenerN1.toDouble()
        } else {
            obtenerN2 += "9"
            n2 = obtenerN2.toDouble()
            espacio?.append("9")
        }
    }

    private fun Clear() {
        this.n1 = 0.0
        this.n2 = 0.0
        this.resultado = 0.0
        this.espacio?.text = "0"
        this.obtenerN1 = ""
        this.obtenerN2 = ""
        this.cantNum = 0
        this.operacion = ' '
    }

    private fun ClickPorcentaje() {
        espacio?.append("%")
        operacion = '%'
        cantNum++
    }

    private fun ClickDivide() {
        espacio?.append("/")
        operacion = '/'
        cantNum++
    }

    private fun ClickMultiplica() {
        espacio?.append("x")
        operacion = 'x'
        cantNum++
    }

    private fun ClickResta() {
        operacion = '-'
        espacio?.append("-")
        cantNum++
    }

    private fun ClickSuma() {
        operacion = '+'
        espacio?.append("+")
        cantNum++
    }

    private fun ClickPunto() {
        if (cantNum == 0) {
            obtenerN1 += "."
            espacio?.append(".")
        } else {
            obtenerN2 += "."
            espacio?.append(".")
        }
    }

    private fun ClickIgual() {

        if (operacion == '/') {
            if (n2 != 0.0) {
                resultado = n1 / n2
                espacio?.text = resultado.toString()
                n1 = resultado
                n2 = 0.0
                obtenerN2 = "0"
            } else {
                espacio?.text = "Syntak Error"
            }
        } else if (operacion == 'x') {
            resultado = n1 * n2
            espacio?.text = resultado.toString()
            n1 = resultado
            n2 = 0.0
            obtenerN2 = "0"
        } else if (operacion == '+') {
            resultado = n1 + n2
            espacio?.text = resultado.toString()
            n1 = resultado
            n2 = 0.0
            obtenerN2 = "0"
        } else if (operacion == '-') {
            resultado = n1 - n2
            espacio?.text = resultado.toString()
            n1 = resultado
            n2 = 0.0
            obtenerN2 = "0"
        } else if (operacion == '%') {
            resultado = n1 * 100 / n2
            espacio?.text = resultado.toString() + "%"
            n1 = resultado
            n2 = 0.0
            obtenerN2 = "0"
        }


    }


}
fun main() {


    var opcion: Int
    var opc: Int
    var cont20 = 0
    var cont50 = 0
    var cont100 = 0
    var cont200 = 0
    var cont500 = 0
    var contador=0

    var suma =0



    val alcancia = arrayListOf<Int>()

    do {
        println(
            """
            
            Menu
            1.Agregar Moneda
            2.Contar Monedas 
            3.Calcular Todo el Dinero 
            4. Romper La alcancia 
            5.Ver Alcancia      
        """.trimIndent()
        )

        opc = readln().toInt()
        when (opc) {
            //Agregar Moneda
            1 -> {


                println(
                    """
                    Agregar Moneda 
                    
                    Elija Moneda a agregar a la alcancia 
                    
                  1. 20 pesos
                  2. 50 pesos
                  3. 100 pesos
                  4. 200 pesos
                  5. 500 pesos
                """.trimIndent()
                )
                opcion = readln().toInt()

                if (opcion == 1) {
                    alcancia.add(20)

                }

                if (opcion == 2) {
                    alcancia.add(50)

                }
                if (opcion == 3) {
                    alcancia.add(100)
                }
                if (opcion == 4) {
                    alcancia.add(200)
                }
                if (opcion == 5) {
                    alcancia.add(500)
                }

            }


            //Contar Monedas
            2 -> {
                for (moneda in alcancia){
                    if (moneda ==20 ){
                        cont20 ++;

                    }
                    println("moneda de 20 $cont20")
                    if (moneda ==50 ){
                        cont50 = cont50+1;
                    }

                    if (moneda ==100 ){
                        cont100 = cont100+1;
                    }
                    if (moneda ==200 ){
                        cont200 = cont200+1;
                    }
                    if (moneda ==500 ){
                        cont500 = cont500+1;
                    }

                }
                    println("""Hay $cont20  monedas de 20
                        | Hay $cont50  monedas de 50
                        | Hay $cont100  monedas de 100
                        | Hay $cont200  monedas de 200
                        | Hay $cont500  monedas de 500
                    """.trimMargin())
                }


            //Calcular dinero Total
            3 -> {

                for (i in alcancia){
                    suma = i + suma
                }
                println("""Total ahorrado: suma = $suma """)

            }
            //Vaciar romper alcancia
            4 -> {
                alcancia.remove(20)
                alcancia.remove(50)
                alcancia.remove(100)
                alcancia.remove(200)
                alcancia.remove(500)

                println("limpio ")

            }

            5 -> {
                println("Alcancia :  $alcancia")
            }


        }
    }while (opc!=6)


}
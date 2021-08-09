//Clase Perro

//*****************************************************************************
//Lammar a la clase random
//*****************************************************************************
import java.util.Random;

//*****************************************************************************
//Clase perro
//*****************************************************************************
class perro{
//******************variables de instancia*************************************
rand = new Random();

private Float animo = rand.nextFloat()*10 -5;
private Float umbral = rand.nextFloat()*20 - 20;
private String acto = null;
//************************Metodos**********************************************

/*
 El metodo psican imprime el animo del perro basado en la confiabilidad de la 
 persona y en el que esta tenga o no una galleta 
*/
private void psican(persona p){
    this.animo = (1.0 / p.getConfiabilidad())*(rand.nextFloat() - 0.5)*10 + this.animo;
    if(p.tieneGalleta()){
        p.dargalleta();
        this.animo +=(1.0 / p.getConfiabilidad())*(rand.nextInt(2));
    }

    System.out.println("Mi nuevo animo es; " + animo );

}

/*
Los siguientes 3 metodos modifican la instania acto dependiendo del valor del 
umbral y del animo.
*/

private void Morder( Float animo, Float umbral  ){

    if (( animo <= 0) && (umbral <= -10) ){

        acto = "morder";
    }    
}

private void Ladrar( Float animo, Float umbral  ){

    if (( animo <= 0) && (umbral >= -10) ){
    
        acto = "ladrar";
    }
}
    
private void MoverCola( Float animo, Float umbral  ){

    if (( animo > 0)){
    
        acto = "moverCola";
    
    }

}

/*
El siguiente metodo es publico y se encarga de imprimir el texto guardado en 
la variable acto, para que luego la persona reaccione a esta accion.
*/
 public String accion (){

    return this.acto;
    System.out.println(acto);


 }







}
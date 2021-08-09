// Clase Persona


//*****************************************************************************
//Lammar a la clase random
//*****************************************************************************
import java.util.Random;

//*****************************************************************************
//Clase persona
//*****************************************************************************
class persona{
//******************variables de instancia*************************************
Random rand = new Random();
perro pe = new perro();

private Float confiabilidad = rand.nextFloat()*10;
private boolean galleta = true;

//************************Metodos**********************************************

/*
El metodo getConfiabilidad hace posible, debido a que es un getter, tomar el valor 
guardado en la variable privada "Confiabilidad" y usarlo en la clase perro
*/
public Float getConfiabilidad(){

    return this.confiabilidad;

}

public boolean tieneGalleta() {
    return this.galleta;
}

public boolean dargalleta() {
    return this.galleta = false;
}

}

/*
El metodo reaccion llama al metodo getAccion creado en la clase perro para
poder reaccionar a la accion realizada por el perro
*/
public void reaccion (){
    
    if(pe.getAccion() == "morder"){
        System.out.println("Persona: -Chucho @#$%&*!!!!");
        //el perro mordio a la persona
    }
    else if(pe.getAccion() == "ladrar"){
        System.out.println("Persona: -Uy que miedo");
        //a la persona le da miedo cuando ladra
    }
    else if(pe.getAccion() == "moverCola"){
        System.out.println("Persona: (Sonrie porque el chucho esta contento)");
        //la persona esta contenta como el perro
    }


    }





}









}
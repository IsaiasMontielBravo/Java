/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

/**
 *
 * @author isime
 */
public class varias {
    /**
    * Devuelve el dígito que está en la posición n de un número entero. Se
    * empieza contando por el 0 y de izquierda a derecha.
    *
    * @param x un número entero positivo
    * @param p un número entero positivo
    * @return un entero
    */
    
    
    ///Digito N///
    public static int digitoN(int x,int p){
        int pos = p;
        int num = x;
        int contador = 0;
        int digito = 0;
        
        //cuenta las veces que se divide//
        contador = varias.cuentaDigitos(num);
        //crea el divisor//
        int divisor = varias.potencia(10,(contador-1));
        
        //busca el digito//
        contador = 0;   
        while(contador<=pos){
            digito = num/divisor;
            num = num%divisor;
            divisor = divisor/10;
            contador++;
            
        }
        //El numero digito es num//
        return digito;
    }
    
    
    /**
    * Devuelve verdadero si el número que se pasa como parámetro es capicúa
    * y falso en caso contrario.
    *
    * @param x un número entero positivo
    * @return verdadero o falso
    */
    
    //Es Capicúa/////////////////////////////////////////////////////
    public static boolean esCapicua(int x){
        int numeroOriginal = x;
        int volteado = 0;
        boolean esCapicua = false;
        
        //le da la vuelta//
        while(x>0){
            volteado = (volteado * 10) +(x % 10);
            x /= 10;
        }
        //comprueba si es capicua//
        if (numeroOriginal == volteado){
            esCapicua= true;
        }
        return esCapicua;
    }
    
    
    
    /**
    * Devuelve verdadero si el número que se pasa como parámetro es primo y
    * falso en caso contrario.
    *
    * @param num un número entero positivo
    * @return verdadero o falso
    */
    
    //Es primo////////////////////////////////////////////////////////
        
    public static boolean esPrimo(int num) {
        int x = 1;
        int resto = 0;
        int suma = 0;
        boolean esPrimo = false;

        //Verifica cuántas veces da de resto 0
        do {
          resto = num % x;
          if (resto == 0) {
            suma++;
          }
          x++;
        } while ((x <= num) && (num != 2));

        //Establece si es o no primo
        if ((suma == 2)||(num == 1)) {
            esPrimo = true;
        } 
        return esPrimo;
}

    /**
    * Devuelve el menor primo que es mayor al número que se pasa
    * como parámetro.
    *
    * @param num un número entero positivo
    * @return un entero
    */
    
    //Siguiente primo/////////////////////////////////////////////////////
    /**
    * Devuelve el menor primo que es mayor al número que se pasa
    * como parámetro.
    *
    * @param num un número entero positivo
    * @return un entero
    */
    
    //Siguiente primo/////////////////////////////////////////////////////
    public static int siguientePrimo(int num) {
       //Le va sumando 1 al número introducido hasta que sea primo
        do {
            num++;
        } while (!varias.esPrimo(num));
        
        return num;
}
    
    /**
    * Dada una base y un exponente devuelve la potencia.
    *
    * @param base un número entero positivo
    * @param exponente un número entero positivo
    * @return un entero
    */
    
    //Potencia/////////////////////////////////////////////////////
public static int potencia(int base, int exponente) {
    int potencia = 1;
    //calcula la potencia//
    if (base == 0){
        potencia = 0;
    }else{
        for (int i = 0; i<exponente;i++){
            potencia = potencia * base;
        }
    }
    return potencia;
}
/**
    * Cuenta el número de dígitos de un número entero.
    *
    * @param num un número entero positivo de tipo long
    * @return un entero
    */
    
    //Cuenta dígitos/////////////////////////////////////////////////////
    public static int cuentaDigitos(long num){
        int contador = 0;
        int digitos = 0;
        //cuenta cuantas veces se puede dividir un numero  hasta llegar a cero//
        while (num>0){
            num = num/10;
            contador++;
        }
        //establece cuantos digitos tiene//
        digitos = contador;
        return digitos;
    }
     /**
    * Le da la vuelta a un número.
    *
    * @param num un número entero positivo
    * @return un entero
    */
    
 //Vuelta/////////////////////////////////////////////////////
    public static int vuelta(int num){
        int volteado = 0;
        
        while(num>0){
            volteado = (volteado*10)+(volteado%10);
            num /=10;
        }
        return volteado;
    }
    /**
    * Da la posición de la primera ocurrencia de un dígito dentro de
    * un número entero. Si no se encuentra, devuelve -1.
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    
//Dice la posición de un dígito/////////////////////////////////////////////
    public static int posicionDeDigito(int num,int dig){
        int contador = varias.cuentaDigitos(num);
        //crea un array para guardar los digitos//
        int[]array = new int [contador];
        int indice = 0;
        
        //crea al divisor//
        int divisor = 1;
        while (contador>1){
            divisor = divisor *10;
            contador--;
        }
        //guarda el digito en un array//
        contador = varias.cuentaDigitos(num); 
        int numeroIntroducido = num;
        while(contador>0){
            num = numeroIntroducido/ divisor;
            numeroIntroducido = numeroIntroducido % divisor;
            divisor = divisor / 10;
            array[indice] = num;
            indice++;
            contador--;
       }
        //busca el digito//
        indice = indice -2;
        int x = 0;
        boolean aparece = false;
        while((dig !=array[x])&&(x <=indice)){
            x++;
        }
        if(dig == array[x]){
            aparece = true;
        }
        //establece la primera ocurrencia y devuelve -1 si no se encuentra//
        int ocurrencia = -1;
        if(aparece){
            ocurrencia = x;
        }
        return ocurrencia;
}
    /**
    * Le quita a un número n dígitos por detrás (por la derecha).
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    
    //Quita dígitos por detrás/////////////////////////////////////////////
      public static int quitaPorDetras(int num, int dig) {
          //crea el divisor//
          int divisor = 1;
          while(dig>0){
              divisor = divisor *10;
              dig--;
          }
          //crea el nuevo numero
          num = num /divisor;
          return num;
      }
      /**
    * Le quita a un número n dígitos por delante (por la izquierda).
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    
    //Quita dígitos por delante/////////////////////////////////////////////
     public static int quitaPorDelante(int num, int dig) {
         int divisor = 1;
         int contador = varias.cuentaDigitos(num);
         //crear divisor/
         while(contador>1){
             divisor = divisor *10;
             contador--;
             
         }
         //crea el nuevo numero quitandole los digitos dichos //
         while(dig>0){
             num = num % divisor;
             divisor = divisor/10;
             dig--;
         }
         return num;
         
     }
     /**
    * Le añade a un número n un dígitos por detrás (por la derecha).
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    
    //Añade dígito por detrás/////////////////////////////////////////////
public static int agregaPorDetras(int num, int dig) {
    //crea el numero añadiendole los numeros dichos//
    int longitud = varias.cuentaDigitos(dig);
    if(longitud>1){ 
        num = varias.agregaPorDelante(dig,num);
    }else{
        num = (num * 10) + dig;
    }
    return num;
}
/**
    * Le añade a un número n un dígitos por delante (por la izquierda).
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    //Añade dígito por delante/////////////////////////////////////////////
public static int agregaPorDelante(int num, int dig) {
    int x = num;
    int contador = 0;
    int divisor = 1;
    //crea el divisor //
    while(x>0){
        x = x/10;
        contador++;
    }
    while(contador >0){
        divisor = divisor *10;
        contador--;
    }
    //crea un nuevo numero poniendole lo que el usuario pide //
    x = (dig*divisor) + num;
    return x;
}
/**
    * Toma como parametros las posiciones inicial y final dentro de un
    * numero y devuelve el trozo correspondiente.
    *
    * @param num un numero entero positivo
    * @param ini un numero entero positivo
    * @param fin un numero entero positivo
    * @return un entero de tipo long
    */
    //Selecciona un trozo de un numero/////////////////////////////////////////
    public static long trozoDeNumero(int num,int ini,int fin){
        fin = varias.cuentaDigitos(num) - fin;
        num = varias.quitaPorDelante(num, (ini - 1));
        
        num = varias.quitaPorDetras(num,fin);
        
        return num;
    }
     /**
    * Pega dos numeros para formar uno.
    *
    * @param numUno un numero entero positivo
    * @param numDos un numero entero positivo
    * @return un entero de tipo long
    */
    //Junta dos numeros/////////////////////////////////////////
    public static int juntaNumeros(int numUno, int numDos) {
        int x = varias.cuentaDigitos(numDos);
        int multiplo = 1;
        while(x>0){
            multiplo = multiplo * 10;
            x--;
        }
        numUno = numUno * multiplo;
        numUno = numUno + numDos;
        return numUno;
    }
    /**
    * Pasa de decimal a binario.
    *
    * @param num un número entero positivo
    * @return array
    */
    //Pasa de decimal a binario/////////////////////////////////////////
    public static int[] decimalAbinario(int num) {
        int resultado = num;
        int resto = 0;
        int binario = 0;
        int contador = 0;
        
        //Averigua la longitud del array
        if (num > 8) {
            while (num > 0){
                num = num /2;
                contador++;
            }
        } else {
            contador = 5;
        }
        
        //Inicializa el array
        int[] array = new int [contador];
        int x = 0;
        
        num = resultado;
        while(resultado > 0) {
            resultado = num / 2;
            resto = num % 2;
            array[x] = resto;
            x++;
            num = num/2;
            
        }
        
        
        //Da vuelta el array
        contador = contador - 1;
        for(int i = 0; i < contador; i++) {
            int aux = array[i];
            array[i] = array[contador];
            array[contador] = aux;
            contador--;
        }
        
        return array;
    }
    
    /**
    * Pasa de binario a decimal.
    *
    * @param num un número entero positivo
    * @return un entero de tipo int
    */
    //Pasa de binario a decimal/////////////////////////////////////////
    public static int binarioAdecimal(int num) {
        int contador = varias.cuentaDigitos(num);
        contador--;
        int decimal = 0;
        int i = 1;
        //Crea el decimal
        for(int x = contador; x >= 0; x-- ){
            decimal = varias.digitoN(num, x) * i + decimal;
            i = i * 2;
        }
        return decimal;
    }
    
    /**
    * Pasa de binario a octal.
    *
    * @param x String de número
    * @return 
    */
    //Pasa de binario a octal/////////////////////////////////////////
    public static int[] binarioAoctal(int[] x) {
       //Crea el array para el hexadecimal
       int longitud = x.length;
       while ((longitud%3 != 0)) {
            longitud++;
       }
        longitud = longitud / 3;
        int[] arrayOctal = new int[longitud];
        
       //Forma los grupos
       int indice = x.length - 1;
       int indiceOctal = 0;
       int grupo = 0;
       
       while(indice >= 3) {
            grupo = 0;
            for(int i = indice - 2; i <= indice; i++) {       
                grupo = grupo * 10 + x[i]; 
            }
            grupo = varias.binarioAdecimal(grupo);
            arrayOctal[indiceOctal] = grupo;
            indiceOctal++;
            indice = indice - 3;
       }
              
       if((indice < 3) && (indice >= 0)) {
            grupo = 0;
            for(int i = 0; i <= indice; i++) {
                grupo = grupo * 10 + x[i]; 
            }
            grupo = varias.binarioAdecimal(grupo);
            arrayOctal[indiceOctal] = grupo;
            indiceOctal++;
            indice = indice - 3;
        }
       Arrays.volteaArrayInt(arrayOctal);
        return arrayOctal;

    }
    
    /**
    * Pasa de binario a hexadecimal.
    *
    * @param x String de número
    * @return array hexadecimal
    */
    //Pasa de binario a heradecimal/////////////////////////////////////////
    public static String[] binarioAhexadecimal(int[] x) {

        //Crea el array para el hexadecimal
        int longitud = x.length;
        while ((longitud%4 != 0)) {
            longitud++;
        }
        longitud = longitud / 4;
        String[] arrayHexadecimal = new String[longitud];  
        
        
       //Forma los grupos
       int indice = x.length - 1;
       int grupo = 0;
       int octal = 0;
       boolean esCero = false;
       int indiceHexadecimal = 0;
       
       while(indice >= 4) {
            grupo = 0;
            for(int i = indice - 3; i <= indice; i++) {            
                grupo = grupo * 10 + x[i]; 
            }
            grupo = varias.binarioAdecimal(grupo);
            if(grupo >= 10) {
                if(grupo == 10) {
                    arrayHexadecimal[indiceHexadecimal] = "A";
                }
                if(grupo == 11) {
                    arrayHexadecimal[indiceHexadecimal] = "B";
                }
                if(grupo == 12) {
                    arrayHexadecimal[indiceHexadecimal] = "C";
                }
                if(grupo == 13) {
                    arrayHexadecimal[indiceHexadecimal] = "D";
                }
                if(grupo == 14) {
                    arrayHexadecimal[indiceHexadecimal] = "E";
                }
                if(grupo == 15) {
                    arrayHexadecimal[indiceHexadecimal] = "F";
                }
            } else {
                arrayHexadecimal[indiceHexadecimal] = Integer.toString(grupo);
            }
            indice = indice - 4;
            indiceHexadecimal++;
       }
              
       if((indice < 4) && (indice >= 0)) {
            grupo = 0;
            for(int i = 0; i <= indice; i++) {
                grupo = grupo * 10 + x[i]; 
            }
            grupo = varias.binarioAdecimal(grupo);
            if(grupo >= 10) {
                if(grupo == 10) {
                    arrayHexadecimal[indiceHexadecimal] = "A";
                }
                if(grupo == 11) {
                    arrayHexadecimal[indiceHexadecimal] = "B";
                }
                if(grupo == 12) {
                    arrayHexadecimal[indiceHexadecimal] = "C";
                }
                if(grupo == 13) {
                    arrayHexadecimal[indiceHexadecimal] = "D";
                }
                if(grupo == 14) {
                    arrayHexadecimal[indiceHexadecimal] = "E";
                }
                if(grupo == 15) {
                    arrayHexadecimal[indiceHexadecimal] = "F";
                }
            } else {
                arrayHexadecimal[indiceHexadecimal] = Integer.toString(grupo);
            }
            indice = indice - 4;
            indiceHexadecimal++;
        }
       
       Arrays.volteaArrayString(arrayHexadecimal);
        return arrayHexadecimal;
    }
      
    /**
    * transforma int en array
    *
    * @param x int de número
    * @return array 
    */
    //Pasa int a array/////////////////////////////////////////
    public static int[] intAarray(int x) {
        int longitud = varias.cuentaDigitos(x);
        int[] array = new int[longitud];
        int indice = 0;
        while(longitud>0) {
            array[indice] = varias.digitoN(x, indice);
            longitud--;
            indice++;
        }
        return array;
    }
    
}



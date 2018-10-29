package ejercicios;
import java.awt.event.ActionListener;
import java.util.*;

public class Ejercicios {

    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(fact(4 ));        

        int arreglo[] = new int[5];
        arreglo[0] = 1;
        arreglo[1] = 2;
        arreglo[2] = 3;
        arreglo[3] = 4;
        arreglo[4] = 5;
    int arreglo1[] = new int[4];        
      
        
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        List<String> cadena = new ArrayList<String>();
        cadena.add("J");
        cadena.add("A");
        cadena.add("V");
        cadena.add("A");     

        List<Integer> fact = new ArrayList<Integer>();
        fact.add(1);
        fact.add(2);
        fact.add(3);
        fact.add(4);  
        fact.add(5);  

        
        // llama al metodo para sumar recursivamente el arreglo
        for(int j = 0; j<arreglo.length;j++){
            System.out.println("Elemento Arreglo "+j+" valor: "+arreglo[j]);
        }
        System.out.println("Suma del arreglo:"+sumaArreglo(arreglo, arreglo.length - 1));        
        System.out.println("");
        
        // llama al metodo para sumar recursivamente la lista         
        System.out.println("Valores de la Lista: "+numeros);
        System.out.println("Suma de la Lista:"+sumaLista(numeros, numeros.size() - 1));        
        System.out.println("");
        
        System.out.println(" Datos de la lista: "+cadena);
        System.out.println("Suma de la Lista:"+impresion(cadena, cadena.size() - 1));        
        System.out.println("");
        
        // llama al metodo para sacar factorial recursivamente       
        System.out.println(" Valor para Factorial: "+fact);
        System.out.println("Factorial de la Lista:"+factorial(fact, fact.size() - 1));        
        System.out.println("");
        
        // llama al metodo para sacar factorial recursivamente       
        int f= 11;
        System.out.println(" Valor para Factorial "+f+" es:"+factorial1(f));  
        System.out.println("");
        
        // llama al metodo para sacar fibonacci recursivo  
        long timerIni, timerFin, timerTotal;
        timerIni = 0;
        timerFin = 0;
        timerTotal = 0;
        timerIni = System.nanoTime()/1000000;
        f=0;
        System.out.println("Fibonaci recursivo de : 8");  
        while(f!=2){
            System.out.print(fibonacci(f)+",");     
            f ++;
        }
        System.out.println("");        
        timerFin= System.nanoTime()/1000000;
        timerTotal = (timerFin - timerIni);        
        System.out.println("Tiempo de Ejecución de Fibonaci recursivo de : "+timerFin+" - "+timerIni+" = "+timerTotal+ " milisegundos"); 
        System.out.println("");
        // llama al metodo para sacar fibonacci iterativo
        timerIni = 0;
        timerFin = 0;
        timerTotal = 0;
        timerIni = System.nanoTime()/1000000;
        f=1;
        System.out.println("Fibonaci iterativo de : 8");  
        System.out.println(fibonacciIterativo(f));     
        //Mide el tiempo de ejecución
        timerFin= System.nanoTime()/1000000;
        timerTotal = (timerFin - timerIni);
        
        System.out.println("Tiempo de Ejecución de Fibonaci Iterativo de : "+timerFin+" - "+timerIni+" = "+timerTotal+ " milisegundos");
        System.out.println("");
        
        // llama al metodo para busqueda binaria
        int[] array = { 18, 8, 15, 6, 14, 9, 13, 20};
        int buscar= 15;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Valor buscado: "+ buscar  + " en la posición "+busquedaBinaria(array, 0, array.length - 1, buscar));
        
        // llama al metodo para sacar binario  
        int b=10;
        System.out.println("Binario de : "+ b +" es : " + binario(b));
        System.out.println("");
        
        //Determinar numero a la potencia        
        System.out.println("La potencia de 2 a la 3 es: "+ potencia(2,3));  
        System.out.println("");
        //Ackerman

        System.out.println("Ackerman de 1 y 2 es: "+ackermann(1,2));  
        System.out.println("");
        
        //Catalan
        System.out.println("Catalan de 5 es: "+catalan(5));    
        System.out.println("");
        
        //Maximo comun divisor método Euclides        
        System.out.println("Maximo común divisor (Euclides) es: "+euclides(102, 68));    
        System.out.println("");
                
        //Maximo comun divisor método Divisores        
        System.out.println("Maximo común divisor (Divisores) es: "+divisores(102, 68));   
        System.out.println("");
        
        //Maximo comun divisor método Factores Primos
        System.out.println("Maximo común divisor (Factores Primos) es: "+factPrimos(102, 68));   
        System.out.println("");
        
        
        //Metodo Codigo Gray
        int n = 4;
        gray("", n);
    }
    // Metodo que recivle arreglo para sumar recursivo
    public static int sumaArreglo(int array[], int posArray) {
        int tamaño = posArray;
        int suma;
        if (tamaño == 0) {
            return array[tamaño];
        } else {
            suma = (array[tamaño]) + sumaArreglo(array, tamaño - 1);
        }
        return suma;
    }
    
    public static int sumaLista(List<Integer> lista, int posLista) {
        int tamaño = posLista;
        int suma;
        if (tamaño == 0) {
            return lista.get(tamaño);
        } else {
            suma = (lista.get(tamaño) + sumaLista(lista, tamaño - 1));                    
        }
        return suma;
    }
    
    public static String impresion(List<String> lista, int posLista) {
        int tamaño = posLista;
        String resultado;
        if (tamaño == 0) {
            return lista.get(tamaño);
        } else {
            resultado = (impresion(lista, tamaño - 1)+lista.get(tamaño));                    
        }
        return resultado;
    }
  
    //Determina el factorial de un numero
    public static int factorial(List<Integer> lista, int posLista) {
        int tamaño = posLista;
        int suma;
        if (tamaño == 0) {
            return lista.get(tamaño);
        } else {
            suma = (lista.get(tamaño) * factorial(lista, tamaño - 1));                    
        }
        return suma;
    }
        //Determina el factorial de un numero
    public static int factorial1(int n) {
        try{
            if (n<0)
                    throw new MiExcepcion(111);
           if (n<=1) 
               return 1;
           else 
               return n*factorial1(n-1);
        }catch (MiExcepcion ex){System.out.println(ex.getMessage());}
        return 0;
    }
    //Determina el fibonacci de un numero
    public static int fibonacci(int valor) {
        if (valor == 0 || valor == 1) {
            return 1;
        } else {
           return fibonacci(valor-1)+ fibonacci(valor-2);                    
        }
    }
    //Determina el fibonacci de un numero
    public static String fibonacciIterativo(int valor) {
        valor =valor+1;
        String fibo = "";
        String c="";
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        c= num1+","+num2+",";
        for(int i=1; i<=valor-2;i++){
            num3 = num1+num2;
            num1=num2;
            num2=num3;
            c=c+","+num3;
        }                     
       return c;
    }
    
    //Método para busqueda binaria
    public static int busquedaBinaria(int[] arreglo, int menor, int mayor, int valorBuscar){
        int media = (mayor + menor) / 2;
		int medio = arreglo[media];

		if (menor > mayor)
			return -1;
		else if(medio == valorBuscar) 
			return media;
		else if (medio < valorBuscar)
			return busquedaBinaria(arreglo, media+1, mayor, valorBuscar);
		else
			return busquedaBinaria(arreglo, menor, media-1, valorBuscar);
    }
    //Eleva a la potencia un numero
    public static int potencia(int valor, int potencia) {
        if (potencia == 0) {
            return 1;
        } else {
            
            return  valor * potencia(valor, potencia-1);              
        }        
    }
     //Determina el valor binario de un decimal   
    public static int binario(int num) {
        if ( num<2 )
            return num;
        else
            return num%2+binario(num/2) * 10;
    }    
    
     public static long ackermann(long m, long n)
    {
        if (m == 0)
            return n + 1;
        if (n == 0)
            return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }
     
   public static long catalan(long n){        
        long nCatalan=0; 
        long a = factorialC(2*n); //Se utiliza el metodo factorial
        long b =  (factorialC(n+1)*(factorialC(n)));
        nCatalan = a/b; 
        return nCatalan; 
    }  
        
    public static long factorialC(long valor) {
        if (valor == 0) {
            return 1;
        } else {
            return valor * factorialC(valor - 1);                    
        }        
    }
    public static double euclides(double valor1, double valor2) {
        double x = 0.0;
        double y = 0.0;
        if (valor2 == 0){ 
            return valor1;
        }else{ 
            x = valor1;
            y = x % valor2;
            return euclides(valor2, y);
        }        
    }
    
    public static int divisores(int valor1, int valor2){
        int i = 1;
        int j = 1;
        double aux = 0.0;
        List<Integer> lista1 = new ArrayList<Integer>();
        List<Integer> lista2 = new ArrayList<Integer>();
        
        while( i != valor1){
            if(j != valor2){
                
                 aux = valor2 % j;
                 if (aux == 0){
                     lista2.add(j);
                 }   
                 j ++;
            }

            aux = valor1 % i;
            if (aux == 0){
                lista1.add(i);
            }  
            i ++;
            
        }
        if(i == valor1)lista1.add(i);
        if(j == valor2)lista2.add(j);
        
        if(lista1.size()>lista2.size()){
            return comparaList(lista2.size(), lista2, lista1);
        }else{
            return comparaList(lista1.size(), lista1, lista2);
        }

    //return lista2;
    }
    public static int comparaList(int menor, List<Integer> lista1, List<Integer> lista2){
        List<Integer> listaOk = new ArrayList<Integer>();   
        int numeromayor = 0;
        for(int i=0; i<menor;i++){
            for(int j=0; j<lista2.size();j++){
                if(lista1.get(i) == lista2.get(j)){
                    listaOk.add(lista1.get(i));  
                    if(lista1.get(i)>numeromayor){ // 
                        numeromayor = lista1.get(i);
                    }
                }
            }
        }                
        return numeromayor;
    }
    
    //Determina los factores primos de un numero
    public static List<ArrayList> factPrimos(int valor1, int valor2){
        List<ArrayList> nListas = new ArrayList<ArrayList>();
        List<Integer> numerosPrimos = new ArrayList<Integer>();
        List<Integer> factor = new ArrayList<Integer>();
        List<Integer> valor = new ArrayList<Integer>();
        double res = 0.0;
        numerosPrimos.add(2);
        
        //ingresa a la lista los numeros primos
        for (int i=2; i<20; i++){
            res = i%2;
            if (res !=0){
                numerosPrimos.add(i);
            }            
        }
        valor1 = valor2;
        while(valor1 != 1){
            for(int j = 0; j<numerosPrimos.size();j++){
                if(valor1%numerosPrimos.get(j)== 0){
                    factor.add(numerosPrimos.get(j));
                    valor.add(valor1);
                    valor1=valor1/numerosPrimos.get(j);                    
                    break;
                    
                }
            }
        }
        valor.add(valor1);
        nListas.add((ArrayList) valor);
        nListas.add((ArrayList) factor);
        
        return nListas;
    }
    //Codigo Gray
        // append reverse of order n gray code to prefix string, and print
    public static void yarg(String prefix, int n) {
        if (n == 0) System.out.println(prefix);
        else {
            gray(prefix + "1", n - 1);
            yarg(prefix + "0", n - 1);
        }
    }  

    // append order n gray code to end of prefix string, and print
    public static void gray(String prefix, int n) {
        if (n == 0) System.out.println(prefix);
        else {
            gray(prefix + "0", n - 1);
            yarg(prefix + "1", n - 1);
        }
    }  
}

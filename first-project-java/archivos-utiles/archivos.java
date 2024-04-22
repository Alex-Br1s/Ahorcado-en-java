

public class archivos {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola mundo!");
        {
            System.out.println("hola mundo adentro");
        }
        // Formas de comentar en Java multiples lineas /* */ o una linea por comentario // 
        // Atajo para acomodar el codigo alt + mayús + f

        //* DATOS NUMERICOS
        int numero = 5; //*TIPOS DE DATOS ENTEROS: byte(-128 a 127), short(-32768 a 32767), int(default), long
        double decimal = 5.65676484; //*TIPOS DE DATOS DECIMAL: double(hasta 16 decimales) float(hasta 8)
        System.out.println(numero);
        System.out.println(decimal);

        //* TIPO DE DATO CARACTER
        char letra = 'a'; //* TIPO DE DATO QUE SOLO SE LE PUEDE ASIGNAR UN CARACTER
        System.out.println(letra);
        
        //* TIPO DE DATO BOOLEANO
        boolean v = true;
        boolean f = false;
        System.out.println(v);
        System.out.println(f);

        //* TIPO DE DATO STRING
        String cadena = "Esta es una cadena de string";
        System.out.println(cadena);

        System.out.println(cadena.toUpperCase());

        //* TIPO DE DATO ARRAY
        int[] numeros = {4,8,12,16};
        for(int index = 0; index < numeros.length; index++){
            System.out.println(numeros);//? Si lo imprimo asi me muestra el espacio en memoria
            System.out.println(numeros[index]);
        };
    }
}

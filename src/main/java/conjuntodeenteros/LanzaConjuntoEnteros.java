
package conjuntodeenteros;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class LanzaConjuntoEnteros {

    public static void main(String[] args) {
   System.out.println( "Ingrese el primer grupo de enteros (Conjunto A)" );
ConjuntoEnteros conjunto1 = ingresaConjunto();
System.out.println( "Ingrese el siguiente grupo de enteros (Conjunto B)" );
ConjuntoEnteros conjunto2 = ingresaConjunto();

ConjuntoEnteros union = conjunto1.union( conjunto2 );
ConjuntoEnteros intersecta = conjunto1.intersection( conjunto2 );


System.out.println( "El conjunto A contiene los siguientes elementos:" );
System.out.println( conjunto1.toString() );
System.out.println( "El conjunto B contiene los siguientes elementos:" );

System.out.println( conjunto2.toString() );
System.out.println(
"La Unión del conjunto A y el conjunto B contiene los siguientes elementos:" );
System.out.println( union.toString() );
System.out.println(
"La Intersección del conjunto A y el conjunto B contiene los siguientes elementos:" );
System.out.println( intersecta.toString() );


if ( conjunto1.isEqualTo( conjunto2 ) )
System.out.println( "El conjunto A es igual al conjunto B" );
else
System.out.println( "El conjunto A no es igual al conjunto B" );


System.out.println( "Insertando el número 77 en el conjunto A..." );
conjunto1.insertaElemento( 77 );
System.out.println( "El conjunto A ahora contiene los siguientes elementos:" );
System.out.println( conjunto1.toString() );

System.out.println( "Borrando el número 77 del conjunto A..." );
conjunto1.eliminarElemento( 77 );
System.out.println( "El conjunto A ahora contiene los siguientes elementos:" );
System.out.println( conjunto1.toString() );


int intArray[] = { 25, 67, 2, 9, 99, 22, 45, 17, 100, 1 };
ConjuntoEnteros otroConjunto = new ConjuntoEnteros( intArray );

System.out.println( "El nuevo conjunto tiene los siguientes elementos:" );
System.out.println( otroConjunto.toString() );
}



private static ConjuntoEnteros ingresaConjunto(){

Scanner input = new Scanner( System.in );
ConjuntoEnteros temp = new ConjuntoEnteros();

System.out.print( "Ingrese (-1 para finalizar): " );
int numero = input.nextInt();

while ( numero != -1 ){

temp.insertaElemento( numero );

System.out.print( "Ingrese (-1 para finalizar): " );
numero = input.nextInt();
}

return temp;
}

} 
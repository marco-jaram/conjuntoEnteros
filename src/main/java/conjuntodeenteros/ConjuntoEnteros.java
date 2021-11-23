package conjuntodeenteros;

public final class ConjuntoEnteros {

    private final int tam_conjunto = 101;
    boolean conjunto_entero[];

    public ConjuntoEnteros() {

        conjunto_entero = new boolean[tam_conjunto];

    }

    public ConjuntoEnteros(int arreglo[]) {

        conjunto_entero = new boolean[tam_conjunto];

        for (int i = 0; i < arreglo.length; i++) {
            insertaElemento(arreglo[i]);
        }

    }

    public void insertaElemento(int insertaEntero) {

        if (valorValido(insertaEntero)) {
            conjunto_entero[insertaEntero] = true;
        } else {
            System.out.println("Ingrese un número válido en el rango de 0 - 100");
        }

    }

    public void eliminarElemento(int borraNumero) {

        if (valorValido(borraNumero)) {
            conjunto_entero[borraNumero] = false;
        }

    }

    public ConjuntoEnteros union(ConjuntoEnteros conj_Entero) {

        ConjuntoEnteros temp = new ConjuntoEnteros();

        for (int i = 0; i < 101; i++) {
            temp.conjunto_entero[i] = (conjunto_entero[i] || conj_Entero.conjunto_entero[i]);
        }

        return temp;

    }

    public ConjuntoEnteros intersection(ConjuntoEnteros conj_Entero) {

        ConjuntoEnteros temp = new ConjuntoEnteros();

        for (int i = 0; i < 101; i++) {
            temp.conjunto_entero[i] = (conjunto_entero[i] && conj_Entero.conjunto_entero[i]);
        }

        return temp;

    }

    public boolean valorValido(int pruebaNumero) {

        return pruebaNumero >= 0 && pruebaNumero <= 100;
    }

    public boolean isEqualTo(ConjuntoEnteros conj_Entero) {

        for (int i = 0; i < 101; i++) {

            if (conjunto_entero[i] != conj_Entero.conjunto_entero[i]) {
                return false;
            }

        }

        return true;

    }

    @Override
    public String toString() {

        int x = 1;

        boolean vacio = true;
        String conjunto = "{ ";

        for (int count = 0; count < 101; count++) {

            if (conjunto_entero[count]) {
                conjunto += count + " ";
                vacio = false;
                x++;
            }

        }
        if (vacio) {
            conjunto += "---";
        }

        conjunto += " }";

        return conjunto;

    }

}

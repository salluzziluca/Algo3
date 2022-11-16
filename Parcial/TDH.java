package Parcial;

class TDH {
    public static void torresDeHanoi(int n, char desde_torre, char hacia_torre, char aux_torre) {
        if (n < 1)
            throw new IllegalArgumentException("n debe ser al menos 1");
        if (n > 20)
            throw new IllegalArgumentException("n es demasiado grande");
        if (n == 1) {
            System.out.println("Mover el disco 1 desde la torre " + desde_torre + " a la torre " + hacia_torre);
            return;
        }
        torresDeHanoi(n - 1, desde_torre, aux_torre, hacia_torre);
        System.out.println("Mover el disco " + n + " desde la torre " + desde_torre + " a la torre " + hacia_torre);
        torresDeHanoi(n - 1, aux_torre, hacia_torre, desde_torre);
    }

    public static void main(String args[]) {
        int n = 4; // Cantidad de discos
        torresDeHanoi(n, 'A', 'C', 'B'); // A, B y C son los nombres de las torres
    }
}
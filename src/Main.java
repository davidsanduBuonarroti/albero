public class Main {
    public static void main(String[] args) {
        Albero root = new Albero(
                new Albero(new Albero(12),
                        new Albero(
                                new Albero(10),
                                new Albero(8),
                                5
                        ),
                        4
                ),
                new Albero(6),
                9
        );
        System.out.println(root.stampaAlbero());
        System.out.println("Somma: " + root.sommaAlbero());
        System.out.println("Max: " + root.maxAlbero());
    }

}
public class ExeCom0104 {
    public static void main(String[] args) {
        String pizzaria = "Java Pizza";
        String sabor = "Portuguesa";
        char tamanho = 'G';
        float valor = 45.0f;
        float taxa = 5.5f;
        float total = valor + taxa;
        boolean borda = true;

        System.out.println("Pizzaria: " + pizzaria);
        System.out.println("Sabor: " + sabor + " | Tamanho: " + tamanho);
        System.out.println("Total: R$ " + total);
        System.out.println("Borda Recheada: " + borda);
    }
}

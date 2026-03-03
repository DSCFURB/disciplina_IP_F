public class Escrever {
    public static void main(String[] args) {
        String nomeCompleto;
        nomeCompleto = "Guilherme L Oliveira";
        System.out.println(nomeCompleto);

        String filme = "Tropa de Elite";
        int anoDeLancamento = 2009;
        int duracao = 240;
        float notaCritica = 8.7f;
        char letraInicial = 'T';
        boolean foiSucesso = true;

        System.out.println("O filme "+ filme);
        System.out.println("foi lançado em " + anoDeLancamento);
        System.out.println("e tem a duração de " + duracao + " minutos");
        System.out.println("e tem a nota da crítica de " + notaCritica);
        System.out.println(letraInicial);
        System.out.println(foiSucesso);

        System.out.print("O filme "+ filme + " foi lançado em " + anoDeLancamento + " e tem a duração de " + duracao + " minutos" + " e tem a nota da crítica de " + notaCritica);

        //O filme <filme> foi lançado em <ano>, tem duaração de <duracao> e nota de <notaCritica>

        System.out.format("O filme %s foi lançado em %d, tem duaração de %d e nota de %.1f ", filme,anoDeLancamento,duracao,notaCritica);
        
        String msg1 = "Universidade de "; 
        String msg2 = "Blumenau";
        int ano = 1964;
         

        String msgFinal = msg1 + msg2;
        System.err.println(msgFinal);

        System.out.format("Fundação %s Regional de %s e foi fundada em %d", msg1,msg2,ano);


    }
}

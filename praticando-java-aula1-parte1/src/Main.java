public class Main {
    public static void main(String[] args) {
        Perfil perfil = new Perfil();
        perfil.Comprimento("Ruan");

        Estudos estudos = new Estudos();
        estudos.acoesAluno();

        Soma soma = new Soma();
        soma.somaValores();

        Subtracao subtracao = new Subtracao();
        subtracao.subtracaoValores();

        MediaNotas mediaNotas = new MediaNotas();
        mediaNotas.mediaValores();
    }
}
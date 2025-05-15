public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica= new Musica();

        minhaMusica.titulo = " OH SE FENDESSE ";
        minhaMusica.artista = " MORADA ";
        minhaMusica.anoLancamento =  2024;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.8);
        minhaMusica.avalia(5.0);
        minhaMusica.avalia(4.9);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println(" Média das avaliações" + mediaAvaliacoes);


    }
}

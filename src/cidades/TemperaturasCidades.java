package cidades;

public class TemperaturasCidades {

    public static void afereTemperatura(int[][] temperaturas, String[] cidades){

        String cidadeMaisFria = "";
        String cidadeMaisQuente = "";
        int menorTemp = Integer.MAX_VALUE;
        int maiorTemp = Integer.MIN_VALUE;

        for (int linha = 0; linha < temperaturas.length; linha++) {
            for (int coluna = 0; coluna < temperaturas[linha].length; coluna++) {
                if (temperaturas[linha][coluna] < menorTemp){
                    menorTemp = temperaturas[linha][coluna];
                    cidadeMaisFria = cidades[linha];
                }
                if (temperaturas[linha][coluna] > maiorTemp){
                    maiorTemp = temperaturas[linha][coluna];
                    cidadeMaisQuente = cidades[linha];
                }
            }
        }

        System.out.printf("A cidade de %s teve a menor temperatura: %d C\n", cidadeMaisFria, menorTemp);
        System.out.printf("A cidade de %s teve a maior temperatura: %d C\n", cidadeMaisQuente, maiorTemp);

    }

    public static void main(String[] args) {
        String[] cidades = {"Londres", "Madri", "NY", "Buenos Aires", "Asuncion", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int [][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        afereTemperatura(temperaturas,cidades);
    }
}

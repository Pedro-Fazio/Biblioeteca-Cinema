//package exerciciopoo1;

/**
 * E comum criarmos uma classe Util que contenha enumeradores, constantes e metodos de utilidade que possivelmente venham a ser usados
 * em mais de uma classe do seu projeto.
 * Esse tipo de documentacao de codigo e conhecida como javadoc, pois e utilizada por um gerador de documentacao de mesmo nome que pode gerar HTMLs
 * contendo toda a documentaÃ§Ã£o do codigo, automaticamente.
 */

public class Util{
    /**
     * Como o rating de idade imprime uma descricao, faz mais sentido criarmos um metodo que retorna sua descricao ao inves de sobrescrevermos
     * seu metodo "toString", como abaixo em genero.
     * Portanto, criamos uma String para conter a descricao e seu construtor para recebe-la. Assim como para cada variavel do enum, ja¡ a declaramos chamando o construtor,
     * passando sua descricao.
     * O metodo getRatingDescription retorna a descriÃ§Ã£o de cada enum.
     * Assim, temos um metodo "limpo" que limita o usuario a colocar uma das das opcoes possi­veis.
     * @author leotp
     */
    public enum ageRatingsEnum {
        LIVRE("Livre Para Todos Os Publicos"), DEZ ("Nao Recomendado Para Menores de Dez Anos"), DOZE ("Nao Recomendado Para Menores de Catorze Anos"),
            CATORZE ("Nao Recomendado Para Menores de Catorze Anos"), DEZESSEIS ("Nao Recomendado Para Menores de Dezesseis Anos"),
            DEZOITO ("Nao Recomendado Para Menores de Dezoito Anos");

        private String desc;

        ageRatingsEnum(String desc) {
            this.desc = desc;
        }

        public String getRatingDescription() {
            return desc;
        }
    }

    /**
     * Como os generos precisam apenas de seus nomes, nao precisamos criar um metodo para devolver uma string de descricao como acima com os ratings de idade.
     * Podemos modificar (sobrescrever) o metodo toString, que originalmente retornaria a string com o nome da variavel do enum, para sua versao gramaticalmente correta.
     * @author leotp
     */
    public enum genresEnum {
        ACAO { 
            public String toString() {
                return "Açao";
            }
        },
        AVENTURA {
            public String toString() {
                return "Aventura";
            }
        },
        COMEDIA {
            public String toString() {
                return "Comedia";
            }
        },
        ROMANCE {
            public String toString() {
                return "Romance";
            }
        },
        FICCAO {
            public String toString() {
                return "Ficcao";
            }
        },
        TERROR {
            public String toString() {
                return "Terror";
            }
        },
        SUSPENSE {
            public String toString() {
                return "Suspense";
            }
        },
        POLICIAL {
            public String toString() {
                return "Policial";
            }
        },
    }
}


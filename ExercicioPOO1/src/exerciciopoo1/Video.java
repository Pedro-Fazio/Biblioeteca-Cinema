//package exerciciopoo1;
import java.util.Calendar;
import java.util.ArrayList;

public class Video {
    Util util = new Util();
    
    final Director DIRECTOR;
    final ArrayList<Actor> ACTOR;
    static int somadorACTOR;
    final String NAME;
    final Util.ageRatingsEnum AGERATING;
    final Util.genresEnum GENRESENUM;
    int ID; // ID atual
    static int somadorID; // Serve pra nao perder a contagem do ID
    int lenght; // Duracao do video
    int year; // Ano atual
    int nViews; // Visualizacoes do video
    int nUserRatings; // Numero de avaliacoes
    float userRating; // Media aritmetica
    int somaTotalAvaliacoes; // Usado como numerador da fracao pra calcular a media
    String classIndicativa;
    String genero;
    
    
    //Construtores
    
    Video() {
        DIRECTOR = new Director();
        ACTOR = null;
        NAME = null;
        AGERATING = null;
        GENRESENUM = null;
    }
    
    //Inicializa todas as variaveis
    Video(String NAME, int escolhaGenero, int escolhaClassIndicativa, Director DIRECTOR, ArrayList<Actor> actor) {
        
        this.ACTOR = actor;
        this.DIRECTOR = DIRECTOR;
        this.NAME = NAME;
        AGERATING = null;
        GENRESENUM = null;
        lenght = -1;
        year = -1;
        nViews = 0;
        nUserRatings = 0;
        somadorID = 0;
        criaID();
        escolhaGenero(escolhaGenero);
        escolhaClassIndicativa(escolhaClassIndicativa);
        
    }
    
    public void escolhaGenero(int escolhaGenero) {
        switch(escolhaGenero) {
            case 1: genero = GENRESENUM.ACAO.toString();
            break;
            
            case 2: genero = GENRESENUM.AVENTURA.toString();
            break;
            
            case 3: genero = GENRESENUM.COMEDIA.toString();
            break;
            
            case 4: genero = GENRESENUM.ROMANCE.toString();
            break;
            
            case 5: genero = GENRESENUM.FICCAO.toString();
            break;
            
            case 6: genero = GENRESENUM.TERROR.toString();
            break;
            
            case 7: genero = GENRESENUM.SUSPENSE.toString();
            break;
            
            case 8: genero = GENRESENUM.POLICIAL.toString();
            break;
        }
            
    }
    
    public void escolhaClassIndicativa(int escolhaClassIndicativa) {
        switch(escolhaClassIndicativa) {
            case 1: classIndicativa = AGERATING.LIVRE.getRatingDescription();
            break;
            
            case 2: classIndicativa = AGERATING.DEZ.getRatingDescription();
            break;
            
            case 3: classIndicativa = AGERATING.DOZE.getRatingDescription();
            break;
            
            case 4: classIndicativa = AGERATING.CATORZE.getRatingDescription();
            break;
            
            case 5: classIndicativa = AGERATING.DEZOITO.getRatingDescription();
            break;
        }
            
    }
    
    
    //Cria um novo ID para um novo video criado
    public void criaID() {
        ID = ++somadorID;
    }
    
    
    //Calcula a media aritmetica
    public float addUserRating(float _userRating) {
        somaTotalAvaliacoes += _userRating;
        nUserRatings++;
        
        userRating = somaTotalAvaliacoes/nUserRatings;
        
        return userRating;
    }
    
    
    public void incrementViews() {
        this.nViews++;
    }
    
    
    public int verificaAno(int ano, Calendar hoje) {
        int anoAtual = hoje.get(Calendar.YEAR);
        
        if(ano < 1878) {
            System.out.println("Não existiam filmes antes de 1878!");
            return 1;
        } else if(ano > anoAtual) {
            System.out.println("O filme não pode ter data de lançamento maior que 1 ano a partir deste!");
            return 1;
        } else {
            return 0;
        }
    }
    
    
    public int verificaDuracaoFilme() {
        if(lenght == -1) {
            return 1;
        } else {
            return 0;
        }
    }
    
    
    //Todos os setters
    public void setLenght(int duracao) {
        lenght = duracao;
    }
    
    public void setYear(int ano) {
        Calendar hoje = Calendar.getInstance();
        
        if(ano != -1 && verificaAno(ano, hoje) == 0) {
            year = ano;
        } else if (ano == -1 && verificaAno(hoje.get(Calendar.YEAR), hoje) == 0){
            year = hoje.get(Calendar.YEAR);
        }
    }
    
    
    //Todos os getters de Video

    public String getNAME() {
        return NAME;
    }
    
    public int getID() {
        return ID;
    }
    
    public int getLenght() {
        if(verificaDuracaoFilme() == 1) {
            System.out.println("Não foi atribuída uma duração para este filme!");
        }
        return lenght;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getNViews() {
        return nViews;
    }
    
    public int getNUserRatings() {
        return nUserRatings;
    }
    
    public float getUserRating() {
        return userRating;
    }
    
    public String getClassIndicativa() {
        return classIndicativa;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public Director getDirector() {
        return DIRECTOR;
    }
    
    public ArrayList<Actor> getActor() {
        return ACTOR;
    }
    
}
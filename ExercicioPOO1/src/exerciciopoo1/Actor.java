//package exerciciopoo1;

import java.time.LocalDate;
import java.time.Period;

public class Actor{
    String name;
    String country;
    LocalDate birthdate;
    String dia;
    String mes;
    String ano;
    int age;

    // Construtores
 
    Actor(String name, String country, String birthdate) {
        
        dia = birthdate.substring(0, 2);
        mes = birthdate.substring(3, 5);
        ano = birthdate.substring(6, 10);
        
        this.name = name;
        this.country = country;
        calculaIdade(LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia)));
        age = Period.between(this.birthdate, LocalDate.now()).getYears();
    }
    
    Actor() {
       this.name = null;
       this.name = null;
    }
    
    public void calculaIdade(LocalDate birthdate) {
        this.birthdate = birthdate;
    }  
   
    
    // Todos os getters
    
    public String getName() {
        return this.name;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public LocalDate getBirthdate() {
        return this.birthdate;
    }
    
    public int getAge() {
        return this.age;
    }
    
    
    // Todos os setters
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public void setBirthdate(String birthdate) {
        dia = birthdate.substring(0, 2);
        mes = birthdate.substring(3, 5);
        ano = birthdate.substring(6, 10);
        
        calculaIdade(LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia)));
        age = Period.between(this.birthdate, LocalDate.now()).getYears();
    }
}

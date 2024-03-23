package javarecordscontrol;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Recorde {
        
        private String nome;
        private LocalDate dataRecorde;
        private double tempo;

    public Recorde( String nome,LocalDate dataRecorde, double tempo) {
        this.nome = nome;
        this.dataRecorde = dataRecorde;
        this.tempo = tempo;
    }

    public LocalDate getDataRecorde() {
        return dataRecorde;
    }

    public void setDataRecorde(LocalDate dataRecorde) {
        this.dataRecorde = dataRecorde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }
 
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
@Override
public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatada = dataRecorde.format(formatter);
    return "Recorde [nome=" + nome + ", dataRecorde=" + dataFormatada + ", tempo=" + tempo + " segundos]";
}

            

}

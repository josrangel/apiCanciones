package com.chemasmas.jaxrs.canciones.domain;

import javax.ejb.Local;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbNumberFormat;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Cancion {

     @JsonbProperty
     int id;

        @JsonbProperty
        String titulo;

        @JsonbProperty(nillable=true)
        String cantante;

        @JsonbProperty
        String letra;

        @JsonbProperty
        String josueRobertoRangelCuevas="c mamut";

        @JsonbProperty("song_tags")
        String[] tags;

        @JsonbDateFormat("dd.MM.yyyy")
        LocalDate lanzamiento;

        long ventas;

        @JsonbNumberFormat("#0.00")
        public BigDecimal salario;


        public LocalDate getLanzamiento() {
            return lanzamiento;
        }

        public void setLanzamiento(LocalDate lanzamiento) {
            this.lanzamiento = lanzamiento;
        }

        public Cancion(){

        }
        public Cancion(int id, String titulo, String cantante, String letra, String[] tags,LocalDate lanzamiento) {
            this.id = id;
            this.titulo = titulo;
            this.cantante = cantante;
            this.letra = letra;
            this.tags = tags;
            this.lanzamiento = lanzamiento;
            this.salario = new BigDecimal(1000000.0050001);
        }



    public static Cancion DummyCancion(){
            return new Cancion(
                    1,
                    "Ramito de violetas",
                    "Banda el Mexicano",
                    "Era feliz en su matrimonio ...",
                    new String[]{"Banda", "Rolon"},
                    LocalDate.now()
            );
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        @JsonbProperty("cantante")
        public String getCantante() {
            return cantante;
        }

        @JsonbProperty("autor")
        public void setCantante(String cantante) {
            this.cantante = cantante;
        }

    public String getJosueRobertoRangelCuevas() {
        return josueRobertoRangelCuevas;
    }

    public void setJosueRobertoRangelCuevas(String josueRobertoRangelCuevas) {
        this.josueRobertoRangelCuevas = josueRobertoRangelCuevas;
    }

    public String getLetra() {
            return letra;
        }

        public void setLetra(String letra) {
            this.letra = letra;
        }

        public String[] getTags() {
            return tags;
        }

        public void setTags(String[] tags) {
            this.tags = tags;
        }

        public long getVentas() {
            return ventas;
        }

        @JsonbTransient
        public void setVentas(long ventas) {
            this.ventas = ventas;
        }

        public BigDecimal getSalario() {
            return salario;
        }

        public void setSalario(BigDecimal salario) {
            this.salario = salario;
        }


}

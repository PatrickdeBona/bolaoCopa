package com.patrickdebona.bolao.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Partida")
public class PartidaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private SelecaoModel mandante;

    @Column(nullable = false)
    private SelecaoModel visitante;

    @Column(nullable = false)
    private Integer gols_mandantes;
    
     @Column(nullable = false)
    private Integer gols_visitantes;
     
     @Column(nullable = false)
    private Date tempo;

    public PartidaModel() {
    }

    public PartidaModel(Long id, SelecaoModel mandante, SelecaoModel visitante, Integer gols_mandantes, Integer gols_visitantes, Date tempo) {
        this.id = id;
        this.mandante = mandante;
        this.visitante = visitante;
        this.gols_mandantes = gols_mandantes;
        this.gols_visitantes = gols_visitantes;
        this.tempo = tempo;
    }

    public SelecaoModel getMandante() {
        return mandante;
    }

    public void setMandante(SelecaoModel mandante) {
        this.mandante = mandante;
    }

    public SelecaoModel getVisitante() {
        return visitante;
    }

    public void setVisitante(SelecaoModel visitante) {
        this.visitante = visitante;
    }

    public Integer getGols_mandantes() {
        return gols_mandantes;
    }

    public void setGols_mandantes(Integer gols_mandantes) {
        this.gols_mandantes = gols_mandantes;
    }

    public Integer getGols_visitantes() {
        return gols_visitantes;
    }

    public void setGols_visitantes(Integer gols_visitantes) {
        this.gols_visitantes = gols_visitantes;
    }

    public Date getTempo() {
        return tempo;
    }

    public void setTempo(Date tempo) {
        this.tempo = tempo;
    }

    

    public Long getId() {
        return id;
    }

}

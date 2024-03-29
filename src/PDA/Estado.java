/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDA;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giandoso
 */
public class Estado {

    int id;
    boolean estado_inicial;
    boolean estado_final;
    List<Transicao> lista_transicoes;

    public Estado(int id, boolean estado_inicial, boolean estado_final) {
        this.id = id;
        this.estado_inicial = estado_inicial;
        this.estado_final = estado_final;
        this.lista_transicoes = new ArrayList<>();
    }

    public void adiciona_transicao(Transicao t) {
        this.lista_transicoes.add(t);
    }

    public void set_lista_transicao(List<Transicao> t) {
        this.lista_transicoes = t;
    }
    
    public void set_inicial(boolean estado_inicial) {
        this.estado_inicial = estado_inicial;
    }

    public void set_final(boolean estado_final) {
        this.estado_final = estado_final;
    }    
}

package ro.ulbs.paradigme.lab4.util;

import java.util.*;

public class prob452 {
    private String nume;
    private String grupa;
    private List<Integer> note;

    public prob452(String nume, String grupa) {
        this.nume = nume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public String getGrupa() {
        return grupa;
    }

    public void adaugaNota(int nota) {
        note.add(nota);
    }

    public boolean esteIntegralist() {
        // Studentul este integralist dacă toate notele sunt ≥ 5
        for (int nota : note) {
            if (nota < 5) {
                return false;
            }
        }
        return true;
    }

    public float getMedie() {
        if (note.isEmpty()) return 0;
        float suma = 0;
        for (int nota : note) {
            suma += nota;
        }
        return suma / note.size();
    }

    public int getNumarRestante() {
        int restante = 0;
        for (int nota : note) {
            if (nota < 5) {
                restante++;
            }
        }
        return restante;
    }

    @Override
    public String toString() {
        return nume + " (Grupa: " + grupa + ") - Restanțe: " + getNumarRestante() + ", Medie: " + getMedie();
    }
}

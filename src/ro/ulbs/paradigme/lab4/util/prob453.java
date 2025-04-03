package ro.ulbs.paradigme.lab4.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Student1 {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;

    public Student1(String nume, String prenume, String grupa, List<Integer> note) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = new ArrayList<>(note);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student = (Student1) o;
        return nume.equals(student.nume) && prenume.equals(student.prenume) && grupa.equals(student.grupa) && note.equals(student.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, grupa, note);
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " " + grupa + " " + note;
    }
}
public class prob453 {
    public static void main(String[] args) {
        Map<Student1, Integer> studentMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("infoStudenti.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String nume = parts[0];
                String prenume = parts[1];
                String grupa = parts[2];
                List<Integer> note = new ArrayList<>();
                for (int i = 3; i < parts.length; i++) {
                    note.add(Integer.parseInt(parts[i]));
                }

                Student1 student = new Student1(nume, prenume, grupa, note);
                studentMap.put(student, studentMap.getOrDefault(student, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Afișare rezultate
        for (Map.Entry<Student1, Integer> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

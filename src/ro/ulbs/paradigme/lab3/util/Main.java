import ro.ulbs.paradigme.lab4.util.*;

public void main() {

    List<prob452> studenti = new ArrayList<>();

    prob452 s1 = new prob452("Andrei Popescu", "321");
    s1.adaugaNota(4);
    s1.adaugaNota(6);
    s1.adaugaNota(3);

    prob452 s2 = new prob452("Maria Ionescu", "322");
    s2.adaugaNota(7);
    s2.adaugaNota(8);
    s2.adaugaNota(6);

    prob452 s3 = new prob452("Ion Georgescu", "321");
    s3.adaugaNota(3);
    s3.adaugaNota(2);
    s3.adaugaNota(4);

    prob452 s4 = new prob452("Elena Vasilescu", "323");
    s4.adaugaNota(10);
    s4.adaugaNota(9);
    s4.adaugaNota(8);

    prob452 s5 = new prob452("Dan Marinescu", "322");
    s5.adaugaNota(5);
    s5.adaugaNota(4);
    s5.adaugaNota(6);

    // Adăugăm studenții în lista generală
    studenti.add(s1);
    studenti.add(s2);
    studenti.add(s3);
    studenti.add(s4);
    studenti.add(s5);

    // Filtrăm doar studenții restanțieri (număr de restanțe > 0)
    List<prob452> restantieri = new ArrayList<>();
    for (prob452 s : studenti) {
        if (!s.esteIntegralist()) {
            restantieri.add(s);
        }
    }

    // Sortăm crescător după numărul de restanțe
    restantieri.sort(Comparator.comparingInt(prob452::getNumarRestante));

    // Afișăm rezultatele
    System.out.println("Studenți restanțieri ordonați crescător după numărul de restanțe:");
    for (prob452 s : restantieri) {
        System.out.println(s);
    }
}



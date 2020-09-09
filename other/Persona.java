import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Persona implements Comparable<Persona> {

    String _nome;
    int _eta;

    Persona(String nome, int eta) {
        _nome = nome;
        _eta = eta;
    }

    String getNome() {
        return _nome;
    }

    int getEta() {
        return _eta;
    }

    @Override
    public int compareTo(Persona o) {
        return getEta() - o.getEta();
    }

    @Override
    public String toString() {
        return "Persona [nome=" + getNome() + ", eta=" + getEta() + "] ";
    }
    
    static void aggiungiPersona(List<Persona> list1, List<Persona> list2, Persona other) {
        if(list2.isEmpty()) {
            if(!list1.isEmpty()){
                list2.add(Collections.min(list1));
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        else {
            if(!list1.isEmpty()) {
                list2.add(Collections.min(list1, Comparator.comparing(Persona::getNome)));            }
            else{
                throw new IllegalArgumentException();
            }
        }
    }
}

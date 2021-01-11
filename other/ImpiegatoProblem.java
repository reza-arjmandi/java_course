import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface ImpiegatoInterface {
    public List<? extends Impiegato> sumAndCompare(Class<? extends Impiegato> imp); 
}

interface FuncInterface {
    boolean function(int l);
}

class Impiegato implements ImpiegatoInterface {

    final String nome;
    final int salario;
    
    public Impiegato(final String nome, final int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    String getNome() {
        return nome;
    }

    int getSalario() {
        return salario;
    }

    @Override
    public List<? extends Impiegato> sumAndCompare(final Class<? extends Impiegato> imp) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FuncInterface sumAndCompare(final Class<? extends Impiegato> imp) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) { 
            return true; 
        } 
    
        if(o == null || o.getClass()!= this.getClass()) {
            return false; 
        }
          
        Impiegato c = (Impiegato) o; 
          
        return getNome().equals(c.getNome()) && getSalario() == c.getSalario(); 
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    static int getMaxNome(List<? extends Impiegato> l1) {
        // return Collections.max(l1, Comparator.comparing(Impiegato::getSalario)).getSalario();
        return l1.stream().sorted(Comparator.comparing(Impiegato::getSalario).reversed()).findFirst().orElseThrow(IllegalArgumentException::new).getSalario();
    }

}
public class ImpiegatoProblem {
    
}

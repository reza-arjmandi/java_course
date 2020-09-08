
// import java.util.ArrayList;
// import java.util.Objects;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

// public class MatriceStream {


// 	private final ArrayList<ArrayList<Integer>> m;
// 	private int i;
// 	private int j;
// 	private int numRows;
// 	private int numCols;
	
	
	
// 	public MatriceStream(ArrayList<ArrayList<Integer>> m, int i, int j){
		
// 		//Controllo che la matrice non sia null e che gli indici non sforino
// 		if (m==null || i > m.size()-1 || j > m.get(0).size()-1) throw new IllegalArgumentException();//Controllo che non sia null
		
// 		//Controllo che il numero di righe == null sia pari a 0	
// 		long nullRows = m.stream().filter(x -> Objects.isNull(x)).count();
// 		if(nullRows > 0) throw new IllegalArgumentException();
			
// 		//Controllo che tutte le righe siano della stessa lunghezza
// 		int rowSize = m.get(0).size();
// 		for(ArrayList<Integer> riga : m) {
// 			if (riga.size() != rowSize) throw new IllegalArgumentException();
// 		}
		
// 		this.m = m;
// 		this.i = i;
// 		this.j = j;
// 		numRows = m.size();
// 		numCols = m.get(0).size();
		
		
// 	}
	
// 	//Getters & Setters
// 	public int getI() {
// 		return i;
// 	}

// 	public void setI(int i) {
// 		this.i = i;
// 	}

// 	public int getJ() {
// 		return j;
// 	}

// 	public void setJ(int j) {
// 		this.j = j;
// 	}

// 	public int getNumRows() {
// 		return numRows;
// 	}

// 	public void setNumRows(int numRows) {
// 		this.numRows = numRows;
// 	}
	
// 	public int getNumCols() {
// 		return numCols;
// 	}

// 	public void setNumCols(int numCols) {
// 		this.numCols = numCols;
// 	}

// 	public ArrayList<ArrayList<Integer>> getM() {
// 		return m;
// 	}
	
	
	
	
// 	public ArrayList<ArrayList<Integer>> extractAdjacentRows(){ 
		
// 		ArrayList<ArrayList<Integer>> adjacentRows = new ArrayList<ArrayList<Integer>>();
		
// 		adjacentRows.add(m.get(i));//Riga da aggiungere
		
// 		if((i+1)%m.size() <i) adjacentRows.add(0, m.get((i+1)%m.size()));// se l'indice sfora la aggiungo in testa
// 		else adjacentRows.add(m.get((i+1)%m.size())); //altrimenti aggiungo in coda		
		
// 		int index = i-1;
// 		if(index < 0) index += m.size();
		
// 		if(index < i) {
// 			if(adjacentRows.get(0).equals(m.get((i+1)%m.size())))
// 				adjacentRows.add(1, m.get(index));// se l'indice non sfora la aggiungo in testa
// 			else 
// 				adjacentRows.add(0, m.get(index));// se l'indice non sfora la aggiungo in testa
// 		}
// 		else adjacentRows.add(m.get(index));//Altrimenti la aggiungo in coda		
		
// 		return adjacentRows;
// 	}
	
// 	public ArrayList<Integer> extractAdjacentColumns(int row) {
		
// 		if(row >= m.size()) throw new IllegalArgumentException();
		
// 		ArrayList<Integer> adjacentColumns = new ArrayList<Integer>();
		
// 		adjacentColumns.add(m.get(row).get(j));//cella da aggiungere di indice j
		
// 		int rowSize = m.get(row).size();
		
// 		System.out.println((j+1)% rowSize);
// 		//aggiungo le adiacenti
// 		if((j+1)%rowSize < j) 
// 			adjacentColumns.add(0, m.get(row).get((j+1)% rowSize));			
// 		else
// 			adjacentColumns.add( m.get(row).get((j+1)% rowSize));	
		
// 		int index = j-1;
// 		if(index < 0) index += rowSize;
		
// 		if(index < j){
// 			if(adjacentColumns.get(0).equals(m.get(row).get((j+1)% rowSize))) {
// 				adjacentColumns.add(1, m.get(row).get(index));
// 			}else {
// 				adjacentColumns.add(0, m.get(row).get(index));
// 			}
// 		}else {
// 			adjacentColumns.add(m.get(row).get(index));
// 		}
		
		
// 		return adjacentColumns;
// 	}
	
	
// }

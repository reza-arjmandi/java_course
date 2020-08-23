import DataAcquisition.CircularPrimeConsoleDataAcquisition;
import DataAcquisition.IDataAcquisition;
import ProblemSolver.CircularPrimeSolver;
import ProblemSolver.IProblemSolver;
import UserInterface.CircularPrimeConsoleUserInterface;
import UserInterface.IUserInterface;

public class Application {
    
    public static void main(String[] args) {
        IDataAcquisition data_acquisition = new CircularPrimeConsoleDataAcquisition();
        IProblemSolver problem_solver = new CircularPrimeSolver(data_acquisition);
        IUserInterface user_interface = new CircularPrimeConsoleUserInterface(problem_solver);

        problem_solver.solve();
        user_interface.DisplayOutputs();
    } 
    
}
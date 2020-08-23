package UserInterface;

import java.util.List;

import ProblemSolver.IProblemSolver;

public class CircularPrimeConsoleUserInterface implements IUserInterface{

    public CircularPrimeConsoleUserInterface(IProblemSolver problem_solver){
        _problem_solver = problem_solver;
    }
    
    @Override
    public void DisplayOutputs() {
        List outputs = _problem_solver.get_outputs();
        System.out.println(outputs.get(0));
    }

    IProblemSolver _problem_solver;
    
}
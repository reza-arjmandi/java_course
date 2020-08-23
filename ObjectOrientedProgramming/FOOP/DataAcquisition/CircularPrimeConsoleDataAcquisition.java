package DataAcquisition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularPrimeConsoleDataAcquisition implements IDataAcquisition {

    @Override
    public List get_inputs() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List result = new ArrayList<>();
        result.add(number);
        return result;
    }
    
}
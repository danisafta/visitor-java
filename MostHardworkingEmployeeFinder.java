package Implementations;

/**
 * Clasa folosita pentru a vedea daca media numarului de ore suplimentare pentru angajati
 * este mai mare decat cea a managerilor.
 */
public class MostHardworkingEmployeeFinder implements Visitor {

	private int numberOfEmployees;
	private int numberOfManagers;
	private float averageEmployeesExtraHours;
	private float averagEmployeesExtraHours;
    @Override
    public void visit(Employee employee) {
    	//TODO
    	numberOfEmployees++;
    	averageEmployeesExtraHours += employee.extraHours;
    }

    @Override
    public void visit(Manager manager) {
        //TODO
    	numberOfManagers++;
    	averagEmployeesExtraHours += manager.extraHours;
    }

    public boolean isManagerHardWorking() {
        //TODO
    	return averagEmployeesExtraHours/numberOfManagers > averageEmployeesExtraHours/numberOfEmployees;
    }

	@Override
	public void visit(Intern intern) {
		// TODO Auto-generated method stub
	}
}

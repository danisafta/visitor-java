package Implementations;

public interface Visitor {
    void visit(Employee employee);
    void visit(Intern intern);
    void visit(Manager manager);
}
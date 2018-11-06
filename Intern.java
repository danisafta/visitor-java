package Implementations;

//TODO implementati interfata Visitable
public class Intern extends Employee implements Visitable {

    private String  name;
    private int duration;  // in months
    public Intern(String name, int duration) {
    	super(name);
    	this.name=name;
    	this.duration = duration;
    }
    public String getName() {
        return this.name;
    }

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	
	public int getDuration() {
		return duration;
	}
}

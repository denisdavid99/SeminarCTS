package ro.ase.cts.decorator;

public class ConcretDecorator extends AbstractDecorator{

	public ConcretDecorator(ICard icard) {
		super(icard);
	}

	@Override
	public void platesteContactLess() {
		System.out.println(super.getIcard().getDetinator() + "plateste contactless");
	}	
}
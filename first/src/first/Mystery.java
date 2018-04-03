package first;

public class Mystery {

	private int my_opOne;
	private int my_opTwo;
	
	public Mystery( int opOne, int opTwo )
	{
	my_opOne = opOne;
	my_opTwo = opTwo;
	}
	
	public String toString( )
	{
	return my_opOne + ", " + my_opTwo;
	}
	
	public void doSomething( )
	{
	my_opOne = my_opOne + 1;
	my_opTwo = my_opTwo - 1;
	}
	
	public static void main( String[] args )
	{
	Mystery aMystery = new Mystery( 9, 3 );
	System.out.println( aMystery.toString( ) );
	aMystery.doSomething( );
	System.out.println( aMystery.toString( ) );
	aMystery.doSomething( );
	System.out.println( aMystery.toString( ) );
	}

}

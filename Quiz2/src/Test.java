import static org.junit.Assert.assertEquals;
import Exceptions.TriangleException;

public class Test {

	
	@Test
	public void testArea() throws TriangleException {
		Triangle tri=new Triangle(5,12,13);
		double A=30;
		assertEquals(A,tri.getArea(),0);
		
	@Test
	public void testPerimeter() throws TriangleException {
		Triangle tri1=new Triangle(5,12,13);
		double P=30;
		assertEquals(P,tri1.getArea(),0);
		
	@Test
	public void testTriangleException() throws TriangleException {
		Triangle tri2= new Triangle(1,3,10);
		
	}
		
	}
}

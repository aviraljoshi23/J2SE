
package ObjectOrientedPrograms;
//37)Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor.
//Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
class Tile
{
	private int edge;
	private int area;
	public Tile(int length)
	{
		this.edge = length;
		this.area = edge*edge;
	}
	public int getArea()
	{
		return area;
	}
}
class floor
{
	private int length;
	private int width;
	public floor(int length,int width)
	{
		this.length = length;
		this.width = width;
	}
	void totalTiles(Tile t)
	{
		double Area = t.getArea();
		double floorArea = length*width;
		double noOfTiles = floorArea/Area;
		System.out.printf("No. of Tiles:-"+noOfTiles);
	}
}
public class Question37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tile t = new Tile(15);
		floor f1 = new floor(2,5);
		f1.totalTiles(t);
	}

}

import java.util.Random;

public class car
{
	Obstacle rintangan = new Obstacle();
	Engine mesin = new Engine(); //ngambil mesin buat mobil
	public int carX = 0, carY = 300; //posisi awal mobil pas gui jalan
	public int speed = 10, hindaran = 50;
	
	
	public void mobilGerak()
	{
	mesin.EngineRun();
	if(mesin.fuel.getAmountOfFuel()!=0)
	{
	carX = carX + speed;
	rintangan.SetobstaclePosition();
	if(carX + 100 == rintangan.x1)
	{
		for(int i = -10; i<40; i++)
		{
		if(carY + i == rintangan.y1)
		{hindar();}
		}
	}
	if(carX + 100 == rintangan.x2)
	{
		for(int i = -10; i<40; i++)
		{
		if(carY + i == rintangan.y2)
		{hindar();}
		}
	}
	if(carX + 100 == rintangan.x3)
	{
		for(int i = -10; i<40; i++)
		{
		if(carY + i == rintangan.y3)
		{hindar();}
		}		
	}
	
	if(carX==800) 
	{carX=0;
	 Random rand = new Random();
	 carY = rand.nextInt(600);
	}
	}
	
	else 
	{mesin.EngineStop();
	carX = carX;}
	}
	
	public void hindar()
	{
	carY = carY-hindaran;
	}
	
}

public class Engine
{
	FuelTank fuel = new FuelTank(); // ngambil tangki sebagai bagian dari mesin
	public boolean EngineRunning;
	public int Temperature = 30;
	
	public void EngineRun() 
	{
	EngineRunning = true;
	fuel.decrementFuelTank();       // fungsi untuk mengurangi jumlah tangki
	}
	
	public void EngineStop()
	{
	EngineRunning = false;		
	}
	
	
	
}

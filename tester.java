public class tester {
	public static void main(String[] args)
	{
		//creating a new Stop
		Stop WTC2=new Stop("World Trade Center (Transit Way)");
		//creating a new Route object based on the Boston-Chelsea SL3
        Route SL3=new Route("SL3", "Chelsea", "South Station", true, 10);
        System.out.println(SL3.toString());
        SL3.addStop(WTC2, 6);
        System.out.println(WTC2.toString());
        
        Route b116=new Route("116", "Maverick", "Wonderland", false, 34);
        System.out.println(b116.toString());
        
        Bus bus=new Bus(400385, SL3);
		System.out.print(bus.toString());
		
		Bus bus2=new Bus(400385, b116);
		System.out.print(bus2.toString());
	}
}
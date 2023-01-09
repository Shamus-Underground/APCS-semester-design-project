public class Route {
	double routeLength;
	boolean BRT;
	int stopCount;
	boolean hasConnections;
	boolean schoolBus;
	boolean universityOperated;
	String terminus1;
	String terminus2;
	String name;
	String toStringInsertion="";
	//constructor
	public Route(String Name, String Terminus1, String Terminus2, boolean brt, int StopCount)
	{
		name=Name;
		terminus1=Terminus1;
		terminus2=Terminus2;
		BRT=brt;
		stopCount=StopCount;
		Stop[] stops=new Stop[StopCount];
	}
	//toString
	public String toString()
		{
			if(BRT==false)
			{
				toStringInsertion="not ";
			}
		return "Bus " + name + " has service to " + terminus1 + " and " + terminus2 + " and is "+ toStringInsertion + "bus rapid transit.";
		}
    //Getters and Setters
    public String getName()
    {
        return name;
    }
    //Other Methods
    public void addStop(Stop stop, int rank)
    {
        stops[rank-1]=stop;
    }
}
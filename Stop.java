public class Stop {
public boolean digitalDisplay;
public int seats;
public int bikeRacks;
public boolean shelter;
public boolean heating;
public boolean AC;
public int routes;
public String name;
public Route route;

//Constructors
public Stop(String Name)
{
    name=Name;
}
public Stop(String Name, int routeCount, Route rte)
{
    name=Name;
    Route[] count=new Route[routeCount];
    route=rte;
}
public String toString()
{
    return name+" of route " + route.getName();
}
public void addRoute(Route rte)
{
   for(int i=0; i<count.length-1; i++)
   {
       if(count[i]!=null)
       {
           count[i]=rte;
       }
   }
}
public void replaceRoute(Route rte, int index)
{
   count[index]=rte;
}
}
public class Bus {
//Attributes
Route routeDesignation;
int serialNumber;
boolean articulated;
Operator Driver;
int seatCount;
double topSpeed;
String toStringInsertion="";

//Methods
//Constructors
public Bus(int serial, Route RouteDesignation)
{
	serialNumber=serial;
    routeDesignation=RouteDesignation;
}
//Getters & setters

//toString
@Override
public String toString()
{
    return "Bus " + serialNumber + " is currently designated as " + routeDesignation.getName() + ".";
}
//Behaviors
// public double calculateTravelTime(Stop a, Stop b)
// {
// 	//calculates the time from one stop on a route to another
// }

// public void express()
// {
// //Express method will remove all the stops on the line except for the end points.
// }
// public void express()
// {
// //Skip method removes a stop from the bus's route.
 }
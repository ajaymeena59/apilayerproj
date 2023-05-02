<%@ page import="com.apis.apilayerproj.models.*,java.util.List" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flights View</title>
<style>

td, th{
border:green 1px solid;
}

</style>
</head>
<body>

   <h2>Flights from aviation stack APIs:</h2>
   
   <%
      List<Flight> flights = (List<Flight>)request.getAttribute("flights");
   %>
   
   <table style='border:black 3px solid' >
     <thead>
        <tr>
           <th>Sr. no.</th>
           <th>Flight date</th>
           <th>Flight status</th>
           <th>Departure</th>
           <th>Arrival</th>
           <th>Airline</th>
           <th>Flight</th>
           <th>Aircraft</th>
           <th>Live</th>
        </tr>
     </thead>
     
     <tbody>
        
        <% if(flights!=null){
        
        	int i=0;
        	
        for(Flight flight : flights){ 
        i++;
        %>
        <tr>
          <td> <%= i %> </td>
          <td><%= flight.getFlight_date() %></td>
          <td><%= flight.getFlight_status() %></td>
          
          <td>
             <ol>
               <li> Airport -> <%= flight.getDeparture().getAirport() %> </li>
               <li> Timezone -> <%= flight.getDeparture().getTimezone() %> </li>
               <li> iata -> <%= flight.getDeparture().getIata() %> </li>
               <li> icao -> <%= flight.getDeparture().getIcao() %> </li>
               <li> Terminal -> <%= flight.getDeparture().getTerminal() %> </li>
               <li> Gate -> <%= flight.getDeparture().getGate() %> </li>
               <li> Delay -> <%= flight.getDeparture().getDelay() %> </li>
               <li> Scheduled -> <%= flight.getDeparture().getScheduled() %> </li>
               <li> Estimated -> <%= flight.getDeparture().getEstimated() %> </li>
               <li> Actual -> <%= flight.getDeparture().getActual() %> </li>
               <li> Estimated runway -> <%= flight.getDeparture().getEstimated_runway() %> </li>
               <li> Actual runway -> <%= flight.getDeparture().getActual_runway() %> </li>
             </ol>
          </td>
          
           <td>
               <ol>
                 <li> Airport -> <%= flight.getArrival().getAirport() %> </li>
                 <li> Timezone -> <%= flight.getArrival().getTimezone() %> </li>
                 <li> iata -> <%= flight.getArrival().getIata() %> </li>
                 <li> icao -> <%= flight.getArrival().getIcao() %> </li>
                 <li> Terminal -> <%= flight.getArrival().getTerminal() %> </li>
                 <li> Gate -> <%= flight.getArrival().getGate() %> </li>
                 <li> Baggage -> <%= flight.getArrival().getBaggage() %> </li>
                 <li> Delay -> <%= flight.getArrival().getDelay() %> </li>
                 <li> Scheduled -> <%= flight.getArrival().getScheduled() %> </li>
                 <li> Estimated -> <%= flight.getArrival().getEstimated() %> </li>
                 <li> Actual -> <%= flight.getArrival().getActual() %> </li>
                 <li> Estimated runway -> <%= flight.getArrival().getEstimated_runway() %> </li>
                 <li> Actual runway -> <%= flight.getArrival().getActual_runway() %> </li>
               </ol>
          </td>
          
           <td>
            <ol>
              <li> Name -> <%= flight.getAirline().getName() %> </li>
              <li> iata -> <%= flight.getAirline().getIata() %> </li>
              <li> icao -> <%= flight.getAirline().getIcao() %> </li>
            </ol>
          </td>
          
           <td>
             <ol>
               <li> Number -> <%= flight.getFlight().getNumber() %> </li>
               <li> iata -> <%= flight.getFlight().getIata() %> </li>
               <li> icao -> <%= flight.getFlight().getIcao() %> </li>
                 <li>  
                   <ul>
                         <%if(flight.getFlight().getCodeshared()==null){ %>
                         
                         <li> CodeShared -> <%= flight.getFlight().getCodeshared() %> </li>
                         
                         <% } else { %>
                   
                       <li> Airline name -> <%= flight.getFlight().getCodeshared().getAirline_name() %> </li>
                       <li> Airline iata -> <%= flight.getFlight().getCodeshared().getAirline_iata() %> </li>
                       <li> Airline iaco -> <%= flight.getFlight().getCodeshared().getAirline_icao() %> </li>
                       <li> Flight number -> <%= flight.getFlight().getCodeshared().getFlight_number() %> </li>
                       <li> Flight iata -> <%= flight.getFlight().getCodeshared().getFlight_iata() %> </li>
                       <li> Flight icao -> <%= flight.getFlight().getCodeshared().getFlight_icao() %> </li>
                       
                       <% } %>
                       
                   </ul> 
                 </li>
             </ol>
          </td>
          
           <td>
             <ol>
             
              <%if(flight.getAircraft()==null){ %>
                         
                         <li> Aircraft -> <%= flight.getAircraft() %> </li>
                         
                         <% } else { %>
                   
             
                <li> Registration -> <%= flight.getAircraft().getRegistration() %> </li>
                <li> iata -> <%= flight.getAircraft().getIata() %> </li>
                <li> icao -> <%= flight.getAircraft().getIcao() %> </li>
                <li> icao24 -> <%= flight.getAircraft().getIcao24() %> </li>
                <% } %>
                
             </ol>
          </td>
          
           <td>
             <ol>
             
              <%if(flight.getLive()==null){ %>
                         
                         <li> Live -> <%= flight.getLive() %> </li>
                         
                         <% } else { %>
                   
             
                <li> Updated -> <%= flight.getLive().getUpdated() %> </li>
                <li> Latitude -> <%= flight.getLive().getLatitude() %> </li>
                <li> Longitude -> <%= flight.getLive().getLongitude() %> </li>
                <li> Altitude -> <%= flight.getLive().getAltitude() %> </li>
                <li> Direction -> <%= flight.getLive().getDirection() %> </li>
                <li> Horizontal speed -> <%= flight.getLive().getSpeed_horizontal() %> </li>
                <li> Vertical speed -> <%= flight.getLive().getSpeed_vertical() %> </li>
                <li> Is on ground? -> <%= flight.getLive().getIs_ground() %> </li>
                <% } %>
                
             </ol>
          </td>
          
        </tr>
          <% } } %>
     </tbody>
   </table>

</body>
</html>
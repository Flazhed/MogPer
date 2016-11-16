/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mogper.test;

import dtos.*;
import etos.LoginException;
import etos.NotFoundException;
import etos.UnexpectedErrorException;
import java.rmi.UnexpectedException;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static mogper.test.BackendHolder.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assume.assumeThat;
import org.junit.BeforeClass;
/**
 *
 * @author Soren
 */
public class AdminInterfaceTest {
    
    
    @Test
    public void dummyTest(){
        assumeThat(adminInterface, not(nullValue()));
        assertEquals("test", "test");
    }
    
    //Req: an admin in the backend with username = admin and password = password
    @Test
    public void adminLoginTest() throws LoginException, UnexpectedErrorException{
        assumeThat(adminInterface, not(nullValue()));
        String userName = "admin";
        String password = "password";
        AdminDetail adminDetail= adminInterface.login(userName, password);
        assertEquals(userName, adminDetail.getUserName());
        assertEquals(password, adminDetail.getPassword() );
    }
    
    //Req: no admin in backend with admin/faultyPassword combination
    @Test(expected = LoginException.class)
    public void adminLoginInvalidPasswordTest() throws LoginException, UnexpectedErrorException{
        assumeThat(adminInterface, not(nullValue()));
        String userName = "admin";
        String password = "faultyPassword";
        adminInterface.login(userName, password);
 
    }
    
    //Req: probably a route with routeId = 2
    @Test
    public void createDepatureTest() throws UnexpectedErrorException{
        assumeThat(adminInterface, not(nullValue()));
        
        long routeId = 2;
        
        RouteIdentifier routeIdentifier = new RouteIdentifier(routeId);
        LocalDateTime departureTime = LocalDateTime.now();
        
        DepartureIdentifier departureIdentifier = adminInterface.createDeparture(routeIdentifier, departureTime);
        assertEquals(routeId, departureIdentifier.getDepartureId());
    }
    
    @Test(expected = UnexpectedErrorException.class)
    public void createDepatureWithInvalidRouteIdTest() throws UnexpectedErrorException{
        assumeThat(adminInterface, not(nullValue()));
        
        long routeId = 999;
        
        RouteIdentifier routeIdentifier = new RouteIdentifier(routeId);
        LocalDateTime departureTime = LocalDateTime.now();
        
        adminInterface.createDeparture(routeIdentifier, departureTime);
        
    }
    
    //Req: Min. 1 departure in backend
    @Test
    public void getAllDeparturesTest() throws UnexpectedErrorException{
        assumeThat(adminInterface, not(nullValue()));
        List<DepartureIdentifier> departures = adminInterface.getAllDepartures();
        assertThat(departures, is(not(hasSize(0))));
    }
    
    //Req: Departure with id : 25
    @Test
    public void getDepartureTest() throws NotFoundException, UnexpectedErrorException{
        long departureId = 25;
        assumeThat(adminInterface, not(nullValue()));
        DepartureIdentifier departureIdentifier = adminInterface.getDeparture(departureId);
        assertNotNull(departureIdentifier);
    }
    
    //Req: No departure with id : 658
    @Test(expected = NotFoundException.class)
    public void getDepartureWithInvalidIdTest() throws NotFoundException, UnexpectedErrorException{
        long departureId = 658;
        assumeThat(adminInterface, not(nullValue()));
        adminInterface.getDeparture(departureId);
    }

    //Req: Departure with id : 25
    @Test
    public void updateDepartureTest() throws NotFoundException, UnexpectedErrorException{
        long departureId = 25;
        assumeThat(adminInterface, not(nullValue()));
        DepartureDetail departureDetail = (DepartureDetail)adminInterface.getDeparture(departureId);
        LocalDateTime oldDepartureDate =  departureDetail.getDepartureTime();
        LocalDateTime newDepartueTime = LocalDateTime.now();
        departureDetail.setDepartureTime(newDepartueTime);
        departureDetail = (DepartureDetail)adminInterface.getDeparture(departureId);
        assertEquals(oldDepartureDate, departureDetail.getDepartureTime());
    }
    
    //Req: Deparute with id : 25
    //Not done yet
    @Test
    public void deleteDepartureTest()throws NotFoundException, UnexpectedErrorException{
        assumeThat(adminInterface, not(nullValue()));
        long departureId = 25;
        adminInterface.getDeparture(departureId);
        
    }
    
}

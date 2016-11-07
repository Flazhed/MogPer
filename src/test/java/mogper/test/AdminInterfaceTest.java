/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mogper.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static mogper.test.BackendHolder.*;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
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
    
}

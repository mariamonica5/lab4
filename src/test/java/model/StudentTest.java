package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Moni on 5/13/2017.
 */
public class StudentTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getRegNumber() throws Exception {

        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        Student stud2= new Student("abcd1234", "Pop", "Viorica", 212);
        assertEquals("fghs5679", stud1.getRegNumber());
        assertEquals("abcd1234", stud2.getRegNumber());

    }

    @Test
    public void setRegNumber() throws Exception {

        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        stud1.setRegNumber("wers1234");
        assertEquals("wers1234", stud1.getRegNumber());

    }


    @Test
    public void getName() throws Exception {

        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        Student stud2= new Student("abcd1234", "Ionescu", "Viorica", 212);
        assertEquals("Pop", stud1.getName());
        assertEquals("Ionescu", stud2.getName());
    }

    @Test
    public void setName() throws Exception {

        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        stud1.setName("Popescu");
        assertEquals("Popescu", stud1.getName());

    }

    @Test
    public void getGroup() throws Exception {

        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        Student stud2= new Student("abcd1234", "Ionescu", "Viorica", 212);
        assertEquals(342, stud1.getGroup());
        assertEquals(212, stud2.getGroup());

    }

    @Test
    public void setGroup() throws Exception {

        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        stud1.setGroup(18);
        assertEquals(18, stud1.getGroup());
    }

}
package org.launchcode.techjobs_oo.Tests;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.launchcode.techjobs_oo.*;

public class JobTest {

    Employer myEmployer = new Employer("Covidien");
    Location place = new Location("Ponce");
    PositionType typeOfJob = new PositionType("Assembler");
    CoreCompetency skill = new CoreCompetency("Manufacturing");
    Job myJob = new Job("My first job", myEmployer, place, typeOfJob, skill);

    @Test

    public void isJobNameWorking(){
        Assert.assertEquals("My first job", myJob.getName());
    }

//   @Test
//    public void isId(){
//        Assert.assertEquals(2, myJob.getId());
//   }

   @Test
    public void isStringWorking(){
        Assert.assertEquals("My first job", myJob.toString());
   }

//   @Test
//    public void isSkillWorking(){
//        Assert.assertEquals("Manufacturing", myJob.toString());
//   }



}

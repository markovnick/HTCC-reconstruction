/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jlab.rec.htcc;

import org.jlab.clasrec.main.DetectorReconstruction;
import org.jlab.clasrec.utils.ServiceConfiguration;
import org.jlab.evio.clas12.EvioDataEvent;

/**
 *
 * @author gavalian
 */
public class HTCCReconstructionService extends DetectorReconstruction {

    public HTCCReconstructionService(){
        super("HTCC","henkins","1.0");
    }
    
    @Override
    public void processEvent(EvioDataEvent event) {
        try {
            HTCCReconstruction reco = new HTCCReconstruction();
            reco.processEvent(event);
        } catch (Exception e){
            System.out.println("----> error with HTCC reconstruction..");
            e.printStackTrace();
        }
    }

    @Override
    public void init() {
        System.out.println("-----> INITIALIZING HTCC as a SERVICE...");
    }

    @Override
    public void configure(ServiceConfiguration sc) {
        
    }
    
}

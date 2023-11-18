package es.deusto.ingenieria.sd.strava.client;

import java.awt.EventQueue;

//import es.deusto.ingenieria.sd.strava.client.gui.VentanaPrincipal;
import java.util.List;

import es.deusto.ingenieria.sd.strava.client.gui.VentanaPrincipal;
import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;




public class MainProgram {



	public static void main(String[] args) {
		
		ServiceLocator serviceLocator = new ServiceLocator();

        //args[0] = RMIRegistry IP
        //args[1] = RMIRegistry Port
        //args[2] = Service Name
        serviceLocator.setService(args[0], args[1], args[2]);

       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaPrincipal frame = new VentanaPrincipal(serviceLocator);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
		
	}

}

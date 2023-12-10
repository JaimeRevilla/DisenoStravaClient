package es.deusto.ingenieria.sd.strava.client;

import java.awt.EventQueue;

//import es.deusto.ingenieria.sd.strava.client.gui.VentanaPrincipal;
import java.util.List;

import es.deusto.ingenieria.sd.strava.client.gui.VentanaPrincipal;
import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;

//import es.deusto.ingenieria.sd.strava.client.controller.LoginController;
//import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;

//import es.deusto.ingenieria.sd.strava.client.controller.RetoController;
//import es.deusto.ingenieria.sd.strava.client.controller.LoginController;
//import es.deusto.ingenieria.sd.strava.client.controller.SesionController;
//
//import es.deusto.ingenieria.sd.strava.client.gui.ventanaEntrenamiento;
//import es.deusto.ingenieria.sd.strava.client.gui.ventanaInicioSesion;
//import es.deusto.ingenieria.sd.strava.client.gui.ventanaLog;
//import es.deusto.ingenieria.sd.strava.client.gui.VentanaPrincipal;
//import es.deusto.ingenieria.sd.strava.client.gui.ventanaRegis;
//import es.deusto.ingenieria.sd.strava.client.gui.ventanaReto;
//
//import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;

//import es.deusto.ingenieria.sd.strava.server.data.dto.RetoDTO;
//import es.deusto.ingenieria.sd.strava.server.data.dto.SesionDTO;
//import es.deusto.ingenieria.sd.strava.server.data.dto.UsuarioDTO;


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

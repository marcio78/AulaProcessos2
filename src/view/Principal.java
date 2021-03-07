package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {
		
		ProcessosController procController = new ProcessosController();
		//String os = procController.os();
		//System.out.println(os);
		
		//String process = "C:\\Program Files (x86)\\Apoio\\Visualg Versão 2\\visualg.exe";
		//procController.callProcess(process);
		
		
		String process = "TASKLIST /FO TABLE";
		procController.readProcess(process);
		
		//String param = "cmd.exe";
		//procController.killProcess(param);

	}

}

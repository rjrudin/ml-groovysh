package com.marklogic.groovysh;

import org.fusesource.jansi.AnsiConsole;

public class Main {

	public static void main(String[] args) {
		// workaround for jAnsi problems, (backspace and arrow keys not working)
		AnsiConsole.systemUninstall();
		org.codehaus.groovy.tools.shell.Main.main(args);
	}
}

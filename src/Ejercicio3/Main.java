package Ejercicio3;

import java.sql.Array;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
       //Creando los procesos
        Process p1=new Process(0,"ClickRaton",0.1);
        Process p2=new Process(1,"Tecla Q",0.1);
        Process p3=new Process(2,"tecla r",0.1);
        Process p4=new Process(3,"Tecla g",0.1);
        Process p5=new Process(4,"Tecla j",0.1);
        Process p6=new Process(5,"Tecla i",0.1);
        //Guardando los procesos en un array
        Process[] processes={p1,p2,p3,p4,p5,p6};
        //Crear Gestionador de procesos
        ProcessManager processManager=new ProcessManager();
        //Crear procesos en gestionador de procesos
        for (Process elemento:processes)
        {
            processManager.crearProceso(elemento);
        }

        //Creando contenedor de toString de procesos
        List<String>lista=processManager.ejecutarProceso();

        //Sacando por pantalla los toString de cada proceso.
        for (String elemento:lista)
        {
            System.out.println(elemento);
        }

    }
}

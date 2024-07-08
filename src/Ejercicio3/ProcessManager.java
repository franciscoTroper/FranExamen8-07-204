package Ejercicio3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ProcessManager
{
    private Queue<Process> processes=new ArrayDeque<>();
    public void crearProceso(Process processP)
    {
        processes.offer(processP);

    }
    public List<String> ejecutarProceso()
    {
        List<String> procesosToString=new ArrayList<>();
        int indice=processes.size();
        for (int x=0;x<indice;x++)
        {
            Process procesoExpulsado= processes.poll();
            procesosToString.add(procesoExpulsado.toString());
        }
        return procesosToString;
    }

    public Queue<Process> getProcesses() {
        return processes;
    }
}

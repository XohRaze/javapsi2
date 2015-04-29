import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.omg.CosNaming._BindingIteratorImplBase;


public class program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] listaAmigos = { "Maria", "Madalena", "Mafalda", "Margarida", "Malaria", "Mariana", "Matumbina", "Capitulina" , "Alfreda" };
		
		
        // Construtores Inicializadores
        pessoa p1 = new pessoa("Bruno", " Coimbra");
        pessoa p2 = new pessoa("Mariana", " Costa");

    /*    p1.agoraFaloEu(p2);
        p1.dizOlaAPessoa("Antonio");
        p1.dizOlaAmigo(p2.getName()); */

        System.out.println(p1.dizOlaAmigo(listaAmigos));
        System.out.println(p1.dizOlaAmigo("Alfredo", "Pinto", "Costa", "Azeite", "Frango", "Alface"));
        
        ArrayList<String> listaNomes = new ArrayList<String>();
        ArrayList<pessoa> listaPessoas = new ArrayList<pessoa>();
        
        listaNomes.add("Clementina");
        listaNomes.add("Cleopatra");
        
        for(String s : listaNomes)
        {
        	
        	System.out.print(s + " ");
        }
        
        System.out.println();
        System.out.println("Numero de strings: " + listaNomes.size());

        System.out.println();

        if (listaNomes.contains("Cleopatra"))
        {
        	System.out.println("Tem");
        }
        else
        {
        	System.out.println("Nao Tem");
        }
        
        
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        System.out.println();

        for (pessoa p : listaPessoas)
        { 
        	System.out.println(p.dizOla());
        }
        
        //Passagem de array para a collection
        
        listaNomes.addAll(Arrays.asList(listaAmigos));
        
        for(String s : listaNomes)
        {
        	System.out.println(s + " ");
        	
        }
        
        System.out.println();
        
        //Remoçao do nome
        
        listaNomes.remove("Cleopatra");
        
        for(String s : listaNomes)
        {
        	System.out.println(s);
        }
        
        String[] listaAmigos2 = new String[listaNomes.size()];
        listaAmigos2 = listaNomes.toArray(listaAmigos2);
        
        System.out.println("");
        System.out.println("Mapas");
        
        Map<Integer, String> listaDeAlunos = new HashMap<Integer, String>();
        listaDeAlunos.put(1, "Bruno Coimbra");
        listaDeAlunos.put(2, "Catalin Criste");
        listaDeAlunos.put(3, "David Sousa");
        listaDeAlunos.put(4, "Ausente no Estrangeiro");
        listaDeAlunos.put(5, "Transferido");
        listaDeAlunos.put(6, "Joao Ventura");
        listaDeAlunos.put(7, "Jorge Silva");
        listaDeAlunos.put(8, "Marcelo Pagaimo");
        listaDeAlunos.put(9, "Mariana Costa");
        listaDeAlunos.put(10, "Ricardo Gomes");
        listaDeAlunos.put(11, "Ruben Severino");
        listaDeAlunos.put(12, "Rui Ricardo");
        listaDeAlunos.put(13, "Samuel Santos");
        
        System.out.println(listaDeAlunos.get(1));
        
        for(Integer i : listaDeAlunos.keySet())
        {
        	System.out.println(listaDeAlunos.get(i));
        }
        
	}

}

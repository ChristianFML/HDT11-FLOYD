/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estrucutras de Datos
 * Ing. Douglas Barrios
 * Fecha: 14 de noviembre del 2016
 */

/**
 * Christian Morales - 15010
 * José Luis Méndez - 15024
 * Rodrigo Barrios - 15
 * Juan a. García - 15
 */
import java.util.*;

public class FloydAlgorithm {

    private int[][] P;
    
    public void floyd(int n, ArrayList<ArrayList<Integer>> W, ArrayList<ArrayList<Integer>> P, ArrayList<ArrayList<Integer>> D){
	D = W;
	for (int i = 0; i<n; i++)
	 	for(int j = 0; j<n; j++)
	 		P.get(i).set(j, 0);
	for (int k = 0; k < n; k++)
            for(int i = 0; i < n; i++)
	 	for(int j = 0; j<n; j++){
                    if (D.get(i).get(k) + D.get(k).get(j)< D.get(i).get(j)){
                        int temp = D.get(i).get(k) + D.get(k).get(j);
	 		P.get(i).set(j, k);
                    }
	 	}
}

    public void path(int q, int r){
	path (q, P[q][r]);
	System.out.println("v" + P[q][r]);
	path (P[q][r], r);
    }
    
}

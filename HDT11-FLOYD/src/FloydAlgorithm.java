/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class FloydAlgorithm {

    private int[][] P;
    
    public void floyd(int n, int[][] W, int[][] P, int[][] D){
	D = W;
	for (int i = 0; i<n; i++)
	 	for(int j = 0; j<n; j++)
	 		P[i][j] = 0;
	for (int k = 0; k < n; k++)
            for(int i = 0; i < n; i++)
	 	for(int j = 0; j<n; j++){
                    if (D[i][k] + D[k][j]< D[i][j]){
                        D[i][j] = D[i][k] + D[k][j];
	 		P[i][j] = k;
                    }
	 	}
}

    public void path(int q, int r){
	path (q, P[q][r]);
	System.out.println("v" + P[q][r]);
	path (P[q][r], r);
    }
    
}

package demo1;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] mtrx = new int[2][3];
mtrx[0][0]=1;
mtrx[0][1]=2;
mtrx[0][2]=3;
mtrx[1][0]=4;
mtrx[1][1]=5;
mtrx[1][2]=6;

for (int i=0; i<2 ;i++){
	System.out.println("\n");
	for (int j=0; j<3; j++){
		System.out.print(mtrx[i][j] + " ");
		
	}
}

	}

}


package datastructures;

public class SparseMatrix {
    private MatrixTerm[] smArray;
    
    //Transposes Matrix
    public SparseMatrix transpose(SparseMatrix matrix){
        SparseMatrix sTrans = new SparseMatrix(8);
        int test=0;
        for(int e=0;e<matrix.smArray.length;e++){
            sTrans.setTerm(test, matrix.smArray[test].getCol(), matrix.smArray[test].getRow(), matrix.smArray[test].getVal());
            test++;
        }
        return sTrans;
    }
    //Prints Matrix
    public void print(SparseMatrix matrix){
        System.out.print("Row: ");
        for(int i=0;i<matrix.smArray.length;i++){
            int e=i+1;
            if(matrix.smArray[i].getVal()>9||matrix.smArray[i].getVal()<0){
                if(matrix.smArray[i].getVal()<-10)
                    System.out.print(" ");
                System.out.print(matrix.smArray[i].getRow()+"  ");}
            else
                System.out.print(matrix.smArray[i].getRow()+" ");
        }
        System.out.print("\nCol: ");
        for(int i=0;i<matrix.smArray.length;i++){
            if(matrix.smArray[i].getVal()>9||matrix.smArray[i].getVal()<0){
                if(matrix.smArray[i].getVal()<-10)
                    System.out.print(" ");
                System.out.print(matrix.smArray[i].getCol()+"  ");
            }
            else
                System.out.print(matrix.smArray[i].getCol()+" ");
        }
        System.out.print("\nVal: ");
        for(int i=0;i<matrix.smArray.length;i++){
            if(matrix.smArray[i].getVal()>9)
                System.out.print(matrix.smArray[i].getVal()+" ");
            else
                System.out.print(matrix.smArray[i].getVal()+" ");
        }
        System.out.println();
    }
    //Adds Values to the Objects
    public void setTerm(int i1, int i2, int i3, int i4){
        smArray[i1].setRow(i2);
        smArray[i1].setCol(i3);
        smArray[i1].setVal(i4);
        
    }
    
    //SparseMatrix
    public SparseMatrix(){};
    public SparseMatrix(int t){
        smArray = new MatrixTerm[t];
        for (int i=0;i<t;i++){
            smArray[i]= new MatrixTerm();
        }
    }
    public class MatrixTerm{
            private int col, val, row;
            
            public MatrixTerm(){
                col=0;
                row=0;
                val=0;
            };
            public MatrixTerm(int col1, int val1, int row1){
                this.col=col1;
                this.row=row1;
                this.val=val1;
            }
            
            int getRow(){return row;}
            int getVal(){return val;}
            int getCol(){return col;}
            
            void setRow(int row1){this.row=row1;}
            void setCol(int col1){this.col=col1;}
            void setVal(int val1){this.val=val1;}
            
    }
}

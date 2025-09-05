class Pattern15 {
    public void pattern15(int n) {
        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=1;j<=n-i+1;j++){
                System.out.print(c++);
            }
            System.out.println();
        }
    }
}
class Pattern16 {
    public void pattern16(int n) {
        char c='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
}
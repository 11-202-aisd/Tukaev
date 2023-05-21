class FastJoin {
    private int [] id;

    public FastJoin(int n){
        this.id = new int[n];
        for (int i = 0; i < n;i++){
            id[i] = i;
        }
    }
    public boolean connected(int q, int p) {
        return root(q) == root(p);
    }
    public void union(int q, int p){
        int i = root(q);
        int j = root(p);
        id[i] = j;
    }
    private int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

}
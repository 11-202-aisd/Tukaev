public class AlgoritmFS {
    private int [] id;

    public AlgoritmFS(int n){
        this.id = new int[n];
        for (int i = 0; i < n; i++){
            id[i] = i;
        }
    }
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid) id[i] = qid;
    }
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }
}
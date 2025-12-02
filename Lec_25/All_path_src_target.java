package Lec_25;
class All_path_src_target {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> li=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        findall(graph,0,graph.length-1);
        return ans;
    }
    public void findall(int [][] arr, int src, int des){
        if(src==des){
            li.add(src);
            ans.add(new ArrayList<>(li));
            li.remove(li.size()-1);
            return;
        }
        for(int i:arr[src]){
            li.add(src);
            findall(arr,i,des);
            li.remove(li.size()-1);
        }
    }
}
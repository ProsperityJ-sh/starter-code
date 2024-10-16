public class BinarySearchTree<T>{

    T data;
    BinarySearchTree<T> left;
    BinarySearchTree<T> right;

    public BinarySearchTree(){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public BinarySearchTree(){
        this.data = data;
        this.left = null;
        this.right = null;

    }


    public void add(T data){
        if (newData.compareTo(this.data) > 0) this.left.add(newData); {
        else if (newData.compareTo(this.data) < 0) this.right.add(newData)
        }
         else if(newData.compareTo(this.data) > 0) {
            if(this.right != null) this.right.add(newData);
            else this.right = new BinarySearchTree<T>(newData);
         }  
        }    
        
    }

    public boolean contains(T query){

        if(query.equals(this.data)) return true;
        if(query.compareTo(this.data) > 0) {
            //right
            if (this.right == null) return false;
            else return this.right.contains(query)
        } else {
            //left
            if (this.left == null) return false;
            else return this.left.contains(query)
        }
    }

    public void remove(T data){
        
    }


    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        int[] arr = new int[]{10,5,17,19,15,13,8,3,9}
        for(int a : arr){   
            tree.add(a)
        }
        system.out.println(this.tree.contains(query:8));
        System.out.println(this.tree.contains(query:16));
    }
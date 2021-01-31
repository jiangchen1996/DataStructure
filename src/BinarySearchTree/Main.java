package BinarySearchTree;

import java.util.Random;

/**
 * @author jc
 * @date 2021/1/27
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        int[] arr=new int[]{5,4,6,3,7,8,1};
        for (int i = 0; i < 7; i++) {
            tree.insert(arr[i]);
        }
        tree.printTree();
        tree.insert(2);
        tree.printTree();
    }
}

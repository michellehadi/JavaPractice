//import java.util.Scanner;
//
//public class Organism {
//    public static int matureOrganism (int[] parent, int deletedCell) {
//        class Node {
//            int key;
//            Node left, right;
//
//            public Node(int item)
//            {
//                key = item;
//                left = right = null;
//            }
//        }
//
//        Node root;
//        Organism() { root = null; }
//
//        void deleteKey(int key) { root = deleteRec(root, key); }
//
//        Node deleteRec(Node root, int key)
//        {
//            if (root == null)
//                return root;
//
//            if (key < root.key)
//                root.left = deleteRec(root.left, key);
//            else if (key > root.key)
//                root.right = deleteRec(root.right, key);
//
//            else {
//                if (root.left == null)
//                    return root.right;
//                else if (root.right == null)
//                    return root.left;
//
//                root.key = minValue(root.right);
//
//                root.right = deleteRec(root.right, root.key);
//            }
//
//            return root;
//        }
//
//        int minValue(Node root)
//        {
//            int minv = root.key;
//            while (root.left != null)
//            {
//                minv = root.left.key;
//                root = root.left;
//            }
//            return minv;
//        }
//
//        void insert(int key) { root = insertRec(root, key); }
//
//
//        Node insertRec(Node root, int key)
//        {
//            if (root == null) {
//                root = new Node(key);
//                return root;
//            }
//
//            if (key < root.key)
//                root.left = insertRec(root.left, key);
//            else if (key > root.key)
//                root.right = insertRec(root.right, key);
//
//            return root;
//        }
//
//        void inorder() { inorderRec(root); }
//
//        void inorderRec(Node root)
//        {
//            if (root != null) {
//                inorderRec(root.left);
//                System.out.print(root.key + " ");
//                inorderRec(root.right);
//            }
//        }
//
//        public static int matureOrganism(){
//            Organism tree = new Organism();
//            tree.insert(50);
//            tree.insert(30);
//            tree.insert(20);
//            tree.insert(40);
//            tree.insert(70);
//            tree.insert(60);
//            tree.insert(80);
//
//            tree.deleteKey(20);
//            tree.deleteKey(30);
//            tree.deleteKey(50);
//            return 0;
//        }
//    public static void main (String[] args) {
//        int[] parent = {-1,0,0,1,1};
//        System.out.println(matureOrganism(parent,2));
//
//        int[] parent1 = {-1,0,0,1,1};
//        System.out.println(matureOrganism(parent1,1));
//
//        int[] parent2 = {-1,0,0,1,1};
//        System.out.println(matureOrganism(parent2,0));
//
//        int[] parent3 = {-1, 0, 0, 2, 2, 4, 4, 6, 6};
//        System.out.println(matureOrganism(parent3,4));
//
//        int[] parent4 = {26, 2, 32, 36, 40, 19, 43, 24, 30, 13, 21, 14, 24, 21, 19, 4, 30, 10, 44, 12, 7, 32, 17, 43, 35, 18, 7, 36, 10, 16, 5, 38, 35, 4, 13, -1, 16, 26, 1, 12, 2, 5, 18, 40, 1, 17, 38, 44, 14};
//        System.out.println(matureOrganism(parent4,24));
//
//        int[] parent5 = {6, 5, 6, -1, 3, 3, 5};
//        System.out.println(matureOrganism(parent5,0));
//
//        int[] parent6 = {5, 3, 6, 6, 3, -1, 5};
//        System.out.println(matureOrganism(parent6,3));
//
//        int[] parent7 = {3, 2, 4, 2, -1, 7, 7, 4, 3};
//        System.out.println(matureOrganism(parent7,1));
//
//        int[] parent8 = {9, 14, 13, 2, 2, -1, 14, 9, 13, 11, 11, 5, 10, 5, 10};
//        System.out.println(matureOrganism(parent8,10));
//
//        int[] parent9 = {28, 6, 0, 16, 9, 18, 27, 15, 13, 34, 6, 18, 19, -1, 9, 19, 8, 0, 1, 32, 4, 1, 4, 28, 32, 34, 27, 13, 15, 26, 3, 26, 8, 3, 16};
//        System.out.println(matureOrganism(parent9,18));
//
//        int[] parent10 = {-1, 4, 36, 24, 10, 29, 19, 31, 7, 0, 26, 31, 4, 18, 7, 6, 14, 24, 23, 0, 29, 14, 10, 35, 26, 1, 19, 1, 9, 36, 18, 6, 22, 35, 22, 9, 23};
//        System.out.println(matureOrganism(parent10,35));
//
//        int[] parent11 = {38, 20, 34, 7, 6, 37, 5, 8, 10, 30, 6, 37, 20, 2, 16, 7, 21, 23, 22, 23, 8, 33, 11, 21, 4, 30, 15, 34, 16, 15, 10, 36, 38, 5, 4, 33, 11, -1, 22, 2, 36};
//        System.out.println(matureOrganism(parent11,39));
//
//        int[] parent12 = {25, 34, 34, 27, 21, 21, 24, 36, 31, 2, 27, 8, 26, 8, 9, 35, 38, 30, 23, 26, 36, 9, 24, 31, 15, 1, 0, 30, 0, 35, 25, 38, -1, 18, 32, 1, 23, 2, 32, 18, 15};
//        System.out.println(matureOrganism(parent12,0));
//
//        int[] parent13 = {24, 42, 4, 30, 29, 43, 22, 15, 26, 36, 26, 16, 3, 22, 21, 41, 18, 16, 34, 41, 12, 29, 32, 30, 43, 15, 4, 38, 36, -1, 24, 42, 18, 6, 21, 38, 6, 17, 32, 17, 3, 34, 12, 14, 14};
//        System.out.println(matureOrganism(parent13,24));
//
//        int[] parent14 = {-1, 21, 24, 30, 46, 1, 16, 29, 30, 41, 18, 33, 26, 31, 12, 45, 29, 7, 16, 45, 27, 32, 41, 18, 35, 6, 9, 1, 19, 32, 22, 33, 0, 9, 6, 0, 12, 19, 21, 35, 46, 24, 31, 27, 26, 22, 7};
//        System.out.println(matureOrganism(parent14,28));
//    }
//}

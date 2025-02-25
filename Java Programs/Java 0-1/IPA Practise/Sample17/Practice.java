class Practice{
    public static void main(String[] args){
        int arr[] = {5,1,7,89,10,12,4,5};
        int n = arr.length;

        int ans1[] = selectionSort(arr);
        for(int i = 0 ; i<n ; i++){
            System.out.println(ans1[i]);
        }

    }

    public static int[] selectionSort(int[] a){
        int n = a.length;
        for(int i = 0 ; i<n ; i++){
            int mini = i;
            for(int j = i+1 ; j<n ; j++){
                if(a[j] < a[mini]){
                    mini = j;
                }
            }
            if(i != mini){
                int temp = a[i];
                a[i] = a[mini];
                a[mini] = temp;
            }
        }
        return a;
    }
}

public class MergeArrays {
	public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Move non-zero elements of X to the beginning
        int k = 0;
        for (int i = 0; i < m; i++) {
            if (X[i] != 0) {
                X[k++] = X[i];
            }
        }

        // Merge X and Y
        int i = k - 1; // Index of last element in array X
        int j = 0;     // Index of first element in array Y
        int index = 0; // Index of merged array

        while (i >= 0 && j < n) {
            if (X[i] > Y[j]) {
                X[index++] = Y[j++];
            } else {
                X[index++] = X[i--];
            }
        }

        // Copy remaining elements of Y[] if any
        while (j < n) {
            X[index++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);

        // Print the merged array
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}



public class arrayRotationPerformanceTest {
    
    public static void main(String[] args) {
        arrayRotationPerformanceTest tester = new arrayRotationPerformanceTest();
        tester.runPerformanceTests();
    }
    
    public void runPerformanceTests() {
        System.out.println("=== Array Rotation Performance Tests ===\n");
        
        // Test different array sizes
        int[] sizes = {1000, 5000, 10000, 50000};
        int[] rotations = {100, 1000, 10000, 100000};
        
        for (int size : sizes) {
            for (int rotation : rotations) {
                testPerformance(size, rotation);
            }
            System.out.println();
        }
        
        System.out.println("Performance analysis complete!");
        System.out.println("Notice: Time complexity is O(n) regardless of rotation count!");
    }
    
    private void testPerformance(int arraySize, int rotationCount) {
        // Create test array
        arrayRotation arr = new arrayRotation();
        arr.arr = new int[arraySize];
        
        // Fill with test data
        for (int i = 0; i < arraySize; i++) {
            arr.arr[i] = i + 1;
        }
        
        // Measure rotation time
        long startTime = System.nanoTime();
        arr.rotate(rotationCount);
        long endTime = System.nanoTime();
        
        double durationMs = (endTime - startTime) / 1_000_000.0;
        
        System.out.printf("Array Size: %6d | Rotations: %7d | Time: %8.3f ms%n", 
                         arraySize, rotationCount, durationMs);
    }
}

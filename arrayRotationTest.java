public class arrayRotationTest {
    
    public static void main(String[] args) {
        arrayRotationTest tester = new arrayRotationTest();
        tester.runAllTests();
    }
    
    public void runAllTests() {
        System.out.println("Running Array Rotation Tests...\n");
        
        testBasicLeftRotation();
        testZeroRotation();
        testFullRotation();
        testMultipleRotations();
        testSingleElement();
        testTwoElements();
        testNegativeRotation();
        testLargeRotations();
        
        System.out.println("\nAll tests completed!");
    }
    
    public void testBasicLeftRotation() {
        System.out.println("Test 1: Basic Left Rotation");
        arrayRotation arr = createTestArray(new int[]{1, 2, 3, 4, 5});
        arr.rotate(2);
        int[] expected = {3, 4, 5, 1, 2};
        boolean passed = compareArrays(arr.arr, expected);
        printResult("Basic Left Rotation (2 positions)", passed, arr.arr, expected);
    }
    
    public void testZeroRotation() {
        System.out.println("Test 2: Zero Rotation");
        arrayRotation arr = createTestArray(new int[]{1, 2, 3, 4, 5});
        arr.rotate(0);
        int[] expected = {1, 2, 3, 4, 5};
        boolean passed = compareArrays(arr.arr, expected);
        printResult("Zero Rotation", passed, arr.arr, expected);
    }
    
    public void testFullRotation() {
        System.out.println("Test 3: Full Rotation (same as original)");
        arrayRotation arr = createTestArray(new int[]{1, 2, 3, 4, 5});
        arr.rotate(5); // Full rotation should return to original
        int[] expected = {1, 2, 3, 4, 5};
        boolean passed = compareArrays(arr.arr, expected);
        printResult("Full Rotation", passed, arr.arr, expected);
    }
    
    public void testMultipleRotations() {
        System.out.println("Test 4: Multiple Rotations (modulo test)");
        arrayRotation arr = createTestArray(new int[]{1, 2, 3, 4, 5});
        arr.rotate(7); // 7 % 5 = 2, same as rotating by 2
        int[] expected = {3, 4, 5, 1, 2};
        boolean passed = compareArrays(arr.arr, expected);
        printResult("Multiple Rotations (7 positions = 2 effective)", passed, arr.arr, expected);
    }
    
    public void testSingleElement() {
        System.out.println("Test 5: Single Element Array");
        arrayRotation arr = new arrayRotation();
        arr.arr = new int[]{42};
        arr.rotate(3);
        int[] expected = {42};
        boolean passed = compareArrays(arr.arr, expected);
        printResult("Single Element Rotation", passed, arr.arr, expected);
    }
    
    public void testTwoElements() {
        System.out.println("Test 6: Two Element Array");
        arrayRotation arr = createTestArray(new int[]{10, 20});
        arr.rotate(1);
        int[] expected = {20, 10};
        boolean passed = compareArrays(arr.arr, expected);
        printResult("Two Element Rotation", passed, arr.arr, expected);
    }
    
    public void testNegativeRotation() {
        System.out.println("Test 7: Large Rotation (efficiency test)");
        arrayRotation arr = createTestArray(new int[]{1, 2, 3, 4, 5});
        arr.rotate(1002); // 1002 % 5 = 2
        int[] expected = {3, 4, 5, 1, 2};
        boolean passed = compareArrays(arr.arr, expected);
        printResult("Large Rotation (1002 positions = 2 effective)", passed, arr.arr, expected);
    }
    
    public void testLargeRotations() {
        System.out.println("Test 8: Edge Case - Rotate by 1");
        arrayRotation arr = createTestArray(new int[]{1, 2, 3, 4, 5});
        arr.rotate(1);
        int[] expected = {2, 3, 4, 5, 1};
        boolean passed = compareArrays(arr.arr, expected);
        printResult("Rotate by 1", passed, arr.arr, expected);
    }
    
    // Helper method to create test array with custom values
    private arrayRotation createTestArray(int[] values) {
        arrayRotation arr = new arrayRotation();
        arr.arr = values.clone();
        return arr;
    }
    
    // Helper method to compare two arrays
    private boolean compareArrays(int[] actual, int[] expected) {
        if (actual.length != expected.length) return false;
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != expected[i]) return false;
        }
        return true;
    }
    
    // Helper method to print test results
    private void printResult(String testName, boolean passed, int[] actual, int[] expected) {
        System.out.println("  " + testName + ": " + (passed ? "✓ PASSED" : "✗ FAILED"));
        if (!passed) {
            System.out.print("    Expected: [");
            for (int i = 0; i < expected.length; i++) {
                System.out.print(expected[i] + (i < expected.length - 1 ? ", " : ""));
            }
            System.out.print("]\n    Actual:   [");
            for (int i = 0; i < actual.length; i++) {
                System.out.print(actual[i] + (i < actual.length - 1 ? ", " : ""));
            }
            System.out.println("]");
        }
        System.out.println();
    }
    
    // Performance test method
    public void performanceTest() {
        System.out.println("Performance Test: Large array with many rotations");
        arrayRotation arr = new arrayRotation();
        arr.arr = new int[10000];
        
        // Fill array with values
        for (int i = 0; i < arr.arr.length; i++) {
            arr.arr[i] = i + 1;
        }
        
        long startTime = System.nanoTime();
        arr.rotate(50000); // Large number of rotations
        long endTime = System.nanoTime();
        
        double durationMs = (endTime - startTime) / 1_000_000.0;
        System.out.println("Performance: Rotated 10,000 elements by 50,000 positions in " + 
                          String.format("%.2f", durationMs) + " ms");
        System.out.println("This demonstrates O(n) time complexity regardless of rotation count!\n");
    }
}

class CalculateAverage {
    
    public static double findAverage(int[] array) {
    
        if(array == null || array.length == 0) {
            return 0.0;
        }
    
        double general = 0;
    
        for (double e: array) {
            general = general + e;
        }
    
        double average = general / array.length;
    
        return average;
    }
}

// Example with memoization:
/*

static Map<Integer, Double> memo = new HashMap<>();

public static double forecast(int years, double initial, double rate) {
    if (years == 0) return initial;
    if (memo.containsKey(years)) return memo.get(years);

    double val = forecast(years - 1, initial, rate) * (1 + rate);
    memo.put(years, val);
    return val;
}

*/
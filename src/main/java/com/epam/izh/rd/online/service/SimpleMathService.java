package com.epam.izh.rd.online.service;

public class SimpleMathService implements MathService {

    @Override
    public int compare(int value1, int value2) {
        if (value1 == value2) {
            return 0;
        } else if (value1 < value2) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 < value2) {
            return value2;
        } else {
            return value1;
        }
    }

    @Override
    public int maxFrom(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    @Override
    public int[] getEvenDigits(int[] values) {
        int size = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                size++;
            }
        }
        int[] evenDigits = new int[size];
        int i = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                evenDigits[i] = value;
                i++;
            }
        }
        return evenDigits;
    }

    @Override
    public long calcFactorial(int initialVal) {
        long factorial = 1;
        for (int i = 1; i <= initialVal + 1; i++) {
            factorial *= i;
        }
        return factorial / (initialVal + 1);
    }

    @Override
    public long calcFibonacci(int number) {
        long first = 0;
        long second = 1;
        long result = 0;
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            for (int i = 1; i < number; i++) {
                result = first + second;
                first = second;
                second = result;
            }
        }
        return result;
    }

    @Override
    public int[] sort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i] < values[j]) {
                    int buffer = values[i];
                    values[i] = values[j];
                    values[j] = buffer;
                }
            }
        }
        return values;
    }

    @Override
    public boolean isPrimary(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int[] reverseArray(int[] values) {
        int[] reversArray = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            reversArray[i] = values[values.length - 1 - i];
        }
        return reversArray;
    }
}

package main.java.ru.javalessons;

public class Statistic<T> {
    public T getMaxKPI(T... varargs) {
        T max = varargs[0];
        if (max instanceof Developer) {
            for (T item :
                    varargs) {
                if (((Developer) item).getKPI() > (((Developer) max).getKPI())) {
                    max = item;
                }
            }
        } else if (max instanceof Manager) {
            for (T item :
                    varargs) {
                if (((Manager) item).getKPI() > (((Manager) max).getKPI())) {
                    max = item;
                }
            }
        }
        return max;
    }

    public T getMinKPI(T... varargs) {
        T min = varargs[0];
        if (min instanceof Developer) {
            for (T item :
                    varargs) {
                if (((Developer) item).getKPI() < (((Developer) min).getKPI())) {
                    min = item;
                }
            }
        } else if (min instanceof Manager) {
            for (T item :
                    varargs) {
                if (((Manager) item).getKPI() < (((Manager) min).getKPI())) {
                    min = item;
                }
            }
        }
        return min;
    }

    public T getAvgKPI(T... varargs) {
        Integer avg = 0;
        Integer index = 0, minDiff, diff;
        if (varargs[0] instanceof Developer) {
            for (T item :
                    varargs) {
                avg += ((Developer) item).getKPI();
            }
            avg /= varargs.length;
            minDiff = Math.abs((((Developer) varargs[0]).getKPI()) - avg);
            for (int i = 1; i < varargs.length; i++) {
                diff = Math.abs((((Developer) varargs[i]).getKPI()) - avg);
                if (diff < minDiff) {
                    minDiff = diff;
                    index = i;
                }
            }
        } else if (varargs[0] instanceof Manager) {
            for (T item :
                    varargs) {
                avg += ((Manager) item).getKPI();
            }
            avg /= varargs.length;
            minDiff = Math.abs((((Manager) varargs[0]).getKPI()) - avg);
            for (int i = 1; i < varargs.length; i++) {
                diff = Math.abs((((Manager) varargs[i]).getKPI()) - avg);
                if (diff < minDiff) {
                    minDiff = diff;
                    index = i;
                }
            }
        }
        return varargs[index];
    }
}

package webdeving.weblab2.businessLogic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ParamsValidator {

    private final Double X_VALUE;
    private final Double Y_VALUE;
    private final Double R_VALUE;
    private final Boolean HIT;

    private final double[] X_VALUES = {-4, -3, -2, -1, 0, 1, 2, 3, 4};
    private final double[] R_VALUES = {1, 2, 3, 4, 5};
    private final String CURRENT_TIME;
    private final double EXECUTION_TIME;
    private final double Y_MAX = 5;
    private final double Y_MIN = -5;


    public ParamsValidator(String x, String y, String r, long startTime) throws CannotValidateException {
        Optional<Double> xOpt = validateXValue(x);
        Optional<Double> yOpt = validateYValue(y);
        Optional<Double> rxOpt = validateRValue(r);

        if (xOpt.isPresent() && yOpt.isPresent() && rxOpt.isPresent()) {
            this.X_VALUE = xOpt.get();
            this.Y_VALUE = yOpt.get();
            this.R_VALUE = rxOpt.get();
        } else {
            throw new CannotValidateException("Some parameters do not meet the conditions of the task" + xOpt + "|" + yOpt + "|" + rxOpt);
        }
        this.HIT = checkHit();
        this.CURRENT_TIME = DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now());
        this.EXECUTION_TIME = getScriptTime(startTime);
    }

    private Optional<Double> validateXValue(String clientValue) {
        try {
            double x = Double.parseDouble(clientValue);
            for (int i = 0; i < X_VALUES.length; i ++) {
                if (X_VALUES[i] == x) {
                    return Optional.of(x);
                }
            }
            if (x >= -4 && x <= 4) {
                return Optional.of(x);
            }
            return Optional.empty();
        } catch (NumberFormatException ex) {
            return Optional.empty();
        }

    }

    private Optional<Double> validateYValue(String clientValue) {
        try {
            double y = Double.parseDouble(clientValue);
            if (y >= Y_MAX || y <= Y_MIN) {
                return Optional.empty();
            } else {
                return Optional.of(y);
            }
        } catch (NumberFormatException ex) {
            return Optional.empty();
        }

    }

    private Optional<Double> validateRValue(String clientValue) {
        try {
            double r = Double.parseDouble(clientValue);
            for (int i = 0; i < R_VALUES.length; i ++) {
                if (R_VALUES[i] == r) {
                    return Optional.of(r);
                }
            }
            return Optional.empty();
        } catch (NumberFormatException ex) {
            return Optional.empty();
        }

    }

    private double getScriptTime(long start) {
        return Math.round((System.nanoTime() - start));
    }

    private boolean checkHit() {
        final Double x = this.X_VALUE;
        final Double y = this.Y_VALUE;
        final Double r = this.R_VALUE;

        boolean firstQuarter = false;
        boolean secondQuarter = (x >= -r/2 && x <= 0 && y >= 0 && y <= r);
        boolean thirdQuarter = (x*x+y*y <= r*r) && x <=0 && y <= 0;
        boolean fourthQuarter = x >= 0 && y <= 0 && (y >= 0.5*x - r/2d);

        return firstQuarter || secondQuarter || thirdQuarter || fourthQuarter;

    }


    public Double getXValue() {
        return X_VALUE;
    }

    public Double getYValue() {
        return Y_VALUE;
    }

    public Double getRValue() {
        return R_VALUE;
    }

    public Boolean getHit() {
        return HIT;
    }

    public String getCURRENT_TIME() {
        return CURRENT_TIME;
    }

    public double getEXECUTION_TIME() {
        return EXECUTION_TIME;
    }
}

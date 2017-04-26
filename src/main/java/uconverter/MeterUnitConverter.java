package uconverter;

public class MeterUnitConverter extends UnitConverter {
    @Override
    public double toSI(double value) {
        return (value *1000);
    }

    @Override
    public double fromSI(double siValue) {
        return (siValue /1000) ;
    }

    @Override
    public String getName() {
        return "Meter";
    }
}

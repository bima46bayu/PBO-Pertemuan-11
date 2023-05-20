public class LivingRoom extends Room{
    private double panjangRuangan;
    private double lebarRuangan;

    public double getluasRuangan(double panjangRuangan, double lebarRuangan){
        return panjangRuangan * lebarRuangan * area();
    }
}

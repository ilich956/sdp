public abstract class Computer {

    //Abstract methods to get ram,hdd,cpu
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();


    //Overriding tostring method to get ram,hdd,cpu
    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
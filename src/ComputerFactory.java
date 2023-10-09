public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {

        //Here we return a PC or Server based on the 'type' parameter
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        //if type is PC it will return a PC, if it Server it will return Server respectfully
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
        return null;
    }
}
public class EducationSystem
{
    public static void main(String[] args) {
        Graduation gd = new Graduation();
        gd.hscPercentage();
        gd.streams();
        gd.ageCritera();

        Engineering eg = new Engineering();
        eg.streams();
        eg.typeOfEngineering();
        eg.hscPercentage();
        eg.ageCritera();

        ComputerScienceEngg cse = new ComputerScienceEngg();
        cse.hscPercentage();
        cse.ageCritera();
        cse.subjects();
        cse.typeOfEngineering();
        cse.streams();

    }

}

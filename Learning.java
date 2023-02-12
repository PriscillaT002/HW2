import java.util.ArrayList;
import java.util.List;

public class Learning {
    public static void main(String[] args) {
        Course course = new Course();
        List<String> materials = new ArrayList<>();
        materials.add("java basic courses");
        materials.add("OOP courses");
        
        // here we use setters to set course materials and notes
        course.setMaterials(materials);
        course.setNotes(new int[] {19,20,30,50,100});

        System.out.println("Display course materials");
        for (String material : course.getMaterials()) {
            System.out.println("Material : " + material);
        }

        System.out.println("Display Notes");
        for (int note : course.getNotes()) {
            System.out.println("Note : " + note);
        }
    }
}

class Course {

    private List<String> materials;
    private int[] notes;


    public List<String> getMaterials() {
        return materials;
    }

    public void setMaterials(List<String> materials) {
        this.materials = materials;
    }

    public int[] getNotes() {
        return notes;
    }

    public void setNotes(int[] notes) {
        this.notes = notes;
    }
}
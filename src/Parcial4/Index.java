package Parcial4;

public class Index {
    public static void main(String[] args) {
        Docente lDetahNote = new Docente("L",27,"LORL991022HGTPZS02",81,9);
        Estudiante nDetahNote = new Estudiante("Jared",19,"BECC070208HGTDMLA3","Administración","El que no tuvo ella",3,99);
        lDetahNote.toString2();
        nDetahNote.toString2();
        System.out.println(nDetahNote.getEspecialidad());
        nDetahNote.setEspecialidad("Industria 4.0");
        System.out.println(nDetahNote.getEspecialidad());

    }
}
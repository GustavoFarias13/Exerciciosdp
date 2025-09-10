package com.gustavofarias.exerciciosdp.composite.fileorganization;

public class FileOrganizationMain {
    public static void main(String[] args) {
        File file1 = new File("documento.txt");
        File file2 = new File("foto.jpg");
        File file3 = new File("musica.mp3");

        Folder folder1 = new Folder("Documentos");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Multimídia");
        folder2.add(file3);
        folder2.add(folder1); // pasta dentro de pasta

        folder2.show();
    }
}

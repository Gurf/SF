package deshifrator;

public interface CreatingString {

    EncryptString toCreate(String str);

    //метод создание новой строки atbash
    CreatingString atbashString = str -> new AtbashString(str);

    //метод создание новой строки XoR
    CreatingString XoRString = str -> new XoRString(str);

}





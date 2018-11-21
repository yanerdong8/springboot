package com.yed.jna.entity;


import com.sun.jna.Library;
import com.sun.jna.Native;
import org.springframework.stereotype.Component;

@Component
public interface Clibrary extends Library {

    Clibrary INSTANTCE = (Clibrary) Native.loadLibrary("testjna", Clibrary.class);

//    public boolean xjkOpenKeyEx(byte cPassWord[]);
//    public boolean xjkCloseKey();

    public int add(int x, int y);
}

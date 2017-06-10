package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Озеров on 10.06.2017.
 */
public class ImagerReaderFactory {
    public static ImageReader getImageReader(ImageTypes types){
        if (types.equals(ImageTypes.JPG))
            return new JpgReader();
        else if (types.equals(ImageTypes.BMP))
            return new BmpReader();
        else if (types.equals(ImageTypes.PNG))
            return new PngReader();
        else throw new IllegalArgumentException();
    }
}

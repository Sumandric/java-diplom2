package ru.netology.graphics.image;

public class TextAndColorSchema implements TextColorSchema {
    private char[] symbols = {'#', '$', '@', '%', '*', '+', '-', '\''};

    @Override
    public char convert(int color) {

        int index = (color * (symbols.length - 1)) / 255;
        return symbols[index];
    }
}


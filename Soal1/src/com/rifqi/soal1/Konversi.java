package com.rifqi.soal1;

public class Konversi {
    float celciusToF, fahrenheitToK, kelvinToR, reamurToC;

    public Konversi(float celciusToF, float fahrenheitToK, float kelvinToR, float reamurToC) {
        this.celciusToF = celciusToF;
        this.fahrenheitToK = fahrenheitToK;
        this.kelvinToR = kelvinToR;
        this.reamurToC = reamurToC;
    }

    void calculate(Konversi pass){
        pass.celciusToF = (pass.celciusToF * 9/5) + 32;
        pass.fahrenheitToK = (pass.fahrenheitToK - 32) * 5/9 + 273;
        pass.kelvinToR = (pass.kelvinToR-273) * 4/5;
        pass.reamurToC = pass.reamurToC * 5/4;
    }
}
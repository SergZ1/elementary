package ru.converter;

import  static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro () {

        float in = 140;
        float expected = 1.4F;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));

    }

    @Test
    void whenConvert200RblThen2dot2222Dlr () {
        float in = 180;
        float expected = 1.8F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));

    }

    @Test
    void whenConvert300RblThen3Euro () {

        float in = 300;
        float expected = 3F;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert400RblThen4Dollar () {

        float in = 400;
        float expected = 4F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }




}
package com.rvindel.example;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private Calculator sut;

    @Before
    public void init() {
        this.sut = new Calculator();
    }

    @Test
    public void add() {
        assertThat(1).isEqualTo(this.sut.add(1, 0));
    }

    @Test
    public void subtract() {
        assertThat(7).isEqualTo(this.sut.subtract(10, 3));
    }

    @Test
    public void multiply() {
        assertThat(12).isEqualTo(this.sut.multiply(6, 2));
    }

    @Test
    public void divide() {
        assertThat(4).isEqualTo(this.sut.divide(8, 2));
    }
}
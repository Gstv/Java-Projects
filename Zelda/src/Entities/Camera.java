/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Guilherme Delmondes
 */
public class Camera {

    public static int x;
    public static int y;

    public static int clamp(int Atual, int Min, int Max) {
        if (Atual < Min) {
            Atual = Min;
        }
        if (Atual > Max) {
            Atual = Max;
        }
        return Atual;
    }
}

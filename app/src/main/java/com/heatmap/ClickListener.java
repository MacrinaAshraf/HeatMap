package com.heatmap;

import android.support.v4.content.ContextCompat;
import android.view.View;


public class ClickListener implements View.OnClickListener {
    int []count = new int [16];
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.view1:
                count[0]++;
                if (count[0] <= 3 && count[0] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[0] <= 6 && count[0] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[0] <= 10 && count[0] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view2:
                count[1]++;
                if (count[1] <= 3 && count[1] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[1] <= 6 && count[1] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[1] <= 10 && count[1] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view3:
                count[2]++;
                if (count[2] <= 3 && count[2] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[1] <= 6 && count[2] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[2] <= 10 && count[2] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view4:
                count[3]++;
                if (count[3] <= 3 && count[3] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[3] <= 6 && count[3] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[3] <= 10 && count[3] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view5:
                count[4]++;
                if (count[4] <= 3 && count[4] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[4] <= 6 && count[4] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[4] <= 10 && count[4] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view6:
                count[5]++;
                if (count[5] <= 3 && count[5] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[5] <= 6 && count[5] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[5] <= 10 && count[5] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view7:
                count[6]++;
                if (count[6] <= 3 && count[6] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[6] <= 6 && count[6] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[6] <= 10 && count[6] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view8:
                count[7]++;
                if (count[7] <= 3 && count[7] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[7] <= 6 && count[7] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[7] <= 10 && count[7] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view9:
                count[8]++;
                if (count[8] <= 3 && count[8] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[8] <= 6 && count[8] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[8] <= 10 && count[8] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view10:
                count[9]++;
                if (count[9] <= 3 && count[9] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[9] <= 6 && count[9] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[9] <= 10 && count[9] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view11:
                count[10]++;
                if (count[10] <= 3 && count[10] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[10] <= 6 && count[10] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[10] <= 10 && count[10] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view12:
                count[11]++;
                if (count[11] <= 3 && count[11] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[11] <= 6 && count[11] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[11] <= 10 && count[11] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view13:
                count[12]++;
                if (count[12] <= 3 && count[12] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[12] <= 6 && count[12] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[12] <= 10 && count[12] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view14:
                count[13]++;
                if (count[13] <= 3 && count[13] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[13] <= 6 && count[13] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[13] <= 10 && count[13] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view15:
                count[14]++;
                if (count[14] <= 3 && count[14] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[14] <= 6 && count[14] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[14] <= 10 && count[14] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
            case R.id.view16:
                count[15]++;
                if (count[15] <= 3 && count[15] > 0) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color1));
                } else if (count[15] <= 6 && count[15] > 3) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color2));
                } else if (count[15] <= 10 && count[15] > 6) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color3));
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.Color4));
                }
                break;
        }
    }
}


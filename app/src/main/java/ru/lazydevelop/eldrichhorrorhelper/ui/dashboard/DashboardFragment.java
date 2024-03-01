package ru.lazydevelop.eldrichhorrorhelper.ui.dashboard;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.HashMap;
import java.util.Map;

import ru.lazydevelop.eldrichhorrorhelper.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;
    private SharedPreferences mySharedPreferences;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mySharedPreferences = getActivity().getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE);

        NumberPicker np1 = binding.numberPicker1;
        np1.setMinValue(0);
        np1.setMaxValue(9);
        NumberPicker np2 = binding.numberPicker2;
        np2.setMinValue(0);
        np2.setMaxValue(9);
        NumberPicker np3 = binding.numberPicker3;
        np3.setMinValue(0);
        np3.setMaxValue(9);
        NumberPicker np4 = binding.numberPicker4;
        np4.setMinValue(0);
        np4.setMaxValue(9);
        NumberPicker np5 = binding.numberPicker5;
        np5.setMinValue(0);
        np5.setMaxValue(9);
        NumberPicker np6 = binding.numberPicker6;
        np6.setMinValue(0);
        np6.setMaxValue(9);
        NumberPicker np7 = binding.numberPicker7;
        np7.setMinValue(0);
        np7.setMaxValue(9);
        NumberPicker np8 = binding.numberPicker8;
        np8.setMinValue(0);
        np8.setMaxValue(9);
        NumberPicker np9 = binding.numberPicker9;
        np9.setMinValue(0);
        np9.setMaxValue(9);
        NumberPicker np10 = binding.numberPicker10;
        np10.setMinValue(0);
        np10.setMaxValue(9);
        NumberPicker np11 = binding.numberPicker11;
        np11.setMinValue(0);
        np11.setMaxValue(9);
        NumberPicker np12 = binding.numberPicker12;
        np12.setMinValue(0);
        np12.setMaxValue(9);
        NumberPicker np13 = binding.numberPicker13;
        np13.setMinValue(0);
        np13.setMaxValue(9);
        NumberPicker np14 = binding.numberPicker14;
        np14.setMinValue(0);
        np14.setMaxValue(9);
        NumberPicker np15 = binding.numberPicker15;
        np15.setMinValue(0);
        np15.setMaxValue(9);
        NumberPicker np16 = binding.numberPicker16;
        np16.setMinValue(0);
        np16.setMaxValue(9);
        np1.setValue(mySharedPreferences.getInt("p0",0));
        np2.setValue(mySharedPreferences.getInt("m1",0));
        np3.setValue(mySharedPreferences.getInt("m2",0));
        np4.setValue(mySharedPreferences.getInt("m3",0));
        np5.setValue(mySharedPreferences.getInt("m4",0));
        np6.setValue(mySharedPreferences.getInt("m5",0));
        np7.setValue(mySharedPreferences.getInt("m6",0));
        np8.setValue(mySharedPreferences.getInt("m7",0));
        np9.setValue(mySharedPreferences.getInt("m8",0));
        np10.setValue(mySharedPreferences.getInt("face",0));
        np11.setValue(mySharedPreferences.getInt("sprute",0));
        np12.setValue(mySharedPreferences.getInt("sheld",0));
        np13.setValue(mySharedPreferences.getInt("skull",0));
        np14.setValue(mySharedPreferences.getInt("red_fail",0));
        np15.setValue(mySharedPreferences.getInt("aw",0));
        np16.setValue(mySharedPreferences.getInt("p1",0));

        binding.btnWipeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                np1.setValue(0);
                np2.setValue(0);
                np3.setValue(0);
                np4.setValue(0);
                np5.setValue(0);
                np6.setValue(0);
                np7.setValue(0);
                np8.setValue(0);
                np9.setValue(0);
                np10.setValue(0);
                np11.setValue(0);
                np12.setValue(0);
                np13.setValue(0);
                np14.setValue(0);
                np15.setValue(0);
                np16.setValue(0);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        Map<String, Integer> mas = new HashMap<>();
        //mySharedPreferences.edit().clear().apply();
        mySharedPreferences.edit().putInt("p0",binding.numberPicker1.getValue()).apply();
        mySharedPreferences.edit().putInt("m1",binding.numberPicker2.getValue()).apply();
        mySharedPreferences.edit().putInt("m2",binding.numberPicker3.getValue()).apply();
        mySharedPreferences.edit().putInt("m3",binding.numberPicker4.getValue()).apply();
        mySharedPreferences.edit().putInt("m4",binding.numberPicker5.getValue()).apply();
        mySharedPreferences.edit().putInt("m5",binding.numberPicker6.getValue()).apply();
        mySharedPreferences.edit().putInt("m6",binding.numberPicker7.getValue()).apply();
        mySharedPreferences.edit().putInt("m7",binding.numberPicker8.getValue()).apply();
        mySharedPreferences.edit().putInt("m8",binding.numberPicker9.getValue()).apply();
        mySharedPreferences.edit().putInt("face",binding.numberPicker10.getValue()).apply();
        mySharedPreferences.edit().putInt("sprute",binding.numberPicker11.getValue()).apply();
        mySharedPreferences.edit().putInt("sheld",binding.numberPicker12.getValue()).apply();
        mySharedPreferences.edit().putInt("skull",binding.numberPicker13.getValue()).apply();
        mySharedPreferences.edit().putInt("red_fail",binding.numberPicker14.getValue()).apply();
        mySharedPreferences.edit().putInt("aw",binding.numberPicker15.getValue()).apply();
        mySharedPreferences.edit().putInt("p1",binding.numberPicker16.getValue()).apply();
        super.onDestroyView();
        binding = null;
    }
}
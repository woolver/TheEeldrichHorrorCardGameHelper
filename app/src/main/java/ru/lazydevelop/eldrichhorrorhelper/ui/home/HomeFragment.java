package ru.lazydevelop.eldrichhorrorhelper.ui.home;



import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

import ru.lazydevelop.eldrichhorrorhelper.databinding.FragmentHomeBinding;
import ru.lazydevelop.eldrichhorrorhelper.R;

public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;
    SharedPreferences mySharedPreferences;
    Random rand = new Random();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mySharedPreferences = getActivity().getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE);

        binding.button.setOnClickListener(v -> {
            Map<String, Integer> tmpMap;
            List<String> lstTotal = new ArrayList<>();
            tmpMap = (Map<String, Integer>) mySharedPreferences.getAll();
            for(Map.Entry<String, Integer> e : tmpMap.entrySet()) {
                for(int j = 0; j < e.getValue(); j++)
                    lstTotal.add(e.getKey());
            }
            if(lstTotal.isEmpty()) return;
            Collections.shuffle(lstTotal, new Random(lstTotal.size()));
            binding.imageView.animate().translationX(0).translationY(0);
            switch (lstTotal.get(rand.nextInt(lstTotal.size()))) {
                case "p0": {
                    binding.imageView.setImageResource(R.drawable.p0);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "p1": {
                    binding.imageView.setImageResource(R.drawable.p1);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "m1": {
                    binding.imageView.setImageResource(R.drawable.m1);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "m2": {
                    binding.imageView.setImageResource(R.drawable.m2);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "m3": {
                    binding.imageView.setImageResource(R.drawable.m3);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "m4": {
                    binding.imageView.setImageResource(R.drawable.m4);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "m5": {
                    binding.imageView.setImageResource(R.drawable.m5);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "m6": {
                    binding.imageView.setImageResource(R.drawable.m6);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "m7": {
                    binding.imageView.setImageResource(R.drawable.m7);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "m8": {
                    binding.imageView.setImageResource(R.drawable.m8);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "red_fail": {
                    binding.imageView.setImageResource(R.drawable.red_fail);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "sheld": {
                    binding.imageView.setImageResource(R.drawable.sheld);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "skull": {
                    binding.imageView.setImageResource(R.drawable.skull);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "sprute": {
                    binding.imageView.setImageResource(R.drawable.sprute);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "aw": {
                    binding.imageView.setImageResource(R.drawable.aw);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
                case "face": {
                    binding.imageView.setImageResource(R.drawable.face);
                    binding.imageView.setVisibility(View.VISIBLE);
                    break;
                }
            }
            long animDuration = 700;
            ObjectAnimator oaAlpha = ObjectAnimator.ofFloat(binding.imageView,View.ALPHA,0.0F,1.0f);
            oaAlpha.setDuration(animDuration);
            ObjectAnimator oa = ObjectAnimator.ofFloat(binding.imageView,"y", binding.imageView2.getMeasuredHeight()/5);
            oa.setDuration(animDuration);
            AnimatorSet as = new AnimatorSet();
            as.playTogether(oaAlpha,oa);
            as.start();
        });

        binding.imageView.setOnClickListener(v -> binding.imageView.setVisibility(View.INVISIBLE));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
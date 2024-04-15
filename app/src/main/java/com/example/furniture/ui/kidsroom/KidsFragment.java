package com.example.furniture.ui.kidsroom;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.furniture.MAdapter;
import com.example.furniture.R;
import com.example.furniture.databinding.FragmentKidsBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class KidsFragment extends Fragment {

    FragmentKidsBinding binding;
    NavController navController;
    List<FurnitureModel> list_kids = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKidsBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_kids);
        binding.rvKids.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_gardenFragment_to_navigation_home);

        });

    }
    public void createList(){
        list_kids.add(new FurnitureModel("junior_headset", "Детская мебель Палермо-Белла", "1000", "Для начала стоит заметить, что они являются не только функциональными предметами мебели, но и яркими акцентами в интерьере, добавляющими неповторимую атмосферу и характер любому пространству." +
                "К плюсам точно можно точно можно отнести возможность создать уникальный и индивидуальный дизайн, который идеально сочетается с вашими предпочтениями и требованиями.", R.drawable.j1));
        list_kids.add(new FurnitureModel("junior_headset", "Модульная детская Акварель", "2000",
                "Для начала стоит заметить, что они являются не только функциональными предметами мебели, но и яркими акцентами в интерьере, добавляющими неповторимую атмосферу и характер любому пространству." +
                        "К плюсам точно можно точно можно отнести возможность создать уникальный и индивидуальный дизайн, который идеально сочетается с вашими предпочтениями и требованиями."
                , R.drawable.j2));
        list_kids.add(new FurnitureModel("junior_headset", "Комната для подростка АйТи", "3000",
                "Для начала стоит заметить, что они являются не только функциональными предметами мебели, но и яркими акцентами в интерьере, добавляющими неповторимую атмосферу и характер любому пространству." +
                        "К плюсам точно можно точно можно отнести возможность создать уникальный и индивидуальный дизайн, который идеально сочетается с вашими предпочтениями и требованиями."
                , R.drawable.j3));
        list_kids.add(new FurnitureModel("junior_headset", "Угловой шкаф-гардероб Studio", "4000",
                "Для начала стоит заметить, что они являются не только функциональными предметами мебели, но и яркими акцентами в интерьере, добавляющими неповторимую атмосферу и характер любому пространству." +
                        "К плюсам точно можно точно можно отнести возможность создать уникальный и индивидуальный дизайн, который идеально сочетается с вашими предпочтениями и требованиями."
                , R.drawable.j4));
        list_kids.add(new FurnitureModel("junior_headset", "Детская мебель Гламур BMS", "5000",
                "Для начала стоит заметить, что они являются не только функциональными предметами мебели, но и яркими акцентами в интерьере, добавляющими неповторимую атмосферу и характер любому пространству." +
                        "К плюсам точно можно точно можно отнести возможность создать уникальный и индивидуальный дизайн, который идеально сочетается с вашими предпочтениями и требованиями.", R.drawable.j5));
        list_kids.add(new FurnitureModel("junior_headset", "Детская мебель Карина", "6000", "Для начала стоит заметить, что они являются не только функциональными предметами мебели, но и яркими акцентами в интерьере, добавляющими неповторимую атмосферу и характер любому пространству." +
                "К плюсам точно можно точно можно отнести возможность создать уникальный и индивидуальный дизайн, который идеально сочетается с вашими предпочтениями и требованиями.", R.drawable.j6));
    }
}
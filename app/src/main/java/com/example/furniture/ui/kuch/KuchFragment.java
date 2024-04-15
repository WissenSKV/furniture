package com.example.furniture.ui.kuch;


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
import com.example.furniture.databinding.FragmentKuchBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class KuchFragment extends Fragment {

    FragmentKuchBinding binding;
    NavController navController;
    List<FurnitureModel> list_k = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKuchBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_k);
        binding.rvKuch.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_kuchFragment_to_navigation_home);

        });

    }
    public void createList(){
        list_k.add(new FurnitureModel("kitchen", "Кухня Алиса", "1000", "Кухня Алиса угловая BMS – вместительный комплект, чью практичную угловую конструкцию и традиционный дизайн по достоинству оценят владельцы просторных помещений в классическом стиле. Напольные модули – это вместительные распашные отделения и тумба с выдвижными ящиками. Навесные представлены закрытыми отделениями и застекленными шкафчиками. Необычная деталь – скругленные боковые секции. Купить кухню Алиса угловая BMS вы сможете в нашем интернет-магазине по приятной цене.", R.drawable.k1));
        list_k.add(new FurnitureModel("kitchen", "Кухня Saturno", "2000",
                "Кухня Алиса угловая BMS – вместительный комплект, чью практичную угловую конструкцию и традиционный дизайн по достоинству оценят владельцы просторных помещений в классическом стиле. Напольные модули – это вместительные распашные отделения и тумба с выдвижными ящиками. Навесные представлены закрытыми отделениями и застекленными шкафчиками. Необычная деталь – скругленные боковые секции. Купить кухню Алиса угловая BMS вы сможете в нашем интернет-магазине по приятной цене."
                , R.drawable.k2));
        list_k.add(new FurnitureModel("kitchen", "Кухня Одри", "3000",
                "Кухня Алиса угловая BMS – вместительный комплект, чью практичную угловую конструкцию и традиционный дизайн по достоинству оценят владельцы просторных помещений в классическом стиле. Напольные модули – это вместительные распашные отделения и тумба с выдвижными ящиками. Навесные представлены закрытыми отделениями и застекленными шкафчиками. Необычная деталь – скругленные боковые секции. Купить кухню Алиса угловая BMS вы сможете в нашем интернет-магазине по приятной цене."
                , R.drawable.k3));
        list_k.add(new FurnitureModel("kitchen", "Кухня Классика", "4000",
                "Кухня Алиса угловая BMS – вместительный комплект, чью практичную угловую конструкцию и традиционный дизайн по достоинству оценят владельцы просторных помещений в классическом стиле. Напольные модули – это вместительные распашные отделения и тумба с выдвижными ящиками. Навесные представлены закрытыми отделениями и застекленными шкафчиками. Необычная деталь – скругленные боковые секции. Купить кухню Алиса угловая BMS вы сможете в нашем интернет-магазине по приятной цене."
                , R.drawable.k4));
        list_k.add(new FurnitureModel("kitchen", "Угловой модуль Сакура", "5000",
                "Кухня Алиса угловая BMS – вместительный комплект, чью практичную угловую конструкцию и традиционный дизайн по достоинству оценят владельцы просторных помещений в классическом стиле. Напольные модули – это вместительные распашные отделения и тумба с выдвижными ящиками. Навесные представлены закрытыми отделениями и застекленными шкафчиками. Необычная деталь – скругленные боковые секции. Купить кухню Алиса угловая BMS вы сможете в нашем интернет-магазине по приятной цене.", R.drawable.k5));
        list_k.add(new FurnitureModel("kitchen", "Кухня София патина", "6000", "Кухня Алиса угловая BMS – вместительный комплект, чью практичную угловую конструкцию и традиционный дизайн по достоинству оценят владельцы просторных помещений в классическом стиле. Напольные модули – это вместительные распашные отделения и тумба с выдвижными ящиками. Навесные представлены закрытыми отделениями и застекленными шкафчиками. Необычная деталь – скругленные боковые секции. Купить кухню Алиса угловая BMS вы сможете в нашем интернет-магазине по приятной цене.", R.drawable.k6));
    }
}
package com.example.furniture.ui.garden;


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
import com.example.furniture.databinding.FragmentGardenBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class GardenFragment extends Fragment {

    FragmentGardenBinding binding;
    NavController navController;
    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGardenBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_g);
        binding.rvGarden.setAdapter(adapter);
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
        list_g.add(new FurnitureModel("garden", "Прямоугольный стол", "1000", "Прямоугольный стол Бамбук 1200 поможет вам оборудовать обеденную зону в гостиной загородного дома, в саду или на веранде. Прямоугольная столешница из закаленного стекла толщиной 5 мм располагается на устойчивых фигурных опорах с покрытием порошковой краской. Благодаря износостойким материалам поверхности устойчивы к действию влаги, солнечных лучей и перепадам температур, а также не требуют специального ухода. Купить прямоугольный стол Бамбук 1200 по доступной цене вы сможете в нашем интернет-магазине.", R.drawable.g1));
        list_g.add(new FurnitureModel("garden", "Комплект Листья", "2000",
                "Прямоугольный стол Бамбук 1200 поможет вам оборудовать обеденную зону в гостиной загородного дома, в саду или на веранде. Прямоугольная столешница из закаленного стекла толщиной 5 мм располагается на устойчивых фигурных опорах с покрытием порошковой краской. Благодаря износостойким материалам поверхности устойчивы к действию влаги, солнечных лучей и перепадам температур, а также не требуют специального ухода. Купить прямоугольный стол Бамбук 1200 по доступной цене вы сможете в нашем интернет-магазине."
                , R.drawable.g2));
        list_g.add(new FurnitureModel("garden", "Комплект Salemo", "3000",
                "Прямоугольный стол Бамбук 1200 поможет вам оборудовать обеденную зону в гостиной загородного дома, в саду или на веранде. Прямоугольная столешница из закаленного стекла толщиной 5 мм располагается на устойчивых фигурных опорах с покрытием порошковой краской. Благодаря износостойким материалам поверхности устойчивы к действию влаги, солнечных лучей и перепадам температур, а также не требуют специального ухода. Купить прямоугольный стол Бамбук 1200 по доступной цене вы сможете в нашем интернет-магазине."
                , R.drawable.g3));
        list_g.add(new FurnitureModel("garden", "Стул Барселона", "4000",
                "Прямоугольный стол Бамбук 1200 поможет вам оборудовать обеденную зону в гостиной загородного дома, в саду или на веранде. Прямоугольная столешница из закаленного стекла толщиной 5 мм располагается на устойчивых фигурных опорах с покрытием порошковой краской. Благодаря износостойким материалам поверхности устойчивы к действию влаги, солнечных лучей и перепадам температур, а также не требуют специального ухода. Купить прямоугольный стол Бамбук 1200 по доступной цене вы сможете в нашем интернет-магазине."
                , R.drawable.g4));
        list_g.add(new FurnitureModel("garden", "Стол Милан", "5000",
                "Прямоугольный стол Бамбук 1200 поможет вам оборудовать обеденную зону в гостиной загородного дома, в саду или на веранде. Прямоугольная столешница из закаленного стекла толщиной 5 мм располагается на устойчивых фигурных опорах с покрытием порошковой краской. Благодаря износостойким материалам поверхности устойчивы к действию влаги, солнечных лучей и перепадам температур, а также не требуют специального ухода. Купить прямоугольный стол Бамбук 1200 по доступной цене вы сможете в нашем интернет-магазине.", R.drawable.g5));
        list_g.add(new FurnitureModel("garden", "Стол Lima", "6000", "Прямоугольный стол Бамбук 1200 поможет вам оборудовать обеденную зону в гостиной загородного дома, в саду или на веранде. Прямоугольная столешница из закаленного стекла толщиной 5 мм располагается на устойчивых фигурных опорах с покрытием порошковой краской. Благодаря износостойким материалам поверхности устойчивы к действию влаги, солнечных лучей и перепадам температур, а также не требуют специального ухода. Купить прямоугольный стол Бамбук 1200 по доступной цене вы сможете в нашем интернет-магазине.", R.drawable.g6));
    }
}
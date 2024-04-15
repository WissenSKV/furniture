package com.example.furniture.ui.notifications;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


import com.example.furniture.MAdapter;
import com.example.furniture.R;
import com.example.furniture.databinding.FragmentZalBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class ZalFragment extends Fragment {
    private FragmentZalBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;

    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentZalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_zal);
        binding.rvZalRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_zal.add(new FurnitureModel("zal", "Сектор Розалия", "1000", "Сектор Розалия модуль 07 BMS представляет собой классический высокий стеллаж с просторными скругленными полками. Элемент станет практичным дополнением шкафа из популярной модульной серии и выдержан в характерных цветах – темные древесные оттенки и белый глянец с орнаментом. На полках выигрышно будут смотреться предметы декора, книги, аксессуары и разнообразные мелочи. Купить сектор Розалия модуль 07 BMS по доступной цене приглашаем к нам в интернет-магазин.", R.drawable.z1));
        list_zal.add(new FurnitureModel("zal", "Полка Зальцбург 1", "2000",
                "Сектор Розалия модуль 07 BMS представляет собой классический высокий стеллаж с просторными скругленными полками. Элемент станет практичным дополнением шкафа из популярной модульной серии и выдержан в характерных цветах – темные древесные оттенки и белый глянец с орнаментом. На полках выигрышно будут смотреться предметы декора, книги, аксессуары и разнообразные мелочи. Купить сектор Розалия модуль 07 BMS по доступной цене приглашаем к нам в интернет-магазин."
                , R.drawable.z2));
        list_zal.add(new FurnitureModel("zal", "Полка Зальцбург 2", "3000",
                "Сектор Розалия модуль 07 BMS представляет собой классический высокий стеллаж с просторными скругленными полками. Элемент станет практичным дополнением шкафа из популярной модульной серии и выдержан в характерных цветах – темные древесные оттенки и белый глянец с орнаментом. На полках выигрышно будут смотреться предметы декора, книги, аксессуары и разнообразные мелочи. Купить сектор Розалия модуль 07 BMS по доступной цене приглашаем к нам в интернет-магазин.в"
                , R.drawable.z3));
        list_zal.add(new FurnitureModel("zal", "Полка Зальцбург 3", "4000",
                "Сектор Розалия модуль 07 BMS представляет собой классический высокий стеллаж с просторными скругленными полками. Элемент станет практичным дополнением шкафа из популярной модульной серии и выдержан в характерных цветах – темные древесные оттенки и белый глянец с орнаментом. На полках выигрышно будут смотреться предметы декора, книги, аксессуары и разнообразные мелочи. Купить сектор Розалия модуль 07 BMS по доступной цене приглашаем к нам в интернет-магазин."
                , R.drawable.z4));
        list_zal.add(new FurnitureModel("zal", "Полка Зальцбург 4", "5000",
                "Сектор Розалия модуль 07 BMS представляет собой классический высокий стеллаж с просторными скругленными полками. Элемент станет практичным дополнением шкафа из популярной модульной серии и выдержан в характерных цветах – темные древесные оттенки и белый глянец с орнаментом. На полках выигрышно будут смотреться предметы декора, книги, аксессуары и разнообразные мелочи. Купить сектор Розалия модуль 07 BMS по доступной цене приглашаем к нам в интернет-магазин.", R.drawable.z5));
        list_zal.add(new FurnitureModel("zal", "Полка Зальцбург 5", "6000", "Сектор Розалия модуль 07 BMS представляет собой классический высокий стеллаж с просторными скругленными полками. Элемент станет практичным дополнением шкафа из популярной модульной серии и выдержан в характерных цветах – темные древесные оттенки и белый глянец с орнаментом. На полках выигрышно будут смотреться предметы декора, книги, аксессуары и разнообразные мелочи. Купить сектор Розалия модуль 07 BMS по доступной цене приглашаем к нам в интернет-магазин.", R.drawable.z6));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_zalFragment_to_navigation_home);
        });



    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
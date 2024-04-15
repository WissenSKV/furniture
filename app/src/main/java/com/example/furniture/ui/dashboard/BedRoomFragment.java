package com.example.furniture.ui.dashboard;



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
import com.example.furniture.databinding.FragmentBedRoomBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class BedRoomFragment extends Fragment {
    private FragmentBedRoomBinding binding;
    List<FurnitureModel> list_bedroom = new ArrayList<>();
    MAdapter adapter;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBedRoomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_bedroom);
        binding.rvBedRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_bedroom.add(new FurnitureModel("bed_room", "Спальня Уют", "1000", "Шкаф-кровать Кремона BMS станет выбором тех, кто " +
                "ценит минимализм и функциональность. Эффектная кремовая композиция объединила шкаф с откидной кроватью-трансформером и комфортный двухместный диван с " +
                "широкими подлокотниками и съемными подушками спинки. Боковые фальшпанели дополнены открытыми полками, на которых удобно разместятся необходимые под " +
                "рукой мелочи, а особенно уютным сделает интерьер встроенная в нишу подсветка. Купить шкаф-кровать Кремона BMS с учетом нужных параметров приглашаем к нам " +
                "в интернет-магазин.", R.drawable.download));
        list_bedroom.add(new FurnitureModel("bed_room", "Спальня Валенсия", "2000",
                "Шкаф-кровать Кремона BMS станет выбором тех, кто ценит минимализм и функциональность. Эффектная кремовая композиция объединила шкаф с откидной " +
                        "кроватью-трансформером и комфортный двухместный диван с широкими подлокотниками и съемными подушками спинки. Боковые фальшпанели дополнены открытыми " +
                        "полками, на которых удобно разместятся необходимые под рукой мелочи, а особенно уютным сделает интерьер встроенная в нишу подсветка. Купить шкаф-кровать Кремона BMS с учетом нужных параметров приглашаем к нам в интернет-магазин."
                , R.drawable.download_2));
        list_bedroom.add(new FurnitureModel("bed_room", "Спальня Палермо", "3000",
                "Шкаф-кровать Кремона BMS станет выбором тех, кто ценит минимализм и функциональность. Эффектная кремовая композиция объединила шкаф с откидной кроватью-трансформером и комфортный двухместный диван с широкими подлокотниками и съемными подушками спинки. Боковые фальшпанели дополнены открытыми полками, на которых удобно разместятся необходимые под рукой мелочи, а особенно уютным сделает интерьер встроенная в нишу подсветка. Купить шкаф-кровать Кремона BMS с учетом нужных параметров приглашаем к нам в интернет-магазин."
                , R.drawable.download_3));
        list_bedroom.add(new FurnitureModel("bed_room", "Спальня Санремо", "4000",
                "Шкаф-кровать Кремона BMS станет выбором тех, кто ценит минимализм и функциональность. Эффектная кремовая композиция объединила шкаф с откидной кроватью-трансформером и комфортный двухместный диван с широкими подлокотниками и съемными подушками спинки. Боковые фальшпанели дополнены открытыми полками, на которых удобно разместятся необходимые под рукой мелочи, а особенно уютным сделает интерьер встроенная в нишу подсветка. Купить шкаф-кровать Кремона BMS с учетом нужных параметров приглашаем к нам в интернет-магазин."
                , R.drawable.download_4));
        list_bedroom.add(new FurnitureModel("bed_room", "Спальня Сальма", "5000",
                "Шкаф-кровать Кремона BMS станет выбором тех, кто ценит минимализм и функциональность. Эффектная кремовая композиция объединила шкаф с откидной кроватью-трансформером и комфортный двухместный диван с широкими подлокотниками и съемными подушками спинки. Боковые фальшпанели дополнены открытыми полками, на которых удобно разместятся необходимые под рукой мелочи, а особенно уютным сделает интерьер встроенная в нишу подсветка. Купить шкаф-кровать Кремона BMS с учетом нужных параметров приглашаем к нам в интернет-магазин.", R.drawable.download_5));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Red_sunrise", "6000", "Шкаф-кровать Кремона BMS станет выбором тех, кто ценит минимализм и функциональность. Эффектная кремовая композиция объединила шкаф с откидной кроватью-трансформером и комфортный двухместный диван с широкими подлокотниками и съемными подушками спинки. Боковые фальшпанели дополнены открытыми полками, на которых удобно разместятся необходимые под рукой мелочи, а особенно уютным сделает интерьер встроенная в нишу подсветка. Купить шкаф-кровать Кремона BMS с учетом нужных параметров приглашаем к нам в интернет-магазин.", R.drawable.download));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_bed_room_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
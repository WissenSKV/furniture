package com.example.furniture.ui.Sale;

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
import com.example.furniture.databinding.FragmentSaleBinding;
import com.example.furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class FragmentSale extends Fragment {

    FragmentSaleBinding binding;
    NavController navController;
    List<FurnitureModel> list_s = new ArrayList<>();

    MAdapter adapter;

    public FragmentSale() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSaleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_s);
        binding.rvSale.setAdapter(adapter);
        return root;
    }




    private void createList() {
        list_s.add(new FurnitureModel("zal", "Сектор Розалия", "6̶0̶0̶0̶ / 1000", "Сектор Розалия модуль 07 BMS представляет собой классический высокий стеллаж с просторными скругленными полками. Элемент станет практичным дополнением шкафа из популярной модульной серии и выдержан в характерных цветах – темные древесные оттенки и белый глянец с орнаментом. На полках выигрышно будут смотреться предметы декора, книги, аксессуары и разнообразные мелочи. Купить сектор Розалия модуль 07 BMS по доступной цене приглашаем к нам в интернет-магазин.", R.drawable.z1));
        list_s.add(new FurnitureModel("kitchen", "Кухня Saturno", "6̶0̶0̶0̶ / 2000",
                "Кухня Алиса угловая BMS – вместительный комплект, чью практичную угловую конструкцию и традиционный дизайн по достоинству оценят владельцы просторных помещений в классическом стиле. Напольные модули – это вместительные распашные отделения и тумба с выдвижными ящиками. Навесные представлены закрытыми отделениями и застекленными шкафчиками. Необычная деталь – скругленные боковые секции. Купить кухню Алиса угловая BMS вы сможете в нашем интернет-магазине по приятной цене."
                , R.drawable.k2));
        list_s.add(new FurnitureModel("zal", "Полка Зальцбург 2", "6̶0̶0̶0̶ / 3000",
                "Сектор Розалия модуль 07 BMS представляет собой классический высокий стеллаж с просторными скругленными полками. Элемент станет практичным дополнением шкафа из популярной модульной серии и выдержан в характерных цветах – темные древесные оттенки и белый глянец с орнаментом. На полках выигрышно будут смотреться предметы декора, книги, аксессуары и разнообразные мелочи. Купить сектор Розалия модуль 07 BMS по доступной цене приглашаем к нам в интернет-магазин.в"
                , R.drawable.z3));
        list_s.add(new FurnitureModel("junior_headset", "Модульная детская Акварель", "6̶0̶0̶0̶ / 2000",
                "Для начала стоит заметить, что они являются не только функциональными предметами мебели, но и яркими акцентами в интерьере, добавляющими неповторимую атмосферу и характер любому пространству." +
                        "К плюсам точно можно точно можно отнести возможность создать уникальный и индивидуальный дизайн, который идеально сочетается с вашими предпочтениями и требованиями."
                , R.drawable.j2));
        list_s.add(new FurnitureModel("zal", "Полка Зальцбург 4", "6̶0̶0̶0̶ / 5000",
                "Сектор Розалия модуль 07 BMS представляет собой классический высокий стеллаж с просторными скругленными полками. Элемент станет практичным дополнением шкафа из популярной модульной серии и выдержан в характерных цветах – темные древесные оттенки и белый глянец с орнаментом. На полках выигрышно будут смотреться предметы декора, книги, аксессуары и разнообразные мелочи. Купить сектор Розалия модуль 07 BMS по доступной цене приглашаем к нам в интернет-магазин.", R.drawable.z5));
        list_s.add(new FurnitureModel("zal", "Полка Зальцбург 5", "6̶0̶0̶0̶ / 4500", "Сектор Розалия модуль 07 BMS представляет собой классический высокий стеллаж с просторными скругленными полками. Элемент станет практичным дополнением шкафа из популярной модульной серии и выдержан в характерных цветах – темные древесные оттенки и белый глянец с орнаментом. На полках выигрышно будут смотреться предметы декора, книги, аксессуары и разнообразные мелочи. Купить сектор Розалия модуль 07 BMS по доступной цене приглашаем к нам в интернет-магазин.", R.drawable.z6));
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_fragmentSale_to_navigation_home);
        });

    }
}
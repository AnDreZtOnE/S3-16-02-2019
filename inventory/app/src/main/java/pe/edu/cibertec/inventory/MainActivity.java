package pe.edu.cibertec.inventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Vista
    RecyclerView rvProduct;

    //Modelo : informacion a mostrar
    ArrayList<Product> items;

    //Adaptador
    AdapterProduct adapterProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //Enlaza variable con su vista a partir de id
        rvProduct = findViewById(R.id.rvProduct);

        //Asigna espacion en memoria
        items = new ArrayList<>();

        //Carga la información a mostrar
        loadItems();

        //Inicializo el adaptador}
        adapterProduct = new AdapterProduct(items);


    }

    private void loadItems() {
        // Instancia un objeto de la clase Product
        Product productLaptop = new Product("Latop","Marca Toshiba",2);

        // Agrega un objeto creado a la lista
        items.add(productLaptop);

        Product productMouse = new Product("Mouse","Modelo Genius",122);

        items.add(productMouse);

    }
}

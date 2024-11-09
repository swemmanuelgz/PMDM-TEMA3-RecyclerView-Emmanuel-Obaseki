package com.example.pmdm_tema3_recyclerview_emmanuel_obaseki;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdm_tema3_recyclerview_emmanuel_obaseki.adapters.ContactoAdapter;
import com.example.pmdm_tema3_recyclerview_emmanuel_obaseki.model.Contacto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            RecyclerView recyclerView = findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            List<Contacto> contactos = new ArrayList<>();
            contactos.add(new Contacto(R.drawable.contacto1, "Ana", "Pérez", "ana.perez@example.com", "612345678"));
            contactos.add(new Contacto(R.drawable.contacto2, "Carlos", "Gómez", "carlos.gomez@example.com", "678912345"));
            // Añade más contactos según sea necesario

            ContactoAdapter adapter = new ContactoAdapter(contactos);
            recyclerView.setAdapter(adapter);
        }


}
package commer.mmr.instock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TelaEstoqueLista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_estoque_lista);

        // Ajustar padding para barras do sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configurar o botão para ir para a Tela User
        ImageButton buttonCadastro = findViewById(R.id.btn_boneco);
        buttonCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criar um Intent para navegar para TelaUser
                Intent intent = new Intent(TelaEstoqueLista.this, TelaUser.class);
                startActivity(intent);
            }
        });

        // Configurar o botão "Adicionar Item"
        FloatingActionButton btnAdicionarItem = findViewById(R.id.BtnAdicionarItem);
        btnAdicionarItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar para a tela de adicionar item
                Intent intent = new Intent(TelaEstoqueLista.this, TelaAdicionarItem.class);
                startActivity(intent);
            }
        });

        // Configurar o botão "sair"
        ImageButton btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar para a tela de login
                Intent intent = new Intent(TelaEstoqueLista.this, TelaLogin.class);
                startActivity(intent);
            }
        });
    }
}

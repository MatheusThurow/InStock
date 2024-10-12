package commer.mmr.instock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_cadastro);

        // Ajustar padding para barras do sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Encontrar o TextView
        TextView textView = findViewById(R.id.possuiCadastro);

        // Definir um OnClickListener para o TextView
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar para a tela de login
                Intent intent = new Intent(TelaCadastro.this, TelaLogin.class);
                startActivity(intent);
            }
        });

        // Configurar o botão "Entrar" para ir para a TelaEstoqueLista
        Button btnEntrar = findViewById(R.id.button_Entrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar para TelaEstoqueLista
                Intent intent = new Intent(TelaCadastro.this, TelaEstoqueLista.class);
                startActivity(intent);
            }
        });
    }
}

package lista.compras;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import java.util.ArrayList;
        import java.util.List;

public class ComprasActivity extends AppCompatActivity {

        RecyclerView rvCompras;
        private Object Compras;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.compras_activity);

                rvCompras = findViewById(R.id.rv_compras);
                rvCompras.setLayoutManager(new LinearLayoutManager(this));

                List<Compras> compras = new ArrayList<>();
                compras.add(new Compras("Pão", "30", R.color.white));
                compras.add(new Compras("Macarrão", "251", R.color.white));
                compras.add(new Compras("Agua", "86", R.color.white));
                compras.add(new Compras("Leite", "28", R.color.white));
                


                ComprasAdapter adapter = new ComprasAdapter(compras);
                rvCompras.setAdapter(adapter);
        }
}
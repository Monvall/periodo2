package sv.edu.ufg.fis.amb.monroyvalladares
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private lateinit var btnAtras: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnAtras = findViewById(R.id.btn_regresar)
        btnAtras.setOnClickListener{
            finish()
        }
    }
}
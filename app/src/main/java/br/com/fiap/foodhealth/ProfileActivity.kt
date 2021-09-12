package br.com.fiap.foodhealth

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import br.com.fiap.foodhealth.database.AppDatabase
import br.com.fiap.foodhealth.databinding.ActivityProfileBinding
import br.com.fiap.foodhealth.models.Pessoa

class ProfileActivity : AppCompatActivity() {

   lateinit var binding: ActivityProfileBinding

    private val db by lazy {
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "pessoas-db"
        ).allowMainThreadQueries().build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btSave.setOnClickListener {
            val data = binding.etData.text.toString().toInt()
            val nome = binding.etName.text.toString()
            val pessoa = Pessoa(data,nome)
            savePessoa(pessoa)
        }
     listPessoas(db.pessodao().getAll())
    }

private fun savePessoa(pessoa: Pessoa){
    db.pessodao().getInsertAll(pessoa)
    listPessoas(db.pessodao().getAll())
}
    private fun listPessoas(pessoas : List<Pessoa>) {
        var pessoasStr = ""
        pessoas.forEach{
                aluno ->
            pessoasStr += "${aluno.nome} | ${aluno.data} \n"
        }
        binding.tvResult.text = pessoasStr
    }
}
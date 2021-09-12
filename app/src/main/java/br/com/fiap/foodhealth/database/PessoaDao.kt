package br.com.fiap.foodhealth.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import br.com.fiap.foodhealth.models.Pessoa

@Dao
interface PessoaDao {
        @Query("SELECT * FROM pessoa")
        fun getAll() : List<Pessoa>

        @Query("SELECT * FROM pessoa WHERE data = :data")
        fun getByRm(data : Int) : Pessoa

        @Insert
        fun getInsertAll(vararg pessoas: Pessoa)

        @Delete
        fun delete(pessoa: Pessoa)

}
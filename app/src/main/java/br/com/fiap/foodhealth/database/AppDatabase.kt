package br.com.fiap.foodhealth.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.fiap.foodhealth.models.Pessoa

@Database(entities = [Pessoa::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun pessodao() : PessoaDao
}
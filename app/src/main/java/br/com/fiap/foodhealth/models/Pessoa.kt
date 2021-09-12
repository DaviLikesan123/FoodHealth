package br.com.fiap.foodhealth.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pessoa(
    @PrimaryKey var data : Int,
    @ColumnInfo(name = "first_name") var nome: String
)
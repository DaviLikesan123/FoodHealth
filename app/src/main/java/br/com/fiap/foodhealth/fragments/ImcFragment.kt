package br.com.fiap.foodhealth.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.fiap.foodhealth.R
import br.com.fiap.foodhealth.databinding.FragmentImcBinding
import com.google.android.material.textfield.TextInputEditText

class ImcFragment : Fragment() {

    private lateinit var binding: FragmentImcBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentImcBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btCalcular.setOnClickListener {
            val peso = binding.tieRegisterPeso.editableText.toString().toFloat()
            val altura = binding.tieRegisterAltura.editableText.toString().toFloat() / 100
            val resultado = (peso/ (altura * altura)) /10000
            binding.tvResult.text = "$resultado"
        }
    }
}



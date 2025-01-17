package com.example.pickupanddrop.delivery.presentation.locationAndMaps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.pickupanddrop.delivery.domain.MapsViewModel
import com.example.pickupanddrop.ui.theme.PickUpandDropTheme

class ChooseDropLocationActivity : ComponentActivity() {
    private val viewModel by lazy { ViewModelProvider(this)[MapsViewModel::class.java] }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PickUpandDropTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ChooseLocationScreen(
                        modifier = Modifier,
                        viewModel = viewModel
                    )
                }
            }
        }
    }
}
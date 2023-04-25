package com.avantageacompany.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.avantageacompany.example.ui.theme.shade_of_cyan_blue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = viewModel<CalculatorViewModel>()
            val state = viewModel.state
            val buttonSpacing = 8.dp
            Calculator(
                state = state,
                onAction = viewModel::onAction,
                buttonSpacing = buttonSpacing,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(shade_of_cyan_blue)
                    .padding(16.dp)
            )
        }
    }
}






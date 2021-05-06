package com.mito.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mito.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
          Main()
        }
      }
    }
  }
}

@Composable
fun Main() {
  val viewModel: MainViewModel = viewModel()

  Column {
    Text(text = "Count1:${viewModel.count1}")
    Text(text = "Count2:${viewModel.count2}")

    Spacer(modifier = Modifier.height(10.dp))
    Text(text = "Result8500:${viewModel.countResult8500}")

    Button(onClick = viewModel::onClickCount) {
      Text(text = "count")
    }
    Button(onClick = viewModel::onClickCount2) {
      Text(text = "count2")
    }
  }
}


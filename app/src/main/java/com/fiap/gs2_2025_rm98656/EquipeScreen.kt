package com.fiap.gs2_2025_rm98656

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun EquipeScreen(navController: NavController) {
    val equipe = listOf("Matheus Bailon RM98656", "Kaique Aleixo RM98627")

    Column(modifier = Modifier.fillMaxSize().padding(32.dp)) {
        Text("EQUIPE", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(24.dp))

        LazyColumn {
            items(equipe) { nome ->
                Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
                    Text(text = nome, modifier = Modifier.padding(16.dp))
                }
            }
        }

        Spacer(Modifier.height(32.dp))
        Button(onClick = { navController.popBackStack() }, modifier = Modifier.fillMaxWidth()
        ,colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)) {
            Text("Voltar")
        }
    }
}

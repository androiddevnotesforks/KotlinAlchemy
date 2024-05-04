package com.istudio.app.modules.module_demos.flows

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.istudio.app.modules.module_selection.ModuleDemo
import com.istudio.app.ui.composables.AppButton


@Composable
fun FlowsDemo (navController: NavHostController) {

    val viewModel: FlowsDemoVm = hiltViewModel()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Flow basics", onClick = {
            navController.navigate(ModuleDemo.FlowBasics.rout)
        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Terminal Operators", onClick = {
            // New composable is launched
            navController.navigate(ModuleDemo.TerminalOperators.rout)
        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Intermediate Operators", onClick = {
            // New composable is launched
            navController.navigate(ModuleDemo.IntermediateOperators.rout)
        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Composing and Flattening the flows", onClick = {
            navController.navigate(ModuleDemo.ComposingAndFlatteningTheFlows.rout)
        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "State And Shared Flow", onClick = {
            navController.navigate(ModuleDemo.StateAndSharedFlowDemo.rout)
        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Mutable State of Flow Demo", onClick = {
            navController.navigate(ModuleDemo.MutableStateOfFlowDemo.rout)
        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Flatten Flows", onClick = {
            navController.navigate(ModuleDemo.FlattenFlowsDemo.rout)
        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Collect As State With Life Cycle", onClick = {
            navController.navigate(ModuleDemo.CollectAsStateWithLifeCycle.rout)
        })

    }

}
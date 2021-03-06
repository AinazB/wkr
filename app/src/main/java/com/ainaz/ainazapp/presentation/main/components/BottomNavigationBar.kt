package com.ainaz.ainazapp.presentation.main.components

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ainaz.ainazapp.ui.theme.AinazAppTheme

@Composable
@ExperimentalAnimationApi
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    itemClick: (BottomNavItem) -> Unit
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(0.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEach { item ->
                val selected = item.route == backStackEntry?.destination?.route
                NavItem(
                    item = item,
                    onClick = { itemClick(item) },
                    selected = selected
                )
            }
        }
    }
}

@ExperimentalAnimationApi
@Preview(showBackground = true)
@Composable
fun BottomNavigationPreview() {
    AinazAppTheme() {
        BottomNavigationBar(
            items = provideBottomNavItems(),
            rememberNavController()
        ) {}
    }
}

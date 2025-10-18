package com.example.myfirstcomposeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.outlined.Newspaper
import androidx.compose.material.icons.outlined.Sell
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImageCard(
) {
    Card(
        modifier = Modifier.fillMaxWidth().fillMaxHeight(.7f),
        shape = RoundedCornerShape(0.dp)
    ) {
        Box{
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "town",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 400f
                        )
                    )
            )
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(30.dp, 20.dp),
                verticalArrangement = Arrangement.Bottom
                ) {
                Box(
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .background(
                            color = Color.Yellow.copy(alpha = 0.2f),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .border(
                            width = 1.dp,
                            color = Color.Yellow.copy(alpha = 0.5f),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(horizontal = 15.dp, vertical = 5.dp)
                ) {
                    Text(
                        text = "TECH",
                        color = Color.Yellow
                    )
                }

                Text(
                    "The Future of Urban Living",
                    color = Color.White, fontSize = 30.sp,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 10.dp)
                )
                AuthorInfoRow()
            }

        }
    }
}

@Composable
fun AuthorInfoRow() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Author",
            tint = Color.White.copy(alpha = 0.5f),
            modifier = Modifier.size(20.dp)
        )
        Text(text = "Sarah Chen", color = Color.White.copy(alpha = 0.5f), fontSize = 14.sp)

        Spacer(modifier = Modifier.width(8.dp))

        Icon(
            imageVector = Icons.Default.Schedule,
            contentDescription = "Read time",
            tint = Color.White.copy(alpha = 0.5f),
            modifier = Modifier.size(20.dp)
        )
        Text(text = "8 min read", color = Color.White.copy(alpha = 0.5f), fontSize = 14.sp)
    }
}

@Composable
fun AppBottomNavigationUI() {
    NavigationBar(
        containerColor = Color.Black,
        contentColor = Color.White
    ) {
        NavigationBarItem(
            icon = { Icon(Icons.Outlined.Newspaper, contentDescription = "News") },
            label = { Text("NEWS") },
            selected = true,
            onClick = { },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                unselectedIconColor = Color.Gray,
                selectedTextColor = Color.White,
                unselectedTextColor = Color.Gray,
                indicatorColor = Color.DarkGray.copy(alpha = 0.5f)
            )
        )

        NavigationBarItem(
            icon = { Icon(Icons.Outlined.Sell, contentDescription = "Promos") },
            label = { Text("PROMOS") },
            selected = false,
            onClick = { },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                unselectedIconColor = Color.Gray,
                selectedTextColor = Color.White,
                unselectedTextColor = Color.Gray,
                indicatorColor = Color.DarkGray.copy(alpha = 0.5f)
            )
        )

        NavigationBarItem(
            icon = { Icon(Icons.Outlined.Settings, contentDescription = "Settings") },
            label = { Text("SETTINGS") },
            selected = false,
            onClick = { },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                unselectedIconColor = Color.Gray,
                selectedTextColor = Color.White,
                unselectedTextColor = Color.Gray,
                indicatorColor = Color.DarkGray.copy(alpha = 0.5f)
            )
        )
    }
}
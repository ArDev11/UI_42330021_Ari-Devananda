package com.example.littlelemonexercise

import androidx.compose.material3.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemonexercise.ui.theme.LittleLemonExerciseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonExerciseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4CE14))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(20.dp))
        RestaurantHeader()
        Spacer(modifier = Modifier.height(20.dp))
        RestaurantName(name = "Little Lemon", size = 36)
        Spacer(modifier = Modifier.height(20.dp))
        OrderButton()
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF495E57))
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 24.sp,
            color = Color.White
        )
        Icon(
            painter = painterResource(id = android.R.drawable.ic_menu_info_details),
            contentDescription = "Menu Icon",
            tint = Color.White,
            modifier = Modifier.size(32.dp)
        )
    }
}

@Composable
fun RestaurantHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = android.R.drawable.ic_menu_camera),
                contentDescription = "Restaurant Logo",
                modifier = Modifier.size(90.dp),
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Welcome to Little Lemon",
                fontSize = 20.sp,
                color = Color.Black
            )
        }
    }
}

@Composable
fun RestaurantName(name: String, size: Int) {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = name,
            fontSize = size.sp,
            color = Color.Black
        )
    }
}

@Composable
fun OrderButton() {
    Button(
        onClick = { /* TODO: Handle click */ },
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF495E57)),
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.fillMaxWidth(0.8f)
    ) {
        Text(text = "Order Now", color = Color.White, fontSize = 18.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    LittleLemonExerciseTheme {
        MainScreen()
    }
}

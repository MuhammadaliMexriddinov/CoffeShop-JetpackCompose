package uz.catsidroid.coffeshop.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import uz.catsidroid.coffeshop.R



@Composable
fun CoffeeItem(name : String) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(8.dp)
    ) {
        Card(
            shape = RoundedCornerShape(30.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp,

                ),
            modifier = Modifier
                .fillMaxSize()
                .weight(6f)
                ,
            colors = CardDefaults.cardColors(
                containerColor = Color("#ECE1CF".toColorInt()),
                contentColor = Color.White
            )
        ) {
            Column {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(
                        painterResource(R.drawable.coffee1),
                        contentDescription = "",
                        modifier = Modifier
                            .height(92.dp)
                            .width(92.dp)
                            .padding(top = 32.dp)
                            .background(Color.Transparent)
                            .align(Alignment.Center),
                    )
                }
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 42.dp),
                    text = name.toString(),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(
                        "#674D3F".toColorInt(),

                        )
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 22.dp , end=12.dp),
                    text = " -  espresso  ",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(
                        "#674D3F".toColorInt(),

                        )
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 22.dp , end=12.dp),
                    text = " -  steamed milk  ",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(
                        "#674D3F".toColorInt(),

                        )
                )


            }
        }
        Spacer(modifier = Modifier.height(12.dp))

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .align(Alignment.CenterHorizontally)
                .background(
                    Color("#FFF9F2".toColorInt()),
                ),

        ) {
            Button(
                colors = ButtonDefaults.buttonColors(Color("#674D3F".toColorInt())),
                onClick = {},
            ) {
                Text(
                    text = "Order"
                )
            }

        }
    }
}


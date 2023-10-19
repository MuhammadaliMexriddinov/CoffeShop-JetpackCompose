package uz.catsidroid.coffeshop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import uz.catsidroid.coffeshop.components.CoffeeItem
import uz.catsidroid.coffeshop.ui.theme.CoffeShopTheme

@Preview
@Composable
fun MainScreen() {
    CoffeShopTheme {

        val coffeeData : List<String> = listOf(
            "Latte",
            "Mocha",
            "Espresso",
            "Red eye",
            "Long Black",
            "Breve",
            "Flat White",
            "Vienna",
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color("#FFF9F2".toColorInt()))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .paint(
                        painterResource(id = R.drawable.shape_main1),
                        contentScale = ContentScale.FillBounds
                    )
                    .weight(0.5f)
            ) {
                Image(
                    painterResource(R.drawable.menu),
                    contentDescription = "",
                    modifier = Modifier
                        .height(52.dp)
                        .width(52.dp)
                        .padding(6.dp)
                        .background(Color.Transparent)
                        .padding(6.dp),
                )

                Image(
                    painterResource(R.drawable.profile),
                    contentDescription = "",
                    modifier = Modifier
                        .height(72.dp)
                        .width(72.dp)
                        .padding(6.dp)
                        .align(Alignment.TopEnd)
                        .background(Color.Transparent)
                        .padding(end = 16.dp),
                )

            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(3f)
            ) {
                Column {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp),
                        text = "Hot Coffee",
                        fontSize = 24.sp,
                        color = Color("#674D3F".toColorInt()),
                        fontWeight = FontWeight.Bold
                    )
                    LazyRow()
                    {
                        items(coffeeData) { item ->
                            CoffeeItem(name = item )
                        }
                    }


                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp),
                        text = "Cold Coffee",
                        fontSize = 24.sp,
                        color = Color("#674D3F".toColorInt()),
                        fontWeight = FontWeight.Bold
                    )
                    LazyRow()
                    {
                        items(coffeeData) { item ->
                            CoffeeItem(name = item )
                        }
                    }
                }

            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.5f)
            ) {

                Card(
                    modifier = Modifier
                        .height(66.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 42.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color("#FFF9F2".toColorInt()),
                        contentColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,

                        ), shape = RoundedCornerShape(30.dp)
                ) {
                    Row {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)
                        ) {
                            Image(
                                painterResource(R.drawable.home1),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(52.dp)
                                    .width(52.dp)
                                    .padding(6.dp)
                                    .background(Color.Transparent)
                                    .align(Alignment.Center)
                                    .padding(6.dp),
                            )
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)
                        ) {
                            Image(
                                painterResource(R.drawable.coffebeans),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(52.dp)
                                    .width(52.dp)
                                    .padding(6.dp)
                                    .background(Color.Transparent)
                                    .align(Alignment.Center)
                                    .padding(6.dp),
                            )
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)
                        ) {
                            Image(
                                painterResource(R.drawable.profile2),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(52.dp)
                                    .width(52.dp)
                                    .padding(6.dp)
                                    .background(Color.Transparent)
                                    .align(Alignment.Center)
                                    .padding(6.dp),
                            )
                        }
                    }

                }

            }
        }
    }
}
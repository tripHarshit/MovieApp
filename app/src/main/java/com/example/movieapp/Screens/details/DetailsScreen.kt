package com.example.movieapp.Screens.details

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.movieapp.models.getMovies
import com.example.movieapp.widgets.MovieRow


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController, movieData: String?){
     val newMovieList = getMovies().filter { movie->
          movie.id == movieData
     }
     val scrollState = rememberScrollState()
     Scaffold(containerColor = Color(0xffacdbdf),
          topBar = {
          TopAppBar(modifier  = Modifier,
               colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent),
               title = { Text(text = "DETAILS",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 25 .sp,
                    color = Color(0xff141e26),
                    fontStyle = FontStyle.Normal,) },
               navigationIcon = {
                    Row (horizontalArrangement = Arrangement.Start){
                         Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription ="GO Back Arrow",
                              modifier = Modifier.clickable {
                                   navController.popBackStack()
                              },
                              tint = Color(0xff141e26)
                         )
                         Spacer(modifier = Modifier.width(20.dp))
                    }
               }
          )

     } )
     {innerPadding->
          Column(modifier = Modifier
               .padding(innerPadding)
               .verticalScroll(state = scrollState)
          ) {

               if (newMovieList.isNotEmpty()) {
                    Card(
                         modifier = Modifier.padding(20.dp) ,
                         colors = CardDefaults.cardColors(Color(0xffd7eaea)),
                         elevation = CardDefaults.cardElevation(12.dp),
                         shape = RoundedCornerShape(10.dp),
                         border = BorderStroke(2.dp,Color.Black),

                    ) {
                         AsyncImage(
                              model = newMovieList[0].poster,
                              contentDescription = "Movie Poster",
                             )
                    }

                          Divider(modifier = Modifier.padding(20.dp))

                     Card(modifier = Modifier.padding(20.dp),
                        colors = CardDefaults.cardColors(Color(0xffd7eaea)),
                        elevation = CardDefaults.cardElevation(12.dp),
                        shape = RoundedCornerShape(10.dp),
                        border = BorderStroke(1.dp,Color.Black))
                   {
                        MovieRow() {

                        }
                   }
               } else {
                    Text(text = "Movie not found",
                         color = Color(0xff141e26) ,
                         modifier = Modifier.padding(20.dp),
                         style = MaterialTheme.typography.displaySmall,
                         fontSize = 50.sp
                    )
               }
          }
     }
}






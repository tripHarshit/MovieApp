package com.example.movieapp.widgets

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.movieapp.models.Movie
import com.example.movieapp.models.getMovies



@Composable
fun MovieRow(
    movie: Movie = getMovies()[0],
    onItemClick: (String?) -> Unit
){
    var expanded by remember {
        mutableStateOf(false)
    }
    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .clickable {
            onItemClick(movie.id)
        },
        colors = CardDefaults.cardColors(Color(0xffd7eaea)),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(12.dp)
    ) {
        Row (verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start){
            Surface(modifier = Modifier
                .padding(12.dp)
                .size(122.dp),
                shape = CircleShape,
                border = BorderStroke(1.dp,Color.Black),
                shadowElevation = 5.dp,

            ) {
                AsyncImage(model = movie.poster, contentDescription = "Movie.poster",
                  contentScale = ContentScale.Crop,
                    modifier = Modifier

                )
            }
            Column(modifier = Modifier.padding(5.dp)) {

                Text(text = movie.title,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 18 .sp,
                    style = MaterialTheme.typography.displayLarge,
                    color = Color(0xff141e26),
                )
                //Spacer(modifier = Modifier.size(8.dp))
                Text(text = "Genre: ${movie.genre}",
                    fontWeight = FontWeight.Medium,
                    style = MaterialTheme.typography.labelLarge,
                    fontSize = 14.sp,
                    color = Color(0xff141e26),
                )
                Text(text = "Rated: ${movie.rated}",
                    color = Color(0xff141e26),
                    fontWeight = FontWeight.Medium,
                    style = MaterialTheme.typography.labelLarge,
                    fontSize = 14.sp
                )
                Text(text = "Released: ${movie.released}",
                    color = Color(0xff141e26),
                    fontWeight = FontWeight.Medium,
                    style = MaterialTheme.typography.labelLarge,
                    fontSize = 14.sp
                )

                Divider(modifier = Modifier.padding(vertical = 10.dp))
                AnimatedVisibility(visible =expanded ) {
                  Column {
                        Text(buildAnnotatedString {
                            withStyle(style = SpanStyle(Color.DarkGray,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold),
                                ){
                                append("Plot: ")
                            }
                            withStyle(style = SpanStyle(Color.DarkGray,
                                fontSize = 13.sp,
                            )){

                              append(movie.plot)
                            }
                        }, modifier = Modifier)

                        Divider(modifier = Modifier.padding(vertical = 10.dp))

                      Text(buildAnnotatedString {
                          withStyle(style = SpanStyle(Color.DarkGray,
                              fontSize = 13.sp,
                              fontWeight = FontWeight.Bold),
                          ){
                              append("Actors: ")
                          }
                          withStyle(style = SpanStyle(Color.DarkGray,
                              fontSize = 13.sp,
                          )){

                              append(movie.actors)
                          }
                      }, modifier = Modifier.padding(vertical = 3.dp))

                      Text(buildAnnotatedString {

                          withStyle(style = SpanStyle(Color.DarkGray,
                              fontSize = 13.sp,
                              fontWeight = FontWeight.Bold),
                          ){
                              append("Director: ")
                          }
                          withStyle(style = SpanStyle(Color.DarkGray,
                              fontSize = 13.sp,
                          )){

                              append(movie.director)
                          }
                      }, modifier = Modifier.padding(vertical = 3.dp))


                      Text(buildAnnotatedString {
                          withStyle(style = SpanStyle(Color.DarkGray,
                              fontSize = 13.sp,
                              fontWeight = FontWeight.Bold),
                          ){
                              append("Ratings: ")
                          }
                          withStyle(style = SpanStyle(Color.DarkGray,

                              fontSize = 13.sp,
                          )){

                              append(movie.rating)
                          }
                      }, modifier = Modifier.padding(vertical = 3.dp))

                    }
                }
                Icon(imageVector = if (!expanded)
                    Icons.Filled.KeyboardArrowDown
                    else
                    Icons.Filled.KeyboardArrowUp
                , contentDescription ="Arrow down",
                    modifier = Modifier
                        .size(50.dp)
                        .clickable {
                            expanded = !expanded
                        },
                    tint = Color.Black)
            }
        }

    }

}



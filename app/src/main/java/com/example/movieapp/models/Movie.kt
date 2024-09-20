package com.example.movieapp.models

import android.provider.MediaStore

data class Movie(
    val id: String?,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val rated: String,
    val released: String,
    val rating: String
)

fun getMovies():List<Movie>{
    return listOf(
        Movie(
            id = "1",
            title = "Inception",
            year = "2010",
            genre = "Action, Sci-Fi",
            director = "Christopher Nolan",
            actors = "Leonardo DiCaprio, Joseph Gordon-Levitt",
            plot = "A thief who enters the dreams of others to steal secrets from their subconscious is given a chance to have his criminal history erased.",
            poster = "https://image.tmdb.org/t/p/original/xymM5aW6MDcH5AR9I3CamSegJd6.jpg",
            rated = "PG-13",
            released = "16 Jul 2010",
            rating = "8.8"
        ),

                Movie(
                id = "2",
        title = "The Shawshank Redemption",
        year = "1994",
        genre = "Drama",
        director = "Frank Darabont",
        actors = "Tim Robbins, Morgan Freeman",
        plot = "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
        poster = "https://is1-ssl.mzstatic.com/image/thumb/Video113/v4/ee/1e/ff/ee1eff0a-1a24-8a1b-6298-2953f8924f5d/pr_source.lsr/2000x1125.jpg",
        rated = "R",
        released = "14 Oct 1994",
        rating = "9.3"
    ),

    Movie(
        id = "3",
        title = "The Godfather",
        year = "1972",
        genre = "Crime, Drama",
        director = "Francis Ford Coppola",
        actors = "Marlon Brando, Al Pacino, James Caan",
        plot = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
        poster = "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg",
        rated = "R",
        released = "24 Mar 1972",
        rating = "9.2"
    ),

    Movie(
        id = "4",
        title = "The Dark Knight",
        year = "2008",
        genre = "Action, Crime, Drama",
        director = "Christopher Nolan",
        actors = "Christian Bale, Heath Ledger, Aaron Eckhart",
        plot = "When the menace known as the Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham.",
        poster = "https://image.tmdb.org/t/p/original/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
        rated = "PG-13",
        released = "18 Jul 2008",
        rating = "9.0"
    ),

    Movie(
        id = "5",
        title = "Pulp Fiction",
        year = "1994",
        genre = "Crime, Drama",
        director = "Quentin Tarantino",
        actors = "John Travolta, Uma Thurman, Samuel L. Jackson",
        plot = "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
        poster = "https://cdn.kinocheck.com/i/j7qxa1uc8s.jpg",
        rated = "R",
        released = "14 Oct 1994",
        rating = "8.9"
    ),

    Movie(
        id = "6",
        title = "Forrest Gump",
        year = "1994",
        genre = "Drama, Romance",
        director = "Robert Zemeckis",
        actors = "Tom Hanks, Robin Wright, Gary Sinise",
        plot = "The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal, and other historical events unfold from the perspective of an Alabama man with an IQ of 75.",
        poster = "https://image.tmdb.org/t/p/original/saHP97rTPS5eLmrLQEcANmKrsFl.jpg",
        rated = "PG-13",
        released = "06 Jul 1994",
        rating = "8.8"
    ),

    Movie(
        id = "7",
        title = "The Matrix",
        year = "1999",
        genre = "Action, Sci-Fi",
        director = "Lana Wachowski, Lilly Wachowski",
        actors = "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss",
        plot = "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",
        poster = "https://image.tmdb.org/t/p/original/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg",
        rated = "R",
        released = "31 Mar 1999",
        rating = "8.7"
    ),

    Movie(
        id = "8",
        title = "Fight Club",
        year = "1999",
        genre = "Drama",
        director = "David Fincher",
        actors = "Brad Pitt, Edward Norton, Meat Loaf",
        plot = "An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more.",
        poster = "https://image.tmdb.org/t/p/original/pB8BM7pdSp6B6Ih7QZ4DrQ3PmJK.jpg",
        rated = "R",
        released = "15 Oct 1999",
        rating = "8.8"
    ),

    Movie(
        id = "9",
        title = "Goodfellas",
        year = "1990",
        genre = "Biography, Crime, Drama",
        director = "Martin Scorsese",
        actors = "Robert De Niro, Ray Liotta, Joe Pesci",
        plot = "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.",
        poster = "https://i.etsystatic.com/17016530/r/il/54191a/1825405876/il_1588xN.1825405876_fy2n.jpg",
        rated = "R",
        released = "19 Sep 1990",
        rating = "8.7"
    ),

    Movie(
        id = "10",
        title = "The Silence of the Lambs",
        year = "1991",
        genre = "Crime, Drama, Thriller",
        director = "Jonathan Demme",
        actors = "Jodie Foster, Anthony Hopkins, Lawrence A. Bonney",
        plot = "A young F.B.I. cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer, a madman who skins his victims.",
        poster = "https://image.tmdb.org/t/p/original/rplLJ2hPcOQmkFhTqUte0MkEaO2.jpg",
        rated = "R",
        released = "14 Feb 1991",
        rating = "8.6"
    ),

    Movie(
        id = "11",
        title = "Se7en",
        year = "1995",
        genre = "Crime, Drama, Mystery",
        director = "David Fincher",
        actors = "Morgan Freeman, Brad Pitt, Kevin Spacey",
        plot = "Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his motives.",
        poster = "https://image.tmdb.org/t/p/original/6yoghtyTpznpBik8EngEmJskVUO.jpg",
        rated = "R",
        released = "22 Sep 1995",
        rating = "8.6"
    ),

    Movie(
        id = "12",
        title = "The Departed",
        year = "2006",
        genre = "Crime, Drama, Thriller",
        director = "Martin Scorsese",
        actors = "Leonardo DiCaprio, Matt Damon, Jack Nicholson",
        plot = "An undercover cop and a mole in the police attempt to identify each other while infiltrating an Irish gang in South Boston.",
        poster = "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/9ecf962875d40b7651b8e33a9d26687e78524db862034b8594980f9f14e30fe9._RI_TTW_.jpg",
        rated = "R",
        released = "06 Oct 2006",
        rating = "8.5"
    ),

    Movie(
        id = "13",
        title = "Gladiator",
        year = "2000",
        genre = "Action, Adventure, Drama",
        director = "Ridley Scott",
        actors = "Russell Crowe, Joaquin Phoenix, Connie Nielsen",
        plot = "A former Roman General sets out to exact vengeance against the corrupt emperor who murdered his family and sent him into slavery.",
        poster = "https://image.tmdb.org/t/p/original/ty8TGRuvJLPUmAR1H1nRIsgwvim.jpg",
        rated = "R",
        released = "05 May 2000",
        rating = "8.5"
    ),

    Movie(
        id = "14",
        title = "Interstellar",
        year = "2014",
        genre = "Adventure, Drama, Sci-Fi",
        director = "Christopher Nolan",
        actors = "Matthew McConaughey, Anne Hathaway, Jessica Chastain",
        plot = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
        poster = "https://image.tmdb.org/t/p/original/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
        rated = "PG-13",
        released = "07 Nov 2014",
        rating = "8.6"
    ),

    Movie(
        id = "15",
        title = "The Usual Suspects",
        year = "1995",
        genre = "Crime, Drama, Mystery",
        director = "Bryan Singer",
        actors = "Kevin Spacey, Gabriel Byrne, Chazz Palminteri",
        plot = "A sole survivor tells of the twists and turns his partners took to their grave.",
        poster = "https://image.tmdb.org/t/p/original/bUPmtQzrRhzqYySeiMpv7GurAfm.jpg",
        rated = "R",
        released = "16 Aug 1995",
        rating = "8.5"
    ),

    Movie(
        id = "16",
        title = "The Green Mile",
        year = "1999",
        genre = "Crime, Drama, Fantasy",
        director = "Frank Darabont",
        actors = "Tom Hanks, Michael Clarke Duncan, David Morse",
        plot = "The lives of guards on Death Row are affected by one of their charges: a black man accused of child murder and rape, yet who has a mysterious gift.",
        poster = "https://4.bp.blogspot.com/-hKz23wEmASE/UPx-Pi_WmAI/AAAAAAAAqy8/p8d-9a51Hac/s947/The-Green-Mile-Poster-2.jpg",
        rated = "R",
        released = "10 Dec 1999",
        rating = "8.6"
    ),

    Movie(
        id = "17",
        title = "Jurassic Park",
        year = "1993",
        genre = "Adventure, Sci-Fi, Thriller",
        director = "Steven Spielberg",
        actors = "Sam Neill, Laura Dern, Jeff Goldblum",
        plot = "A pragmatic paleontologist visiting an almost complete theme park is tasked with protecting a couple of kids after a power failure causes the park's cloned dinosaurs to run loose.",
        poster = "https://image.tmdb.org/t/p/original/qIm2nHXLpBBdMxi8dvfrnDkBUDh.jpg",
        rated = "PG-13",
        released = "11 Jun 1993",
        rating = "8.1"
    ),

    Movie(
        id = "18",
        title = "The Lion King",
        year = "1994",
        genre = "Animation, Adventure, Drama",
        director = "Roger Allers, Rob Minkoff",
        actors = "Matthew Broderick, Jeremy Irons, James Earl Jones",
        plot = "Lion prince Simba and his father are targeted by his bitter uncle, who wants to ascend the throne himself.",
        poster = "https://image.tmdb.org/t/p/original/sKCr78MXSLixwmZ8DyJLrpMsd15.jpg",
        rated = "G",
        released = "24 Jun 1994",
        rating = "8.5"
    ),

    Movie(
        id = "19",
        title = "The Prestige",
        year = "2006",
        genre = "Drama, Mystery, Sci-Fi",
        director = "Christopher Nolan",
        actors = "Christian Bale, Hugh Jackman, Scarlett Johansson",
        plot = "After a tragic accident, two stage magicians in 1890s London engage in a battle to create the ultimate illusion while sacrificing everything they have to outwit each other.",
        poster = "https://i.pinimg.com/originals/67/60/1a/67601a894c6f1d2007b62611d6ea7a2d.jpg",
        rated = "PG-13",
        released = "20 Oct 2006",
        rating = "8.5"
    ),

    Movie(
        id = "20",
        title = "Shutter Island",
        year = "2010",
        genre = "Mystery, Thriller",
        director = "Martin Scorsese",
        actors = "Leonardo DiCaprio, Emily Mortimer, Mark Ruffalo",
        plot = "In 1954, a U.S. Marshal investigates the disappearance of a murderer who escaped from a hospital for the criminally insane.",
        poster = "https://image.tmdb.org/t/p/original/kve20tXwUZpu4GUX8l6X7Z4jmL6.jpg",
        rated = "R",
        released = "19 Feb 2010",
        rating = "8.2"
    ),

    Movie(
        id = "21",
        title = "Avatar",
        year = "2009",
        genre = "Action, Adventure, Fantasy",
        director = "James Cameron",
        actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver",
        plot = "A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
        poster = "https://image.tmdb.org/t/p/original/jRXYjXNq0Cs2TcJjLkki24MLp7u.jpg",
        rated = "PG-13",
        released = "18 Dec 2009",
        rating = "7.9"
    ),

    Movie(
        id = "22",
        title = "Harry Potter and the Sorcerer's Stone",
        year = "2001",
        genre = "Adventure, Family, Fantasy",
        director = "Chris Columbus",
        actors = "Daniel Radcliffe, Rupert Grint, Richard Harris",
        plot = "An orphaned boy enrolls in a school of wizardry, where he learns the truth about himself, his family and the terrible evil that haunts the magical world.",
        poster = "https://tse2.mm.bing.net/th?id=OIP.QToVJm6gYYynT8C2DYlnDQHaLH&pid=Api&P=0&h=180",
        rated = "PG",
        released = "16 Nov 2001",
        rating = "7.6"
    ),

    Movie(
        id = "23",
        title = "La La Land",
        year = "2016",
        genre = "Comedy, Drama, Music",
        director = "Damien Chazelle",
        actors = "Ryan Gosling, Emma Stone, Rosemarie DeWitt",
        plot = "While navigating their careers in Los Angeles, a pianist and an actress fall in love while attempting to reconcile their aspirations for the future.",
        poster = "https://image.tmdb.org/t/p/original/uDO8zWDhfWwoFdKS4fzkUJt0Rf0.jpg",
        rated = "PG-13",
        released = "25 Dec 2016",
        rating = "8.0"
    ),

    Movie(
        id = "24",
        title = "Fast & Furious",
        year = "2009",
        genre = "Action, Crime, Thriller",
        director = "Justin Lin",
        actors = "Vin Diesel, Paul Walker, Michelle Rodriguez",
        plot = "Brian O'Conner and Dominic Toretto team up to bring down a heroin importer by infiltrating his operation.",
        poster = "https://image.tmdb.org/t/p/original/yVcUylmQQJDei0vaDy03Ub5AdOK.jpg",
        rated = "PG-13",
        released = "03 Apr 2009",
        rating = "6.6"
    ),

    Movie(
        id = "25",
        title = "Deadpool",
        year = "2016",
        genre = "Action, Comedy",
        director = "Tim Miller",
        actors = "Ryan Reynolds, Morena Baccarin, T.J. Miller",
        plot = "A wisecracking mercenary gets experimented on and becomes immortal but ugly, and sets out to track down the man who ruined his looks.",
        poster = "https://image.tmdb.org/t/p/original/fSRb7vyIP8rQpL0I47P3qUsEKX3.jpg",
        rated = "R",
        released = "12 Feb 2016",
        rating = "8.0"
    ),

    Movie(
        id = "26",
        title = "Titanic",
        year = "1997",
        genre = "Drama, Romance",
        director = "James Cameron",
        actors = "Leonardo DiCaprio, Kate Winslet, Billy Zane",
        plot = "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
        poster = "https://image.tmdb.org/t/p/original/9xjZS2rlVxm8SFx8kPC3aIGCOYQ.jpg",
        rated = "PG-13",
        released = "19 Dec 1997",
        rating = "7.9"
    ),

    Movie(
        id = "27",
        title = "The Avengers",
        year = "2012",
        genre = "Action, Adventure, Sci-Fi",
        director = "Joss Whedon",
        actors = "Robert Downey Jr., Chris Evans, Scarlett Johansson",
        plot = "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
        poster = "https://image.tmdb.org/t/p/original/RYMX2wcKCBAr24UyPD7xwmjaTn.jpg",
        rated = "PG-13",
        released = "04 May 2012",
        rating = "8.0"
    ),

    Movie(
        id = "28",
        title = "The Social Network",
        year = "2010",
        genre = "Biography, Drama",
        director = "David Fincher",
        actors = "Jesse Eisenberg, Andrew Garfield, Justin Timberlake",
        plot = "As Harvard student Mark Zuckerberg creates the social networking site that would become known as Facebook, he is sued by the twins who claimed he stole their idea, and by the cofounder who was later squeezed out of the business.",
        poster = "https://image.tmdb.org/t/p/original/n0ybibhJtQ5icDqTp8eRytcIHJx.jpg",
        rated = "PG-13",
        released = "01 Oct 2010",
        rating = "7.7"
    ),

    Movie(
        id = "29",
        title = "Pirates of the Caribbean: The Curse of the Black Pearl",
        year = "2003",
        genre = "Action, Adventure, Fantasy",
        director = "Gore Verbinski",
        actors = "Johnny Depp, Geoffrey Rush, Orlando Bloom",
        plot = "Blacksmith Will Turner teams up with eccentric pirate Captain Jack Sparrow to save his love, the governor's daughter, from Jack's former pirate allies, who are now undead.",
        poster = "https://image.tmdb.org/t/p/original/z8onk7LV9Mmw6zKz4hT6pzzvmvl.jpg",
        rated = "PG-13",
        released = "09 Jul 2003",
        rating = "8.1"
    ),

    Movie(
        id = "30",
        title = "The Lord of the Rings: The Fellowship of the Ring",
        year = "2001",
        genre = "Action, Adventure, Drama",
        director = "Peter Jackson",
        actors = "Elijah Wood, Ian McKellen, Orlando Bloom",
        plot = "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.",
        poster = "https://image.tmdb.org/t/p/original/56zTpe2xvaA4alU51sRWPoKPYZy.jpg",
        rated = "PG-13",
        released = "19 Dec 2001",
        rating = "8.8"
    )

    )
}

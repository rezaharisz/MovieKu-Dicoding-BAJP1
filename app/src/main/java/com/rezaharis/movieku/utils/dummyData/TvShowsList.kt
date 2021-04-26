package com.rezaharis.movieku.utils.dummyData

import com.rezaharis.movieku.R
import com.rezaharis.movieku.model.DataTvShows

object TvShowsList {
    fun getTvShowList(): ArrayList<DataTvShows>{
        return arrayListOf(
                DataTvShows(0, R.drawable.poster_arrow, "Arrow (2012)",
                        "Arrow follows billionaire playboy Oliver Queen (Stephen Amell), who claimed to have spent five years shipwrecked on Lian Yu, " +
                                "a mysterious island in the North China Sea, before returning home to Starling City to fight crime and corruption as a " +
                                "secret vigilante whose weapon of choice is a bow and arrow.",
                        "TV-14 | 42min | Action, Adventure, Crime"),

                DataTvShows(1, R.drawable.poster_doom_patrol, "Doom Patrol (2019)",
                        "Doom Patrol is a team of traumatized and downtrodden superheroes, each of whom has suffered a horrible accident that gave them " +
                                "superhuman abilities but also left them scarred and disfigured. The members of the team have found their purpose through The Chief " +
                                "and have come together to investigate some of the world's weirdest phenomena. After The Chief mysteriously disappears, though, " +
                                "the reluctant heroes find themselves called to action by Cyborg, who comes to them with a mission that they cannot refuse. " +
                                "Doom Patrol -- part support group, part superhero team -- is a band of superpowered freaks fighting for a world that wants nothing " +
                                "to do with them.",
                        "TV-MA | 1h | Action, Adventure, Comedy"),

                DataTvShows(2, R.drawable.poster_flash, "The Flash (2014)",
                        "It is a spin-off from Arrow, existing in the same fictional universe known as Arrowverse. The series follows Barry Allen, " +
                                "portrayed by Grant Gustin, a crime scene investigator who gains super-human speed, which he uses to fight criminals, including " +
                                "others who have also gained superhuman abilities.",
                        "TV-PG | 43min | Action, Adventure, Drama"),

                DataTvShows(3, R.drawable.poster_god, "Game of Thrones (2011)",
                        "Nine noble families wage war against each other in order to gain control over the mythical land of Westeros. " +
                                "Meanwhile, a force is rising after millenniums and threatens the existence of living men.",
                        "TV-MA | 57min | Action, Adventure, Drama "),

                DataTvShows(4, R.drawable.poster_gotham, "Gotham (2014)",
                        "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous " +
                                "with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it " +
                                "take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic " +
                                "villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, " +
                                "The Riddler, Two-Face and The Joker?",
                        "TV-14 | 42min | Action, Crime, Drama"),

                DataTvShows(5, R.drawable.poster_iron_fist, "Marvel's Iron Fist (2017)",
                        "Fueled by a desire for revenge, nine-year-old Danny Rand spent a decade training in martial arts in the heavenly city of K'un-Lun. " +
                                "He eventually earned the title of Iron Fist, granting him even more power. Instead of staying and embracing immortality, " +
                                "he returned to Earth ten years later to avenge his dead parents.",
                        "TV-MA | 55min | Action, Adventure, Crime"),

                DataTvShows(6, R.drawable.poster_riverdale, "Riverdale (2017)",
                        "Riverdale is an American teen drama television series based on the characters of Archie Comics. The series was adapted for " +
                                "The CW by Archie Comics' chief creative officer Roberto Aguirre-Sacasa, and is produced by Warner Bros. Television and CBS Studios, " +
                                "in association with Berlanti Productions and Archie Comics. Originally conceived as a feature film adaptation for Warner Bros. " +
                                "Pictures, the idea was re-imagined as a television series for Fox. In 2015, development on the project moved to The CW, where " +
                                "the series was ordered for a pilot. Filming takes place in Vancouver, British Columbia.",
                        "TV-14 | 45min | Crime, Drama, Mystery"),

                DataTvShows(7, R.drawable.poster_supergirl, "Supergirl (2015)",
                        "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, " +
                                "must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has " +
                                "to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                        "TV-PG | 43min | Action, Adventure, Drama"),

                DataTvShows(8, R.drawable.poster_the_umbrella, "The Umbrella Academy (2019)",
                        "The Umbrella Academy is an American superhero streaming television series based on the comic book series of the same name " +
                                "written by Gerard Way. Created for Netflix by Steve Blackman and developed by Jeremy Slater, it revolves around a dysfunctional " +
                                "family of adopted sibling superheroes who reunite to solve the mystery of their father's death and the threat of an impending " +
                                "apocalypse. The series is produced by Borderline Entertainment, Dark Horse Entertainment, and Universal Cable Productions.",
                        "TV-14 | 1h | Action, Adventure, Comedy"),

                DataTvShows(9, R.drawable.poster_the_walking_dead, "The Walking Dead (2010)",
                        "In the wake of a zombie apocalypse, various survivors struggle to stay alive. As they search for safety and evade the undead, " +
                                "they are forced to grapple with rival groups and difficult choices.",
                        "TV-14 | 44min | Drama, Horror, Thriller")
        )
    }

    fun getTvShowsId(id: Int): DataTvShows = getTvShowList()[id]
}
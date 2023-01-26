package com.example.image_gallery

class Generator {
    companion object {
        fun get(): List<Image> {
            return mutableListOf(
                Image("Image 1", R.drawable.cute_astronaut_flying),
                Image("Image 2", R.drawable.ansronotmusic, true),
                Image("Image 3", R.drawable.astronaut_gaming),
                Image("Image 4", R.drawable.astronaut_meditation),
                Image("Image 5", R.drawable.cute_astronaut_super),
                Image("Image 6", R.drawable.cute_astrona),
                Image("Image 7", R.drawable.loving_robot),
                Image("Image 8", R.drawable.robot_rocket),
                Image("Image 9", R.drawable.robot_laptop),
                Image("Image 10", R.drawable.robot_coffee)
            )
        }
    }
}
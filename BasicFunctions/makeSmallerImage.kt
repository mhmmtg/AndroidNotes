private fun makeSmallerImage(filePath: String): ByteArray {
        val max = 1000

        //Scale image
        val image = BitmapFactory.decodeFile(filePath)
        val width = image.width
        val height = image.height

        val smallerImage = when {
            width > max || height > max -> {
                val scale: Float = when {
                    width > height -> { (width/max).toFloat() }
                    else -> { (height/max).toFloat() }
                }

                val defWidth = (width / scale).toInt()
                val defHeight = (height / scale).toInt()
                Bitmap.createScaledBitmap(image, defWidth, defHeight, true)
            }
            else -> { image }
        }

        //Convert byte array
        val outputStream = ByteArrayOutputStream()
        smallerImage.compress(Bitmap.CompressFormat.JPEG, 90, outputStream)
        val byteArray = outputStream.toByteArray()

        return byteArray
    }

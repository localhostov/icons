package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.BookOpenCover: ImageVector
    get() {
        if (_bookOpenCover != null) {
            return _bookOpenCover!!
        }
        _bookOpenCover = Builder(name = "BookOpenCover", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.209f, 3.407f)
                curveToRelative(-0.091f, -0.068f, -0.184f, -0.131f, -0.279f, -0.19f)
                curveToRelative(-0.179f, -0.95f, -0.702f, -1.797f, -1.494f, -2.395f)
                curveToRelative(-0.994f, -0.75f, -2.251f, -0.982f, -3.445f, -0.641f)
                lineToRelative(-3.643f, 1.041f)
                curveToRelative(-0.5f, 0.143f, -0.956f, 0.382f, -1.349f, 0.693f)
                curveToRelative(-0.393f, -0.311f, -0.849f, -0.55f, -1.349f, -0.693f)
                lineTo(7.008f, 0.182f)
                curveToRelative(-1.194f, -0.34f, -2.451f, -0.108f, -3.445f, 0.641f)
                curveToRelative(-0.792f, 0.597f, -1.314f, 1.445f, -1.494f, 2.395f)
                curveToRelative(-0.095f, 0.059f, -0.188f, 0.122f, -0.279f, 0.19f)
                curveToRelative(-1.138f, 0.858f, -1.791f, 2.167f, -1.791f, 3.593f)
                verticalLineToRelative(13.631f)
                lineToRelative(12.0f, 3.429f)
                lineToRelative(12.0f, -3.429f)
                lineTo(23.999f, 7.0f)
                curveToRelative(0.0f, -1.425f, -0.653f, -2.735f, -1.791f, -3.593f)
                close()
                moveTo(13.5f, 5.0f)
                curveToRelative(0.0f, -0.412f, 0.277f, -0.779f, 0.673f, -0.893f)
                curveToRelative(0.0f, 0.0f, 3.824f, -1.079f, 3.905f, -1.079f)
                curveToRelative(0.256f, 0.0f, 0.448f, 0.11f, 0.552f, 0.189f)
                curveToRelative(0.138f, 0.104f, 0.37f, 0.339f, 0.37f, 0.741f)
                verticalLineToRelative(13.481f)
                lineToRelative(-5.5f, 1.571f)
                lineTo(13.5f, 5.0f)
                close()
                moveTo(5.0f, 3.959f)
                curveToRelative(0.0f, -0.402f, 0.231f, -0.637f, 0.37f, -0.741f)
                curveToRelative(0.138f, -0.104f, 0.426f, -0.262f, 0.814f, -0.151f)
                lineToRelative(3.643f, 1.041f)
                curveToRelative(0.396f, 0.113f, 0.673f, 0.48f, 0.673f, 0.893f)
                verticalLineToRelative(14.011f)
                lineToRelative(-5.5f, -1.571f)
                lineTo(5.0f, 3.959f)
                close()
            }
        }
        .build()
        return _bookOpenCover!!
    }

private var _bookOpenCover: ImageVector? = null

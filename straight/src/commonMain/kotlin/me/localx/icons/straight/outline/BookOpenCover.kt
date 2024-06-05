package me.localx.icons.straight.outline

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

public val Icons.Outline.BookOpenCover: ImageVector
    get() {
        if (_bookOpenCover != null) {
            return _bookOpenCover!!
        }
        _bookOpenCover = Builder(name = "BookOpenCover", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.754f)
                lineTo(20.0f, 3.001f)
                curveToRelative(0.0f, -0.95f, -0.435f, -1.823f, -1.194f, -2.395f)
                curveToRelative(-0.758f, -0.572f, -1.715f, -0.752f, -2.63f, -0.489f)
                lineToRelative(-3.0f, 0.857f)
                curveToRelative(-0.446f, 0.127f, -0.845f, 0.354f, -1.176f, 0.651f)
                curveToRelative(-0.331f, -0.297f, -0.73f, -0.524f, -1.176f, -0.651f)
                lineTo(7.824f, 0.117f)
                curveToRelative(-0.916f, -0.263f, -1.873f, -0.083f, -2.63f, 0.489f)
                curveToRelative(-0.759f, 0.572f, -1.194f, 1.445f, -1.194f, 2.395f)
                verticalLineToRelative(14.753f)
                lineToRelative(8.0f, 2.286f)
                lineToRelative(8.0f, -2.286f)
                close()
                moveTo(13.0f, 3.858f)
                curveToRelative(0.0f, -0.444f, 0.298f, -0.839f, 0.726f, -0.961f)
                lineToRelative(3.0f, -0.857f)
                curveToRelative(0.092f, -0.026f, 0.185f, -0.039f, 0.277f, -0.039f)
                curveToRelative(0.214f, 0.0f, 0.423f, 0.069f, 0.599f, 0.202f)
                curveToRelative(0.253f, 0.191f, 0.398f, 0.482f, 0.398f, 0.798f)
                verticalLineToRelative(13.245f)
                lineToRelative(-5.0f, 1.429f)
                lineTo(13.0f, 3.858f)
                close()
                moveTo(11.0f, 17.674f)
                lineToRelative(-5.0f, -1.429f)
                lineTo(6.0f, 3.001f)
                curveToRelative(0.0f, -0.316f, 0.145f, -0.607f, 0.398f, -0.798f)
                curveToRelative(0.252f, -0.19f, 0.572f, -0.25f, 0.876f, -0.163f)
                lineToRelative(3.0f, 0.857f)
                curveToRelative(0.427f, 0.122f, 0.725f, 0.517f, 0.725f, 0.961f)
                verticalLineToRelative(13.816f)
                close()
                moveTo(24.0f, 3.0f)
                lineTo(24.0f, 20.611f)
                lineToRelative(-12.0f, 3.429f)
                lineTo(0.0f, 20.611f)
                lineTo(0.0f, 4.0f)
                curveToRelative(0.0f, -0.95f, 0.435f, -1.823f, 1.194f, -2.395f)
                curveToRelative(0.249f, -0.188f, 0.523f, -0.316f, 0.806f, -0.418f)
                lineTo(2.0f, 19.103f)
                lineToRelative(10.0f, 2.857f)
                lineToRelative(10.0f, -2.857f)
                lineTo(22.0f, 0.187f)
                curveToRelative(0.283f, 0.102f, 0.558f, 0.23f, 0.806f, 0.418f)
                curveToRelative(0.759f, 0.572f, 1.194f, 1.445f, 1.194f, 2.395f)
                close()
            }
        }
        .build()
        return _bookOpenCover!!
    }

private var _bookOpenCover: ImageVector? = null

package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.BookmarkSlash: ImageVector
    get() {
        if (_bookmarkSlash != null) {
            return _bookmarkSlash!!
        }
        _bookmarkSlash = Builder(name = "BookmarkSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-2.707f, -2.707f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.485f, 0.0f, -2.876f, 0.66f, -3.816f, 1.77f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(18.99f, 18.99f)
                curveToRelative(0.007f, 0.007f, 0.013f, 0.013f, 0.02f, 0.02f)
                lineToRelative(2.99f, 2.99f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(4.703f, 8.789f)
                curveToRelative(-0.287f, -0.284f, -0.716f, -0.367f, -1.088f, -0.212f)
                curveToRelative(-0.372f, 0.155f, -0.615f, 0.52f, -0.615f, 0.923f)
                verticalLineToRelative(10.767f)
                curveToRelative(0.0f, 1.126f, 0.676f, 2.121f, 1.722f, 2.537f)
                curveToRelative(0.33f, 0.131f, 0.671f, 0.194f, 1.01f, 0.194f)
                curveToRelative(0.737f, 0.0f, 1.459f, -0.303f, 2.0f, -0.875f)
                lineToRelative(4.281f, -4.762f)
                curveToRelative(0.357f, -0.397f, 0.339f, -1.005f, -0.041f, -1.38f)
                lineToRelative(-7.269f, -7.192f)
                close()
            }
        }
        .build()
        return _bookmarkSlash!!
    }

private var _bookmarkSlash: ImageVector? = null

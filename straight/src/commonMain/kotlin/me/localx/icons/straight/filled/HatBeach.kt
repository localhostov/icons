package me.localx.icons.straight.filled

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

public val Icons.Filled.HatBeach: ImageVector
    get() {
        if (_hatBeach != null) {
            return _hatBeach!!
        }
        _hatBeach = Builder(name = "HatBeach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.33f, 8.33f)
                curveToRelative(-0.607f, -0.041f, -1.227f, 0.162f, -1.691f, 0.626f)
                curveToRelative(-0.853f, 0.853f, -0.853f, 2.236f, 0.0f, 3.088f)
                curveToRelative(0.464f, 0.464f, 1.084f, 0.666f, 1.691f, 0.626f)
                curveToRelative(-0.041f, 0.607f, 0.162f, 1.227f, 0.626f, 1.691f)
                curveToRelative(0.853f, 0.853f, 2.235f, 0.853f, 3.088f, 0.0f)
                curveToRelative(0.464f, -0.464f, 0.666f, -1.084f, 0.626f, -1.691f)
                curveToRelative(0.607f, 0.041f, 1.227f, -0.162f, 1.691f, -0.626f)
                curveToRelative(0.853f, -0.853f, 0.853f, -2.235f, 0.0f, -3.088f)
                curveToRelative(-0.464f, -0.464f, -1.084f, -0.666f, -1.691f, -0.626f)
                curveToRelative(0.041f, -0.607f, -0.162f, -1.227f, -0.626f, -1.691f)
                curveToRelative(-0.853f, -0.853f, -2.235f, -0.853f, -3.088f, 0.0f)
                curveToRelative(-0.464f, 0.464f, -0.666f, 1.084f, -0.626f, 1.691f)
                close()
                moveTo(17.5f, 9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 14.5f)
                curveToRelative(0.0f, 3.645f, -5.271f, 6.5f, -12.0f, 6.5f)
                reflectiveCurveTo(0.0f, 18.145f, 0.0f, 14.5f)
                curveToRelative(0.0f, -1.655f, 1.088f, -3.183f, 3.0f, -4.347f)
                verticalLineToRelative(1.654f)
                curveToRelative(0.082f, 0.163f, 2.175f, 4.193f, 9.0f, 4.193f)
                curveToRelative(0.949f, 0.0f, 1.795f, -0.079f, 2.565f, -0.207f)
                curveToRelative(0.789f, 0.777f, 1.828f, 1.207f, 2.935f, 1.207f)
                curveToRelative(1.118f, 0.0f, 2.168f, -0.435f, 2.958f, -1.226f)
                curveToRelative(0.402f, -0.402f, 0.713f, -0.878f, 0.919f, -1.397f)
                curveToRelative(0.52f, -0.207f, 0.996f, -0.517f, 1.397f, -0.919f)
                curveToRelative(0.279f, -0.279f, 0.493f, -0.595f, 0.676f, -0.924f)
                curveToRelative(0.353f, 0.624f, 0.549f, 1.283f, 0.549f, 1.966f)
                close()
                moveTo(5.0f, 11.293f)
                verticalLineToRelative(-2.293f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                curveToRelative(1.93f, 0.0f, 3.681f, 0.786f, 4.948f, 2.054f)
                curveToRelative(-0.907f, 0.12f, -1.749f, 0.514f, -2.406f, 1.172f)
                curveToRelative(-0.402f, 0.402f, -0.713f, 0.878f, -0.919f, 1.397f)
                curveToRelative(-0.52f, 0.207f, -0.996f, 0.517f, -1.397f, 0.918f)
                curveToRelative(-0.791f, 0.79f, -1.226f, 1.841f, -1.226f, 2.958f)
                reflectiveCurveToRelative(0.435f, 2.168f, 1.226f, 2.958f)
                curveToRelative(0.195f, 0.195f, 0.41f, 0.368f, 0.637f, 0.518f)
                curveToRelative(-0.276f, 0.015f, -0.563f, 0.024f, -0.863f, 0.024f)
                curveToRelative(-4.784f, 0.0f, -6.574f, -2.087f, -7.0f, -2.707f)
                close()
            }
        }
        .build()
        return _hatBeach!!
    }

private var _hatBeach: ImageVector? = null

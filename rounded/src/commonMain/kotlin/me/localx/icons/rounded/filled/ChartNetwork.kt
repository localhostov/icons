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

public val Icons.Filled.ChartNetwork: ImageVector
    get() {
        if (_chartNetwork != null) {
            return _chartNetwork!!
        }
        _chartNetwork = Builder(name = "ChartNetwork", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.383f, 286.442f)
                curveToRelative(-16.454f, 0.003f, -32.259f, 6.415f, -44.065f, 17.876f)
                lineToRelative(-25.107f, -12.554f)
                curveToRelative(20.494f, -67.214f, -17.38f, -138.315f, -84.594f, -158.809f)
                curveToRelative(-24.586f, -7.496f, -50.867f, -7.37f, -75.38f, 0.361f)
                lineToRelative(-14.717f, -26.571f)
                curveToRelative(23.622f, -25.866f, 21.803f, -65.984f, -4.063f, -89.605f)
                curveToRelative(-25.866f, -23.622f, -65.983f, -21.803f, -89.605f, 4.063f)
                reflectiveCurveToRelative(-21.803f, 65.983f, 4.063f, 89.605f)
                curveToRelative(11.734f, 10.716f, 27.063f, 16.637f, 42.953f, 16.591f)
                curveToRelative(3.05f, -0.087f, 6.09f, -0.392f, 9.097f, -0.912f)
                lineToRelative(14.589f, 26.358f)
                curveToRelative(-55.259f, 41.007f, -67.66f, 118.636f, -27.928f, 174.818f)
                lineToRelative(-61.793f, 59.375f)
                curveToRelative(-32.782f, -14.681f, -71.258f, -0.008f, -85.939f, 32.774f)
                reflectiveCurveToRelative(-0.008f, 71.258f, 32.774f, 85.939f)
                curveToRelative(32.782f, 14.681f, 71.258f, 0.008f, 85.939f, -32.774f)
                curveToRelative(8.18f, -18.265f, 7.495f, -39.279f, -1.856f, -56.973f)
                lineToRelative(60.563f, -58.209f)
                curveToRelative(56.591f, 40.988f, 135.691f, 28.375f, 176.727f, -28.182f)
                lineToRelative(25.447f, 12.723f)
                curveToRelative(-0.402f, 2.555f, -0.642f, 5.133f, -0.721f, 7.719f)
                curveToRelative(0.0f, 35.134f, 28.482f, 63.617f, 63.617f, 63.617f)
                reflectiveCurveTo(512.0f, 385.193f, 512.0f, 350.059f)
                reflectiveCurveTo(483.518f, 286.442f, 448.383f, 286.442f)
                close()
            }
        }
        .build()
        return _chartNetwork!!
    }

private var _chartNetwork: ImageVector? = null

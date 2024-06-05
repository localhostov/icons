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
                moveTo(448.357f, 286.397f)
                curveToRelative(-17.282f, 0.007f, -33.812f, 7.073f, -45.76f, 19.56f)
                lineToRelative(-48.517f, -20.62f)
                curveToRelative(3.316f, -9.922f, 5.062f, -20.3f, 5.176f, -30.761f)
                curveToRelative(-0.117f, -56.19f, -45.639f, -101.713f, -101.829f, -101.829f)
                curveToRelative(-8.495f, 0.106f, -16.942f, 1.289f, -25.139f, 3.522f)
                lineToRelative(-27.897f, -49.663f)
                curveToRelative(23.62f, -25.887f, 21.782f, -66.021f, -4.105f, -89.641f)
                reflectiveCurveToRelative(-66.021f, -21.782f, -89.641f, 4.105f)
                reflectiveCurveToRelative(-21.782f, 66.021f, 4.105f, 89.641f)
                curveToRelative(11.741f, 10.713f, 27.075f, 16.629f, 42.97f, 16.579f)
                curveToRelative(3.051f, -0.087f, 6.093f, -0.392f, 9.101f, -0.912f)
                lineToRelative(27.43f, 48.793f)
                curveToRelative(-41.2f, 32.082f, -50.98f, 90.366f, -22.509f, 134.139f)
                lineToRelative(-80.275f, 77.666f)
                curveToRelative(-32.847f, -14.572f, -71.288f, 0.243f, -85.86f, 33.09f)
                reflectiveCurveToRelative(0.243f, 71.288f, 33.09f, 85.86f)
                curveToRelative(32.847f, 14.572f, 71.288f, -0.243f, 85.86f, -33.09f)
                curveToRelative(8.105f, -18.269f, 7.364f, -39.25f, -2.011f, -56.902f)
                lineToRelative(78.939f, -76.372f)
                curveToRelative(41.939f, 27.906f, 98.038f, 20.578f, 131.402f, -17.163f)
                lineToRelative(52.357f, 22.233f)
                curveToRelative(-0.148f, 1.803f, -0.53f, 3.543f, -0.53f, 5.367f)
                curveToRelative(0.0f, 35.149f, 28.494f, 63.643f, 63.643f, 63.643f)
                reflectiveCurveTo(512.0f, 385.147f, 512.0f, 349.998f)
                reflectiveCurveToRelative(-28.494f, -63.643f, -63.643f, -63.643f)
                verticalLineTo(286.397f)
                close()
            }
        }
        .build()
        return _chartNetwork!!
    }

private var _chartNetwork: ImageVector? = null

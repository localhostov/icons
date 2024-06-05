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

public val Icons.Outline.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.618f, 466.531f)
                curveToRelative(-63.074f, -14.759f, -102.241f, -77.856f, -87.482f, -140.93f)
                curveToRelative(7.577f, -32.38f, 28.542f, -60.021f, 57.68f, -76.048f)
                curveTo(18.062f, 166.3f, 50.083f, 63.339f, 133.337f, 19.585f)
                reflectiveCurveTo(319.552f, 7.852f, 363.306f, 91.106f)
                curveToRelative(6.998f, 13.315f, 12.2f, 27.498f, 15.472f, 42.179f)
                curveToRelative(77.908f, 17.988f, 132.864f, 87.68f, 132.192f, 167.634f)
                curveToRelative(-13.331f, -13.337f, -29.089f, -24.002f, -46.427f, -31.419f)
                curveToRelative(-12.253f, -51.208f, -54.675f, -89.649f, -106.839f, -96.813f)
                lineToRelative(-16.157f, -2.129f)
                lineToRelative(-2.129f, -16.135f)
                curveTo(330.07f, 84.577f, 265.871f, 35.535f, 196.026f, 44.883f)
                reflectiveCurveTo(77.138f, 118.431f, 86.486f, 188.276f)
                curveToRelative(2.859f, 21.363f, 11.084f, 41.654f, 23.906f, 58.979f)
                lineToRelative(21.862f, 30.589f)
                curveToRelative(-11.289f, -0.787f, -22.633f, 0.117f, -33.655f, 2.682f)
                curveToRelative(-39.733f, 10.694f, -63.274f, 51.574f, -52.58f, 91.308f)
                curveToRelative(5.64f, 20.956f, 20.137f, 38.411f, 39.701f, 47.802f)
                curveTo(84.502f, 435.505f, 86.508f, 451.457f, 91.618f, 466.531f)
                close()
                moveTo(510.97f, 405.565f)
                curveToRelative(-0.059f, -52.295f, -38.049f, -96.822f, -89.682f, -105.115f)
                curveToRelative(-40.062f, -137.79f, -241.926f, -99.474f, -228.813f, 43.745f)
                curveToRelative(-45.594f, 11.755f, -73.025f, 58.245f, -61.27f, 103.839f)
                curveToRelative(9.634f, 37.365f, 43.163f, 63.601f, 81.748f, 63.966f)
                horizontalLineToRelative(191.582f)
                curveTo(463.288f, 511.93f, 510.899f, 464.318f, 510.97f, 405.565f)
                close()
                moveTo(249.141f, 384.279f)
                lineToRelative(-10.154f, -28.439f)
                curveToRelative(-32.718f, -104.732f, 126.678f, -141.664f, 143.431f, -32.973f)
                lineToRelative(2.129f, 18.945f)
                horizontalLineToRelative(21.287f)
                curveToRelative(35.226f, 1.753f, 62.361f, 31.729f, 60.609f, 66.955f)
                curveToRelative(-1.655f, 33.272f, -28.608f, 59.682f, -61.907f, 60.66f)
                horizontalLineTo(212.953f)
                curveToRelative(-23.513f, 0.0f, -42.574f, -19.061f, -42.574f, -42.574f)
                reflectiveCurveToRelative(19.061f, -42.574f, 42.574f, -42.574f)
                horizontalLineTo(249.141f)
                close()
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null

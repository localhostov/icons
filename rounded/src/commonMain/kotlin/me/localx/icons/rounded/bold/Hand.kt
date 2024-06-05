package me.localx.icons.rounded.bold

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

public val Icons.Bold.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(486.715f, 143.036f)
                curveToRelative(-11.609f, -53.966f, -59.222f, -92.571f, -114.422f, -92.775f)
                horizontalLineToRelative(-255.34f)
                curveTo(52.387f, 50.343f, 0.07f, 102.67f, 0.0f, 167.235f)
                verticalLineToRelative(106.321f)
                curveToRelative(0.07f, 64.562f, 52.391f, 116.882f, 116.953f, 116.953f)
                horizontalLineToRelative(44.251f)
                lineToRelative(32.173f, 63.006f)
                curveToRelative(14.81f, 28.863f, 44.709f, 46.829f, 77.146f, 46.356f)
                curveToRelative(46.4f, 0.061f, 84.064f, -37.504f, 84.125f, -83.904f)
                curveToRelative(0.006f, -4.769f, -0.393f, -9.529f, -1.195f, -14.23f)
                lineToRelative(-1.914f, -11.227f)
                horizontalLineToRelative(43.336f)
                curveToRelative(64.591f, 0.0f, 116.953f, -52.361f, 116.953f, -116.952f)
                curveToRelative(0.0f, -8.132f, -0.848f, -16.243f, -2.531f, -24.199f)
                lineTo(486.715f, 143.036f)
                close()
                moveTo(63.792f, 273.556f)
                verticalLineTo(167.235f)
                curveToRelative(0.0f, -29.36f, 23.801f, -53.16f, 53.16f, -53.16f)
                horizontalLineToRelative(31.896f)
                verticalLineToRelative(212.641f)
                horizontalLineToRelative(-31.896f)
                curveTo(87.593f, 326.716f, 63.792f, 302.916f, 63.792f, 273.556f)
                close()
                moveTo(436.063f, 307.047f)
                curveToRelative(-10.077f, 12.471f, -25.262f, 19.703f, -41.295f, 19.669f)
                horizontalLineTo(275.859f)
                lineToRelative(14.608f, 85.737f)
                curveToRelative(1.047f, 5.875f, -0.6f, 11.909f, -4.487f, 16.437f)
                curveToRelative(-4.135f, 4.798f, -10.236f, 7.445f, -16.565f, 7.187f)
                curveToRelative(-8.051f, 0.085f, -15.459f, -4.385f, -19.138f, -11.546f)
                lineToRelative(-37.637f, -73.51f)
                verticalLineTo(114.075f)
                horizontalLineToRelative(159.651f)
                curveToRelative(25.092f, 0.074f, 46.738f, 17.63f, 51.991f, 42.167f)
                lineToRelative(22.497f, 106.321f)
                curveTo(450.131f, 278.248f, 446.189f, 294.607f, 436.063f, 307.047f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null

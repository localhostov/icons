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

public val Icons.Filled.DrumstickBite: ImageVector
    get() {
        if (_drumstickBite != null) {
            return _drumstickBite!!
        }
        _drumstickBite = Builder(name = "DrumstickBite", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.499f, 2.501f)
                curveToRelative(-1.612f, -1.613f, -3.757f, -2.501f, -6.037f, -2.501f)
                reflectiveCurveToRelative(-4.425f, 0.888f, -6.038f, 2.501f)
                curveToRelative(-2.377f, 2.377f, -3.156f, 7.909f, -3.41f, 10.995f)
                curveToRelative(-0.073f, 0.884f, 0.136f, 1.754f, 0.582f, 2.495f)
                lineToRelative(-3.783f, 3.783f)
                curveToRelative(-0.256f, -0.461f, -0.748f, -0.774f, -1.312f, -0.774f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.231f, 0.0f, 0.45f, -0.052f, 0.646f, -0.146f)
                curveToRelative(-0.093f, 0.196f, -0.146f, 0.415f, -0.146f, 0.646f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.565f, -0.312f, -1.057f, -0.773f, -1.312f)
                lineToRelative(3.784f, -3.783f)
                curveToRelative(0.644f, 0.388f, 1.385f, 0.596f, 2.148f, 0.596f)
                curveToRelative(0.115f, 0.0f, 0.23f, -0.004f, 0.346f, -0.014f)
                curveToRelative(1.173f, -0.096f, 2.953f, -0.292f, 4.77f, -0.676f)
                curveToRelative(0.51f, -0.108f, 0.852f, -0.59f, 0.785f, -1.107f)
                curveToRelative(-0.03f, -0.229f, -0.051f, -0.462f, -0.051f, -0.7f)
                curveToRelative(0.0f, -3.434f, 3.137f, -6.183f, 6.737f, -5.354f)
                curveToRelative(0.282f, 0.064f, 0.58f, 0.005f, 0.813f, -0.167f)
                curveToRelative(0.234f, -0.171f, 0.383f, -0.435f, 0.407f, -0.724f)
                curveToRelative(0.212f, -2.515f, -0.688f, -4.978f, -2.467f, -6.757f)
                close()
            }
        }
        .build()
        return _drumstickBite!!
    }

private var _drumstickBite: ImageVector? = null

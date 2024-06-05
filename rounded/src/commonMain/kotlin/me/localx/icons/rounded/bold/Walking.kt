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

public val Icons.Bold.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = Builder(name = "Walking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(20.171f, 12.158f)
                lineToRelative(-2.625f, -1.312f)
                reflectiveCurveToRelative(-2.268f, -3.592f, -2.319f, -3.651f)
                curveToRelative(-0.665f, -0.76f, -1.625f, -1.195f, -2.634f, -1.195f)
                curveToRelative(-1.274f, 0.0f, -2.549f, 0.301f, -3.688f, 0.871f)
                lineToRelative(-2.526f, 1.263f)
                curveToRelative(-0.641f, 0.321f, -1.114f, 0.902f, -1.298f, 1.596f)
                lineToRelative(-0.633f, 2.387f)
                curveToRelative(-0.212f, 0.801f, 0.265f, 1.622f, 1.065f, 1.834f)
                curveToRelative(0.802f, 0.213f, 1.622f, -0.264f, 1.834f, -1.065f)
                lineToRelative(0.575f, -2.168f)
                lineToRelative(1.831f, -0.916f)
                lineToRelative(-0.662f, 2.83f)
                curveToRelative(-0.351f, 1.5f, 0.339f, 3.079f, 1.679f, 3.84f)
                lineToRelative(3.976f, 2.258f)
                curveToRelative(0.156f, 0.089f, 0.253f, 0.256f, 0.253f, 0.436f)
                verticalLineToRelative(3.336f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-3.336f)
                curveToRelative(0.0f, -1.256f, -0.679f, -2.422f, -1.771f, -3.043f)
                lineToRelative(-2.724f, -1.547f)
                lineToRelative(0.849f, -3.165f)
                lineToRelative(0.875f, 1.39f)
                curveToRelative(0.146f, 0.232f, 0.354f, 0.42f, 0.599f, 0.543f)
                lineToRelative(3.0f, 1.5f)
                curveToRelative(0.216f, 0.107f, 0.444f, 0.159f, 0.67f, 0.159f)
                curveToRelative(0.55f, 0.0f, 1.08f, -0.304f, 1.343f, -0.83f)
                curveToRelative(0.37f, -0.741f, 0.07f, -1.642f, -0.671f, -2.013f)
                close()
                moveTo(9.859f, 17.623f)
                curveToRelative(-0.812f, -0.161f, -1.6f, 0.378f, -1.754f, 1.192f)
                lineToRelative(-0.039f, 0.2f)
                lineToRelative(-1.407f, 2.814f)
                curveToRelative(-0.37f, 0.741f, -0.07f, 1.642f, 0.671f, 2.013f)
                curveToRelative(0.215f, 0.107f, 0.444f, 0.159f, 0.67f, 0.159f)
                curveToRelative(0.55f, 0.0f, 1.08f, -0.304f, 1.343f, -0.83f)
                lineToRelative(1.5f, -3.0f)
                curveToRelative(0.062f, -0.123f, 0.106f, -0.254f, 0.131f, -0.39f)
                lineToRelative(0.077f, -0.404f)
                curveToRelative(0.156f, -0.813f, -0.378f, -1.599f, -1.192f, -1.754f)
                close()
            }
        }
        .build()
        return _walking!!
    }

private var _walking: ImageVector? = null

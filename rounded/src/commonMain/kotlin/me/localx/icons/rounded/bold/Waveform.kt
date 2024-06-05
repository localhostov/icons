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

public val Icons.Bold.Waveform: ImageVector
    get() {
        if (_waveform != null) {
            return _waveform!!
        }
        _waveform = Builder(name = "Waveform", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 24.0f)
                horizontalLineToRelative(-0.028f)
                curveToRelative(-0.735f, -0.015f, -1.353f, -0.56f, -1.457f, -1.288f)
                lineToRelative(-1.515f, -10.605f)
                lineToRelative(-1.515f, 10.605f)
                curveToRelative(-0.104f, 0.729f, -0.722f, 1.273f, -1.457f, 1.288f)
                horizontalLineToRelative(-0.028f)
                curveToRelative(-0.724f, 0.0f, -1.346f, -0.518f, -1.476f, -1.231f)
                lineToRelative(-1.655f, -9.104f)
                lineToRelative(-0.903f, 4.154f)
                curveToRelative(-0.144f, 0.66f, -0.711f, 1.144f, -1.385f, 1.18f)
                curveToRelative(-0.665f, 0.026f, -1.29f, -0.382f, -1.504f, -1.023f)
                lineTo(0.077f, 11.975f)
                curveToRelative(-0.262f, -0.786f, 0.162f, -1.636f, 0.948f, -1.897f)
                reflectiveCurveToRelative(1.636f, 0.163f, 1.897f, 0.948f)
                lineToRelative(0.272f, 0.816f)
                lineToRelative(1.339f, -6.16f)
                curveToRelative(0.152f, -0.699f, 0.79f, -1.147f, 1.491f, -1.182f)
                curveToRelative(0.716f, 0.013f, 1.322f, 0.528f, 1.45f, 1.231f)
                lineToRelative(1.347f, 7.406f)
                lineToRelative(1.692f, -11.85f)
                curveToRelative(0.106f, -0.739f, 0.739f, -1.288f, 1.485f, -1.288f)
                reflectiveCurveToRelative(1.379f, 0.549f, 1.485f, 1.288f)
                lineToRelative(1.692f, 11.85f)
                lineToRelative(1.347f, -7.406f)
                curveToRelative(0.128f, -0.703f, 0.734f, -1.219f, 1.45f, -1.231f)
                curveToRelative(0.693f, -0.015f, 1.339f, 0.482f, 1.491f, 1.182f)
                lineToRelative(1.339f, 6.16f)
                lineToRelative(0.272f, -0.816f)
                curveToRelative(0.261f, -0.785f, 1.112f, -1.212f, 1.897f, -0.948f)
                curveToRelative(0.786f, 0.262f, 1.21f, 1.111f, 0.948f, 1.897f)
                lineToRelative(-2.0f, 6.0f)
                curveToRelative(-0.214f, 0.641f, -0.837f, 1.05f, -1.504f, 1.023f)
                curveToRelative(-0.674f, -0.036f, -1.241f, -0.52f, -1.385f, -1.18f)
                lineToRelative(-0.903f, -4.154f)
                lineToRelative(-1.655f, 9.104f)
                curveToRelative(-0.13f, 0.714f, -0.752f, 1.231f, -1.476f, 1.231f)
                close()
            }
        }
        .build()
        return _waveform!!
    }

private var _waveform: ImageVector? = null

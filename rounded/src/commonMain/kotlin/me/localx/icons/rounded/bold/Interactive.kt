package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Interactive: ImageVector
    get() {
        if (_interactive != null) {
            return _interactive!!
        }
        _interactive = Builder(name = "Interactive", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.34f, viewportHeight = 512.34f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 213.333f)
                curveToRelative(0.584f, -82.472f, 67.915f, -148.856f, 150.388f, -148.271f)
                curveToRelative(72.918f, 0.517f, 134.8f, 53.62f, 146.38f, 125.615f)
                lineToRelative(65.899f, 23.936f)
                curveToRelative(0.0f, -0.427f, 0.0f, -0.853f, 0.0f, -1.28f)
                curveTo(426.667f, 95.513f, 331.154f, 0.0f, 213.333f, 0.0f)
                reflectiveCurveTo(0.0f, 95.513f, 0.0f, 213.333f)
                reflectiveCurveToRelative(95.513f, 213.333f, 213.333f, 213.333f)
                curveToRelative(0.448f, 0.0f, 0.853f, 0.0f, 1.301f, 0.0f)
                lineToRelative(-23.936f, -65.899f)
                curveTo(117.881f, 349.602f, 64.086f, 287.002f, 64.0f, 213.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(289.429f, 172.267f)
                curveToRelative(3.648f, 0.0f, 7.253f, 0.619f, 10.88f, 0.96f)
                curveToRelative(-22.045f, -48.128f, -78.932f, -69.273f, -127.06f, -47.228f)
                reflectiveCurveToRelative(-69.273f, 78.932f, -47.228f, 127.06f)
                curveToRelative(9.521f, 20.785f, 26.157f, 37.483f, 46.907f, 47.08f)
                curveToRelative(-5.821f, -64.539f, 41.78f, -121.578f, 106.32f, -127.398f)
                curveTo(282.633f, 172.435f, 286.03f, 172.277f, 289.429f, 172.267f)
                lineTo(289.429f, 172.267f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.571f, 457.323f)
                lineToRelative(-56.427f, -56.427f)
                lineToRelative(35.541f, -35.541f)
                curveToRelative(22.007f, -21.998f, 22.014f, -57.672f, 0.016f, -79.679f)
                curveToRelative(-5.825f, -5.828f, -12.858f, -10.307f, -20.603f, -13.121f)
                lineTo(315.221f, 219.52f)
                curveToRelative(-38.755f, -14.09f, -81.595f, 5.904f, -95.686f, 44.66f)
                curveToRelative(-5.994f, 16.486f, -5.992f, 34.557f, 0.006f, 51.042f)
                lineToRelative(53.035f, 145.877f)
                curveToRelative(6.538f, 18.127f, 21.924f, 31.628f, 40.747f, 35.755f)
                curveToRelative(4.049f, 0.898f, 8.183f, 1.355f, 12.331f, 1.365f)
                curveToRelative(14.906f, -0.012f, 29.193f, -5.962f, 39.701f, -16.533f)
                lineToRelative(35.541f, -35.541f)
                lineToRelative(56.427f, 56.427f)
                curveToRelative(12.278f, 12.712f, 32.536f, 13.064f, 45.248f, 0.786f)
                curveToRelative(12.712f, -12.278f, 13.064f, -32.536f, 0.786f, -45.248f)
                curveTo(503.099f, 457.842f, 502.837f, 457.58f, 502.571f, 457.323f)
                close()
                moveTo(328.533f, 427.947f)
                lineTo(279.68f, 293.355f)
                curveToRelative(-1.543f, -3.885f, -0.553f, -8.319f, 2.496f, -11.179f)
                curveToRelative(2.834f, -3.094f, 7.298f, -4.09f, 11.179f, -2.496f)
                lineToRelative(134.592f, 48.853f)
                lineTo(328.533f, 427.947f)
                close()
            }
        }
        .build()
        return _interactive!!
    }

private var _interactive: ImageVector? = null

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

public val Icons.Filled.RouteHighway: ImageVector
    get() {
        if (_routeHighway != null) {
            return _routeHighway!!
        }
        _routeHighway = Builder(name = "RouteHighway", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.523f, 6.736f)
                lineToRelative(-0.448f, -0.413f)
                lineTo(3.534f, 0.994f)
                lineToRelative(1.045f, 0.428f)
                curveToRelative(0.974f, 0.398f, 2.182f, 0.603f, 3.403f, 0.584f)
                curveToRelative(1.555f, -0.028f, 2.081f, -0.404f, 3.375f, -1.489f)
                lineTo(12.0f, -0.022f)
                lineToRelative(0.643f, 0.539f)
                curveToRelative(1.289f, 1.081f, 1.813f, 1.456f, 3.375f, 1.483f)
                curveToRelative(1.297f, 0.0f, 2.479f, -0.2f, 3.403f, -0.578f)
                lineToRelative(1.045f, -0.428f)
                lineToRelative(1.459f, 5.33f)
                lineToRelative(-0.448f, 0.413f)
                curveToRelative(-0.286f, 0.264f, -0.671f, 0.69f, -0.977f, 1.268f)
                lineToRelative(-17.0f, -0.003f)
                curveToRelative(-0.306f, -0.576f, -0.69f, -1.002f, -0.976f, -1.265f)
                close()
                moveTo(20.0f, 10.004f)
                lineToRelative(-16.001f, -0.003f)
                curveToRelative(0.0f, 0.764f, -0.435f, 1.632f, -0.894f, 2.552f)
                curveToRelative(-0.543f, 1.087f, -1.105f, 2.211f, -1.105f, 3.447f)
                curveToRelative(0.0f, 4.662f, 4.685f, 6.142f, 7.483f, 7.026f)
                curveToRelative(0.701f, 0.222f, 1.308f, 0.413f, 1.67f, 0.594f)
                lineToRelative(0.847f, 0.422f)
                lineToRelative(0.848f, -0.423f)
                curveToRelative(0.361f, -0.181f, 0.968f, -0.372f, 1.669f, -0.594f)
                curveToRelative(2.799f, -0.884f, 7.483f, -2.364f, 7.483f, -7.026f)
                curveToRelative(0.0f, -1.236f, -0.563f, -2.36f, -1.105f, -3.447f)
                curveToRelative(-0.459f, -0.918f, -0.893f, -1.785f, -0.894f, -2.549f)
                close()
            }
        }
        .build()
        return _routeHighway!!
    }

private var _routeHighway: ImageVector? = null

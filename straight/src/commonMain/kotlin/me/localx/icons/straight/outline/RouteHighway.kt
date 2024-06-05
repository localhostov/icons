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

public val Icons.Outline.RouteHighway: ImageVector
    get() {
        if (_routeHighway != null) {
            return _routeHighway!!
        }
        _routeHighway = Builder(name = "RouteHighway", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.895f, 12.553f)
                curveToRelative(-0.46f, -0.92f, -0.895f, -1.789f, -0.895f, -2.553f)
                curveToRelative(0.0f, -1.657f, 0.926f, -2.756f, 1.477f, -3.264f)
                lineToRelative(0.448f, -0.413f)
                lineToRelative(-1.459f, -5.33f)
                lineToRelative(-1.045f, 0.428f)
                curveToRelative(-0.924f, 0.378f, -2.106f, 0.578f, -3.403f, 0.578f)
                curveToRelative(-1.562f, -0.028f, -2.086f, -0.403f, -3.375f, -1.483f)
                lineTo(12.0f, -0.022f)
                lineToRelative(-0.643f, 0.539f)
                curveToRelative(-1.294f, 1.085f, -1.82f, 1.461f, -3.375f, 1.489f)
                curveToRelative(-1.222f, 0.019f, -2.43f, -0.186f, -3.403f, -0.584f)
                lineToRelative(-1.045f, -0.428f)
                lineToRelative(-1.459f, 5.33f)
                lineToRelative(0.448f, 0.413f)
                curveToRelative(0.551f, 0.508f, 1.477f, 1.607f, 1.477f, 3.264f)
                curveToRelative(0.0f, 0.764f, -0.435f, 1.633f, -0.895f, 2.553f)
                curveToRelative(-0.543f, 1.087f, -1.105f, 2.211f, -1.105f, 3.447f)
                curveToRelative(0.0f, 4.662f, 4.685f, 6.142f, 7.483f, 7.026f)
                curveToRelative(0.701f, 0.222f, 1.308f, 0.413f, 1.67f, 0.594f)
                lineToRelative(0.847f, 0.422f)
                lineToRelative(0.848f, -0.423f)
                curveToRelative(0.361f, -0.181f, 0.968f, -0.372f, 1.669f, -0.594f)
                curveToRelative(2.799f, -0.884f, 7.483f, -2.364f, 7.483f, -7.026f)
                curveToRelative(0.0f, -1.236f, -0.563f, -2.36f, -1.105f, -3.447f)
                close()
                moveTo(4.886f, 3.63f)
                curveToRelative(0.976f, 0.264f, 2.072f, 0.394f, 3.132f, 0.375f)
                curveToRelative(1.89f, -0.034f, 2.849f, -0.536f, 3.982f, -1.431f)
                curveToRelative(1.131f, 0.891f, 2.092f, 1.391f, 4.0f, 1.425f)
                curveToRelative(1.121f, 0.0f, 2.178f, -0.128f, 3.113f, -0.374f)
                lineToRelative(0.569f, 2.081f)
                curveToRelative(-0.619f, 0.681f, -1.078f, 1.46f, -1.358f, 2.298f)
                lineToRelative(-12.65f, -0.004f)
                curveToRelative(-0.281f, -0.836f, -0.739f, -1.614f, -1.357f, -2.294f)
                lineToRelative(0.568f, -2.076f)
                close()
                moveTo(13.914f, 21.119f)
                curveToRelative(-0.759f, 0.24f, -1.417f, 0.448f, -1.914f, 0.689f)
                curveToRelative(-0.498f, -0.242f, -1.156f, -0.449f, -1.914f, -0.689f)
                curveToRelative(-3.207f, -1.013f, -6.086f, -2.167f, -6.086f, -5.119f)
                curveToRelative(0.0f, -0.764f, 0.435f, -1.633f, 0.895f, -2.553f)
                curveToRelative(0.543f, -1.087f, 1.105f, -2.211f, 1.105f, -3.447f)
                lineToRelative(12.0f, 0.004f)
                curveToRelative(0.001f, 1.234f, 0.563f, 2.357f, 1.105f, 3.443f)
                curveToRelative(0.46f, 0.92f, 0.895f, 1.789f, 0.895f, 2.553f)
                curveToRelative(0.0f, 2.952f, -2.879f, 4.105f, -6.086f, 5.119f)
                close()
            }
        }
        .build()
        return _routeHighway!!
    }

private var _routeHighway: ImageVector? = null

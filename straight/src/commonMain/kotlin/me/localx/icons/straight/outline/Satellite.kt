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

public val Icons.Outline.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.121f, 6.846f)
                curveToRelative(1.17f, -1.169f, 1.17f, -3.073f, 0.0f, -4.243f)
                lineToRelative(-1.725f, -1.725f)
                curveToRelative(-1.134f, -1.135f, -3.112f, -1.132f, -4.242f, 0.0f)
                lineToRelative(-3.931f, 3.931f)
                lineTo(8.5f, 0.086f)
                lineTo(2.274f, 6.311f)
                lineToRelative(4.724f, 4.724f)
                lineToRelative(-0.056f, 0.056f)
                curveToRelative(-0.359f, -0.055f, -0.722f, -0.091f, -1.092f, -0.091f)
                curveToRelative(-1.91f, 0.0f, -3.706f, 0.744f, -5.057f, 2.094f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(4.349f, 4.349f)
                lineToRelative(-1.642f, 1.642f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.642f, -1.642f)
                lineToRelative(4.349f, 4.349f)
                lineToRelative(0.707f, -0.707f)
                curveToRelative(1.351f, -1.351f, 2.095f, -3.146f, 2.095f, -5.056f)
                curveToRelative(0.0f, -0.37f, -0.036f, -0.733f, -0.091f, -1.092f)
                lineToRelative(0.057f, -0.057f)
                lineToRelative(4.723f, 4.723f)
                lineToRelative(6.226f, -6.225f)
                lineToRelative(-4.723f, -4.723f)
                lineToRelative(3.93f, -3.931f)
                close()
                moveTo(18.569f, 2.292f)
                curveToRelative(0.377f, -0.376f, 1.034f, -0.378f, 1.413f, 0.0f)
                lineToRelative(1.725f, 1.725f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.415f)
                lineToRelative(-9.483f, 9.484f)
                curveToRelative(-0.338f, -0.664f, -0.777f, -1.28f, -1.319f, -1.821f)
                reflectiveCurveToRelative(-1.157f, -0.981f, -1.82f, -1.318f)
                lineTo(18.569f, 2.292f)
                close()
                moveTo(5.103f, 6.311f)
                lineToRelative(3.397f, -3.397f)
                lineToRelative(3.309f, 3.309f)
                lineToRelative(-3.397f, 3.397f)
                lineToRelative(-3.31f, -3.31f)
                close()
                moveTo(10.13f, 21.018f)
                lineToRelative(-7.147f, -7.148f)
                curveToRelative(0.841f, -0.566f, 1.831f, -0.87f, 2.867f, -0.87f)
                curveToRelative(1.376f, 0.0f, 2.669f, 0.536f, 3.642f, 1.508f)
                curveToRelative(0.973f, 0.973f, 1.509f, 2.267f, 1.509f, 3.643f)
                curveToRelative(0.0f, 1.036f, -0.304f, 2.026f, -0.87f, 2.867f)
                close()
                moveTo(21.086f, 15.5f)
                lineToRelative(-3.397f, 3.397f)
                lineToRelative(-3.309f, -3.309f)
                lineToRelative(3.397f, -3.397f)
                lineToRelative(3.309f, 3.309f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null

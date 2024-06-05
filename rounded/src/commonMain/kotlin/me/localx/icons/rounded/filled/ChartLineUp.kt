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

public val Icons.Filled.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) {
            return _chartLineUp!!
        }
        _chartLineUp = Builder(name = "ChartLineUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 1.0f)
                curveTo(0.006f, -0.308f, 1.994f, -0.307f, 2.0f, 1.0f)
                lineTo(2.0f, 21.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                lineTo(23.0f, 22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(21.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.308f, 0.006f, -1.307f, 1.994f, 0.0f, 2.0f)
                horizontalLineToRelative(3.563f)
                lineToRelative(-4.857f, 4.707f)
                curveToRelative(-0.377f, 0.378f, -1.036f, 0.378f, -1.413f, 0.0f)
                curveToRelative(-0.041f, -0.04f, -1.239f, -0.893f, -1.239f, -0.893f)
                curveToRelative(-1.138f, -1.073f, -3.077f, -1.033f, -4.162f, 0.051f)
                lineToRelative(-4.586f, 4.414f)
                curveToRelative(-0.398f, 0.383f, -0.41f, 1.016f, -0.027f, 1.414f)
                curveToRelative(0.384f, 0.398f, 1.016f, 0.41f, 1.414f, 0.027f)
                lineToRelative(4.6f, -4.428f)
                curveToRelative(0.377f, -0.378f, 1.036f, -0.378f, 1.413f, 0.0f)
                curveToRelative(0.041f, 0.04f, 1.239f, 0.893f, 1.239f, 0.893f)
                curveToRelative(1.139f, 1.074f, 3.076f, 1.036f, 4.164f, -0.054f)
                lineToRelative(4.89f, -4.74f)
                verticalLineToRelative(3.607f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.307f, 2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null

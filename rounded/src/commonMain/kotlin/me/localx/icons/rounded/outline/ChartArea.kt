package me.localx.icons.rounded.outline

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

public val Icons.Outline.ChartArea: ImageVector
    get() {
        if (_chartArea != null) {
            return _chartArea!!
        }
        _chartArea = Builder(name = "ChartArea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 1.0f)
                curveTo(0.0f, 0.448f, 0.448f, 0.0f, 1.0f, 0.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                lineTo(2.0f, 21.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                lineTo(23.0f, 22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(24.006f, 17.009f)
                lineToRelative(0.015f, -4.979f)
                curveToRelative(0.002f, -0.794f, -0.318f, -1.571f, -0.879f, -2.13f)
                lineToRelative(-2.021f, -2.021f)
                curveToRelative(-1.134f, -1.134f, -3.11f, -1.134f, -4.243f, 0.0f)
                lineToRelative(-1.879f, 1.878f)
                lineToRelative(-3.879f, -3.878f)
                curveToRelative(-1.133f, -1.134f, -3.109f, -1.134f, -4.242f, 0.0f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.567f, 0.566f, -0.879f, 1.32f, -0.879f, 2.121f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.006f)
                curveToRelative(1.65f, 0.0f, 2.996f, -1.342f, 3.0f, -2.991f)
                close()
                moveTo(9.707f, 7.293f)
                horizontalLineToRelative(0.0f)
                lineToRelative(4.586f, 4.585f)
                curveToRelative(0.391f, 0.391f, 1.023f, 0.391f, 1.414f, 0.0f)
                lineToRelative(2.586f, -2.585f)
                curveToRelative(0.377f, -0.378f, 1.036f, -0.378f, 1.414f, 0.0f)
                lineToRelative(2.021f, 2.021f)
                curveToRelative(0.189f, 0.189f, 0.293f, 0.441f, 0.292f, 0.71f)
                lineToRelative(-0.015f, 4.979f)
                curveToRelative(-0.001f, 0.549f, -0.45f, 0.997f, -1.0f, 0.997f)
                lineTo(7.0f, 18.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.263f, 0.107f, -0.521f, 0.293f, -0.707f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.188f, -0.189f, 0.439f, -0.293f, 0.707f, -0.293f)
                reflectiveCurveToRelative(0.518f, 0.104f, 0.707f, 0.293f)
                close()
            }
        }
        .build()
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null

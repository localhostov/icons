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
                moveTo(24.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                lineTo(2.0f, 21.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                lineTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.025f, 10.782f)
                lineToRelative(-2.903f, -2.903f)
                curveToRelative(-1.134f, -1.134f, -3.11f, -1.134f, -4.243f, 0.0f)
                lineToRelative(-1.879f, 1.878f)
                lineToRelative(-3.879f, -3.878f)
                curveToRelative(-1.133f, -1.134f, -3.109f, -1.134f, -4.242f, 0.0f)
                lineToRelative(-2.879f, 2.878f)
                verticalLineToRelative(11.243f)
                lineTo(23.997f, 20.0f)
                lineToRelative(0.028f, -9.218f)
                close()
                moveTo(6.0f, 9.585f)
                lineToRelative(2.293f, -2.292f)
                curveToRelative(0.377f, -0.378f, 1.036f, -0.378f, 1.413f, 0.0f)
                lineToRelative(5.293f, 5.292f)
                lineToRelative(3.293f, -3.292f)
                curveToRelative(0.377f, -0.378f, 1.036f, -0.378f, 1.414f, 0.0f)
                lineToRelative(2.315f, 2.315f)
                lineToRelative(-0.019f, 6.392f)
                lineTo(6.0f, 18.0f)
                lineTo(6.0f, 9.585f)
                close()
            }
        }
        .build()
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null

package me.localx.icons.straight.bold

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

public val Icons.Bold.FileChartPie: ImageVector
    get() {
        if (_fileChartPie != null) {
            return _fileChartPie!!
        }
        _fileChartPie = Builder(name = "FileChartPie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.614f, 12.077f)
                curveToRelative(0.247f, 0.592f, 0.386f, 1.241f, 0.386f, 1.923f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.239f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.239f, -5.0f, 5.0f, -5.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(4.614f, -1.923f)
                close()
                moveTo(22.0f, 5.664f)
                lineTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.346f, 3.346f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(11.382f)
                lineToRelative(5.618f, 5.665f)
                close()
                moveTo(19.0f, 20.999f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _fileChartPie!!
    }

private var _fileChartPie: ImageVector? = null

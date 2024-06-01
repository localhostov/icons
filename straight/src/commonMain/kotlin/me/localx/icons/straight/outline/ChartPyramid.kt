package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.ChartPyramid: ImageVector
    get() {
        if (_chartPyramid != null) {
            return _chartPyramid!!
        }
        _chartPyramid = Builder(name = "ChartPyramid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.905f, 1.2431f)
                    curveTo(13.7402f, 0.8757f, 13.4726f, 0.5639f, 13.1347f, 0.3451f)
                    curveTo(12.7967f, 0.1263f, 12.4026f, 0.0099f, 12.0f, 0.0099f)
                    curveTo(11.5974f, 0.0099f, 11.2033f, 0.1263f, 10.8653f, 0.3451f)
                    curveTo(10.5274f, 0.5639f, 10.2598f, 0.8757f, 10.095f, 1.2431f)
                    lineTo(0.0f, 24.0001f)
                    horizontalLineTo(24.0f)
                    lineTo(13.905f, 1.2431f)
                    close()
                    moveTo(18.263f, 16.0001f)
                    horizontalLineTo(5.737f)
                    lineTo(7.511f, 12.0001f)
                    horizontalLineTo(16.489f)
                    lineTo(18.263f, 16.0001f)
                    close()
                    moveTo(11.919f, 2.0621f)
                    curveTo(11.935f, 2.0271f, 11.943f, 2.0101f, 12.0f, 2.0101f)
                    curveTo(12.057f, 2.0101f, 12.065f, 2.0271f, 12.077f, 2.0541f)
                    lineTo(15.6f, 10.0001f)
                    horizontalLineTo(8.4f)
                    lineTo(11.919f, 2.0621f)
                    close()
                    moveTo(4.849f, 18.0001f)
                    horizontalLineTo(19.149f)
                    lineTo(20.923f, 22.0001f)
                    horizontalLineTo(3.075f)
                    lineTo(4.849f, 18.0001f)
                    close()
                }
            }
        }
        .build()
        return _chartPyramid!!
    }

private var _chartPyramid: ImageVector? = null

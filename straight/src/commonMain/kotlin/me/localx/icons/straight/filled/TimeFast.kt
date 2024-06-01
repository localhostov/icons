package me.localx.icons.straight.filled

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

public val Icons.Filled.TimeFast: ImageVector
    get() {
        if (_timeFast != null) {
            return _timeFast!!
        }
        _timeFast = Builder(name = "TimeFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 23.9993f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.9993f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(23.9993f)
                    close()
                    moveTo(8.0f, 17.9993f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(19.9993f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(17.9993f)
                    close()
                    moveTo(6.0f, 13.9993f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(15.9993f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(13.9993f)
                    close()
                    moveTo(23.991f, 11.5253f)
                    curveTo(24.053f, 13.1394f, 23.7888f, 14.7494f, 23.2143f, 16.2591f)
                    curveTo(22.6398f, 17.7687f, 21.7667f, 19.147f, 20.6473f, 20.3115f)
                    curveTo(19.5279f, 21.476f, 18.1852f, 22.4028f, 16.6994f, 23.0364f)
                    curveTo(15.2136f, 23.6701f, 13.6153f, 23.9976f, 12.0f, 23.9993f)
                    verticalLineTo(21.9993f)
                    curveTo(12.0f, 21.4689f, 11.7893f, 20.9602f, 11.4142f, 20.5851f)
                    curveTo(11.0391f, 20.2101f, 10.5304f, 19.9993f, 10.0f, 19.9993f)
                    verticalLineTo(17.9993f)
                    curveTo(10.0f, 17.4689f, 9.7893f, 16.9602f, 9.4142f, 16.5851f)
                    curveTo(9.0391f, 16.2101f, 8.5304f, 15.9993f, 8.0f, 15.9993f)
                    verticalLineTo(13.9993f)
                    curveTo(8.0f, 13.4689f, 7.7893f, 12.9602f, 7.4142f, 12.5851f)
                    curveTo(7.0391f, 12.2101f, 6.5304f, 11.9993f, 6.0f, 11.9993f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0019f, 10.384f, 0.3295f, 8.7857f, 0.9633f, 7.2999f)
                    curveTo(1.597f, 5.8141f, 2.5239f, 4.4714f, 3.6885f, 3.352f)
                    curveTo(4.8531f, 2.2326f, 6.2314f, 1.3595f, 7.7411f, 0.785f)
                    curveTo(9.2508f, 0.2105f, 10.8609f, -0.0536f, 12.475f, 0.0084f)
                    curveTo(15.4826f, 0.1535f, 18.3283f, 1.4135f, 20.4573f, 3.5427f)
                    curveTo(22.5863f, 5.672f, 23.8461f, 8.5178f, 23.991f, 11.5253f)
                    close()
                    moveTo(11.0f, 5.7923f)
                    verticalLineTo(11.2063f)
                    lineTo(14.293f, 14.4993f)
                    lineTo(15.707f, 13.0853f)
                    lineTo(13.0f, 10.3783f)
                    verticalLineTo(5.7923f)
                    horizontalLineTo(11.0f)
                    close()
                }
            }
        }
        .build()
        return _timeFast!!
    }

private var _timeFast: ImageVector? = null

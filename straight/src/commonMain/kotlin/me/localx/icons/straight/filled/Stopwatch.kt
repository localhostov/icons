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

public val Icons.Filled.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0382f, 4.452f)
                    lineTo(21.9182f, 5.332f)
                    lineTo(23.3322f, 3.918f)
                    lineTo(20.1452f, 0.73f)
                    lineTo(18.7302f, 2.145f)
                    lineTo(19.6222f, 3.036f)
                    lineTo(18.5742f, 4.2f)
                    curveTo(16.952f, 2.9796f, 15.0218f, 2.2355f, 13.0002f, 2.051f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(2.051f)
                    curveTo(8.9786f, 2.2355f, 7.0484f, 2.9796f, 5.4262f, 4.2f)
                    lineTo(4.3782f, 3.036f)
                    lineTo(5.3322f, 2.082f)
                    lineTo(3.9182f, 0.668f)
                    lineTo(0.6682f, 3.918f)
                    lineTo(2.0822f, 5.332f)
                    lineTo(2.9622f, 4.452f)
                    lineTo(3.9402f, 5.539f)
                    curveTo(2.4832f, 7.1078f, 1.5156f, 9.0677f, 1.1563f, 11.1783f)
                    curveTo(0.7969f, 13.2889f, 1.0612f, 15.4586f, 1.9169f, 17.4212f)
                    curveTo(2.7726f, 19.3837f, 4.1825f, 21.0539f, 5.9736f, 22.2269f)
                    curveTo(7.7647f, 23.3999f, 9.8591f, 24.0247f, 12.0002f, 24.0247f)
                    curveTo(14.1412f, 24.0247f, 16.2357f, 23.3999f, 18.0268f, 22.2269f)
                    curveTo(19.8179f, 21.0539f, 21.2277f, 19.3837f, 22.0834f, 17.4212f)
                    curveTo(22.9391f, 15.4586f, 23.2035f, 13.2889f, 22.8441f, 11.1783f)
                    curveTo(22.4847f, 9.0677f, 21.5172f, 7.1078f, 20.0602f, 5.539f)
                    lineTo(21.0382f, 4.452f)
                    close()
                    moveTo(12.0002f, 15.0f)
                    curveTo(11.5603f, 15.0015f, 11.1322f, 14.8575f, 10.7827f, 14.5904f)
                    curveTo(10.4332f, 14.3233f, 10.1818f, 13.9481f, 10.0677f, 13.5233f)
                    curveTo(9.9536f, 13.0984f, 9.9831f, 12.6478f, 10.1518f, 12.2415f)
                    curveTo(10.3205f, 11.8352f, 10.6187f, 11.4961f, 11.0002f, 11.277f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(11.277f)
                    curveTo(13.3816f, 11.4961f, 13.6799f, 11.8352f, 13.8485f, 12.2415f)
                    curveTo(14.0172f, 12.6478f, 14.0468f, 13.0984f, 13.9327f, 13.5233f)
                    curveTo(13.8185f, 13.9481f, 13.5671f, 14.3233f, 13.2176f, 14.5904f)
                    curveTo(12.8681f, 14.8575f, 12.4401f, 15.0015f, 12.0002f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null

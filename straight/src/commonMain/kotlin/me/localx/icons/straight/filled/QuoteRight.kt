package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.QuoteRight: ImageVector
    get() {
        if (_quoteRight != null) {
            return _quoteRight!!
        }
        _quoteRight = Builder(name = "QuoteRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 7.9994f)
                    verticalLineTo(13.9994f)
                    horizontalLineTo(7.91f)
                    curveTo(7.6727f, 15.3959f, 6.9495f, 16.6637f, 5.868f, 17.5786f)
                    curveTo(4.7866f, 18.4935f, 3.4165f, 18.9968f, 2.0f, 18.9994f)
                    verticalLineTo(20.9994f)
                    curveTo(4.121f, 20.997f, 6.1544f, 20.1534f, 7.6542f, 18.6536f)
                    curveTo(9.154f, 17.1538f, 9.9976f, 15.1204f, 10.0f, 12.9994f)
                    verticalLineTo(3.9994f)
                    horizontalLineTo(4.0f)
                    curveTo(2.9391f, 3.9994f, 1.9217f, 4.4208f, 1.1716f, 5.171f)
                    curveTo(0.4214f, 5.9211f, 0.0f, 6.9385f, 0.0f, 7.9994f)
                    horizontalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0002f, 3.9994f)
                    curveTo(16.9393f, 3.9994f, 15.9219f, 4.4208f, 15.1717f, 5.171f)
                    curveTo(14.4216f, 5.9211f, 14.0002f, 6.9385f, 14.0002f, 7.9994f)
                    verticalLineTo(13.9994f)
                    horizontalLineTo(21.9102f)
                    curveTo(21.6729f, 15.3959f, 20.9496f, 16.6637f, 19.8682f, 17.5786f)
                    curveTo(18.7867f, 18.4935f, 17.4167f, 18.9968f, 16.0002f, 18.9994f)
                    verticalLineTo(20.9994f)
                    curveTo(18.1212f, 20.997f, 20.1546f, 20.1534f, 21.6544f, 18.6536f)
                    curveTo(23.1542f, 17.1538f, 23.9978f, 15.1204f, 24.0002f, 12.9994f)
                    verticalLineTo(3.9994f)
                    horizontalLineTo(18.0002f)
                    close()
                }
            }
        }
        .build()
        return _quoteRight!!
    }

private var _quoteRight: ImageVector? = null

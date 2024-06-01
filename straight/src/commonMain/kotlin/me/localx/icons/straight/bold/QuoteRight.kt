package me.localx.icons.straight.bold

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

public val Icons.Bold.QuoteRight: ImageVector
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
                    horizontalLineTo(7.0f)
                    curveTo(6.9984f, 15.325f, 6.4711f, 16.5958f, 5.5338f, 17.5332f)
                    curveTo(4.5964f, 18.4705f, 3.3256f, 18.9978f, 2.0f, 18.9994f)
                    verticalLineTo(21.9994f)
                    curveTo(4.121f, 21.997f, 6.1544f, 21.1534f, 7.6542f, 19.6536f)
                    curveTo(9.154f, 18.1538f, 9.9976f, 16.1204f, 10.0f, 13.9994f)
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
                    moveTo(17.9999f, 3.9994f)
                    curveTo(16.939f, 3.9994f, 15.9216f, 4.4208f, 15.1715f, 5.171f)
                    curveTo(14.4213f, 5.9211f, 13.9999f, 6.9385f, 13.9999f, 7.9994f)
                    verticalLineTo(13.9994f)
                    horizontalLineTo(20.9999f)
                    curveTo(20.9983f, 15.325f, 20.471f, 16.5958f, 19.5337f, 17.5332f)
                    curveTo(18.5963f, 18.4705f, 17.3255f, 18.9978f, 15.9999f, 18.9994f)
                    verticalLineTo(21.9994f)
                    curveTo(18.1209f, 21.997f, 20.1543f, 21.1534f, 21.6541f, 19.6536f)
                    curveTo(23.1539f, 18.1538f, 23.9975f, 16.1204f, 23.9999f, 13.9994f)
                    verticalLineTo(3.9994f)
                    horizontalLineTo(17.9999f)
                    close()
                }
            }
        }
        .build()
        return _quoteRight!!
    }

private var _quoteRight: ImageVector? = null

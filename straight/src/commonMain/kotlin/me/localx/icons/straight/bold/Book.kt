package me.localx.icons.straight.bold

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

public val Icons.Bold.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0001f, 0.0f)
                    horizontalLineTo(5.0001f)
                    curveTo(4.2045f, 0.0f, 3.4414f, 0.3161f, 2.8788f, 0.8787f)
                    curveTo(2.3162f, 1.4413f, 2.0001f, 2.2043f, 2.0001f, 3.0f)
                    verticalLineTo(19.5f)
                    curveTo(2.0015f, 20.6931f, 2.476f, 21.8369f, 3.3196f, 22.6805f)
                    curveTo(4.1632f, 23.5241f, 5.3071f, 23.9987f, 6.5001f, 24.0f)
                    horizontalLineTo(22.0001f)
                    verticalLineTo(2.0f)
                    curveTo(22.0001f, 1.4696f, 21.7894f, 0.9609f, 21.4143f, 0.5858f)
                    curveTo(21.0393f, 0.2107f, 20.5306f, 0.0f, 20.0001f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(8.0001f, 3.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(6.5001f)
                    curveTo(5.9879f, 15.0049f, 5.4805f, 15.0983f, 5.0001f, 15.276f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(8.0001f)
                    close()
                    moveTo(19.0001f, 21.0f)
                    horizontalLineTo(6.5001f)
                    curveTo(6.1023f, 21.0f, 5.7208f, 20.842f, 5.4395f, 20.5607f)
                    curveTo(5.1582f, 20.2794f, 5.0001f, 19.8978f, 5.0001f, 19.5f)
                    curveTo(5.0001f, 19.1022f, 5.1582f, 18.7206f, 5.4395f, 18.4393f)
                    curveTo(5.7208f, 18.158f, 6.1023f, 18.0f, 6.5001f, 18.0f)
                    horizontalLineTo(19.0001f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(11.0001f, 15.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(19.0001f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(11.0001f)
                    close()
                }
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null

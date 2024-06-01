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

public val Icons.Bold.ToolMarquee: ImageVector
    get() {
        if (_toolMarquee != null) {
            return _toolMarquee!!
        }
        _toolMarquee = Builder(name = "ToolMarquee", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(24.0f, 3.5f)
                    curveTo(24.0f, 2.5717f, 23.6313f, 1.6815f, 22.9749f, 1.0251f)
                    curveTo(22.3185f, 0.3687f, 21.4283f, 0.0f, 20.5f, 0.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.632f, 3.0018f, 20.7582f, 3.0551f, 20.8516f, 3.1484f)
                    curveTo(20.9449f, 3.2418f, 20.9982f, 3.368f, 21.0f, 3.5f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.5f)
                    close()
                    moveTo(24.0f, 9.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(6.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(3.0f, 3.5f)
                    curveTo(3.0f, 3.3674f, 3.0527f, 3.2402f, 3.1465f, 3.1465f)
                    curveTo(3.2402f, 3.0527f, 3.3674f, 3.0f, 3.5f, 3.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 0.0f, 1.6815f, 0.3687f, 1.0251f, 1.0251f)
                    curveTo(0.3687f, 1.6815f, 0.0f, 2.5717f, 0.0f, 3.5f)
                    lineTo(0.0f, 6.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.5f)
                    close()
                    moveTo(3.0f, 9.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(15.0f, 0.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(15.068f, 21.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(15.068f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _toolMarquee!!
    }

private var _toolMarquee: ImageVector? = null

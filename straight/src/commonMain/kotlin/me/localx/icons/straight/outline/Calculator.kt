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

public val Icons.Outline.Calculator: ImageVector
    get() {
        if (_calculator != null) {
            return _calculator!!
        }
        _calculator = Builder(name = "Calculator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.9998f, 24.0f)
                    horizontalLineTo(22.9998f)
                    verticalLineTo(3.0f)
                    curveTo(22.9998f, 2.2043f, 22.6837f, 1.4413f, 22.1211f, 0.8787f)
                    curveTo(21.5585f, 0.3161f, 20.7955f, 0.0f, 19.9998f, 0.0f)
                    lineTo(3.9998f, 0.0f)
                    curveTo(3.2042f, 0.0f, 2.4411f, 0.3161f, 1.8785f, 0.8787f)
                    curveTo(1.3159f, 1.4413f, 0.9998f, 2.2043f, 0.9998f, 3.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(2.9998f, 3.0f)
                    curveTo(2.9998f, 2.7348f, 3.1052f, 2.4804f, 3.2927f, 2.2929f)
                    curveTo(3.4802f, 2.1054f, 3.7346f, 2.0f, 3.9998f, 2.0f)
                    horizontalLineTo(19.9998f)
                    curveTo(20.265f, 2.0f, 20.5194f, 2.1054f, 20.7069f, 2.2929f)
                    curveTo(20.8945f, 2.4804f, 20.9998f, 2.7348f, 20.9998f, 3.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(2.9998f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(4.9998f, 10.0f)
                    horizontalLineTo(18.9998f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(4.9998f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(6.9998f, 6.0f)
                    horizontalLineTo(16.9998f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(6.9998f)
                    verticalLineTo(6.0f)
                    close()
                    moveTo(4.9998f, 13.0f)
                    horizontalLineTo(6.9998f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(4.9998f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(8.9998f, 13.0f)
                    horizontalLineTo(10.9998f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(8.9998f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(14.9998f, 13.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(12.9998f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(14.9998f)
                    close()
                    moveTo(4.9998f, 17.0f)
                    horizontalLineTo(6.9998f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(4.9998f)
                    verticalLineTo(17.0f)
                    close()
                    moveTo(8.9998f, 17.0f)
                    horizontalLineTo(10.9998f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(8.9998f)
                    verticalLineTo(17.0f)
                    close()
                    moveTo(16.9998f, 13.0f)
                    horizontalLineTo(18.9998f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(16.9998f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(12.9998f, 17.0f)
                    horizontalLineTo(18.9998f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(12.9998f)
                    verticalLineTo(17.0f)
                    close()
                }
            }
        }
        .build()
        return _calculator!!
    }

private var _calculator: ImageVector? = null

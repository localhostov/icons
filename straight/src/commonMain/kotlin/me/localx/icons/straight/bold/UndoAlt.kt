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

public val Icons.Bold.UndoAlt: ImageVector
    get() {
        if (_undoAlt != null) {
            return _undoAlt!!
        }
        _undoAlt = Builder(name = "UndoAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5f, 5.9996f)
                    horizontalLineTo(4.508f)
                    lineTo(7.958f, 2.5496f)
                    lineTo(5.837f, 0.4286f)
                    lineTo(0.887f, 5.3786f)
                    curveTo(0.3246f, 5.9412f, 0.0087f, 6.7042f, 0.0087f, 7.4996f)
                    curveTo(0.0087f, 8.2951f, 0.3246f, 9.0581f, 0.887f, 9.6206f)
                    lineTo(5.837f, 14.5706f)
                    lineTo(7.958f, 12.4496f)
                    lineTo(4.508f, 8.9996f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 8.9996f, 20.7598f, 9.0523f, 20.8536f, 9.1461f)
                    curveTo(20.9473f, 9.2399f, 21.0f, 9.367f, 21.0f, 9.4996f)
                    verticalLineTo(20.4996f)
                    curveTo(21.0f, 20.6322f, 20.9473f, 20.7594f, 20.8536f, 20.8532f)
                    curveTo(20.7598f, 20.9469f, 20.6326f, 20.9996f, 20.5f, 20.9996f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(23.9996f)
                    horizontalLineTo(20.5f)
                    curveTo(21.4283f, 23.9996f, 22.3185f, 23.6309f, 22.9749f, 22.9745f)
                    curveTo(23.6313f, 22.3181f, 24.0f, 21.4279f, 24.0f, 20.4996f)
                    verticalLineTo(9.4996f)
                    curveTo(24.0f, 8.5714f, 23.6313f, 7.6811f, 22.9749f, 7.0248f)
                    curveTo(22.3185f, 6.3684f, 21.4283f, 5.9996f, 20.5f, 5.9996f)
                    close()
                }
            }
        }
        .build()
        return _undoAlt!!
    }

private var _undoAlt: ImageVector? = null

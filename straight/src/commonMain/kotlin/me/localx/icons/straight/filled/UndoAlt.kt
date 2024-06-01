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

public val Icons.Filled.UndoAlt: ImageVector
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
                    moveTo(20.9002f, 7.0057f)
                    horizontalLineTo(2.7932f)
                    lineTo(7.1002f, 2.7007f)
                    lineTo(5.6822f, 1.2887f)
                    lineTo(0.7322f, 6.2377f)
                    curveTo(0.2635f, 6.7066f, 2.0E-4f, 7.3423f, 2.0E-4f, 8.0052f)
                    curveTo(2.0E-4f, 8.6681f, 0.2635f, 9.3039f, 0.7322f, 9.7727f)
                    lineTo(5.6822f, 14.7237f)
                    lineTo(7.1002f, 13.3097f)
                    lineTo(2.8002f, 9.0097f)
                    horizontalLineTo(20.9002f)
                    curveTo(21.1717f, 8.9915f, 21.4394f, 9.081f, 21.6453f, 9.2589f)
                    curveTo(21.8512f, 9.4367f, 21.9787f, 9.6885f, 22.0002f, 9.9597f)
                    verticalLineTo(21.0597f)
                    curveTo(21.9785f, 21.3308f, 21.8508f, 21.5823f, 21.645f, 21.76f)
                    curveTo(21.4391f, 21.9376f, 21.1715f, 22.027f, 20.9002f, 22.0087f)
                    horizontalLineTo(2.0002f)
                    verticalLineTo(24.0087f)
                    horizontalLineTo(20.9002f)
                    curveTo(21.7024f, 24.0273f, 22.4793f, 23.7269f, 23.0604f, 23.1735f)
                    curveTo(23.6415f, 22.6202f, 23.9795f, 21.8589f, 24.0002f, 21.0567f)
                    verticalLineTo(9.9557f)
                    curveTo(23.979f, 9.1539f, 23.6408f, 8.3932f, 23.0597f, 7.8402f)
                    curveTo(22.4787f, 7.2873f, 21.7021f, 6.9872f, 20.9002f, 7.0057f)
                    close()
                }
            }
        }
        .build()
        return _undoAlt!!
    }

private var _undoAlt: ImageVector? = null

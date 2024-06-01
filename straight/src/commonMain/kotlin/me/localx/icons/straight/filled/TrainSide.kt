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

public val Icons.Filled.TrainSide: ImageVector
    get() {
        if (_trainSide != null) {
            return _trainSide!!
        }
        _trainSide = Builder(name = "TrainSide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 22.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0006f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(22.0006f)
                    close()
                    moveTo(0.0f, 8.0006f)
                    verticalLineTo(17.0006f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(16.0006f)
                    curveTo(24.001f, 13.1374f, 23.1185f, 10.3437f, 21.473f, 8.0006f)
                    horizontalLineTo(0.0f)
                    close()
                    moveTo(6.0f, 6.0006f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(2.0006f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(6.0006f)
                    close()
                    moveTo(12.0f, 6.0006f)
                    horizontalLineTo(19.779f)
                    curveTo(17.6597f, 3.9268f, 14.9351f, 2.5818f, 12.0f, 2.1606f)
                    verticalLineTo(6.0006f)
                    close()
                    moveTo(4.0f, 6.0006f)
                    verticalLineTo(2.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.0006f)
                    horizontalLineTo(4.0f)
                    close()
                }
            }
        }
        .build()
        return _trainSide!!
    }

private var _trainSide: ImageVector? = null

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

public val Icons.Bold.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5f, 0.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 0.0f, 1.6815f, 0.3687f, 1.0251f, 1.0251f)
                    curveTo(0.3687f, 1.6815f, 0.0f, 2.5717f, 0.0f, 3.5f)
                    lineTo(0.0f, 12.5f)
                    curveTo(0.0019f, 13.9581f, 0.5819f, 15.356f, 1.613f, 16.387f)
                    curveTo(2.644f, 17.4181f, 4.0419f, 17.9981f, 5.5f, 18.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9581f, 17.9981f, 21.356f, 17.4181f, 22.387f, 16.387f)
                    curveTo(23.4181f, 15.356f, 23.9981f, 13.9581f, 24.0f, 12.5f)
                    verticalLineTo(3.5f)
                    curveTo(24.0f, 2.5717f, 23.6313f, 1.6815f, 22.9749f, 1.0251f)
                    curveTo(22.3185f, 0.3687f, 21.4283f, 0.0f, 20.5f, 0.0f)
                    close()
                    moveTo(3.5f, 3.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 3.0f, 20.7598f, 3.0527f, 20.8536f, 3.1465f)
                    curveTo(20.9473f, 3.2402f, 21.0f, 3.3674f, 21.0f, 3.5f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.5f)
                    curveTo(3.0f, 3.3674f, 3.0527f, 3.2402f, 3.1465f, 3.1465f)
                    curveTo(3.2402f, 3.0527f, 3.3674f, 3.0f, 3.5f, 3.0f)
                    close()
                    moveTo(18.5f, 15.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.9239f, 14.9999f, 4.3654f, 14.8008f, 3.9192f, 14.4363f)
                    curveTo(3.4729f, 14.0719f, 3.1662f, 13.5645f, 3.051f, 13.0f)
                    horizontalLineTo(20.951f)
                    curveTo(20.8357f, 13.5649f, 20.5287f, 14.0725f, 20.0821f, 14.437f)
                    curveTo(19.6354f, 14.8014f, 19.0765f, 15.0003f, 18.5f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null

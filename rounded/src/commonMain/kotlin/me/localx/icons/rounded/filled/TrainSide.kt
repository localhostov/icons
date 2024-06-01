package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

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
                    moveTo(23.0f, 22.0006f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 22.0006f, 0.4804f, 21.8953f, 0.2929f, 21.7077f)
                    curveTo(0.1054f, 21.5202f, 0.0f, 21.2658f, 0.0f, 21.0006f)
                    curveTo(0.0f, 20.7354f, 0.1054f, 20.481f, 0.2929f, 20.2935f)
                    curveTo(0.4804f, 20.106f, 0.7348f, 20.0006f, 1.0f, 20.0006f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 20.0006f, 23.5196f, 20.106f, 23.7071f, 20.2935f)
                    curveTo(23.8946f, 20.481f, 24.0f, 20.7354f, 24.0f, 21.0006f)
                    curveTo(24.0f, 21.2658f, 23.8946f, 21.5202f, 23.7071f, 21.7077f)
                    curveTo(23.5196f, 21.8953f, 23.2652f, 22.0006f, 23.0f, 22.0006f)
                    close()
                    moveTo(12.0f, 2.0946f)
                    verticalLineTo(6.0006f)
                    horizontalLineTo(20.267f)
                    curveTo(18.0295f, 3.8053f, 15.1167f, 2.4291f, 12.0f, 2.0946f)
                    close()
                    moveTo(6.0f, 2.0006f)
                    verticalLineTo(6.0006f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(2.0006f)
                    horizontalLineTo(6.0f)
                    close()
                    moveTo(21.949f, 8.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0006f)
                    curveTo(0.0f, 16.2658f, 0.1054f, 16.5202f, 0.2929f, 16.7077f)
                    curveTo(0.4804f, 16.8953f, 0.7348f, 17.0006f, 1.0f, 17.0006f)
                    horizontalLineTo(19.99f)
                    curveTo(20.618f, 17.0017f, 21.2375f, 16.8549f, 21.7982f, 16.5721f)
                    curveTo(22.359f, 16.2894f, 22.8452f, 15.8785f, 23.2177f, 15.3728f)
                    curveTo(23.5901f, 14.8672f, 23.8383f, 14.2809f, 23.9421f, 13.6615f)
                    curveTo(24.0458f, 13.0422f, 24.0023f, 12.407f, 23.815f, 11.8076f)
                    curveTo(23.3892f, 10.4515f, 22.76f, 9.1679f, 21.949f, 8.0006f)
                    close()
                    moveTo(4.0f, 6.0006f)
                    verticalLineTo(2.0006f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 2.0006f, 0.4804f, 2.106f, 0.2929f, 2.2935f)
                    curveTo(0.1054f, 2.481f, 0.0f, 2.7354f, 0.0f, 3.0006f)
                    lineTo(0.0f, 6.0006f)
                    horizontalLineTo(4.0f)
                    close()
                }
            }
        }
        .build()
        return _trainSide!!
    }

private var _trainSide: ImageVector? = null

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

public val Icons.Outline.Book: ImageVector
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
                    verticalLineTo(21.0f)
                    curveTo(2.0001f, 21.7956f, 2.3162f, 22.5587f, 2.8788f, 23.1213f)
                    curveTo(3.4414f, 23.6839f, 4.2045f, 24.0f, 5.0001f, 24.0f)
                    horizontalLineTo(22.0001f)
                    verticalLineTo(2.0f)
                    curveTo(22.0001f, 1.4696f, 21.7894f, 0.9609f, 21.4143f, 0.5858f)
                    curveTo(21.0393f, 0.2107f, 20.5306f, 0.0f, 20.0001f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(20.0001f, 18.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(20.0001f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(5.0001f, 2.0f)
                    horizontalLineTo(6.0001f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(5.0171f)
                    curveTo(4.6698f, 18.003f, 4.3257f, 18.0663f, 4.0001f, 18.187f)
                    verticalLineTo(3.0f)
                    curveTo(4.0001f, 2.7348f, 4.1055f, 2.4804f, 4.293f, 2.2929f)
                    curveTo(4.4805f, 2.1054f, 4.7349f, 2.0f, 5.0001f, 2.0f)
                    close()
                    moveTo(5.0001f, 22.0f)
                    curveTo(4.7363f, 22.0f, 4.4831f, 21.8958f, 4.2958f, 21.7099f)
                    curveTo(4.1085f, 21.5241f, 4.0022f, 21.2718f, 4.0001f, 21.008f)
                    horizontalLineTo(4.0151f)
                    curveTo(4.0141f, 20.876f, 4.0392f, 20.7451f, 4.0889f, 20.6229f)
                    curveTo(4.1387f, 20.5006f, 4.2122f, 20.3894f, 4.3052f, 20.2957f)
                    curveTo(4.3981f, 20.202f, 4.5087f, 20.1276f, 4.6306f, 20.0769f)
                    curveTo(4.7524f, 20.0261f, 4.8831f, 20.0f, 5.0151f, 20.0f)
                    horizontalLineTo(20.0001f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(5.0001f)
                    close()
                }
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null

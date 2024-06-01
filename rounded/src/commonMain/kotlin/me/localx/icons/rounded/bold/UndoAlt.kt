package me.localx.icons.rounded.bold

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
                    moveTo(7.6999f, 15.0077f)
                    curveTo(7.4186f, 15.2889f, 7.0371f, 15.4469f, 6.6394f, 15.4469f)
                    curveTo(6.2417f, 15.4469f, 5.8602f, 15.2889f, 5.5789f, 15.0077f)
                    lineTo(0.8579f, 10.2827f)
                    curveTo(0.3085f, 9.7329f, -1.0E-4f, 8.9874f, -1.0E-4f, 8.2102f)
                    curveTo(-1.0E-4f, 7.4329f, 0.3085f, 6.6875f, 0.8579f, 6.1377f)
                    lineTo(5.5829f, 1.4127f)
                    curveTo(5.8683f, 1.1533f, 6.2427f, 1.0138f, 6.6283f, 1.0232f)
                    curveTo(7.0138f, 1.0326f, 7.381f, 1.1901f, 7.6534f, 1.4631f)
                    curveTo(7.9259f, 1.7361f, 8.0827f, 2.1035f, 8.0914f, 2.4891f)
                    curveTo(8.1f, 2.8747f, 7.9598f, 3.2488f, 7.6999f, 3.5337f)
                    lineTo(4.4669f, 6.7007f)
                    horizontalLineTo(18.6799f)
                    curveTo(20.0903f, 6.702f, 21.4425f, 7.2628f, 22.4399f, 8.26f)
                    curveTo(23.4373f, 9.2572f, 23.9983f, 10.6093f, 23.9999f, 12.0197f)
                    verticalLineTo(18.7007f)
                    curveTo(23.9986f, 20.1107f, 23.4379f, 21.4626f, 22.4408f, 22.4596f)
                    curveTo(21.4438f, 23.4566f, 20.0919f, 24.0173f, 18.6819f, 24.0187f)
                    horizontalLineTo(5.3179f)
                    curveTo(4.9201f, 24.0187f, 4.5385f, 23.8606f, 4.2572f, 23.5793f)
                    curveTo(3.9759f, 23.298f, 3.8179f, 22.9165f, 3.8179f, 22.5187f)
                    curveTo(3.8179f, 22.1208f, 3.9759f, 21.7393f, 4.2572f, 21.458f)
                    curveTo(4.5385f, 21.1767f, 4.9201f, 21.0187f, 5.3179f, 21.0187f)
                    horizontalLineTo(18.6809f)
                    curveTo(19.2956f, 21.0181f, 19.885f, 20.7738f, 20.3197f, 20.3392f)
                    curveTo(20.7545f, 19.9047f, 20.9991f, 19.3154f, 20.9999f, 18.7007f)
                    verticalLineTo(12.0197f)
                    curveTo(20.9994f, 11.4046f, 20.7547f, 10.8149f, 20.3197f, 10.3801f)
                    curveTo(19.8848f, 9.9453f, 19.295f, 9.7009f, 18.6799f, 9.7007f)
                    horizontalLineTo(4.5219f)
                    lineTo(7.6999f, 12.8867f)
                    curveTo(7.9811f, 13.168f, 8.1391f, 13.5494f, 8.1391f, 13.9472f)
                    curveTo(8.1391f, 14.3449f, 7.9811f, 14.7264f, 7.6999f, 15.0077f)
                    close()
                }
            }
        }
        .build()
        return _undoAlt!!
    }

private var _undoAlt: ImageVector? = null

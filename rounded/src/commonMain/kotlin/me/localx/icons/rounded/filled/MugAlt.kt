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

public val Icons.Filled.MugAlt: ImageVector
    get() {
        if (_mugAlt != null) {
            return _mugAlt!!
        }
        _mugAlt = Builder(name = "MugAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 23.0f)
                    curveTo(19.0f, 23.2652f, 18.8946f, 23.5196f, 18.7071f, 23.7071f)
                    curveTo(18.5196f, 23.8947f, 18.2652f, 24.0f, 18.0f, 24.0f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 24.0f, 0.4804f, 23.8947f, 0.2929f, 23.7071f)
                    curveTo(0.1054f, 23.5196f, 0.0f, 23.2652f, 0.0f, 23.0f)
                    curveTo(0.0f, 22.7348f, 0.1054f, 22.4805f, 0.2929f, 22.2929f)
                    curveTo(0.4804f, 22.1054f, 0.7348f, 22.0f, 1.0f, 22.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.2652f, 22.0f, 18.5196f, 22.1054f, 18.7071f, 22.2929f)
                    curveTo(18.8946f, 22.4805f, 19.0f, 22.7348f, 19.0f, 23.0f)
                    close()
                    moveTo(24.0f, 8.0f)
                    curveTo(24.0f, 10.774f, 21.815f, 14.0f, 19.0f, 14.0f)
                    horizontalLineTo(17.388f)
                    lineTo(17.088f, 15.821f)
                    curveTo(16.8966f, 16.9908f, 16.2945f, 18.054f, 15.3899f, 18.8199f)
                    curveTo(14.4853f, 19.5858f, 13.3373f, 20.0042f, 12.152f, 20.0f)
                    horizontalLineTo(6.852f)
                    curveTo(5.6674f, 20.0032f, 4.5204f, 19.5844f, 3.6166f, 18.8186f)
                    curveTo(2.7128f, 18.0528f, 2.1113f, 16.9901f, 1.92f, 15.821f)
                    lineTo(0.056f, 4.657f)
                    curveTo(-0.0394f, 4.0842f, -0.0089f, 3.4974f, 0.1454f, 2.9376f)
                    curveTo(0.2996f, 2.3777f, 0.5739f, 1.8581f, 0.9492f, 1.4149f)
                    curveTo(1.3246f, 0.9718f, 1.7919f, 0.6156f, 2.3187f, 0.3713f)
                    curveTo(2.8455f, 0.127f, 3.4193f, 3.0E-4f, 4.0f, 0.0f)
                    horizontalLineTo(15.0f)
                    curveTo(15.525f, -0.002f, 16.0453f, 0.1002f, 16.5305f, 0.3008f)
                    curveTo(17.0158f, 0.5013f, 17.4564f, 0.7961f, 17.8269f, 1.1682f)
                    curveTo(18.1974f, 1.5402f, 18.4903f, 1.9821f, 18.6888f, 2.4682f)
                    curveTo(18.8872f, 2.9543f, 18.9872f, 3.475f, 18.983f, 4.0f)
                    horizontalLineTo(19.0f)
                    curveTo(22.131f, 4.0f, 24.0f, 5.5f, 24.0f, 8.0f)
                    close()
                    moveTo(22.0f, 8.0f)
                    curveTo(22.0f, 7.5f, 22.0f, 6.0f, 19.0f, 6.0f)
                    horizontalLineTo(18.721f)
                    lineTo(17.721f, 12.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.545f, 12.0f, 22.0f, 9.746f, 22.0f, 8.0f)
                    close()
                }
            }
        }
        .build()
        return _mugAlt!!
    }

private var _mugAlt: ImageVector? = null

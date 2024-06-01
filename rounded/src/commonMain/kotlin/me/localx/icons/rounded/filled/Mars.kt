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

public val Icons.Filled.Mars: ImageVector
    get() {
        if (_mars != null) {
            return _mars!!
        }
        _mars = Builder(name = "Mars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.9995f, 0.0f)
                    horizontalLineTo(16.0107f)
                    curveTo(15.4597f, 0.0f, 15.013f, 0.4467f, 15.013f, 0.9977f)
                    curveTo(15.013f, 1.5488f, 15.4597f, 1.9955f, 16.0107f, 1.9955f)
                    horizontalLineTo(20.5864f)
                    lineTo(13.7698f, 8.8121f)
                    curveTo(10.0806f, 5.9021f, 4.731f, 6.5337f, 1.821f, 10.2229f)
                    curveTo(-1.089f, 13.912f, -0.4573f, 19.2617f, 3.2318f, 22.1717f)
                    curveTo(6.921f, 25.0817f, 12.2706f, 24.45f, 15.1806f, 20.7609f)
                    curveTo(17.6179f, 17.671f, 17.6179f, 13.3128f, 15.1806f, 10.2229f)
                    lineTo(21.9972f, 3.4063f)
                    verticalLineTo(7.982f)
                    curveTo(21.9972f, 8.533f, 22.4439f, 8.9797f, 22.9949f, 8.9797f)
                    curveTo(23.546f, 8.9797f, 23.9927f, 8.533f, 23.9927f, 7.982f)
                    verticalLineTo(2.9932f)
                    curveTo(23.9927f, 1.3401f, 22.6526f, 0.0f, 20.9995f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null

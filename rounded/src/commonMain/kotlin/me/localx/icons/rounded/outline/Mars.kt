package me.localx.icons.rounded.outline

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

public val Icons.Outline.Mars: ImageVector
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
                    moveTo(21.0117f, 0.0f)
                    horizontalLineTo(16.0312f)
                    curveTo(15.4811f, 0.0f, 15.0351f, 0.4467f, 15.0351f, 0.9977f)
                    curveTo(15.0351f, 1.5488f, 15.4811f, 1.9955f, 16.0312f, 1.9955f)
                    horizontalLineTo(20.5993f)
                    lineTo(13.7939f, 8.8121f)
                    curveTo(10.1109f, 5.9021f, 4.77f, 6.5337f, 1.8648f, 10.2229f)
                    curveTo(-1.0404f, 13.912f, -0.4098f, 19.2617f, 3.2733f, 22.1717f)
                    curveTo(6.9563f, 25.0817f, 12.2972f, 24.45f, 15.2024f, 20.7609f)
                    curveTo(17.6357f, 17.671f, 17.6357f, 13.3128f, 15.2024f, 10.2229f)
                    lineTo(22.0078f, 3.4063f)
                    verticalLineTo(7.982f)
                    curveTo(22.0078f, 8.533f, 22.4538f, 8.9797f, 23.0039f, 8.9797f)
                    curveTo(23.554f, 8.9797f, 24.0f, 8.533f, 24.0f, 7.982f)
                    verticalLineTo(2.9932f)
                    curveTo(24.0f, 1.3401f, 22.6621f, 0.0f, 21.0117f, 0.0f)
                    close()
                    moveTo(8.5604f, 21.9504f)
                    curveTo(4.9845f, 21.9504f, 2.0857f, 19.0468f, 2.0857f, 15.465f)
                    curveTo(2.0857f, 11.8833f, 4.9845f, 8.9797f, 8.5604f, 8.9797f)
                    curveTo(12.1362f, 8.9797f, 15.035f, 11.8833f, 15.035f, 15.465f)
                    curveTo(15.0307f, 19.045f, 12.1344f, 21.946f, 8.5604f, 21.9504f)
                    close()
                }
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null

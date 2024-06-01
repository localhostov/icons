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
                    moveTo(21.997f, 0.0f)
                    horizontalLineTo(16.0105f)
                    verticalLineTo(1.9955f)
                    horizontalLineTo(20.5862f)
                    lineTo(13.7696f, 8.8121f)
                    curveTo(10.0804f, 5.9021f, 4.7307f, 6.5337f, 1.8207f, 10.2229f)
                    curveTo(-1.0893f, 13.912f, -0.4576f, 19.2617f, 3.2316f, 22.1717f)
                    curveTo(6.9207f, 25.0817f, 12.2704f, 24.45f, 15.1804f, 20.7609f)
                    curveTo(17.6177f, 17.671f, 17.6177f, 13.3128f, 15.1804f, 10.2229f)
                    lineTo(21.997f, 3.4063f)
                    verticalLineTo(7.982f)
                    horizontalLineTo(23.9924f)
                    verticalLineTo(1.9955f)
                    curveTo(23.9924f, 0.8934f, 23.099f, 0.0f, 21.997f, 0.0f)
                    close()
                    moveTo(8.5274f, 21.9504f)
                    curveTo(4.9457f, 21.9504f, 2.0421f, 19.0468f, 2.0421f, 15.465f)
                    curveTo(2.0421f, 11.8833f, 4.9457f, 8.9797f, 8.5274f, 8.9797f)
                    curveTo(12.1092f, 8.9797f, 15.0128f, 11.8833f, 15.0128f, 15.465f)
                    curveTo(15.0084f, 19.045f, 12.1074f, 21.946f, 8.5274f, 21.9504f)
                    close()
                }
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null

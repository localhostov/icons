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

public val Icons.Outline.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 1.9992f)
                    horizontalLineTo(16.46f)
                    curveTo(15.8997f, 1.3701f, 15.2126f, 0.8668f, 14.4439f, 0.5221f)
                    curveTo(13.6753f, 0.1774f, 12.8424f, -8.0E-4f, 12.0f, -8.0E-4f)
                    curveTo(11.1576f, -8.0E-4f, 10.3247f, 0.1774f, 9.5561f, 0.5221f)
                    curveTo(8.7874f, 0.8668f, 8.1003f, 1.3701f, 7.54f, 1.9992f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 1.9992f, 1.4413f, 2.3152f, 0.8787f, 2.8778f)
                    curveTo(0.3161f, 3.4404f, 0.0f, 4.2035f, 0.0f, 4.9992f)
                    lineTo(0.0f, 23.9992f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(4.9992f)
                    curveTo(24.0f, 4.2035f, 23.6839f, 3.4404f, 23.1213f, 2.8778f)
                    curveTo(22.5587f, 2.3152f, 21.7956f, 1.9992f, 21.0f, 1.9992f)
                    close()
                    moveTo(12.0f, 1.9992f)
                    curveTo(13.0609f, 1.9992f, 14.0783f, 2.4206f, 14.8284f, 3.1707f)
                    curveTo(15.5786f, 3.9209f, 16.0f, 4.9383f, 16.0f, 5.9992f)
                    verticalLineTo(6.9992f)
                    horizontalLineTo(12.618f)
                    lineTo(13.9f, 4.4462f)
                    lineTo(12.11f, 3.5522f)
                    lineTo(10.382f, 6.9992f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(5.9992f)
                    curveTo(8.0f, 4.9383f, 8.4214f, 3.9209f, 9.1716f, 3.1707f)
                    curveTo(9.9217f, 2.4206f, 10.9391f, 1.9992f, 12.0f, 1.9992f)
                    close()
                    moveTo(22.0f, 21.9992f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(4.9992f)
                    curveTo(2.0f, 4.7339f, 2.1054f, 4.4796f, 2.2929f, 4.292f)
                    curveTo(2.4804f, 4.1045f, 2.7348f, 3.9992f, 3.0f, 3.9992f)
                    horizontalLineTo(6.35f)
                    curveTo(6.1201f, 4.641f, 6.0017f, 5.3174f, 6.0f, 5.9992f)
                    verticalLineTo(8.9992f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(5.9992f)
                    curveTo(17.9983f, 5.3174f, 17.8799f, 4.641f, 17.65f, 3.9992f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 3.9992f, 21.5196f, 4.1045f, 21.7071f, 4.292f)
                    curveTo(21.8946f, 4.4796f, 22.0f, 4.7339f, 22.0f, 4.9992f)
                    verticalLineTo(21.9992f)
                    close()
                }
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null

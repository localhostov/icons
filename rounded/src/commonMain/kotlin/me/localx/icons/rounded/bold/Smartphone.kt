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

public val Icons.Bold.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }
        _smartphone = Builder(name = "Smartphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.5001f, 0.0f)
                    horizontalLineTo(9.5001f)
                    curveTo(8.0419f, 0.0016f, 6.6439f, 0.5816f, 5.6128f, 1.6127f)
                    curveTo(4.5817f, 2.6438f, 4.0017f, 4.0418f, 4.0001f, 5.5f)
                    verticalLineTo(18.5f)
                    curveTo(4.0017f, 19.9582f, 4.5817f, 21.3562f, 5.6128f, 22.3873f)
                    curveTo(6.6439f, 23.4184f, 8.0419f, 23.9984f, 9.5001f, 24.0f)
                    horizontalLineTo(14.5001f)
                    curveTo(15.9583f, 23.9984f, 17.3563f, 23.4184f, 18.3875f, 22.3873f)
                    curveTo(19.4186f, 21.3562f, 19.9985f, 19.9582f, 20.0001f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(19.9985f, 4.0418f, 19.4186f, 2.6438f, 18.3875f, 1.6127f)
                    curveTo(17.3563f, 0.5816f, 15.9583f, 0.0016f, 14.5001f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(9.5001f, 3.0f)
                    horizontalLineTo(14.5001f)
                    curveTo(15.1632f, 3.0f, 15.799f, 3.2634f, 16.2679f, 3.7322f)
                    curveTo(16.7367f, 4.2011f, 17.0001f, 4.837f, 17.0001f, 5.5f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(5.5f)
                    curveTo(7.0001f, 4.837f, 7.2635f, 4.2011f, 7.7324f, 3.7322f)
                    curveTo(8.2012f, 3.2634f, 8.8371f, 3.0f, 9.5001f, 3.0f)
                    close()
                    moveTo(12.0001f, 22.0f)
                    curveTo(11.7349f, 22.0f, 11.4806f, 21.8946f, 11.293f, 21.7071f)
                    curveTo(11.1055f, 21.5196f, 11.0001f, 21.2652f, 11.0001f, 21.0f)
                    curveTo(11.0001f, 20.7348f, 11.1055f, 20.4804f, 11.293f, 20.2929f)
                    curveTo(11.4806f, 20.1054f, 11.7349f, 20.0f, 12.0001f, 20.0f)
                    curveTo(12.2653f, 20.0f, 12.5197f, 20.1054f, 12.7072f, 20.2929f)
                    curveTo(12.8948f, 20.4804f, 13.0001f, 20.7348f, 13.0001f, 21.0f)
                    curveTo(13.0001f, 21.2652f, 12.8948f, 21.5196f, 12.7072f, 21.7071f)
                    curveTo(12.5197f, 21.8946f, 12.2653f, 22.0f, 12.0001f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _smartphone!!
    }

private var _smartphone: ImageVector? = null

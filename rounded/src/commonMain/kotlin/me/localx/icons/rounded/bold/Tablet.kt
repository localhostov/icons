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

public val Icons.Bold.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = Builder(name = "Tablet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.5001f, 0.0f)
                    horizontalLineTo(7.5001f)
                    curveTo(6.0419f, 0.0016f, 4.6439f, 0.5816f, 3.6128f, 1.6127f)
                    curveTo(2.5817f, 2.6438f, 2.0017f, 4.0418f, 2.0001f, 5.5f)
                    verticalLineTo(18.5f)
                    curveTo(2.0017f, 19.9582f, 2.5817f, 21.3562f, 3.6128f, 22.3873f)
                    curveTo(4.6439f, 23.4184f, 6.0419f, 23.9984f, 7.5001f, 24.0f)
                    horizontalLineTo(16.5001f)
                    curveTo(17.9583f, 23.9984f, 19.3563f, 23.4184f, 20.3875f, 22.3873f)
                    curveTo(21.4186f, 21.3562f, 21.9985f, 19.9582f, 22.0001f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(21.9985f, 4.0418f, 21.4186f, 2.6438f, 20.3875f, 1.6127f)
                    curveTo(19.3563f, 0.5816f, 17.9583f, 0.0016f, 16.5001f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(19.0001f, 18.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(19.0f)
                    curveTo(13.0001f, 19.2652f, 12.8948f, 19.5196f, 12.7072f, 19.7071f)
                    curveTo(12.5197f, 19.8946f, 12.2653f, 20.0f, 12.0001f, 20.0f)
                    curveTo(11.7349f, 20.0f, 11.4806f, 19.8946f, 11.293f, 19.7071f)
                    curveTo(11.1055f, 19.5196f, 11.0001f, 19.2652f, 11.0001f, 19.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(5.0001f)
                    verticalLineTo(5.5f)
                    curveTo(5.0001f, 4.837f, 5.2635f, 4.2011f, 5.7324f, 3.7322f)
                    curveTo(6.2012f, 3.2634f, 6.8371f, 3.0f, 7.5001f, 3.0f)
                    horizontalLineTo(16.5001f)
                    curveTo(17.1632f, 3.0f, 17.799f, 3.2634f, 18.2679f, 3.7322f)
                    curveTo(18.7367f, 4.2011f, 19.0001f, 4.837f, 19.0001f, 5.5f)
                    verticalLineTo(18.0f)
                    close()
                }
            }
        }
        .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null

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

public val Icons.Outline.RedoAlt: ImageVector
    get() {
        if (_redoAlt != null) {
            return _redoAlt!!
        }
        _redoAlt = Builder(name = "RedoAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.318f, 14.7177f)
                    lineTo(23.268f, 9.7677f)
                    curveTo(23.5002f, 9.5356f, 23.6844f, 9.26f, 23.8101f, 8.9566f)
                    curveTo(23.9358f, 8.6532f, 24.0005f, 8.3281f, 24.0005f, 7.9997f)
                    curveTo(24.0005f, 7.6714f, 23.9358f, 7.3462f, 23.8101f, 7.0429f)
                    curveTo(23.6844f, 6.7395f, 23.5002f, 6.4639f, 23.268f, 6.2317f)
                    lineTo(18.318f, 1.2817f)
                    lineTo(16.9f, 2.6997f)
                    lineTo(21.2f, 6.9997f)
                    horizontalLineTo(3.1f)
                    curveTo(2.2981f, 6.9812f, 1.5215f, 7.2813f, 0.9405f, 7.8342f)
                    curveTo(0.3594f, 8.3872f, 0.0212f, 9.1479f, 0.0f, 9.9497f)
                    lineTo(0.0f, 21.0497f)
                    curveTo(0.0212f, 21.8516f, 0.3594f, 22.6123f, 0.9405f, 23.1653f)
                    curveTo(1.5215f, 23.7182f, 2.2981f, 24.0183f, 3.1f, 23.9997f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(21.9997f)
                    horizontalLineTo(3.1f)
                    curveTo(2.8285f, 22.018f, 2.5608f, 21.9284f, 2.3549f, 21.7506f)
                    curveTo(2.149f, 21.5728f, 2.0215f, 21.321f, 2.0f, 21.0497f)
                    verticalLineTo(9.9497f)
                    curveTo(2.0215f, 9.6785f, 2.149f, 9.4267f, 2.3549f, 9.2489f)
                    curveTo(2.5608f, 9.071f, 2.8285f, 8.9815f, 3.1f, 8.9997f)
                    horizontalLineTo(21.207f)
                    lineTo(16.907f, 13.2997f)
                    lineTo(18.318f, 14.7177f)
                    close()
                }
            }
        }
        .build()
        return _redoAlt!!
    }

private var _redoAlt: ImageVector? = null

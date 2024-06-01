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

public val Icons.Filled.Italic: ImageVector
    get() {
        if (_italic != null) {
            return _italic!!
        }
        _italic = Builder(name = "Italic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 0.0f)
                    horizontalLineTo(7.0f)
                    curveTo(6.7348f, 0.0f, 6.4804f, 0.1054f, 6.2929f, 0.2929f)
                    curveTo(6.1054f, 0.4804f, 6.0f, 0.7348f, 6.0f, 1.0f)
                    curveTo(6.0f, 1.2652f, 6.1054f, 1.5196f, 6.2929f, 1.7071f)
                    curveTo(6.4804f, 1.8946f, 6.7348f, 2.0f, 7.0f, 2.0f)
                    horizontalLineTo(12.354f)
                    lineTo(9.627f, 22.0f)
                    horizontalLineTo(4.0f)
                    curveTo(3.7348f, 22.0f, 3.4804f, 22.1054f, 3.2929f, 22.2929f)
                    curveTo(3.1054f, 22.4804f, 3.0f, 22.7348f, 3.0f, 23.0f)
                    curveTo(3.0f, 23.2652f, 3.1054f, 23.5196f, 3.2929f, 23.7071f)
                    curveTo(3.4804f, 23.8946f, 3.7348f, 24.0f, 4.0f, 24.0f)
                    horizontalLineTo(17.0f)
                    curveTo(17.2652f, 24.0f, 17.5196f, 23.8946f, 17.7071f, 23.7071f)
                    curveTo(17.8946f, 23.5196f, 18.0f, 23.2652f, 18.0f, 23.0f)
                    curveTo(18.0f, 22.7348f, 17.8946f, 22.4804f, 17.7071f, 22.2929f)
                    curveTo(17.5196f, 22.1054f, 17.2652f, 22.0f, 17.0f, 22.0f)
                    horizontalLineTo(11.646f)
                    lineTo(14.373f, 2.0f)
                    horizontalLineTo(20.0f)
                    curveTo(20.2652f, 2.0f, 20.5196f, 1.8946f, 20.7071f, 1.7071f)
                    curveTo(20.8946f, 1.5196f, 21.0f, 1.2652f, 21.0f, 1.0f)
                    curveTo(21.0f, 0.7348f, 20.8946f, 0.4804f, 20.7071f, 0.2929f)
                    curveTo(20.5196f, 0.1054f, 20.2652f, 0.0f, 20.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _italic!!
    }

private var _italic: ImageVector? = null

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

public val Icons.Outline.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9998f, 24.0f)
                    lineTo(8.9998f, 19.5f)
                    verticalLineTo(14.38f)
                    lineTo(0.9998f, 5.38f)
                    verticalLineTo(3.0f)
                    curveTo(0.9998f, 2.2043f, 1.3159f, 1.4413f, 1.8785f, 0.8787f)
                    curveTo(2.4411f, 0.3161f, 3.2042f, 0.0f, 3.9998f, 0.0f)
                    lineTo(19.9998f, 0.0f)
                    curveTo(20.7955f, 0.0f, 21.5585f, 0.3161f, 22.1211f, 0.8787f)
                    curveTo(22.6837f, 1.4413f, 22.9998f, 2.2043f, 22.9998f, 3.0f)
                    verticalLineTo(5.38f)
                    lineTo(14.9998f, 14.38f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(10.9998f, 18.5f)
                    lineTo(12.9998f, 20.0f)
                    verticalLineTo(13.62f)
                    lineTo(20.9998f, 4.62f)
                    verticalLineTo(3.0f)
                    curveTo(20.9998f, 2.7348f, 20.8945f, 2.4804f, 20.7069f, 2.2929f)
                    curveTo(20.5194f, 2.1054f, 20.265f, 2.0f, 19.9998f, 2.0f)
                    horizontalLineTo(3.9998f)
                    curveTo(3.7346f, 2.0f, 3.4802f, 2.1054f, 3.2927f, 2.2929f)
                    curveTo(3.1052f, 2.4804f, 2.9998f, 2.7348f, 2.9998f, 3.0f)
                    verticalLineTo(4.62f)
                    lineTo(10.9998f, 13.62f)
                    verticalLineTo(18.5f)
                    close()
                }
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null

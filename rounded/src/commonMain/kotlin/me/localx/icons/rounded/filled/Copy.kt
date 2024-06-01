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

public val Icons.Filled.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 20.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 19.9984f, 2.4036f, 19.4711f, 1.4662f, 18.5338f)
                    curveTo(0.5289f, 17.5964f, 0.0016f, 16.3256f, 0.0f, 15.0f)
                    lineTo(0.0f, 5.0f)
                    curveTo(0.0016f, 3.6744f, 0.5289f, 2.4036f, 1.4662f, 1.4662f)
                    curveTo(2.4036f, 0.5289f, 3.6744f, 0.0016f, 5.0f, 0.0f)
                    lineTo(15.0f, 0.0f)
                    curveTo(16.3256f, 0.0016f, 17.5964f, 0.5289f, 18.5338f, 1.4662f)
                    curveTo(19.4711f, 2.4036f, 19.9984f, 3.6744f, 20.0f, 5.0f)
                    verticalLineTo(15.0f)
                    curveTo(19.9984f, 16.3256f, 19.4711f, 17.5964f, 18.5338f, 18.5338f)
                    curveTo(17.5964f, 19.4711f, 16.3256f, 19.9984f, 15.0f, 20.0f)
                    close()
                    moveTo(24.0f, 19.0f)
                    verticalLineTo(6.0f)
                    curveTo(24.0f, 5.7348f, 23.8946f, 5.4804f, 23.7071f, 5.2929f)
                    curveTo(23.5196f, 5.1054f, 23.2652f, 5.0f, 23.0f, 5.0f)
                    curveTo(22.7348f, 5.0f, 22.4804f, 5.1054f, 22.2929f, 5.2929f)
                    curveTo(22.1054f, 5.4804f, 22.0f, 5.7348f, 22.0f, 6.0f)
                    verticalLineTo(19.0f)
                    curveTo(22.0f, 19.7956f, 21.6839f, 20.5587f, 21.1213f, 21.1213f)
                    curveTo(20.5587f, 21.6839f, 19.7956f, 22.0f, 19.0f, 22.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.7348f, 22.0f, 5.4804f, 22.1054f, 5.2929f, 22.2929f)
                    curveTo(5.1054f, 22.4804f, 5.0f, 22.7348f, 5.0f, 23.0f)
                    curveTo(5.0f, 23.2652f, 5.1054f, 23.5196f, 5.2929f, 23.7071f)
                    curveTo(5.4804f, 23.8946f, 5.7348f, 24.0f, 6.0f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9984f, 21.5964f, 23.4711f, 22.5338f, 22.5338f)
                    curveTo(23.4711f, 21.5964f, 23.9984f, 20.3256f, 24.0f, 19.0f)
                    close()
                }
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null

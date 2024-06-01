package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Apps: ImageVector
    get() {
        if (_apps != null) {
            return _apps!!
        }
        _apps = Builder(name = "Apps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0f, 11.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.0f)
                    curveTo(0.0f, 2.2043f, 0.3161f, 1.4413f, 0.8787f, 0.8787f)
                    curveTo(1.4413f, 0.3161f, 2.2043f, 0.0f, 3.0f, 0.0f)
                    lineTo(11.0f, 0.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(2.0f, 9.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 2.0f, 2.4804f, 2.1054f, 2.2929f, 2.2929f)
                    curveTo(2.1054f, 2.4804f, 2.0f, 2.7348f, 2.0f, 3.0f)
                    verticalLineTo(9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9998f, 11.0f)
                    horizontalLineTo(12.9998f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(20.9998f)
                    curveTo(21.7955f, 0.0f, 22.5585f, 0.3161f, 23.1212f, 0.8787f)
                    curveTo(23.6838f, 1.4413f, 23.9998f, 2.2043f, 23.9998f, 3.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(14.9998f, 9.0f)
                    horizontalLineTo(21.9998f)
                    verticalLineTo(3.0f)
                    curveTo(21.9998f, 2.7348f, 21.8945f, 2.4804f, 21.7069f, 2.2929f)
                    curveTo(21.5194f, 2.1054f, 21.2651f, 2.0f, 20.9998f, 2.0f)
                    horizontalLineTo(14.9998f)
                    verticalLineTo(9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 24.0f, 1.4413f, 23.6839f, 0.8787f, 23.1213f)
                    curveTo(0.3161f, 22.5587f, 0.0f, 21.7956f, 0.0f, 21.0f)
                    lineTo(0.0f, 13.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(2.0f, 15.0f)
                    verticalLineTo(21.0f)
                    curveTo(2.0f, 21.2652f, 2.1054f, 21.5196f, 2.2929f, 21.7071f)
                    curveTo(2.4804f, 21.8946f, 2.7348f, 22.0f, 3.0f, 22.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.9998f, 24.0f)
                    horizontalLineTo(12.9998f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(23.9998f)
                    verticalLineTo(21.0f)
                    curveTo(23.9998f, 21.7956f, 23.6838f, 22.5587f, 23.1212f, 23.1213f)
                    curveTo(22.5585f, 23.6839f, 21.7955f, 24.0f, 20.9998f, 24.0f)
                    close()
                    moveTo(14.9998f, 22.0f)
                    horizontalLineTo(20.9998f)
                    curveTo(21.2651f, 22.0f, 21.5194f, 21.8946f, 21.7069f, 21.7071f)
                    curveTo(21.8945f, 21.5196f, 21.9998f, 21.2652f, 21.9998f, 21.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(14.9998f)
                    verticalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _apps!!
    }

private var _apps: ImageVector? = null

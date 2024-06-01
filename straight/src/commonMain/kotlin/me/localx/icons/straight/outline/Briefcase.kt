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

public val Icons.Outline.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 4.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(2.0f)
                    curveTo(18.0f, 1.4696f, 17.7893f, 0.9609f, 17.4142f, 0.5858f)
                    curveTo(17.0391f, 0.2107f, 16.5304f, 0.0f, 16.0f, 0.0f)
                    lineTo(8.0f, 0.0f)
                    curveTo(7.4696f, 0.0f, 6.9609f, 0.2107f, 6.5858f, 0.5858f)
                    curveTo(6.2107f, 0.9609f, 6.0f, 1.4696f, 6.0f, 2.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 4.0f, 1.4413f, 4.3161f, 0.8787f, 4.8787f)
                    curveTo(0.3161f, 5.4413f, 0.0f, 6.2043f, 0.0f, 7.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.0f)
                    curveTo(24.0f, 6.2043f, 23.6839f, 5.4413f, 23.1213f, 4.8787f)
                    curveTo(22.5587f, 4.3161f, 21.7956f, 4.0f, 21.0f, 4.0f)
                    close()
                    moveTo(8.0f, 2.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(2.0f)
                    close()
                    moveTo(3.0f, 6.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 6.0f, 21.5196f, 6.1054f, 21.7071f, 6.2929f)
                    curveTo(21.8946f, 6.4804f, 22.0f, 6.7348f, 22.0f, 7.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(7.0f)
                    curveTo(2.0f, 6.7348f, 2.1054f, 6.4804f, 2.2929f, 6.2929f)
                    curveTo(2.4804f, 6.1054f, 2.7348f, 6.0f, 3.0f, 6.0f)
                    close()
                    moveTo(2.0f, 22.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(2.0f)
                    close()
                }
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null

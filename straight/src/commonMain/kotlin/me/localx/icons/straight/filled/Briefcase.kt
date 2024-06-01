package me.localx.icons.straight.filled

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

public val Icons.Filled.Briefcase: ImageVector
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
                    moveTo(13.0f, 13.9999f)
                    verticalLineTo(15.9999f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(13.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(23.9998f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(13.9999f)
                    horizontalLineTo(13.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 12.0f)
                    verticalLineTo(7.0f)
                    curveTo(24.0f, 6.2043f, 23.6839f, 5.4413f, 23.1213f, 4.8787f)
                    curveTo(22.5587f, 4.3161f, 21.7956f, 4.0f, 21.0f, 4.0f)
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
                    lineTo(0.0f, 12.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(8.0f, 2.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(2.0f)
                    close()
                }
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null

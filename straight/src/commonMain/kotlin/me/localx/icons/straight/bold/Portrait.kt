package me.localx.icons.straight.bold

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

public val Icons.Bold.Portrait: ImageVector
    get() {
        if (_portrait != null) {
            return _portrait!!
        }
        _portrait = Builder(name = "Portrait", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(21.0f, 21.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(16.0f)
                    curveTo(18.0f, 15.4696f, 17.7893f, 14.9609f, 17.4142f, 14.5858f)
                    curveTo(17.0391f, 14.2107f, 16.5304f, 14.0f, 16.0f, 14.0f)
                    horizontalLineTo(8.0f)
                    curveTo(7.4696f, 14.0f, 6.9609f, 14.2107f, 6.5858f, 14.5858f)
                    curveTo(6.2107f, 14.9609f, 6.0f, 15.4696f, 6.0f, 16.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(21.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9998f, 12.0006f)
                    curveTo(13.9328f, 12.0006f, 15.4998f, 10.4336f, 15.4998f, 8.5006f)
                    curveTo(15.4998f, 6.5676f, 13.9328f, 5.0006f, 11.9998f, 5.0006f)
                    curveTo(10.0668f, 5.0006f, 8.4998f, 6.5676f, 8.4998f, 8.5006f)
                    curveTo(8.4998f, 10.4336f, 10.0668f, 12.0006f, 11.9998f, 12.0006f)
                    close()
                }
            }
        }
        .build()
        return _portrait!!
    }

private var _portrait: ImageVector? = null

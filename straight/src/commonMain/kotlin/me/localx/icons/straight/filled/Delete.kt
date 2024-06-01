package me.localx.icons.straight.filled

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

public val Icons.Filled.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 5.0001f)
                    curveTo(24.0f, 4.2045f, 23.6839f, 3.4414f, 23.1213f, 2.8788f)
                    curveTo(22.5587f, 2.3162f, 21.7956f, 2.0001f, 21.0f, 2.0001f)
                    horizontalLineTo(7.758f)
                    lineTo(0.0f, 12.0001f)
                    lineTo(7.758f, 22.0001f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 22.0001f, 22.5587f, 21.6841f, 23.1213f, 21.1214f)
                    curveTo(23.6839f, 20.5588f, 24.0f, 19.7958f, 24.0f, 19.0001f)
                    verticalLineTo(5.0001f)
                    close()
                    moveTo(17.959f, 14.5431f)
                    lineTo(16.545f, 15.9571f)
                    lineTo(14.0f, 13.4141f)
                    lineTo(11.457f, 15.9571f)
                    lineTo(10.043f, 14.5431f)
                    lineTo(12.586f, 12.0001f)
                    lineTo(10.043f, 9.4571f)
                    lineTo(11.457f, 8.0431f)
                    lineTo(14.0f, 10.5861f)
                    lineTo(16.543f, 8.0431f)
                    lineTo(17.957f, 9.4571f)
                    lineTo(15.414f, 12.0001f)
                    lineTo(17.959f, 14.5431f)
                    close()
                }
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null

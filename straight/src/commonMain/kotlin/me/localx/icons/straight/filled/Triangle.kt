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

public val Icons.Filled.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 21.0001f)
                    horizontalLineTo(0.0f)
                    lineTo(10.264f, 3.2231f)
                    curveTo(10.439f, 2.9172f, 10.6917f, 2.6629f, 10.9966f, 2.4861f)
                    curveTo(11.3014f, 2.3093f, 11.6476f, 2.2162f, 12.0f, 2.2162f)
                    curveTo(12.3524f, 2.2162f, 12.6986f, 2.3093f, 13.0034f, 2.4861f)
                    curveTo(13.3083f, 2.6629f, 13.561f, 2.9172f, 13.736f, 3.2231f)
                    lineTo(24.0f, 21.0001f)
                    close()
                }
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null

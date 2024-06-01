package me.localx.icons.rounded.bold

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

public val Icons.Bold.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = Builder(name = "Plus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.5f, 10.5f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(1.5f)
                    curveTo(13.5f, 0.6716f, 12.8284f, 0.0f, 12.0f, 0.0f)
                    curveTo(11.1716f, 0.0f, 10.5f, 0.6716f, 10.5f, 1.5f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(1.5f)
                    curveTo(0.6716f, 10.5f, 0.0f, 11.1716f, 0.0f, 12.0f)
                    curveTo(0.0f, 12.8284f, 0.6716f, 13.5f, 1.5f, 13.5f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(22.5f)
                    curveTo(10.5f, 23.3284f, 11.1716f, 24.0f, 12.0f, 24.0f)
                    curveTo(12.8284f, 24.0f, 13.5f, 23.3284f, 13.5f, 22.5f)
                    verticalLineTo(13.5f)
                    horizontalLineTo(22.5f)
                    curveTo(23.3284f, 13.5f, 24.0f, 12.8284f, 24.0f, 12.0f)
                    curveTo(24.0f, 11.1716f, 23.3284f, 10.5f, 22.5f, 10.5f)
                    close()
                }
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null

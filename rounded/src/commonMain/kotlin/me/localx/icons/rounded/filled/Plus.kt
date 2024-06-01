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

public val Icons.Filled.Plus: ImageVector
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
                    moveTo(23.0f, 11.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(1.0f)
                    curveTo(13.0f, 0.4477f, 12.5523f, 0.0f, 12.0f, 0.0f)
                    curveTo(11.4477f, 0.0f, 11.0f, 0.4477f, 11.0f, 1.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(1.0f)
                    curveTo(0.4477f, 11.0f, 0.0f, 11.4477f, 0.0f, 12.0f)
                    curveTo(0.0f, 12.5523f, 0.4477f, 13.0f, 1.0f, 13.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(23.0f)
                    curveTo(11.0f, 23.5522f, 11.4477f, 24.0f, 12.0f, 24.0f)
                    curveTo(12.5522f, 24.0f, 12.9999f, 23.5522f, 12.9999f, 23.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(22.9999f)
                    curveTo(23.5522f, 13.0f, 23.9999f, 12.5523f, 23.9999f, 12.0f)
                    curveTo(24.0f, 11.4477f, 23.5523f, 11.0f, 23.0f, 11.0f)
                    close()
                }
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null

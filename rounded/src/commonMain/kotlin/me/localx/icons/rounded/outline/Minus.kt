package me.localx.icons.rounded.outline

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

public val Icons.Outline.Minus: ImageVector
    get() {
        if (_minus != null) {
            return _minus!!
        }
        _minus = Builder(name = "Minus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 10.9997f)
                    horizontalLineTo(1.0f)
                    curveTo(0.4477f, 10.9997f, 0.0f, 11.4474f, 0.0f, 11.9997f)
                    curveTo(0.0f, 12.552f, 0.4477f, 12.9997f, 1.0f, 12.9997f)
                    horizontalLineTo(23.0f)
                    curveTo(23.5523f, 12.9997f, 24.0f, 12.552f, 24.0f, 11.9997f)
                    curveTo(24.0f, 11.4474f, 23.5523f, 10.9997f, 23.0f, 10.9997f)
                    close()
                }
            }
        }
        .build()
        return _minus!!
    }

private var _minus: ImageVector? = null

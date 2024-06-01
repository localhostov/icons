package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Minus: ImageVector
    get() {
        if (_minus != null) {
            return _minus!!
        }
        _minus = Builder(name = "Minus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 13.5f)
                horizontalLineTo(1.5f)
                curveTo(0.6716f, 13.5f, 0.0f, 12.8284f, 0.0f, 12.0f)
                curveTo(0.0f, 11.1716f, 0.6716f, 10.5f, 1.5f, 10.5f)
                horizontalLineTo(22.5f)
                curveTo(23.3284f, 10.5f, 24.0f, 11.1716f, 24.0f, 12.0f)
                curveTo(24.0f, 12.8284f, 23.3284f, 13.5f, 22.5f, 13.5f)
                close()
            }
        }
        .build()
        return _minus!!
    }

private var _minus: ImageVector? = null

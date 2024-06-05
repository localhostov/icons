package me.localx.icons.rounded.outline

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

public val Icons.Outline.Minus: ImageVector
    get() {
        if (_minus != null) {
            return _minus!!
        }
        _minus = Builder(name = "Minus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 11.0f)
                lineTo(23.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 24.0f, 12.0f)
                lineTo(24.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 13.0f)
                lineTo(1.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 11.0f)
                close()
            }
        }
        .build()
        return _minus!!
    }

private var _minus: ImageVector? = null

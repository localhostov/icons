package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Icicles: ImageVector
    get() {
        if (_icicles != null) {
            return _icicles!!
        }
        _icicles = Builder(name = "Icicles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.278f, 24.078f)
                lineToRelative(-3.242f, -12.082f)
                lineToRelative(-2.319f, 6.231f)
                lineTo(0.0f, 1.515f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(24.0f)
                lineToRelative(-0.011f, 1.664f)
                lineToRelative(-3.293f, 21.83f)
                lineToRelative(-3.561f, -12.099f)
                lineToRelative(-2.481f, 6.795f)
                lineToRelative(-2.611f, -6.637f)
                lineToRelative(-3.765f, 12.524f)
                close()
                moveTo(5.345f, 5.432f)
                lineToRelative(3.043f, 11.336f)
                lineToRelative(3.401f, -11.321f)
                lineToRelative(2.795f, 7.105f)
                lineToRelative(2.757f, -7.547f)
                lineToRelative(2.725f, 9.261f)
                lineToRelative(1.85f, -12.266f)
                horizontalLineTo(2.093f)
                lineToRelative(1.382f, 8.458f)
                lineToRelative(1.87f, -5.026f)
                close()
            }
        }
        .build()
        return _icicles!!
    }

private var _icicles: ImageVector? = null

package me.localx.icons.straight.bold

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

public val Icons.Bold.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(1.847f, 3.043f, 12.031f, -2.983f, 19.792f, 1.508f)
                lineTo(22.122f, 2.8f)
                lineTo(19.809f, 4.122f)
                arcToRelative(8.55f, 8.55f, 0.0f, false, false, 0.718f, 15.167f)
                lineToRelative(2.433f, 1.1f)
                lineToRelative(-2.2f, 1.508f)
                arcTo(11.921f, 11.921f, 0.0f, false, true, 14.0f, 24.0f)
                close()
                moveTo(14.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 2.848f, 17.529f)
                curveToRelative(-5.366f, -4.022f, -5.793f, -12.77f, -0.817f, -17.3f)
                arcTo(8.873f, 8.873f, 0.0f, false, false, 14.0f, 3.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null

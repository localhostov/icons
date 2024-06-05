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
                moveTo(15.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 19.058f, 0.71f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, true, 0.814f, 5.067f)
                curveToRelative(-5.1f, 3.92f, -5.088f, 8.539f, 0.0f, 12.446f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, true, -0.816f, 5.067f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 15.0f, 24.0f)
                close()
                moveTo(15.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 2.925f, 17.508f)
                curveToRelative(-6.511f, -5.065f, -6.489f, -11.969f, 0.0f, -17.016f)
                arcTo(9.322f, 9.322f, 0.0f, false, false, 15.0f, 3.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null

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

public val Icons.Bold.Tilde: ImageVector
    get() {
        if (_tilde != null) {
            return _tilde!!
        }
        _tilde = Builder(name = "Tilde", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.18f, 20.0f)
                curveToRelative(-2.878f, 0.0f, -5.311f, -1.956f, -6.675f, -5.366f)
                lineToRelative(-1.737f, -4.188f)
                curveToRelative(-0.519f, -1.298f, -1.709f, -3.446f, -3.922f, -3.446f)
                curveToRelative(-1.623f, 0.0f, -2.846f, 1.29f, -2.846f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.364f, 2.568f, -6.0f, 5.846f, -6.0f)
                curveToRelative(2.907f, 0.0f, 5.349f, 1.937f, 6.7f, 5.314f)
                lineToRelative(1.737f, 4.188f)
                curveToRelative(0.526f, 1.317f, 1.724f, 3.498f, 3.896f, 3.498f)
                curveToRelative(1.607f, 0.0f, 2.82f, -1.29f, 2.82f, -3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.364f, -2.557f, 6.0f, -5.82f, 6.0f)
                close()
            }
        }
        .build()
        return _tilde!!
    }

private var _tilde: ImageVector? = null

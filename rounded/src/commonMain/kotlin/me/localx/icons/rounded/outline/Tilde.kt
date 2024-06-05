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

public val Icons.Outline.Tilde: ImageVector
    get() {
        if (_tilde != null) {
            return _tilde!!
        }
        _tilde = Builder(name = "Tilde", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.474f, 20.0f)
                curveToRelative(-2.77f, 0.0f, -5.125f, -1.918f, -6.462f, -5.263f)
                lineToRelative(-1.832f, -4.801f)
                curveToRelative(-0.47f, -1.173f, -1.873f, -3.937f, -4.626f, -3.937f)
                curveToRelative(-1.993f, 0.0f, -3.553f, 1.631f, -3.553f, 3.714f)
                verticalLineToRelative(5.286f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-5.286f)
                curveToRelative(0.0f, -3.204f, 2.439f, -5.714f, 5.553f, -5.714f)
                curveToRelative(2.799f, 0.0f, 5.165f, 1.898f, 6.489f, 5.208f)
                lineToRelative(1.832f, 4.801f)
                curveToRelative(0.593f, 1.481f, 1.986f, 3.99f, 4.6f, 3.99f)
                curveToRelative(2.011f, 0.0f, 3.526f, -1.597f, 3.526f, -3.714f)
                verticalLineToRelative(-5.286f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(5.286f)
                curveToRelative(0.0f, 3.204f, -2.428f, 5.714f, -5.526f, 5.714f)
                close()
            }
        }
        .build()
        return _tilde!!
    }

private var _tilde: ImageVector? = null

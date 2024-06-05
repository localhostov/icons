package me.localx.icons.rounded.filled

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

public val Icons.Filled.Custard: ImageVector
    get() {
        if (_custard != null) {
            return _custard!!
        }
        _custard = Builder(name = "Custard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.967f, 5.0f)
                curveToRelative(0.475f, -2.319f, 2.508f, -4.0f, 4.888f, -4.0f)
                horizontalLineToRelative(6.288f)
                curveToRelative(2.38f, 0.0f, 4.414f, 1.681f, 4.889f, 4.0f)
                horizontalLineToRelative(-3.532f)
                curveToRelative(-0.979f, 0.0f, -1.864f, 0.403f, -2.5f, 1.053f)
                curveToRelative(-0.636f, -0.649f, -1.521f, -1.053f, -2.5f, -1.053f)
                reflectiveCurveToRelative(-1.864f, 0.403f, -2.5f, 1.053f)
                curveToRelative(-0.636f, -0.649f, -1.521f, -1.053f, -2.5f, -1.053f)
                horizontalLineToRelative(-2.533f)
                close()
                moveTo(24.0f, 19.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.278f)
                curveToRelative(-0.626f, 1.758f, -2.307f, 3.0f, -4.222f, 3.0f)
                lineTo(5.5f, 23.0f)
                curveToRelative(-1.914f, 0.0f, -3.595f, -1.242f, -4.222f, -3.0f)
                horizontalLineToRelative(-0.278f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(21.985f, 16.0f)
                lineToRelative(-1.588f, -9.0f)
                horizontalLineToRelative(-3.898f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.898f)
                lineToRelative(-1.588f, 9.0f)
                horizontalLineToRelative(19.972f)
                close()
            }
        }
        .build()
        return _custard!!
    }

private var _custard: ImageVector? = null

package me.localx.icons.straight.filled

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

public val Icons.Filled.ExitAlt: ImageVector
    get() {
        if (_exitAlt != null) {
            return _exitAlt!!
        }
        _exitAlt = Builder(name = "ExitAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 21.0f)
                lineToRelative(-0.402f, -0.976f)
                lineToRelative(0.914f, -0.648f)
                curveToRelative(0.316f, -0.204f, 0.598f, -0.441f, 0.856f, -0.697f)
                lineToRelative(0.132f, 0.321f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(6.002f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineToRelative(-0.002f, 21.0f)
                horizontalLineToRelative(8.022f)
                verticalLineToRelative(-4.975f)
                lineToRelative(2.832f, -2.306f)
                lineToRelative(-1.667f, -3.615f)
                lineToRelative(-1.087f, 1.895f)
                horizontalLineToRelative(-5.102f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.943f)
                lineToRelative(1.729f, -2.977f)
                curveToRelative(0.57f, -0.65f, 1.393f, -1.023f, 2.257f, -1.023f)
                horizontalLineToRelative(4.709f)
                lineToRelative(1.885f, 4.081f)
                lineToRelative(-1.815f, 0.838f)
                lineToRelative(-1.349f, -2.919f)
                horizontalLineToRelative(-1.989f)
                lineToRelative(1.432f, 3.106f)
                curveToRelative(0.562f, 1.368f, 0.092f, 2.888f, -1.099f, 3.677f)
                lineToRelative(-2.683f, 2.191f)
                verticalLineToRelative(4.025f)
                horizontalLineToRelative(8.978f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(11.5f, 8.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _exitAlt!!
    }

private var _exitAlt: ImageVector? = null

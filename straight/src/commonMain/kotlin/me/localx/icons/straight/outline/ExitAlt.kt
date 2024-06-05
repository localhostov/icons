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

public val Icons.Outline.ExitAlt: ImageVector
    get() {
        if (_exitAlt != null) {
            return _exitAlt!!
        }
        _exitAlt = Builder(name = "ExitAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 3.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(16.804f, 14.106f)
                lineToRelative(-1.432f, -3.106f)
                horizontalLineToRelative(1.989f)
                lineToRelative(1.349f, 2.919f)
                lineToRelative(1.815f, -0.838f)
                lineToRelative(-1.885f, -4.081f)
                horizontalLineToRelative(-4.709f)
                curveToRelative(-0.865f, 0.0f, -1.688f, 0.373f, -2.257f, 1.023f)
                lineToRelative(-1.729f, 2.977f)
                horizontalLineToRelative(-3.943f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.102f)
                lineToRelative(1.087f, -1.895f)
                lineToRelative(1.667f, 3.615f)
                lineToRelative(-2.832f, 2.306f)
                verticalLineToRelative(4.975f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.025f)
                lineToRelative(2.683f, -2.191f)
                curveToRelative(1.191f, -0.789f, 1.661f, -2.309f, 1.099f, -3.677f)
                close()
                moveTo(18.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(4.002f, 0.0f)
                curveTo(2.348f, 0.0f, 1.002f, 1.346f, 1.002f, 3.0f)
                lineToRelative(-0.002f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.002f, -21.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.998f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineToRelative(-0.132f, -0.321f)
                curveToRelative(-0.258f, 0.256f, -0.54f, 0.493f, -0.856f, 0.697f)
                lineToRelative(-0.914f, 0.648f)
                lineToRelative(0.402f, 0.976f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _exitAlt!!
    }

private var _exitAlt: ImageVector? = null

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

public val Icons.Outline.CircleQuartersAlt: ImageVector
    get() {
        if (_circleQuartersAlt != null) {
            return _circleQuartersAlt!!
        }
        _circleQuartersAlt = Builder(name = "CircleQuartersAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(2.398f, 0.0f, 4.601f, 0.849f, 6.325f, 2.261f)
                lineToRelative(-6.325f, 6.325f)
                lineToRelative(-6.325f, -6.325f)
                curveToRelative(1.725f, -1.412f, 3.928f, -2.261f, 6.325f, -2.261f)
                close()
                moveTo(2.0f, 12.0f)
                curveToRelative(0.0f, -2.398f, 0.849f, -4.601f, 2.261f, -6.325f)
                lineToRelative(6.325f, 6.325f)
                lineToRelative(-6.325f, 6.325f)
                curveToRelative(-1.412f, -1.725f, -2.261f, -3.928f, -2.261f, -6.325f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-2.398f, 0.0f, -4.601f, -0.849f, -6.325f, -2.261f)
                lineToRelative(6.325f, -6.325f)
                lineToRelative(6.325f, 6.325f)
                curveToRelative(-1.725f, 1.412f, -3.928f, 2.261f, -6.325f, 2.261f)
                close()
                moveTo(19.739f, 18.325f)
                lineToRelative(-6.325f, -6.325f)
                lineToRelative(6.325f, -6.325f)
                curveToRelative(1.412f, 1.725f, 2.261f, 3.928f, 2.261f, 6.325f)
                reflectiveCurveToRelative(-0.849f, 4.601f, -2.261f, 6.325f)
                close()
            }
        }
        .build()
        return _circleQuartersAlt!!
    }

private var _circleQuartersAlt: ImageVector? = null

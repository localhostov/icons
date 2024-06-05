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

public val Icons.Bold.Mercury: ImageVector
    get() {
        if (_mercury != null) {
            return _mercury!!
        }
        _mercury = Builder(name = "Mercury", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 10.0f)
                curveToRelative(0.0f, -2.675f, -1.32f, -5.048f, -3.344f, -6.501f)
                curveToRelative(1.219f, -0.877f, 2.182f, -2.089f, 2.755f, -3.499f)
                horizontalLineToRelative(-3.437f)
                curveToRelative(-0.914f, 1.207f, -2.348f, 2.0f, -3.974f, 2.0f)
                reflectiveCurveToRelative(-3.061f, -0.793f, -3.974f, -2.0f)
                horizontalLineToRelative(-3.437f)
                curveToRelative(0.573f, 1.41f, 1.536f, 2.621f, 2.755f, 3.499f)
                curveToRelative(-2.023f, 1.453f, -3.344f, 3.826f, -3.344f, 6.501f)
                curveToRelative(0.0f, 3.898f, 2.803f, 7.154f, 6.5f, 7.858f)
                verticalLineToRelative(1.142f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.142f)
                curveToRelative(3.697f, -0.704f, 6.5f, -3.96f, 6.5f, -7.858f)
                close()
                moveTo(7.0f, 10.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _mercury!!
    }

private var _mercury: ImageVector? = null

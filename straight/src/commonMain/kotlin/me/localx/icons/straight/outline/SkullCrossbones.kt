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

public val Icons.Outline.SkullCrossbones: ImageVector
    get() {
        if (_skullCrossbones != null) {
            return _skullCrossbones!!
        }
        _skullCrossbones = Builder(name = "SkullCrossbones", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.069f, 19.006f)
                lineToRelative(8.846f, 3.048f)
                lineToRelative(-0.651f, 1.891f)
                lineToRelative(-11.264f, -3.881f)
                lineTo(0.736f, 23.945f)
                lineToRelative(-0.651f, -1.891f)
                lineToRelative(8.846f, -3.048f)
                lineTo(0.084f, 15.958f)
                lineToRelative(0.651f, -1.891f)
                lineToRelative(11.264f, 3.881f)
                lineToRelative(11.264f, -3.881f)
                lineToRelative(0.651f, 1.891f)
                lineToRelative(-8.846f, 3.048f)
                close()
                moveTo(11.0f, 7.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(14.5f, 9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _skullCrossbones!!
    }

private var _skullCrossbones: ImageVector? = null

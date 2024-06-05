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

public val Icons.Outline.ScrewAlt: ImageVector
    get() {
        if (_screwAlt != null) {
            return _screwAlt!!
        }
        _screwAlt = Builder(name = "ScrewAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 18.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(9.0f, 6.914f)
                verticalLineToRelative(14.058f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(3.0f, 6.914f)
                lineTo(0.0f, 3.914f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.914f)
                lineToRelative(-3.0f, 3.0f)
                close()
                moveTo(5.0f, 16.169f)
                lineToRelative(2.0f, -2.073f)
                verticalLineToRelative(-2.682f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(2.755f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(-1.586f)
                close()
                moveTo(2.0f, 3.086f)
                lineToRelative(1.914f, 1.914f)
                horizontalLineToRelative(4.172f)
                lineToRelative(1.914f, -1.914f)
                verticalLineToRelative(-1.086f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(1.086f)
                close()
                moveTo(7.0f, 20.144f)
                verticalLineToRelative(-3.167f)
                lineToRelative(-2.0f, 2.073f)
                verticalLineToRelative(1.094f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(1.0f, -1.0f)
                close()
                moveTo(23.842f, 18.5f)
                lineToRelative(-3.175f, 5.5f)
                horizontalLineToRelative(-6.351f)
                lineToRelative(-3.175f, -5.5f)
                lineToRelative(3.175f, -5.5f)
                horizontalLineToRelative(6.351f)
                lineToRelative(3.175f, 5.5f)
                close()
                moveTo(21.533f, 18.5f)
                lineToRelative(-2.021f, -3.5f)
                horizontalLineToRelative(-4.042f)
                lineToRelative(-2.021f, 3.5f)
                lineToRelative(2.021f, 3.5f)
                horizontalLineToRelative(4.042f)
                lineToRelative(2.021f, -3.5f)
                close()
            }
        }
        .build()
        return _screwAlt!!
    }

private var _screwAlt: ImageVector? = null

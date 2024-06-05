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

public val Icons.Outline.CompassAlt: ImageVector
    get() {
        if (_compassAlt != null) {
            return _compassAlt!!
        }
        _compassAlt = Builder(name = "CompassAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.051f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.051f)
                curveTo(5.402f, 2.558f, 1.0f, 7.272f, 1.0f, 13.0f)
                curveToRelative(0.0f, 6.065f, 4.935f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.935f, 11.0f, -11.0f)
                curveToRelative(0.0f, -5.728f, -4.402f, -10.442f, -10.0f, -10.949f)
                close()
                moveTo(13.0f, 21.941f)
                verticalLineToRelative(-1.941f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.941f)
                curveToRelative(-4.165f, -0.463f, -7.478f, -3.776f, -7.941f, -7.941f)
                horizontalLineToRelative(1.941f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.941f)
                curveToRelative(0.463f, -4.164f, 3.776f, -7.478f, 7.941f, -7.941f)
                verticalLineToRelative(1.941f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.941f)
                curveToRelative(4.165f, 0.463f, 7.478f, 3.777f, 7.941f, 7.941f)
                horizontalLineToRelative(-1.941f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.941f)
                curveToRelative(-0.463f, 4.165f, -3.776f, 7.478f, -7.941f, 7.941f)
                close()
                moveTo(6.559f, 7.559f)
                lineToRelative(2.922f, 7.905f)
                lineToRelative(7.98f, 2.996f)
                lineToRelative(-2.997f, -7.979f)
                lineToRelative(-7.905f, -2.922f)
                close()
                moveTo(11.039f, 13.913f)
                lineToRelative(-1.098f, -2.972f)
                lineToRelative(2.972f, 1.098f)
                lineToRelative(1.126f, 3.0f)
                lineToRelative(-3.0f, -1.127f)
                close()
            }
        }
        .build()
        return _compassAlt!!
    }

private var _compassAlt: ImageVector? = null

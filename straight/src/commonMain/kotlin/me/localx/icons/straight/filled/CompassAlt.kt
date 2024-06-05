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

public val Icons.Filled.CompassAlt: ImageVector
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
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 2.051f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(2.949f)
                curveToRelative(-0.478f, 5.268f, -4.681f, 9.472f, -9.949f, 9.949f)
                verticalLineToRelative(-2.949f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.949f)
                curveToRelative(-5.268f, -0.478f, -9.472f, -4.681f, -9.949f, -9.949f)
                horizontalLineToRelative(2.949f)
                verticalLineToRelative(-2.0f)
                lineTo(1.048f, 12.0f)
                curveTo(1.525f, 6.732f, 5.732f, 2.528f, 11.0f, 2.051f)
                verticalLineToRelative(2.949f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 2.051f)
                curveToRelative(5.268f, 0.478f, 9.475f, 4.682f, 9.952f, 9.949f)
                horizontalLineToRelative(-2.952f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.461f, 18.46f)
                lineToRelative(-2.997f, -7.979f)
                lineToRelative(-7.905f, -2.922f)
                lineToRelative(2.922f, 7.905f)
                lineToRelative(7.98f, 2.996f)
                close()
                moveTo(9.941f, 10.941f)
                lineToRelative(1.098f, 2.972f)
                lineToRelative(3.0f, 1.127f)
                lineToRelative(-1.126f, -3.0f)
                lineToRelative(-2.972f, -1.098f)
                close()
            }
        }
        .build()
        return _compassAlt!!
    }

private var _compassAlt: ImageVector? = null

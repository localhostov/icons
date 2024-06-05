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

public val Icons.Filled.RollerCoaster: ImageVector
    get() {
        if (_rollerCoaster != null) {
            return _rollerCoaster!!
        }
        _rollerCoaster = Builder(name = "RollerCoaster", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.0f)
                curveToRelative(-1.139f, 0.0f, -2.223f, -0.239f, -3.204f, -0.67f)
                curveToRelative(1.97f, -1.828f, 3.204f, -4.438f, 3.204f, -7.33f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 2.893f, 1.234f, 5.502f, 3.204f, 7.33f)
                curveToRelative(-0.981f, 0.431f, -2.065f, 0.67f, -3.204f, 0.67f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                lineTo(1.0f, 5.0f)
                lineTo(1.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 10.974f)
                curveToRelative(0.576f, 0.769f, 1.257f, 1.45f, 2.026f, 2.026f)
                horizontalLineToRelative(-0.026f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 14.159f)
                curveToRelative(0.636f, 0.279f, 1.304f, 0.497f, 2.0f, 0.639f)
                verticalLineToRelative(9.202f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 15.0f)
                curveToRelative(0.687f, 0.0f, 1.351f, -0.09f, 2.0f, -0.223f)
                verticalLineToRelative(9.223f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 14.155f)
                curveToRelative(0.342f, -0.15f, 0.679f, -0.311f, 1.0f, -0.497f)
                curveToRelative(0.321f, 0.186f, 0.658f, 0.347f, 1.0f, 0.497f)
                verticalLineToRelative(9.845f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 14.777f)
                curveToRelative(0.649f, 0.133f, 1.313f, 0.223f, 2.0f, 0.223f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 11.241f)
                curveToRelative(-1.828f, -1.468f, -3.0f, -3.721f, -3.0f, -6.241f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 2.521f, -1.172f, 4.773f, -3.0f, 6.241f)
                close()
            }
        }
        .build()
        return _rollerCoaster!!
    }

private var _rollerCoaster: ImageVector? = null

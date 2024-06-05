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

public val Icons.Bold.HouseLeave: ImageVector
    get() {
        if (_houseLeave != null) {
            return _houseLeave!!
        }
        _houseLeave = Builder(name = "HouseLeave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(22.192f, 15.045f)
                lineToRelative(1.577f, -2.552f)
                lineToRelative(-3.999f, -2.471f)
                lineToRelative(-0.493f, -1.622f)
                curveToRelative(-0.443f, -1.419f, -1.715f, -2.4f, -3.105f, -2.4f)
                horizontalLineToRelative(-0.044f)
                curveToRelative(-0.424f, 0.007f, -0.833f, 0.096f, -1.25f, 0.278f)
                lineToRelative(-4.879f, 2.864f)
                verticalLineToRelative(4.857f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.143f)
                lineToRelative(1.0f, -0.589f)
                verticalLineToRelative(3.19f)
                curveToRelative(0.0f, 1.141f, 0.558f, 2.213f, 1.493f, 2.868f)
                lineToRelative(3.507f, 2.455f)
                verticalLineToRelative(5.219f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.781f)
                lineToRelative(-3.0f, -2.1f)
                verticalLineToRelative(-2.047f)
                lineToRelative(3.192f, 1.973f)
                close()
                moveTo(13.763f, 17.483f)
                lineToRelative(-2.673f, 6.517f)
                horizontalLineToRelative(3.242f)
                lineToRelative(1.932f, -4.711f)
                lineToRelative(-1.841f, -1.304f)
                curveToRelative(-0.236f, -0.152f, -0.456f, -0.321f, -0.661f, -0.503f)
                close()
                moveTo(13.592f, 4.73f)
                curveToRelative(-0.377f, -0.658f, -0.592f, -1.419f, -0.592f, -2.229f)
                curveToRelative(0.0f, -0.033f, 0.0f, -0.065f, 0.001f, -0.098f)
                lineToRelative(-2.139f, -1.588f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-1.391f, -1.088f, -3.333f, -1.087f, -4.724f, 0.0f)
                lineTo(1.471f, 4.466f)
                curveToRelative(-0.935f, 0.731f, -1.471f, 1.832f, -1.471f, 3.019f)
                verticalLineToRelative(9.515f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-6.515f)
                curveToRelative(0.0f, -0.258f, 0.117f, -0.498f, 0.32f, -0.657f)
                lineToRelative(4.667f, -3.651f)
                curveToRelative(0.302f, -0.237f, 0.725f, -0.237f, 1.027f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(3.08f, 2.428f, 3.08f, 2.428f)
                lineToRelative(1.498f, -0.875f)
                close()
                moveTo(5.0f, 11.001f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _houseLeave!!
    }

private var _houseLeave: ImageVector? = null

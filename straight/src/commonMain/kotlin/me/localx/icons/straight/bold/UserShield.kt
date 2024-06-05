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

public val Icons.Bold.UserShield: ImageVector
    get() {
        if (_userShield != null) {
            return _userShield!!
        }
        _userShield = Builder(name = "UserShield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 0.0f)
                curveTo(4.691f, 0.0f, 2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(22.363f, 11.701f)
                lineToRelative(-3.863f, -1.281f)
                lineToRelative(-3.863f, 1.281f)
                curveToRelative(-0.979f, 0.324f, -1.637f, 1.234f, -1.637f, 2.265f)
                verticalLineToRelative(3.477f)
                curveToRelative(0.0f, 3.522f, 3.561f, 5.576f, 4.651f, 6.122f)
                lineToRelative(0.783f, 0.391f)
                lineToRelative(0.812f, -0.327f)
                curveToRelative(1.115f, -0.449f, 4.754f, -2.221f, 4.754f, -6.187f)
                verticalLineToRelative(-3.477f)
                curveToRelative(0.0f, -1.031f, -0.658f, -1.941f, -1.637f, -2.265f)
                close()
                moveTo(21.0f, 17.443f)
                curveToRelative(0.0f, 1.744f, -1.537f, 2.761f, -2.436f, 3.207f)
                curveToRelative(-0.877f, -0.509f, -2.564f, -1.686f, -2.564f, -3.207f)
                verticalLineToRelative(-3.033f)
                lineToRelative(2.5f, -0.829f)
                lineToRelative(2.5f, 0.829f)
                verticalLineToRelative(3.033f)
                close()
            }
        }
        .build()
        return _userShield!!
    }

private var _userShield: ImageVector? = null

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

public val Icons.Outline.UserPilot: ImageVector
    get() {
        if (_userPilot != null) {
            return _userPilot!!
        }
        _userPilot = Builder(name = "UserPilot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 21.317f)
                verticalLineToRelative(2.667f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.667f)
                curveToRelative(0.0f, -1.483f, -1.01f, -2.756f, -2.416f, -3.133f)
                lineToRelative(-4.559f, 4.949f)
                lineToRelative(-4.589f, -4.954f)
                curveToRelative(-1.417f, 0.369f, -2.436f, 1.645f, -2.436f, 3.138f)
                verticalLineToRelative(2.667f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.667f)
                curveToRelative(0.0f, -2.676f, 2.015f, -4.917f, 4.687f, -5.213f)
                lineToRelative(0.501f, -0.056f)
                lineToRelative(3.832f, 4.138f)
                lineToRelative(3.812f, -4.138f)
                lineToRelative(0.506f, 0.059f)
                curveToRelative(2.658f, 0.308f, 4.662f, 2.548f, 4.662f, 5.21f)
                close()
                moveTo(6.0f, 6.0f)
                lineToRelative(-2.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(10.302f, 0.209f)
                curveToRelative(1.115f, -0.279f, 2.281f, -0.279f, 3.396f, 0.0f)
                lineToRelative(6.302f, 1.791f)
                verticalLineToRelative(3.0f)
                lineToRelative(-2.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(16.0f, 7.615f)
                curveToRelative(-0.976f, 0.206f, -2.309f, 0.385f, -4.0f, 0.385f)
                reflectiveCurveToRelative(-3.024f, -0.179f, -4.0f, -0.385f)
                verticalLineToRelative(1.385f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-1.385f)
                close()
                moveTo(8.985f, 4.191f)
                lineToRelative(3.015f, 1.809f)
                lineToRelative(3.015f, -1.809f)
                lineToRelative(-1.029f, -1.715f)
                lineToRelative(-1.985f, 1.191f)
                lineToRelative(-1.985f, -1.191f)
                lineToRelative(-1.029f, 1.715f)
                close()
            }
        }
        .build()
        return _userPilot!!
    }

private var _userPilot: ImageVector? = null

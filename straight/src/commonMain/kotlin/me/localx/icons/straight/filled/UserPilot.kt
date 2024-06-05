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

public val Icons.Filled.UserPilot: ImageVector
    get() {
        if (_userPilot != null) {
            return _userPilot!!
        }
        _userPilot = Builder(name = "UserPilot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.698f, 0.209f)
                curveToRelative(-1.115f, -0.279f, -2.281f, -0.279f, -3.396f, 0.0f)
                lineToRelative(-6.302f, 1.791f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.0f, 1.0f)
                verticalLineToRelative(1.0f)
                reflectiveCurveToRelative(2.0f, 1.0f, 6.0f, 1.0f)
                reflectiveCurveToRelative(6.0f, -1.0f, 6.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(2.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(13.698f, 0.209f)
                close()
                moveTo(12.0f, 6.0f)
                lineToRelative(-3.015f, -1.809f)
                lineToRelative(1.029f, -1.715f)
                lineToRelative(1.985f, 1.191f)
                lineToRelative(1.985f, -1.191f)
                lineToRelative(1.029f, 1.715f)
                lineToRelative(-3.015f, 1.809f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-2.93f, 0.0f, -4.93f, -0.494f, -5.998f, -0.854f)
                curveToRelative(0.078f, 3.241f, 2.738f, 5.854f, 5.998f, 5.854f)
                reflectiveCurveToRelative(5.92f, -2.613f, 5.998f, -5.854f)
                curveToRelative(-1.068f, 0.36f, -3.068f, 0.854f, -5.998f, 0.854f)
                close()
                moveTo(11.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(21.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _userPilot!!
    }

private var _userPilot: ImageVector? = null

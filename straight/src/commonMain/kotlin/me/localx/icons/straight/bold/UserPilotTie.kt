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

public val Icons.Bold.UserPilotTie: ImageVector
    get() {
        if (_userPilotTie != null) {
            return _userPilotTie!!
        }
        _userPilotTie = Builder(name = "UserPilotTie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 9.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-2.984f)
                lineToRelative(2.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(13.698f, 0.224f)
                curveToRelative(-0.557f, -0.139f, -1.128f, -0.209f, -1.698f, -0.209f)
                reflectiveCurveToRelative(-1.14f, 0.07f, -1.698f, 0.209f)
                lineToRelative(-6.302f, 1.791f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.0f, 1.0f)
                verticalLineToRelative(2.984f)
                close()
                moveTo(15.0f, 9.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-1.199f)
                curveToRelative(0.833f, 0.123f, 1.818f, 0.214f, 3.0f, 0.214f)
                reflectiveCurveToRelative(2.167f, -0.091f, 3.0f, -0.214f)
                verticalLineToRelative(1.199f)
                close()
                moveTo(10.015f, 2.158f)
                lineToRelative(1.985f, 1.191f)
                lineToRelative(1.985f, -1.191f)
                lineToRelative(1.029f, 1.715f)
                lineToRelative(-3.015f, 1.809f)
                lineToRelative(-3.015f, -1.809f)
                lineToRelative(1.029f, -1.715f)
                close()
                moveTo(21.0f, 21.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(2.0f, 3.5f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(2.0f, -3.5f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -3.032f, 2.468f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _userPilotTie!!
    }

private var _userPilotTie: ImageVector? = null

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

public val Icons.Outline.UserPilotTie: ImageVector
    get() {
        if (_userPilotTie != null) {
            return _userPilotTie!!
        }
        _userPilotTie = Builder(name = "UserPilotTie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 9.043f)
                verticalLineToRelative(-3.0f)
                lineToRelative(2.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(13.698f, 0.252f)
                curveTo(12.583f, -0.027f, 11.417f, -0.027f, 10.302f, 0.252f)
                lineToRelative(-6.302f, 1.791f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(10.015f, 2.519f)
                lineToRelative(1.985f, 1.191f)
                lineToRelative(1.985f, -1.191f)
                lineToRelative(1.029f, 1.715f)
                lineToRelative(-3.015f, 1.809f)
                lineToRelative(-3.015f, -1.809f)
                lineToRelative(1.029f, -1.715f)
                close()
                moveTo(12.0f, 13.043f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-1.385f)
                curveToRelative(0.976f, 0.206f, 2.309f, 0.385f, 4.0f, 0.385f)
                reflectiveCurveToRelative(3.024f, -0.179f, 4.0f, -0.385f)
                verticalLineToRelative(1.385f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(9.5f, 16.0f)
                lineToRelative(2.0f, 2.5f)
                lineToRelative(-1.488f, 5.5f)
                lineToRelative(-2.807f, -5.443f)
                curveToRelative(-1.039f, 0.144f, -2.205f, 1.122f, -2.205f, 2.943f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -3.032f, 2.468f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(21.0f, 21.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.821f, -1.166f, -2.799f, -2.07f, -3.175f)
                lineToRelative(-2.93f, 5.675f)
                lineToRelative(-1.5f, -5.5f)
                lineToRelative(2.0f, -2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _userPilotTie!!
    }

private var _userPilotTie: ImageVector? = null

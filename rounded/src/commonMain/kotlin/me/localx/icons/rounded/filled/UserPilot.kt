package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                lineToRelative(-4.715f, 1.34f)
                curveToRelative(-0.939f, 0.267f, -1.587f, 1.125f, -1.587f, 2.101f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.827f, 0.467f, 1.584f, 1.207f, 1.954f)
                lineToRelative(0.793f, 0.396f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(2.0f, 1.0f, 6.0f, 1.0f)
                reflectiveCurveToRelative(6.0f, -1.0f, 6.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.793f, -0.396f)
                curveToRelative(0.74f, -0.37f, 1.207f, -1.126f, 1.207f, -1.954f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.976f, -0.648f, -1.834f, -1.587f, -2.101f)
                lineTo(13.698f, 0.209f)
                close()
                moveTo(11.486f, 5.36f)
                lineToRelative(-1.643f, -0.985f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.899f, -0.343f, -1.372f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.284f, -0.473f, 0.898f, -0.627f, 1.372f, -0.343f)
                lineToRelative(1.128f, 0.677f)
                lineToRelative(1.128f, -0.677f)
                curveToRelative(0.474f, -0.284f, 1.088f, -0.131f, 1.372f, 0.343f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.284f, 0.474f, 0.131f, 1.088f, -0.343f, 1.372f)
                lineToRelative(-1.643f, 0.985f)
                curveToRelative(-0.317f, 0.19f, -0.712f, 0.19f, -1.029f, 0.0f)
                close()
                moveTo(17.993f, 8.144f)
                curveToRelative(-0.077f, 3.242f, -2.733f, 5.856f, -5.993f, 5.856f)
                reflectiveCurveToRelative(-5.915f, -2.615f, -5.993f, -5.856f)
                curveToRelative(1.064f, 0.36f, 3.046f, 0.856f, 5.993f, 0.856f)
                reflectiveCurveToRelative(4.929f, -0.496f, 5.993f, -0.856f)
                close()
                moveTo(11.058f, 24.054f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.287f, 0.0f, -0.56f, -0.123f, -0.75f, -0.338f)
                curveToRelative(-0.19f, -0.216f, -0.278f, -0.502f, -0.243f, -0.786f)
                curveToRelative(0.538f, -4.304f, 3.763f, -7.398f, 7.992f, -7.822f)
                verticalLineToRelative(8.946f)
                close()
                moveTo(21.05f, 22.93f)
                curveToRelative(0.036f, 0.284f, -0.053f, 0.57f, -0.243f, 0.786f)
                curveToRelative(-0.189f, 0.215f, -0.463f, 0.338f, -0.75f, 0.338f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-8.946f)
                curveToRelative(4.229f, 0.424f, 7.454f, 3.518f, 7.992f, 7.822f)
                close()
            }
        }
        .build()
        return _userPilot!!
    }

private var _userPilot: ImageVector? = null

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

public val Icons.Filled.UserPilotTie: ImageVector
    get() {
        if (_userPilotTie != null) {
            return _userPilotTie!!
        }
        _userPilotTie = Builder(name = "UserPilotTie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.698f, 0.225f)
                curveTo(12.583f, -0.054f, 11.417f, -0.054f, 10.302f, 0.225f)
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
                lineTo(13.698f, 0.225f)
                close()
                moveTo(11.486f, 5.37f)
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
                moveTo(17.992f, 8.16f)
                curveToRelative(-0.086f, 3.234f, -2.737f, 5.84f, -5.992f, 5.84f)
                reflectiveCurveToRelative(-5.906f, -2.606f, -5.992f, -5.84f)
                curveToRelative(1.064f, 0.36f, 3.046f, 0.856f, 5.992f, 0.856f)
                reflectiveCurveToRelative(4.928f, -0.496f, 5.992f, -0.856f)
                close()
                moveTo(20.992f, 22.876f)
                curveToRelative(0.036f, 0.284f, -0.053f, 0.57f, -0.243f, 0.786f)
                curveToRelative(-0.189f, 0.215f, -0.463f, 0.338f, -0.75f, 0.338f)
                horizontalLineToRelative(-5.615f)
                curveToRelative(-0.333f, 0.0f, -0.405f, -0.382f, -0.405f, -0.382f)
                lineToRelative(-1.48f, -5.618f)
                lineToRelative(1.72f, -2.736f)
                curveToRelative(3.617f, 0.845f, 6.287f, 3.734f, 6.772f, 7.612f)
                close()
                moveTo(9.538f, 24.0f)
                horizontalLineToRelative(-5.538f)
                curveToRelative(-0.287f, 0.0f, -0.56f, -0.123f, -0.75f, -0.338f)
                curveToRelative(-0.19f, -0.216f, -0.278f, -0.502f, -0.243f, -0.786f)
                curveToRelative(0.485f, -3.878f, 3.155f, -6.767f, 6.772f, -7.612f)
                lineToRelative(1.72f, 2.736f)
                lineToRelative(-1.557f, 5.618f)
                reflectiveCurveToRelative(-0.072f, 0.382f, -0.405f, 0.382f)
                close()
            }
        }
        .build()
        return _userPilotTie!!
    }

private var _userPilotTie: ImageVector? = null

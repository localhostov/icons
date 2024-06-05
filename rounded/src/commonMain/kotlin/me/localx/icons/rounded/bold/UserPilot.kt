package me.localx.icons.rounded.bold

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

public val Icons.Bold.UserPilot: ImageVector
    get() {
        if (_userPilot != null) {
            return _userPilot!!
        }
        _userPilot = Builder(name = "UserPilot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.207f, 5.604f)
                lineToRelative(0.793f, 0.396f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(0.793f, -0.396f)
                curveToRelative(0.74f, -0.37f, 1.207f, -1.126f, 1.207f, -1.954f)
                curveToRelative(0.0f, -0.976f, -0.648f, -1.834f, -1.587f, -2.101f)
                lineTo(13.698f, 0.209f)
                curveTo(13.14f, 0.07f, 12.57f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(-1.14f, 0.07f, -1.698f, 0.209f)
                lineToRelative(-4.715f, 1.34f)
                curveToRelative(-0.939f, 0.267f, -1.587f, 1.125f, -1.587f, 2.101f)
                curveToRelative(0.0f, 0.827f, 0.467f, 1.584f, 1.207f, 1.954f)
                close()
                moveTo(15.0f, 8.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-0.214f)
                curveToRelative(0.833f, 0.123f, 1.818f, 0.214f, 3.0f, 0.214f)
                reflectiveCurveToRelative(2.167f, -0.091f, 3.0f, -0.214f)
                verticalLineToRelative(0.214f)
                close()
                moveTo(9.5f, 3.5f)
                curveToRelative(0.188f, -0.312f, 0.519f, -0.485f, 0.858f, -0.485f)
                curveToRelative(0.175f, 0.0f, 0.352f, 0.046f, 0.514f, 0.143f)
                lineToRelative(1.128f, 0.677f)
                lineToRelative(1.128f, -0.677f)
                curveToRelative(0.161f, -0.097f, 0.338f, -0.143f, 0.514f, -0.143f)
                curveToRelative(0.34f, 0.0f, 0.671f, 0.173f, 0.858f, 0.485f)
                curveToRelative(0.284f, 0.474f, 0.131f, 1.088f, -0.343f, 1.372f)
                lineToRelative(-1.643f, 0.985f)
                curveToRelative(-0.158f, 0.095f, -0.336f, 0.142f, -0.514f, 0.142f)
                reflectiveCurveToRelative(-0.356f, -0.047f, -0.514f, -0.142f)
                lineToRelative(-1.643f, -0.985f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.898f, -0.343f, -1.372f)
                close()
                moveTo(19.712f, 23.985f)
                curveToRelative(-0.072f, 0.01f, -0.143f, 0.015f, -0.214f, 0.015f)
                curveToRelative(-0.734f, 0.0f, -1.376f, -0.54f, -1.483f, -1.288f)
                curveToRelative(-0.33f, -2.312f, -2.113f, -4.025f, -4.515f, -4.538f)
                verticalLineToRelative(4.326f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-4.326f)
                curveToRelative(-2.402f, 0.513f, -4.185f, 2.225f, -4.515f, 4.538f)
                curveToRelative(-0.117f, 0.82f, -0.876f, 1.389f, -1.697f, 1.273f)
                curveToRelative(-0.82f, -0.117f, -1.39f, -0.877f, -1.273f, -1.697f)
                curveToRelative(0.613f, -4.291f, 4.308f, -7.288f, 8.985f, -7.288f)
                reflectiveCurveToRelative(8.372f, 2.997f, 8.985f, 7.288f)
                curveToRelative(0.117f, 0.82f, -0.453f, 1.58f, -1.273f, 1.697f)
                close()
            }
        }
        .build()
        return _userPilot!!
    }

private var _userPilot: ImageVector? = null

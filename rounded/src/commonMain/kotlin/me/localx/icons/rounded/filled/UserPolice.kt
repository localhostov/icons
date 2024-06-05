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

public val Icons.Filled.UserPolice: ImageVector
    get() {
        if (_userPolice != null) {
            return _userPolice!!
        }
        _userPolice = Builder(name = "UserPolice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.993f, 8.144f)
                curveToRelative(-0.077f, 3.242f, -2.733f, 5.856f, -5.993f, 5.856f)
                reflectiveCurveToRelative(-5.915f, -2.615f, -5.993f, -5.856f)
                curveToRelative(1.064f, 0.36f, 3.046f, 0.856f, 5.993f, 0.856f)
                reflectiveCurveToRelative(4.929f, -0.496f, 5.993f, -0.856f)
                close()
                moveTo(20.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-0.287f, 0.0f, -0.56f, -0.123f, -0.75f, -0.338f)
                curveToRelative(-0.189f, -0.215f, -0.277f, -0.501f, -0.242f, -0.786f)
                curveToRelative(0.245f, -1.968f, 1.162f, -4.818f, 2.936f, -6.377f)
                curveToRelative(0.795f, -0.697f, 1.999f, -0.655f, 2.744f, 0.089f)
                lineToRelative(3.313f, 3.873f)
                lineToRelative(3.259f, -3.815f)
                curveToRelative(0.8f, -0.804f, 2.006f, -0.845f, 2.798f, -0.146f)
                curveToRelative(1.773f, 1.559f, 2.69f, 4.409f, 2.936f, 6.377f)
                curveToRelative(0.035f, 0.285f, -0.053f, 0.571f, -0.242f, 0.786f)
                curveToRelative(-0.19f, 0.215f, -0.463f, 0.338f, -0.75f, 0.338f)
                close()
                moveTo(18.413f, 1.549f)
                lineTo(13.698f, 0.209f)
                curveToRelative(-1.115f, -0.279f, -2.281f, -0.279f, -3.396f, 0.0f)
                lineToRelative(-4.715f, 1.34f)
                curveToRelative(-0.939f, 0.267f, -1.587f, 1.125f, -1.587f, 2.101f)
                curveToRelative(0.0f, 0.827f, 0.467f, 1.584f, 1.207f, 1.954f)
                lineToRelative(0.793f, 0.396f)
                reflectiveCurveToRelative(2.0f, 1.0f, 6.0f, 1.0f)
                reflectiveCurveToRelative(6.0f, -1.0f, 6.0f, -1.0f)
                lineToRelative(0.793f, -0.396f)
                curveToRelative(0.74f, -0.37f, 1.207f, -1.126f, 1.207f, -1.954f)
                curveToRelative(0.0f, -0.976f, -0.648f, -1.834f, -1.587f, -2.101f)
                close()
                moveTo(14.0f, 3.565f)
                curveToRelative(0.0f, 1.513f, -1.552f, 2.255f, -1.999f, 2.435f)
                curveToRelative(-0.448f, -0.224f, -2.001f, -1.104f, -2.001f, -2.435f)
                verticalLineToRelative(-1.45f)
                curveToRelative(0.0f, -0.191f, 0.122f, -0.36f, 0.304f, -0.421f)
                lineToRelative(1.696f, -0.562f)
                lineToRelative(1.696f, 0.562f)
                curveToRelative(0.182f, 0.06f, 0.304f, 0.229f, 0.304f, 0.421f)
                verticalLineToRelative(1.45f)
                close()
            }
        }
        .build()
        return _userPolice!!
    }

private var _userPolice: ImageVector? = null

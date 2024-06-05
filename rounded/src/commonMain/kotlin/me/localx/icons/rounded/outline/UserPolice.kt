package me.localx.icons.rounded.outline

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

public val Icons.Outline.UserPolice: ImageVector
    get() {
        if (_userPolice != null) {
            return _userPolice!!
        }
        _userPolice = Builder(name = "UserPolice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.124f, 23.992f)
                curveToRelative(-0.614f, 0.046f, -1.053f, -0.362f, -1.116f, -0.868f)
                curveToRelative(-0.258f, -2.067f, -1.192f, -4.175f, -2.271f, -5.123f)
                lineToRelative(-3.976f, 4.648f)
                curveToRelative(-0.381f, 0.445f, -1.141f, 0.445f, -1.521f, 0.0f)
                lineToRelative(-4.02f, -4.705f)
                curveToRelative(-1.035f, 1.005f, -1.97f, 3.112f, -2.228f, 5.18f)
                curveToRelative(-0.069f, 0.548f, -0.567f, 0.936f, -1.116f, 0.868f)
                curveToRelative(-0.548f, -0.068f, -0.937f, -0.568f, -0.868f, -1.116f)
                curveToRelative(0.245f, -1.968f, 1.162f, -4.818f, 2.936f, -6.377f)
                curveToRelative(0.795f, -0.697f, 1.999f, -0.655f, 2.744f, 0.089f)
                lineToRelative(3.313f, 3.873f)
                lineToRelative(3.259f, -3.815f)
                curveToRelative(0.8f, -0.804f, 2.006f, -0.845f, 2.798f, -0.146f)
                curveToRelative(1.773f, 1.559f, 2.69f, 4.409f, 2.936f, 6.377f)
                curveToRelative(0.068f, 0.548f, -0.318f, 1.075f, -0.868f, 1.116f)
                close()
                moveTo(4.0f, 3.65f)
                curveToRelative(0.0f, -0.976f, 0.648f, -1.834f, 1.587f, -2.101f)
                lineTo(10.302f, 0.209f)
                curveToRelative(1.115f, -0.279f, 2.281f, -0.279f, 3.396f, 0.0f)
                lineToRelative(4.715f, 1.34f)
                curveToRelative(0.939f, 0.267f, 1.587f, 1.125f, 1.587f, 2.101f)
                curveToRelative(0.0f, 0.827f, -0.467f, 1.584f, -1.207f, 1.954f)
                lineToRelative(-0.793f, 0.396f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-0.793f, -0.396f)
                curveToRelative(-0.74f, -0.37f, -1.207f, -1.126f, -1.207f, -1.954f)
                close()
                moveTo(16.0f, 7.615f)
                curveToRelative(-0.976f, 0.206f, -2.309f, 0.385f, -4.0f, 0.385f)
                reflectiveCurveToRelative(-3.024f, -0.179f, -4.0f, -0.385f)
                verticalLineToRelative(0.385f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-0.385f)
                close()
                moveTo(10.0f, 4.065f)
                curveToRelative(0.0f, 1.331f, 1.552f, 2.211f, 2.001f, 2.435f)
                curveToRelative(0.447f, -0.18f, 1.999f, -0.922f, 1.999f, -2.435f)
                verticalLineToRelative(-1.45f)
                curveToRelative(0.0f, -0.191f, -0.122f, -0.36f, -0.304f, -0.421f)
                lineToRelative(-1.696f, -0.562f)
                lineToRelative(-1.696f, 0.562f)
                curveToRelative(-0.182f, 0.06f, -0.304f, 0.229f, -0.304f, 0.421f)
                verticalLineToRelative(1.45f)
                close()
            }
        }
        .build()
        return _userPolice!!
    }

private var _userPolice: ImageVector? = null

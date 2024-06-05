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

public val Icons.Filled.HandLove: ImageVector
    get() {
        if (_handLove != null) {
            return _handLove!!
        }
        _handLove = Builder(name = "HandLove", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(16.5f, 15.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(23.0f, 2.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                lineTo(20.0f, 13.321f)
                curveToRelative(0.0f, 1.901f, -1.439f, 3.588f, -3.337f, 3.675f)
                curveToRelative(-0.805f, 0.037f, -1.554f, -0.201f, -2.163f, -0.626f)
                curveToRelative(-0.567f, 0.397f, -1.257f, 0.63f, -2.0f, 0.63f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                lineTo(9.0f, 1.58f)
                curveToRelative(0.0f, -0.747f, -0.511f, -1.44f, -1.248f, -1.56f)
                curveToRelative(-0.94f, -0.153f, -1.752f, 0.568f, -1.752f, 1.479f)
                verticalLineToRelative(14.654f)
                lineToRelative(-2.605f, -2.65f)
                curveToRelative(-0.088f, -0.088f, -0.24f, -0.201f, -0.441f, -0.333f)
                curveToRelative(-0.843f, -0.47f, -1.954f, -0.284f, -2.584f, 0.561f)
                curveToRelative(-0.604f, 0.81f, -0.437f, 1.965f, 0.276f, 2.68f)
                lineToRelative(7.354f, 7.588f)
                horizontalLineToRelative(15.0f)
                lineTo(23.0f, 2.5f)
                close()
            }
        }
        .build()
        return _handLove!!
    }

private var _handLove: ImageVector? = null

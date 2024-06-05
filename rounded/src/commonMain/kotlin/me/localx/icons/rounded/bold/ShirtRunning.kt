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

public val Icons.Bold.ShirtRunning: ImageVector
    get() {
        if (_shirtRunning != null) {
            return _shirtRunning!!
        }
        _shirtRunning = Builder(name = "ShirtRunning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.414f, 7.547f)
                curveToRelative(-0.886f, -0.553f, -1.414f, -1.505f, -1.414f, -2.547f)
                lineTo(18.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(9.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.042f, -0.528f, 1.995f, -1.415f, 2.548f)
                curveToRelative(-0.978f, 0.611f, -1.585f, 1.732f, -1.585f, 2.926f)
                verticalLineToRelative(8.526f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.526f)
                curveToRelative(0.0f, -1.194f, -0.607f, -2.315f, -1.586f, -2.926f)
                close()
                moveTo(6.0f, 10.473f)
                curveToRelative(0.0f, -0.163f, 0.07f, -0.316f, 0.174f, -0.381f)
                curveToRelative(0.711f, -0.444f, 1.307f, -1.017f, 1.766f, -1.679f)
                curveToRelative(1.069f, 0.985f, 2.496f, 1.587f, 4.061f, 1.587f)
                reflectiveCurveToRelative(2.991f, -0.602f, 4.06f, -1.587f)
                curveToRelative(0.446f, 0.644f, 1.022f, 1.203f, 1.708f, 1.642f)
                lineToRelative(-11.765f, 9.05f)
                curveToRelative(-0.002f, -0.035f, -0.003f, -0.07f, -0.003f, -0.105f)
                verticalLineToRelative(-8.526f)
                close()
                moveTo(16.0f, 20.999f)
                horizontalLineToRelative(-7.539f)
                lineToRelative(9.539f, -7.338f)
                verticalLineToRelative(5.338f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _shirtRunning!!
    }

private var _shirtRunning: ImageVector? = null

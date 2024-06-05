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

public val Icons.Bold.TankWater: ImageVector
    get() {
        if (_tankWater != null) {
            return _tankWater!!
        }
        _tankWater = Builder(name = "TankWater", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(6.479f)
                curveToRelative(-0.367f, 0.001f, -0.743f, -0.103f, -1.058f, -0.327f)
                curveToRelative(-1.16f, -0.827f, -2.722f, -0.828f, -3.883f, 0.0f)
                curveToRelative(-0.625f, 0.443f, -1.496f, 0.442f, -2.117f, 0.0f)
                curveToRelative(-1.162f, -0.828f, -2.723f, -0.827f, -3.884f, 0.0f)
                curveToRelative(-0.623f, 0.443f, -1.495f, 0.442f, -2.117f, 0.0f)
                curveToRelative(-1.161f, -0.828f, -2.722f, -0.827f, -3.883f, 0.0f)
                curveToRelative(-0.316f, 0.224f, -0.692f, 0.329f, -1.059f, 0.328f)
                verticalLineToRelative(-6.479f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-3.529f)
                curveToRelative(0.983f, -0.001f, 1.977f, -0.291f, 2.797f, -0.875f)
                curveToRelative(0.128f, -0.09f, 0.275f, -0.091f, 0.406f, 0.0f)
                curveToRelative(1.639f, 1.164f, 3.955f, 1.165f, 5.594f, 0.0f)
                curveToRelative(0.129f, -0.09f, 0.276f, -0.091f, 0.406f, 0.0f)
                curveToRelative(1.64f, 1.166f, 3.952f, 1.167f, 5.594f, 0.0f)
                curveToRelative(0.129f, -0.092f, 0.275f, -0.091f, 0.406f, 0.0f)
                curveToRelative(0.819f, 0.583f, 1.812f, 0.903f, 2.796f, 0.903f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(9.827f, 8.112f)
                curveToRelative(-0.586f, -0.592f, -0.879f, -1.368f, -0.879f, -2.144f)
                curveToRelative(0.0f, -1.685f, 2.166f, -3.993f, 2.166f, -3.993f)
                curveToRelative(0.441f, -0.516f, 1.233f, -0.515f, 1.673f, 0.001f)
                curveToRelative(0.0f, 0.0f, 2.161f, 2.307f, 2.161f, 3.991f)
                curveToRelative(0.0f, 0.776f, -0.293f, 1.552f, -0.879f, 2.144f)
                curveToRelative(-0.586f, 0.592f, -1.353f, 0.888f, -2.121f, 0.888f)
                curveToRelative(-0.768f, 0.0f, -1.536f, -0.296f, -2.121f, -0.888f)
                close()
            }
        }
        .build()
        return _tankWater!!
    }

private var _tankWater: ImageVector? = null

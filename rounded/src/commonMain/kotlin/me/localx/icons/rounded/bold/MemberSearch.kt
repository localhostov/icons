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

public val Icons.Bold.MemberSearch: ImageVector
    get() {
        if (_memberSearch != null) {
            return _memberSearch!!
        }
        _memberSearch = Builder(name = "MemberSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.046f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.355f, 0.0f, 9.046f, 0.0f)
                reflectiveCurveTo(3.046f, 2.691f, 3.046f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(9.046f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(23.57f, 21.449f)
                lineToRelative(-2.11f, -2.15f)
                curveToRelative(0.362f, -0.692f, 0.586f, -1.466f, 0.586f, -2.299f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(0.83f, 0.0f, 1.601f, -0.222f, 2.29f, -0.582f)
                lineToRelative(2.092f, 2.132f)
                curveToRelative(0.293f, 0.299f, 0.682f, 0.449f, 1.07f, 0.449f)
                curveToRelative(0.379f, 0.0f, 0.759f, -0.143f, 1.051f, -0.429f)
                curveToRelative(0.591f, -0.581f, 0.6f, -1.53f, 0.02f, -2.122f)
                close()
                moveTo(17.047f, 19.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(9.996f, 15.412f)
                curveToRelative(0.059f, 0.827f, -0.562f, 1.544f, -1.389f, 1.604f)
                curveToRelative(-2.975f, 0.213f, -5.367f, 2.614f, -5.564f, 5.584f)
                curveToRelative(-0.053f, 0.792f, -0.712f, 1.4f, -1.495f, 1.4f)
                curveToRelative(-0.033f, 0.0f, -0.067f, 0.0f, -0.101f, -0.003f)
                curveToRelative(-0.826f, -0.055f, -1.452f, -0.77f, -1.397f, -1.596f)
                curveToRelative(0.296f, -4.456f, 3.883f, -8.058f, 8.343f, -8.377f)
                curveToRelative(0.829f, -0.052f, 1.544f, 0.562f, 1.604f, 1.389f)
                close()
            }
        }
        .build()
        return _memberSearch!!
    }

private var _memberSearch: ImageVector? = null

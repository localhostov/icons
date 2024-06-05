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

public val Icons.Bold.LightCeiling: ImageVector
    get() {
        if (_lightCeiling != null) {
            return _lightCeiling!!
        }
        _lightCeiling = Builder(name = "LightCeiling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.743f, 13.985f)
                curveToRelative(-1.485f, -4.251f, -5.577f, -7.333f, -10.243f, -7.887f)
                lineTo(13.5f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(4.598f)
                curveTo(5.834f, 6.652f, 1.742f, 9.735f, 0.257f, 13.985f)
                curveToRelative(-0.484f, 1.387f, -0.268f, 2.928f, 0.58f, 4.123f)
                curveToRelative(0.854f, 1.202f, 2.188f, 1.892f, 3.663f, 1.892f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.475f, 0.0f, 2.81f, -0.689f, 3.663f, -1.892f)
                curveToRelative(0.848f, -1.195f, 1.064f, -2.736f, 0.58f, -4.123f)
                close()
                moveTo(20.717f, 16.372f)
                curveToRelative(-0.283f, 0.399f, -0.727f, 0.628f, -1.217f, 0.628f)
                lineTo(4.5f, 17.0f)
                curveToRelative(-0.49f, 0.0f, -0.934f, -0.229f, -1.217f, -0.628f)
                curveToRelative(-0.291f, -0.41f, -0.361f, -0.919f, -0.194f, -1.397f)
                curveToRelative(1.229f, -3.518f, 4.894f, -5.975f, 8.911f, -5.975f)
                reflectiveCurveToRelative(7.682f, 2.457f, 8.911f, 5.975f)
                curveToRelative(0.167f, 0.479f, 0.097f, 0.988f, -0.194f, 1.397f)
                close()
            }
        }
        .build()
        return _lightCeiling!!
    }

private var _lightCeiling: ImageVector? = null

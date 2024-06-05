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

public val Icons.Filled.Clarinet: ImageVector
    get() {
        if (_clarinet != null) {
            return _clarinet!!
        }
        _clarinet = Builder(name = "Clarinet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.035f, 6.274f)
                curveToRelative(-0.322f, -0.203f, -1.004f, -0.482f, -1.939f, -0.037f)
                curveToRelative(-0.179f, 0.085f, -0.395f, 0.201f, -0.644f, 0.336f)
                curveToRelative(-0.854f, 0.461f, -2.061f, 1.113f, -3.452f, 1.343f)
                verticalLineToRelative(-0.916f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.281f)
                curveToRelative(-1.17f, 0.295f, -2.331f, 0.776f, -3.236f, 1.204f)
                curveToRelative(-1.071f, 0.508f, -1.764f, 1.604f, -1.764f, 2.795f)
                verticalLineToRelative(0.504f)
                curveToRelative(0.0f, 1.169f, 0.641f, 2.222f, 1.671f, 2.749f)
                curveToRelative(1.31f, 0.669f, 3.297f, 1.467f, 5.329f, 1.467f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.519f, 0.0f, 3.624f, 1.046f, 4.636f, 1.549f)
                lineToRelative(0.434f, 0.213f)
                curveToRelative(0.367f, 0.176f, 0.696f, 0.238f, 0.979f, 0.238f)
                curveToRelative(0.436f, 0.0f, 0.765f, -0.15f, 0.961f, -0.274f)
                curveToRelative(0.629f, -0.396f, 0.989f, -1.176f, 0.99f, -2.138f)
                lineToRelative(0.025f, -8.173f)
                curveToRelative(0.0f, -0.964f, -0.361f, -1.744f, -0.99f, -2.141f)
                close()
                moveTo(6.5f, 14.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11.5f, 14.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 14.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _clarinet!!
    }

private var _clarinet: ImageVector? = null

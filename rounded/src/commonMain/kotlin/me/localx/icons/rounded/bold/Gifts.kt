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

public val Icons.Bold.Gifts: ImageVector
    get() {
        if (_gifts != null) {
            return _gifts!!
        }
        _gifts = Builder(name = "Gifts", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.774f, 14.184f)
                curveToRelative(0.119f, -0.067f, 0.235f, -0.141f, 0.346f, -0.224f)
                curveToRelative(0.972f, -0.729f, 1.169f, -2.108f, 0.44f, -3.08f)
                reflectiveCurveToRelative(-2.108f, -1.169f, -3.08f, -0.44f)
                curveToRelative(-1.339f, 1.004f, -1.842f, 2.771f, -1.98f, 3.56f)
                curveToRelative(-0.138f, -0.789f, -0.641f, -2.556f, -1.98f, -3.56f)
                curveToRelative(-0.972f, -0.729f, -2.351f, -0.532f, -3.08f, 0.44f)
                reflectiveCurveToRelative(-0.532f, 2.351f, 0.44f, 3.08f)
                curveToRelative(0.111f, 0.083f, 0.227f, 0.157f, 0.346f, 0.224f)
                curveToRelative(-1.863f, 0.551f, -3.226f, 2.277f, -3.226f, 4.316f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.526f, 0.091f, 1.031f, 0.257f, 1.5f)
                horizontalLineToRelative(-3.757f)
                curveToRelative(-0.417f, 0.0f, -2.5f, -0.097f, -2.5f, -2.0f)
                lineTo(3.0f, 10.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.609f, 0.0f, 1.196f, 0.222f, 1.653f, 0.625f)
                curveToRelative(0.622f, 0.547f, 1.569f, 0.488f, 2.117f, -0.133f)
                curveToRelative(0.548f, -0.621f, 0.489f, -1.569f, -0.133f, -2.117f)
                curveToRelative(-0.975f, -0.86f, -2.22f, -1.346f, -3.518f, -1.374f)
                lineToRelative(1.441f, -1.441f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(-1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-0.939f, 0.939f)
                verticalLineToRelative(-0.879f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.879f)
                lineToRelative(-0.939f, -0.939f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                reflectiveCurveToRelative(-0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(1.441f, 1.441f)
                curveToRelative(-2.978f, 0.064f, -5.38f, 2.506f, -5.38f, 5.499f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 2.897f, 2.313f, 5.0f, 5.5f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.039f, -1.363f, -3.765f, -3.226f, -4.316f)
                close()
                moveTo(15.0f, 21.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(21.0f, 19.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _gifts!!
    }

private var _gifts: ImageVector? = null

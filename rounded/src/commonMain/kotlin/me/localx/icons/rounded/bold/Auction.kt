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

public val Icons.Bold.Auction: ImageVector
    get() {
        if (_auction != null) {
            return _auction!!
        }
        _auction = Builder(name = "Auction", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.155f, 14.878f)
                lineToRelative(-0.149f, 0.149f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(7.0f, -7.0f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(-1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-0.274f, 0.274f)
                lineToRelative(-5.463f, -5.449f)
                lineToRelative(0.29f, -0.29f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(-1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-7.0f, 7.0f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(0.132f, -0.132f)
                lineToRelative(1.68f, 1.676f)
                lineTo(0.445f, 19.934f)
                curveToRelative(-0.589f, 0.582f, -0.595f, 1.532f, -0.012f, 2.121f)
                curveToRelative(0.293f, 0.297f, 0.68f, 0.445f, 1.066f, 0.445f)
                curveToRelative(0.381f, 0.0f, 0.763f, -0.145f, 1.055f, -0.434f)
                lineToRelative(8.942f, -8.843f)
                lineToRelative(1.659f, 1.655f)
                close()
                moveTo(12.149f, 4.972f)
                lineToRelative(5.463f, 5.449f)
                lineToRelative(-2.335f, 2.335f)
                lineToRelative(-5.463f, -5.449f)
                lineToRelative(2.335f, -2.335f)
                close()
                moveTo(24.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.668f, 0.439f, -1.227f, 1.043f, -1.421f)
                curveToRelative(0.202f, -1.178f, 1.223f, -2.079f, 2.457f, -2.079f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.235f, 0.0f, 2.256f, 0.901f, 2.457f, 2.079f)
                curveToRelative(0.603f, 0.194f, 1.043f, 0.754f, 1.043f, 1.421f)
                close()
            }
        }
        .build()
        return _auction!!
    }

private var _auction: ImageVector? = null

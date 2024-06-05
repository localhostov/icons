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

public val Icons.Bold.PenSlash: ImageVector
    get() {
        if (_penSlash != null) {
            return _penSlash!!
        }
        _penSlash = Builder(name = "PenSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.112f, 16.491f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(-3.777f, 3.776f)
                curveToRelative(-1.04f, 1.039f, -2.421f, 1.611f, -3.889f, 1.611f)
                horizontalLineToRelative(-1.946f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.946f)
                curveToRelative(0.0f, -1.469f, 0.572f, -2.85f, 1.611f, -3.889f)
                lineToRelative(3.88f, -3.88f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                reflectiveCurveToRelative(0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(-3.88f, 3.88f)
                curveToRelative(-0.465f, 0.466f, -0.732f, 1.109f, -0.732f, 1.768f)
                verticalLineToRelative(0.446f)
                horizontalLineToRelative(0.446f)
                curveToRelative(0.667f, 0.0f, 1.295f, -0.261f, 1.768f, -0.732f)
                lineToRelative(3.777f, -3.776f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                close()
                moveTo(23.56f, 23.56f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                reflectiveCurveTo(1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(7.638f, 7.638f)
                lineToRelative(6.892f, -6.892f)
                curveToRelative(0.764f, -0.765f, 1.78f, -1.186f, 2.862f, -1.186f)
                reflectiveCurveToRelative(2.098f, 0.421f, 2.862f, 1.186f)
                curveToRelative(1.578f, 1.578f, 1.578f, 4.146f, 0.0f, 5.725f)
                lineToRelative(-6.893f, 6.891f)
                lineToRelative(7.638f, 7.638f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                close()
                moveTo(19.212f, 3.307f)
                lineToRelative(-1.751f, 1.751f)
                lineToRelative(1.482f, 1.482f)
                lineToRelative(1.751f, -1.751f)
                curveToRelative(0.408f, -0.408f, 0.408f, -1.074f, 0.0f, -1.482f)
                curveToRelative(-0.396f, -0.396f, -1.085f, -0.396f, -1.481f, 0.0f)
                close()
                moveTo(12.319f, 10.199f)
                lineToRelative(1.482f, 1.482f)
                lineToRelative(3.02f, -3.02f)
                lineToRelative(-1.482f, -1.482f)
                lineToRelative(-3.02f, 3.02f)
                close()
            }
        }
        .build()
        return _penSlash!!
    }

private var _penSlash: ImageVector? = null

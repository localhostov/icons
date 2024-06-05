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

public val Icons.Bold.BoltSlash: ImageVector
    get() {
        if (_boltSlash != null) {
            return _boltSlash!!
        }
        _boltSlash = Builder(name = "BoltSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 21.439f)
                lineToRelative(-5.678f, -5.678f)
                lineToRelative(1.526f, -2.439f)
                curveToRelative(0.71f, -1.047f, 0.784f, -2.392f, 0.191f, -3.51f)
                curveToRelative(-0.592f, -1.118f, -1.747f, -1.812f, -3.01f, -1.812f)
                lineToRelative(-2.705f, -0.002f)
                lineToRelative(1.058f, -4.59f)
                curveToRelative(0.376f, -1.317f, -0.185f, -2.659f, -1.336f, -3.191f)
                curveToRelative(-1.095f, -0.505f, -2.361f, -0.106f, -3.101f, 1.008f)
                lineToRelative(-2.756f, 4.404f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                reflectiveCurveTo(-0.146f, 1.975f, 0.439f, 2.561f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                close()
                moveTo(16.588f, 11.0f)
                curveToRelative(0.204f, 0.0f, 0.309f, 0.118f, 0.361f, 0.217f)
                curveToRelative(0.052f, 0.1f, 0.091f, 0.253f, -0.053f, 0.468f)
                lineToRelative(-1.19f, 1.901f)
                lineToRelative(-2.587f, -2.587f)
                lineToRelative(3.469f, 0.002f)
                close()
                moveTo(14.404f, 19.353f)
                curveToRelative(0.444f, 0.444f, 0.522f, 1.135f, 0.189f, 1.667f)
                lineToRelative(-1.099f, 1.755f)
                curveToRelative(-0.527f, 0.793f, -1.321f, 1.224f, -2.129f, 1.224f)
                curveToRelative(-0.327f, 0.0f, -0.656f, -0.07f, -0.972f, -0.216f)
                curveToRelative(-1.151f, -0.532f, -1.712f, -1.874f, -1.336f, -3.191f)
                lineToRelative(1.057f, -4.588f)
                horizontalLineToRelative(-2.558f)
                curveToRelative(-1.0f, 0.0f, -1.997f, -0.365f, -2.664f, -1.109f)
                curveToRelative(-1.086f, -1.211f, -1.168f, -2.935f, -0.301f, -4.214f)
                curveToRelative(0.0f, 0.0f, 0.408f, -0.732f, 1.088f, -0.052f)
                lineToRelative(8.725f, 8.725f)
                close()
            }
        }
        .build()
        return _boltSlash!!
    }

private var _boltSlash: ImageVector? = null

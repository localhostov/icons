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

public val Icons.Bold.BookmarkSlash: ImageVector
    get() {
        if (_bookmarkSlash != null) {
            return _bookmarkSlash!!
        }
        _bookmarkSlash = Builder(name = "BookmarkSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 21.439f)
                lineToRelative(-2.561f, -2.56f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                lineTo(7.5f, 1.0f)
                curveToRelative(-1.179f, 0.0f, -2.292f, 0.458f, -3.121f, 1.258f)
                lineTo(2.561f, 0.44f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.44f)
                reflectiveCurveTo(-0.146f, 1.976f, 0.439f, 2.561f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                close()
                moveTo(7.5f, 4.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(10.379f)
                lineTo(6.502f, 4.381f)
                curveToRelative(0.272f, -0.243f, 0.625f, -0.38f, 0.998f, -0.38f)
                close()
                moveTo(11.612f, 18.506f)
                lineToRelative(-3.178f, 3.512f)
                curveToRelative(-0.623f, 0.659f, -1.452f, 1.007f, -2.299f, 1.007f)
                curveToRelative(-0.389f, 0.0f, -0.781f, -0.073f, -1.159f, -0.223f)
                curveToRelative(-1.201f, -0.478f, -1.977f, -1.621f, -1.977f, -2.913f)
                verticalLineToRelative(-8.389f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(8.389f)
                curveToRelative(0.0f, 0.041f, 0.0f, 0.091f, 0.085f, 0.125f)
                curveToRelative(0.085f, 0.035f, 0.119f, -0.003f, 0.146f, -0.032f)
                lineToRelative(3.156f, -3.489f)
                curveToRelative(0.557f, -0.614f, 1.504f, -0.662f, 2.119f, -0.105f)
                curveToRelative(0.614f, 0.556f, 0.662f, 1.505f, 0.106f, 2.119f)
                close()
            }
        }
        .build()
        return _bookmarkSlash!!
    }

private var _bookmarkSlash: ImageVector? = null

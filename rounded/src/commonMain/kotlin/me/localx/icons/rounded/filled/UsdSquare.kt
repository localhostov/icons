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

public val Icons.Filled.UsdSquare: ImageVector
    get() {
        if (_usdSquare != null) {
            return _usdSquare!!
        }
        _usdSquare = Builder(name = "UsdSquare", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(13.0f, 17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.005f, 1.308f, -1.995f, 1.307f, -2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.268f)
                curveToRelative(-1.067f, 0.0f, -2.063f, -0.574f, -2.598f, -1.499f)
                curveToRelative(-0.277f, -0.479f, -0.113f, -1.09f, 0.364f, -1.366f)
                curveToRelative(0.479f, -0.279f, 1.09f, -0.113f, 1.366f, 0.364f)
                curveToRelative(0.179f, 0.31f, 0.511f, 0.501f, 0.867f, 0.501f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.997f, 0.065f, 1.443f, -1.55f, 0.356f, -1.76f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-3.502f, -0.649f, -2.748f, -5.753f, 0.685f, -5.733f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.006f, -1.308f, 1.995f, -1.307f, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.268f)
                curveToRelative(1.067f, 0.0f, 2.063f, 0.575f, 2.598f, 1.5f)
                curveToRelative(0.277f, 0.478f, 0.113f, 1.089f, -0.364f, 1.366f)
                curveToRelative(-0.48f, 0.277f, -1.091f, 0.113f, -1.366f, -0.365f)
                curveToRelative(-0.179f, -0.309f, -0.511f, -0.5f, -0.867f, -0.5f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.997f, -0.065f, -1.442f, 1.55f, -0.356f, 1.76f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(3.502f, 0.649f, 2.748f, 5.753f, -0.685f, 5.733f)
                close()
            }
        }
        .build()
        return _usdSquare!!
    }

private var _usdSquare: ImageVector? = null

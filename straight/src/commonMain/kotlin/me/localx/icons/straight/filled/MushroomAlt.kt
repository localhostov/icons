package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.MushroomAlt: ImageVector
    get() {
        if (_mushroomAlt != null) {
            return _mushroomAlt!!
        }
        _mushroomAlt = Builder(name = "MushroomAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.109f, 2.191f)
                curveToRelative(1.338f, -0.943f, 2.873f, -1.624f, 4.535f, -1.956f)
                curveToRelative(0.221f, 0.372f, 0.356f, 0.801f, 0.356f, 1.265f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.137f, 0.0f, -2.088f, -0.768f, -2.391f, -1.809f)
                close()
                moveTo(24.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.302f, 1.341f, -6.297f, 3.507f, -8.469f)
                curveToRelative(0.745f, 1.458f, 2.246f, 2.469f, 3.993f, 2.469f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -0.523f, -0.107f, -1.019f, -0.272f, -1.486f)
                curveToRelative(0.091f, -0.002f, 0.18f, -0.014f, 0.272f, -0.014f)
                curveToRelative(6.617f, 0.0f, 12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(13.0f, 9.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(19.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(7.55f, 15.0f)
                curveToRelative(-0.348f, 2.11f, -0.55f, 4.232f, -0.55f, 5.0f)
                curveToRelative(0.0f, 2.43f, 1.962f, 4.0f, 5.0f, 4.0f)
                reflectiveCurveToRelative(5.0f, -1.57f, 5.0f, -4.0f)
                curveToRelative(0.0f, -0.768f, -0.202f, -2.89f, -0.55f, -5.0f)
                lineTo(7.55f, 15.0f)
                close()
            }
        }
        .build()
        return _mushroomAlt!!
    }

private var _mushroomAlt: ImageVector? = null

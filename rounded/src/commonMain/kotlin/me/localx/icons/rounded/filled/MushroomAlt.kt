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
                moveToRelative(7.55f, 15.0f)
                curveToRelative(-0.348f, 2.11f, -0.55f, 3.732f, -0.55f, 4.5f)
                curveToRelative(0.0f, 2.43f, 1.962f, 4.5f, 5.0f, 4.5f)
                reflectiveCurveToRelative(5.0f, -2.07f, 5.0f, -4.5f)
                curveToRelative(0.0f, -0.768f, -0.202f, -2.39f, -0.55f, -4.5f)
                lineTo(7.55f, 15.0f)
                close()
                moveTo(5.094f, 2.141f)
                curveToRelative(1.359f, -0.923f, 2.906f, -1.577f, 4.552f, -1.902f)
                curveToRelative(0.219f, 0.372f, 0.354f, 0.799f, 0.354f, 1.261f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.155f, 0.0f, -2.121f, -0.792f, -2.406f, -1.859f)
                close()
                moveTo(23.925f, 9.367f)
                curveTo(22.665f, 3.939f, 17.649f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-0.092f, 0.0f, -0.181f, 0.01f, -0.273f, 0.012f)
                curveToRelative(0.165f, 0.468f, 0.273f, 0.964f, 0.273f, 1.488f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                curveToRelative(-1.776f, 0.0f, -3.3f, -1.043f, -4.032f, -2.54f)
                curveTo(1.823f, 5.039f, 0.609f, 7.067f, 0.075f, 9.368f)
                curveToRelative(-0.201f, 0.864f, 0.006f, 1.766f, 0.566f, 2.471f)
                curveToRelative(0.586f, 0.738f, 1.466f, 1.161f, 2.413f, 1.161f)
                horizontalLineToRelative(17.891f)
                curveToRelative(0.947f, 0.0f, 1.827f, -0.423f, 2.413f, -1.161f)
                curveToRelative(0.561f, -0.705f, 0.767f, -1.606f, 0.566f, -2.472f)
                close()
                moveTo(11.0f, 11.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(17.5f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _mushroomAlt!!
    }

private var _mushroomAlt: ImageVector? = null

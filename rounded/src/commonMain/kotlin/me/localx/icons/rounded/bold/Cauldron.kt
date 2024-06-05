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

public val Icons.Bold.Cauldron: ImageVector
    get() {
        if (_cauldron != null) {
            return _cauldron!!
        }
        _cauldron = Builder(name = "Cauldron", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 15.0f)
                curveToRelative(0.0f, -2.361f, -0.948f, -4.465f, -1.916f, -6.0f)
                horizontalLineToRelative(0.416f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                lineTo(1.5f, 6.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.416f)
                curveToRelative(-0.969f, 1.535f, -1.916f, 3.639f, -1.916f, 6.0f)
                curveToRelative(0.0f, 2.04f, 0.911f, 3.924f, 2.442f, 5.435f)
                curveToRelative(-0.092f, 0.27f, -0.333f, 0.544f, -0.961f, 0.565f)
                curveToRelative(-0.82f, 0.01f, -1.481f, 0.678f, -1.481f, 1.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                curveToRelative(1.101f, 0.0f, 2.569f, -0.5f, 3.386f, -1.757f)
                curveToRelative(1.992f, 1.104f, 4.453f, 1.757f, 7.114f, 1.757f)
                reflectiveCurveToRelative(5.122f, -0.653f, 7.114f, -1.757f)
                curveToRelative(0.817f, 1.257f, 2.285f, 1.757f, 3.386f, 1.757f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.363f, 0.0f, -0.78f, -0.11f, -0.937f, -0.57f)
                curveToRelative(1.528f, -1.51f, 2.437f, -3.392f, 2.437f, -5.43f)
                close()
                moveTo(3.0f, 15.0f)
                curveToRelative(0.0f, -2.677f, 1.831f, -5.066f, 2.651f, -6.0f)
                horizontalLineToRelative(12.696f)
                curveToRelative(0.818f, 0.938f, 2.653f, 3.339f, 2.653f, 6.0f)
                curveToRelative(0.0f, 3.252f, -4.122f, 6.0f, -9.0f, 6.0f)
                reflectiveCurveToRelative(-9.0f, -2.748f, -9.0f, -6.0f)
                close()
                moveTo(7.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(14.0f, 2.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _cauldron!!
    }

private var _cauldron: ImageVector? = null

package me.localx.icons.straight.outline

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

public val Icons.Outline.HouseSignal: ImageVector
    get() {
        if (_houseSignal != null) {
            return _houseSignal!!
        }
        _houseSignal = Builder(name = "HouseSignal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.183f)
                verticalLineToRelative(9.817f)
                horizontalLineToRelative(-9.939f)
                curveToRelative(-0.267f, -0.695f, -0.585f, -1.363f, -0.955f, -2.0f)
                horizontalLineToRelative(8.894f)
                verticalLineToRelative(-7.817f)
                curveToRelative(0.0f, -0.619f, -0.279f, -1.193f, -0.768f, -1.574f)
                lineToRelative(-5.616f, -4.396f)
                curveToRelative(-0.363f, -0.283f, -0.869f, -0.283f, -1.232f, 0.0f)
                lineToRelative(-5.616f, 4.396f)
                curveToRelative(-0.488f, 0.382f, -0.768f, 0.956f, -0.768f, 1.575f)
                verticalLineToRelative(2.712f)
                curveToRelative(-0.637f, -0.37f, -1.305f, -0.688f, -2.0f, -0.955f)
                verticalLineToRelative(-1.756f)
                curveToRelative(0.0f, -1.238f, 0.56f, -2.387f, 1.535f, -3.15f)
                lineTo(13.151f, 0.638f)
                curveToRelative(1.088f, -0.854f, 2.609f, -0.854f, 3.697f, 0.0f)
                lineToRelative(5.616f, 4.396f)
                curveToRelative(0.976f, 0.763f, 1.535f, 1.911f, 1.535f, 3.149f)
                close()
                moveTo(1.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.0f, 16.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(1.0f, 11.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -6.617f, -5.383f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(17.0f, 9.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _houseSignal!!
    }

private var _houseSignal: ImageVector? = null

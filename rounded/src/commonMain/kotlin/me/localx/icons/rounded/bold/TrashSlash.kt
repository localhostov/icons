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

public val Icons.Bold.TrashSlash: ImageVector
    get() {
        if (_trashSlash != null) {
            return _trashSlash!!
        }
        _trashSlash = Builder(name = "TrashSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.82f, 18.699f)
                curveToRelative(0.003f, -0.024f, 1.06f, -12.699f, 1.06f, -12.699f)
                horizontalLineToRelative(0.62f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4.757f)
                curveToRelative(-0.619f, -1.746f, -2.287f, -3.0f, -4.243f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.956f, 0.0f, -3.624f, 1.254f, -4.243f, 3.0f)
                horizontalLineToRelative(-1.136f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                reflectiveCurveTo(-0.146f, 1.975f, 0.439f, 2.561f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-2.74f, -2.74f)
                close()
                moveTo(18.043f, 15.922f)
                lineTo(8.121f, 6.0f)
                horizontalLineToRelative(10.749f)
                lineToRelative(-0.827f, 9.922f)
                close()
                moveTo(16.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.819f)
                curveToRelative(-2.838f, 0.0f, -5.246f, -2.215f, -5.481f, -5.043f)
                lineToRelative(-0.611f, -7.332f)
                curveToRelative(-0.069f, -0.826f, 0.544f, -1.551f, 1.37f, -1.62f)
                curveToRelative(0.831f, -0.053f, 1.551f, 0.545f, 1.619f, 1.37f)
                lineToRelative(0.611f, 7.332f)
                curveToRelative(0.107f, 1.286f, 1.202f, 2.293f, 2.492f, 2.293f)
                horizontalLineToRelative(5.819f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _trashSlash!!
    }

private var _trashSlash: ImageVector? = null

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

public val Icons.Bold.AngleDoubleSmallUp: ImageVector
    get() {
        if (_angleDoubleSmallUp != null) {
            return _angleDoubleSmallUp!!
        }
        _angleDoubleSmallUp = Builder(name = "AngleDoubleSmallUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                curveToRelative(-0.384f, 0.0f, -0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-4.938f, -4.939f)
                lineToRelative(-4.94f, 4.939f)
                curveToRelative(-0.586f, 0.586f, -1.535f, 0.586f, -2.121f, 0.0f)
                reflectiveCurveToRelative(-0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(6.001f, -6.0f)
                curveToRelative(0.281f, -0.281f, 0.663f, -0.439f, 1.061f, -0.439f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.397f, 0.0f, 0.779f, 0.158f, 1.061f, 0.439f)
                lineToRelative(5.999f, 6.0f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                close()
                moveTo(19.067f, 12.292f)
                curveToRelative(0.582f, -0.589f, 0.576f, -1.539f, -0.014f, -2.121f)
                lineToRelative(-3.922f, -3.873f)
                curveToRelative(-0.837f, -0.837f, -1.948f, -1.298f, -3.132f, -1.298f)
                reflectiveCurveToRelative(-2.295f, 0.461f, -3.124f, 1.291f)
                lineToRelative(-3.93f, 3.88f)
                curveToRelative(-0.59f, 0.582f, -0.596f, 1.532f, -0.014f, 2.121f)
                curveToRelative(0.581f, 0.59f, 1.533f, 0.595f, 2.121f, 0.014f)
                lineToRelative(3.938f, -3.887f)
                curveToRelative(0.537f, -0.539f, 1.473f, -0.546f, 2.025f, 0.007f)
                lineToRelative(3.93f, 3.88f)
                curveToRelative(0.292f, 0.289f, 0.673f, 0.433f, 1.054f, 0.433f)
                curveToRelative(0.387f, 0.0f, 0.774f, -0.149f, 1.067f, -0.446f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallUp!!
    }

private var _angleDoubleSmallUp: ImageVector? = null

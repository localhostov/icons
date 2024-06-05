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

public val Icons.Filled.RulesAlt: ImageVector
    get() {
        if (_rulesAlt != null) {
            return _rulesAlt!!
        }
        _rulesAlt = Builder(name = "RulesAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 17.974f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.974f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(5.0f, 15.974f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 0.074f)
                curveTo(3.672f, 0.55f, 2.0f, 2.598f, 2.0f, 4.974f)
                verticalLineToRelative(12.025f)
                curveToRelative(0.699f, -0.527f, 1.525f, -0.86f, 2.395f, -0.964f)
                curveToRelative(0.199f, -0.041f, 0.402f, -0.061f, 0.605f, -0.061f)
                close()
                moveTo(22.0f, 4.974f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-14.0f)
                lineTo(8.0f, -0.026f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(16.023f, 11.0f)
                lineToRelative(1.293f, -1.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(-1.293f, 1.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(1.293f, 1.293f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-1.293f, -1.293f)
                close()
                moveTo(18.215f, 2.301f)
                curveToRelative(-0.394f, -0.403f, -1.042f, -0.401f, -1.433f, 0.004f)
                lineToRelative(-2.22f, 2.202f)
                lineToRelative(-1.138f, -1.183f)
                curveToRelative(-0.392f, -0.414f, -1.05f, -0.417f, -1.445f, -0.006f)
                curveToRelative(-0.37f, 0.384f, -0.372f, 0.992f, -0.006f, 1.379f)
                lineToRelative(1.131f, 1.175f)
                curveToRelative(0.787f, 0.832f, 2.109f, 0.839f, 2.905f, 0.015f)
                lineToRelative(2.211f, -2.193f)
                curveToRelative(0.376f, -0.389f, 0.374f, -1.007f, -0.004f, -1.394f)
                close()
            }
        }
        .build()
        return _rulesAlt!!
    }

private var _rulesAlt: ImageVector? = null

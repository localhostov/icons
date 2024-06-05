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

public val Icons.Filled.Poop: ImageVector
    get() {
        if (_poop != null) {
            return _poop!!
        }
        _poop = Builder(name = "Poop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.32f, 17.034f)
                horizontalLineToRelative(-2.32f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-0.034f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.357f)
                curveToRelative(1.308f, 0.0f, 2.499f, -0.941f, 2.63f, -2.242f)
                curveToRelative(0.15f, -1.497f, -1.021f, -2.758f, -2.487f, -2.758f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-0.107f)
                curveToRelative(0.0f, -0.493f, 0.4f, -0.893f, 0.893f, -0.893f)
                curveToRelative(0.996f, 0.0f, 1.92f, -0.681f, 2.08f, -1.664f)
                curveToRelative(0.204f, -1.253f, -0.758f, -2.336f, -1.973f, -2.336f)
                horizontalLineToRelative(-2.131f)
                curveToRelative(-0.317f, -1.43f, -1.219f, -3.121f, -2.372f, -3.854f)
                curveToRelative(-0.596f, -0.379f, -1.373f, -0.022f, -1.486f, 0.675f)
                curveToRelative(-0.242f, 1.492f, -0.89f, 2.515f, -1.492f, 3.179f)
                horizontalLineToRelative(-4.412f)
                curveToRelative(-0.996f, 0.0f, -1.92f, 0.681f, -2.08f, 1.664f)
                curveToRelative(-0.204f, 1.253f, 0.758f, 2.336f, 1.973f, 2.336f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.357f)
                curveToRelative(-1.308f, 0.0f, -2.499f, 0.941f, -2.63f, 2.242f)
                curveToRelative(-0.15f, 1.496f, 1.021f, 2.758f, 2.487f, 2.758f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(0.004f)
                curveToRelative(0.0f, 0.551f, -0.446f, 0.998f, -0.996f, 1.0f)
                lineToRelative(-8.52f, 0.03f)
                curveTo(1.497f, 17.034f, -0.1f, 18.695f, 0.005f, 20.704f)
                curveToRelative(0.099f, 1.884f, 1.789f, 3.296f, 3.675f, 3.296f)
                horizontalLineToRelative(16.837f)
                curveToRelative(1.986f, 0.0f, 3.583f, -1.662f, 3.478f, -3.671f)
                curveToRelative(-0.099f, -1.883f, -1.789f, -3.296f, -3.675f, -3.296f)
                close()
            }
        }
        .build()
        return _poop!!
    }

private var _poop: ImageVector? = null

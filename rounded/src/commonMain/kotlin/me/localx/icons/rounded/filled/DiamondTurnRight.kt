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

public val Icons.Filled.DiamondTurnRight: ImageVector
    get() {
        if (_diamondTurnRight != null) {
            return _diamondTurnRight!!
        }
        _diamondTurnRight = Builder(name = "DiamondTurnRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.543f, 8.481f)
                lineTo(15.519f, 1.457f)
                curveToRelative(-1.939f, -1.939f, -5.098f, -1.939f, -7.037f, 0.0f)
                lineTo(1.457f, 8.481f)
                curveToRelative(-1.939f, 1.94f, -1.939f, 5.097f, 0.0f, 7.037f)
                lineToRelative(7.024f, 7.024f)
                curveToRelative(0.97f, 0.97f, 2.244f, 1.454f, 3.519f, 1.454f)
                reflectiveCurveToRelative(2.549f, -0.484f, 3.519f, -1.454f)
                lineToRelative(7.024f, -7.024f)
                curveToRelative(1.939f, -1.94f, 1.939f, -5.097f, 0.0f, -7.037f)
                close()
                moveTo(17.128f, 13.121f)
                lineToRelative(-2.421f, 2.421f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.128f, -2.128f)
                horizontalLineToRelative(-5.421f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(5.421f)
                lineToRelative(-2.128f, -2.128f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.421f, 2.421f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.072f, 0.0f, 4.242f)
                close()
            }
        }
        .build()
        return _diamondTurnRight!!
    }

private var _diamondTurnRight: ImageVector? = null

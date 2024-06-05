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

public val Icons.Filled.DownFromBracket: ImageVector
    get() {
        if (_downFromBracket != null) {
            return _downFromBracket!!
        }
        _downFromBracket = Builder(name = "DownFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 9.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 2.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                curveTo(0.0f, 2.019f, 2.019f, 0.0f, 4.5f, 0.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(14.817f, 22.863f)
                curveToRelative(0.007f, -0.007f, 0.014f, -0.015f, 0.021f, -0.021f)
                lineToRelative(6.326f, -6.724f)
                curveToRelative(0.868f, -0.867f, 1.117f, -2.11f, 0.65f, -3.245f)
                curveToRelative(-0.466f, -1.134f, -1.518f, -1.842f, -2.749f, -1.848f)
                horizontalLineToRelative(-2.068f)
                lineToRelative(-0.023f, -2.026f)
                curveToRelative(0.0f, -2.191f, -1.783f, -3.974f, -3.974f, -3.974f)
                horizontalLineToRelative(-1.982f)
                curveToRelative(-2.191f, 0.0f, -3.974f, 1.783f, -3.974f, 3.977f)
                lineToRelative(0.005f, 1.998f)
                horizontalLineToRelative(-2.057f)
                curveToRelative(-1.228f, 0.004f, -2.28f, 0.712f, -2.747f, 1.846f)
                curveToRelative(-0.467f, 1.134f, -0.217f, 2.378f, 0.626f, 3.219f)
                lineToRelative(6.331f, 6.797f)
                curveToRelative(0.775f, 0.774f, 1.792f, 1.161f, 2.809f, 1.161f)
                reflectiveCurveToRelative(2.033f, -0.387f, 2.807f, -1.16f)
                close()
                moveTo(14.11f, 22.156f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _downFromBracket!!
    }

private var _downFromBracket: ImageVector? = null

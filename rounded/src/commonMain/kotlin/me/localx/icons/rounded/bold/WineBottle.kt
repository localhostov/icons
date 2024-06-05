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

public val Icons.Bold.WineBottle: ImageVector
    get() {
        if (_wineBottle != null) {
            return _wineBottle!!
        }
        _wineBottle = Builder(name = "WineBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.314f, 7.548f)
                lineToRelative(-2.347f, -1.397f)
                lineToRelative(0.032f, -4.641f)
                curveToRelative(0.003f, -0.399f, -0.154f, -0.784f, -0.436f, -1.067f)
                curveToRelative(-0.281f, -0.283f, -0.665f, -0.443f, -1.064f, -0.443f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(4.628f)
                lineToRelative(-2.348f, 1.421f)
                curveToRelative(-1.636f, 0.99f, -2.652f, 2.793f, -2.652f, 4.706f)
                verticalLineToRelative(6.245f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-6.226f)
                curveToRelative(0.0f, -1.928f, -1.029f, -3.739f, -2.686f, -4.726f)
                close()
                moveTo(18.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(6.034f, 12.0f)
                curveToRelative(0.081f, -0.771f, 0.503f, -1.479f, 1.172f, -1.884f)
                lineToRelative(3.071f, -1.858f)
                curveToRelative(0.449f, -0.271f, 0.724f, -0.758f, 0.724f, -1.283f)
                verticalLineToRelative(-1.974f)
                horizontalLineToRelative(1.976f)
                lineToRelative(-0.014f, 1.99f)
                curveToRelative(-0.004f, 0.532f, 0.275f, 1.027f, 0.732f, 1.299f)
                lineToRelative(3.085f, 1.836f)
                curveToRelative(0.753f, 0.449f, 1.221f, 1.272f, 1.221f, 2.148f)
                verticalLineToRelative(6.226f)
                close()
            }
        }
        .build()
        return _wineBottle!!
    }

private var _wineBottle: ImageVector? = null

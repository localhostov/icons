package me.localx.icons.rounded.outline

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

public val Icons.Outline.Ux: ImageVector
    get() {
        if (_ux != null) {
            return _ux!!
        }
        _ux = Builder(name = "Ux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(12.0f, 8.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(19.871f, 8.49f)
                lineToRelative(-1.974f, 3.51f)
                lineToRelative(1.974f, 3.51f)
                curveToRelative(0.271f, 0.481f, 0.101f, 1.091f, -0.381f, 1.362f)
                curveToRelative(-0.155f, 0.087f, -0.323f, 0.128f, -0.489f, 0.128f)
                curveToRelative(-0.35f, 0.0f, -0.688f, -0.184f, -0.872f, -0.51f)
                lineToRelative(-1.379f, -2.451f)
                lineToRelative(-1.379f, 2.451f)
                curveToRelative(-0.183f, 0.326f, -0.522f, 0.51f, -0.872f, 0.51f)
                curveToRelative(-0.166f, 0.0f, -0.334f, -0.041f, -0.489f, -0.128f)
                curveToRelative(-0.481f, -0.271f, -0.652f, -0.88f, -0.381f, -1.362f)
                lineToRelative(1.974f, -3.51f)
                lineToRelative(-1.974f, -3.51f)
                curveToRelative(-0.271f, -0.481f, -0.101f, -1.091f, 0.381f, -1.362f)
                curveToRelative(0.482f, -0.271f, 1.09f, -0.1f, 1.361f, 0.381f)
                lineToRelative(1.379f, 2.451f)
                lineToRelative(1.379f, -2.451f)
                curveToRelative(0.27f, -0.481f, 0.878f, -0.653f, 1.361f, -0.381f)
                curveToRelative(0.481f, 0.271f, 0.652f, 0.88f, 0.381f, 1.362f)
                close()
            }
        }
        .build()
        return _ux!!
    }

private var _ux: ImageVector? = null

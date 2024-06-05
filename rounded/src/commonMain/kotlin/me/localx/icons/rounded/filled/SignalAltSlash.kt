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

public val Icons.Filled.SignalAltSlash: ImageVector
    get() {
        if (_signalAltSlash != null) {
            return _signalAltSlash!!
        }
        _signalAltSlash = Builder(name = "SignalAltSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 23.707f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, 0.391f, -1.023f, 0.392f, -1.414f, 0.001f)
                lineTo(0.294f, 1.708f)
                curveToRelative(-0.391f, -0.39f, -0.392f, -1.023f, -0.001f, -1.414f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, -0.391f, 1.024f, -0.392f, 1.415f, -0.001f)
                lineToRelative(11.293f, 11.313f)
                verticalLineToRelative(-5.605f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(9.598f)
                reflectiveCurveToRelative(2.0f, 1.996f, 2.0f, 1.996f)
                lineTo(19.001f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(19.588f)
                reflectiveCurveToRelative(0.705f, 0.705f, 0.705f, 0.705f)
                curveToRelative(0.391f, 0.39f, 0.392f, 1.023f, 0.002f, 1.414f)
                close()
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(9.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-6.739f)
                lineToRelative(-4.0f, -3.993f)
                verticalLineToRelative(10.731f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(15.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-0.749f)
                lineToRelative(-4.0f, -3.993f)
                verticalLineToRelative(4.742f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _signalAltSlash!!
    }

private var _signalAltSlash: ImageVector? = null

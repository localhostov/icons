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

public val Icons.Outline.CameraSecurity: ImageVector
    get() {
        if (_cameraSecurity != null) {
            return _cameraSecurity!!
        }
        _cameraSecurity = Builder(name = "CameraSecurity", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(0.033f)
                curveToRelative(-0.246f, 0.249f, -0.472f, 0.517f, -0.674f, 0.806f)
                curveToRelative(-0.428f, 0.611f, -0.478f, 1.37f, -0.135f, 2.028f)
                curveToRelative(0.375f, 0.719f, 1.138f, 1.166f, 1.991f, 1.166f)
                horizontalLineToRelative(7.568f)
                curveToRelative(0.854f, 0.0f, 1.617f, -0.447f, 1.991f, -1.166f)
                curveToRelative(0.343f, -0.659f, 0.293f, -1.417f, -0.135f, -2.029f)
                curveToRelative(-0.202f, -0.288f, -0.428f, -0.557f, -0.674f, -0.805f)
                horizontalLineToRelative(0.033f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(21.998f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(16.002f, 21.908f)
                curveToRelative(-0.007f, 0.018f, -0.068f, 0.092f, -0.218f, 0.092f)
                horizontalLineToRelative(-7.568f)
                curveToRelative(-0.127f, 0.0f, -0.191f, -0.053f, -0.211f, -0.053f)
                curveToRelative(-0.001f, 0.0f, -0.002f, 0.0f, -0.003f, 0.0f)
                curveToRelative(0.844f, -1.202f, 2.375f, -1.948f, 3.999f, -1.948f)
                reflectiveCurveToRelative(3.159f, 0.748f, 4.002f, 1.908f)
                close()
                moveTo(20.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 18.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _cameraSecurity!!
    }

private var _cameraSecurity: ImageVector? = null

package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.001f)
                reflectiveCurveToRelative(0.0f, 0.004f, 0.0f, 0.005f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.003f, 0.0f, -0.005f)
                close()
                moveTo(21.0f, 19.859f)
                verticalLineToRelative(-4.617f)
                lineToRelative(-2.0f, 2.014f)
                verticalLineToRelative(3.865f)
                lineToRelative(-0.439f, 0.439f)
                curveToRelative(-0.1f, 0.1f, -2.486f, 2.439f, -6.561f, 2.439f)
                reflectiveCurveToRelative(-6.461f, -2.34f, -6.561f, -2.439f)
                lineToRelative(-0.439f, -0.439f)
                verticalLineToRelative(-3.869f)
                lineToRelative(-2.0f, -2.036f)
                verticalLineToRelative(4.643f)
                curveTo(1.149f, 17.756f, 0.01f, 15.013f, 0.0f, 12.0f)
                curveTo(0.042f, 5.418f, 5.409f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(11.958f, 5.418f, 12.0f, 12.0f)
                curveToRelative(-0.01f, 3.013f, -1.149f, 5.756f, -3.0f, 7.859f)
                close()
                moveTo(16.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(3.788f)
                curveToRelative(0.657f, 0.461f, 2.031f, 1.212f, 4.0f, 1.212f)
                reflectiveCurveToRelative(3.338f, -0.749f, 4.0f, -1.213f)
                verticalLineToRelative(-3.787f)
                close()
                moveTo(20.948f, 11.037f)
                curveToRelative(-0.482f, -4.511f, -4.311f, -8.037f, -8.948f, -8.037f)
                reflectiveCurveTo(3.559f, 6.502f, 3.057f, 10.993f)
                lineToRelative(1.972f, 2.007f)
                horizontalLineToRelative(13.971f)
                lineToRelative(1.949f, -1.963f)
                close()
                moveTo(17.913f, 7.409f)
                curveToRelative(-1.656f, -1.122f, -3.812f, 0.278f, -4.727f, 1.629f)
                curveToRelative(0.0f, 0.0f, 2.217f, 0.294f, 3.044f, 0.855f)
                curveToRelative(0.828f, 0.561f, 1.923f, 2.511f, 1.923f, 2.511f)
                curveToRelative(0.915f, -1.351f, 1.416f, -3.872f, -0.24f, -4.994f)
                close()
                moveTo(24.0f, 12.005f)
                reflectiveCurveToRelative(0.0f, -0.003f, 0.0f, -0.005f)
                curveToRelative(0.0f, 0.003f, 0.0f, 0.004f, 0.0f, 0.005f)
                close()
                moveTo(6.086f, 7.409f)
                curveToRelative(-1.656f, 1.122f, -1.155f, 3.644f, -0.24f, 4.994f)
                curveToRelative(0.0f, 0.0f, 1.095f, -1.95f, 1.923f, -2.511f)
                curveToRelative(0.828f, -0.561f, 3.044f, -0.855f, 3.044f, -0.855f)
                curveToRelative(-0.915f, -1.351f, -3.072f, -2.75f, -4.727f, -1.629f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null

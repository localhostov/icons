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

public val Icons.Bold.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.871f, 15.281f)
                curveToRelative(-0.161f, -0.378f, -0.264f, -0.751f, -0.32f, -1.115f)
                curveToRelative(-0.094f, -0.608f, 0.659f, -0.977f, 1.094f, -0.542f)
                lineToRelative(3.231f, 3.231f)
                curveToRelative(0.435f, 0.435f, 0.066f, 1.187f, -0.542f, 1.094f)
                curveToRelative(-0.364f, -0.056f, -0.736f, -0.16f, -1.115f, -0.32f)
                curveToRelative(-1.048f, -0.444f, -1.904f, -1.3f, -2.348f, -2.348f)
                close()
                moveTo(23.56f, 23.561f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                reflectiveCurveTo(1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(3.922f, 3.922f)
                lineToRelative(1.393f, -1.539f)
                curveToRelative(0.472f, -0.521f, 1.147f, -0.822f, 1.854f, -0.822f)
                horizontalLineToRelative(4.541f)
                curveToRelative(0.706f, 0.0f, 1.382f, 0.301f, 1.854f, 0.824f)
                lineToRelative(2.008f, 2.219f)
                curveToRelative(2.765f, 0.34f, 4.867f, 2.658f, 4.867f, 5.457f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.946f, -0.243f, 1.867f, -0.698f, 2.681f)
                lineToRelative(1.258f, 1.258f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                close()
                moveTo(8.607f, 6.486f)
                lineToRelative(2.588f, 2.588f)
                curveToRelative(0.261f, -0.048f, 0.53f, -0.074f, 0.805f, -0.074f)
                curveToRelative(2.485f, 0.0f, 4.5f, 2.015f, 4.5f, 4.5f)
                curveToRelative(0.0f, 0.275f, -0.026f, 0.544f, -0.074f, 0.805f)
                lineToRelative(3.548f, 3.548f)
                curveToRelative(0.017f, -0.116f, 0.025f, -0.235f, 0.025f, -0.354f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.424f, 0.0f, -0.899f, -0.18f, -1.184f, -0.493f)
                lineToRelative(-2.269f, -2.507f)
                horizontalLineToRelative(-4.096f)
                lineToRelative(-1.345f, 1.486f)
                close()
                moveTo(14.5f, 20.0f)
                lineTo(6.5f, 20.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null

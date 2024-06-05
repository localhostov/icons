package me.localx.icons.straight.outline

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

public val Icons.Outline.UserTag: ImageVector
    get() {
        if (_userTag != null) {
            return _userTag!!
        }
        _userTag = Builder(name = "UserTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(8.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(23.169f, 16.111f)
                lineToRelative(-4.745f, -4.764f)
                lineToRelative(-6.442f, 0.852f)
                lineToRelative(-0.5f, 6.266f)
                lineToRelative(4.683f, 4.701f)
                curveToRelative(0.535f, 0.532f, 1.244f, 0.825f, 1.998f, 0.825f)
                curveToRelative(0.004f, 0.0f, 0.008f, 0.0f, 0.012f, 0.0f)
                curveToRelative(0.759f, -0.003f, 1.47f, -0.302f, 2.003f, -0.842f)
                lineToRelative(3.005f, -3.044f)
                curveToRelative(1.092f, -1.105f, 1.084f, -2.898f, -0.014f, -3.993f)
                close()
                moveTo(21.76f, 18.7f)
                lineToRelative(-3.005f, 3.043f)
                curveToRelative(-0.157f, 0.159f, -0.366f, 0.247f, -0.588f, 0.248f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.222f, 0.0f, -0.43f, -0.087f, -0.584f, -0.24f)
                lineToRelative(-4.029f, -4.046f)
                lineToRelative(0.298f, -3.734f)
                lineToRelative(3.858f, -0.51f)
                lineToRelative(4.049f, 4.064f)
                curveToRelative(0.324f, 0.322f, 0.326f, 0.85f, 0.005f, 1.175f)
                close()
                moveTo(4.5f, 14.0f)
                horizontalLineToRelative(5.332f)
                lineToRelative(-0.16f, 2.0f)
                horizontalLineToRelative(-5.173f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(18.0f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _userTag!!
    }

private var _userTag: ImageVector? = null

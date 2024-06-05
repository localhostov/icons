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

public val Icons.Bold.WindTurbine: ImageVector
    get() {
        if (_windTurbine != null) {
            return _windTurbine!!
        }
        _windTurbine = Builder(name = "WindTurbine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.902f, 13.184f)
                curveToRelative(-0.146f, -0.12f, -3.361f, -2.761f, -6.077f, -4.552f)
                curveToRelative(-0.391f, -3.23f, -1.322f, -7.286f, -1.364f, -7.469f)
                lineToRelative(-0.269f, -1.163f)
                horizontalLineToRelative(-4.387f)
                lineToRelative(-0.269f, 1.163f)
                curveToRelative(-0.042f, 0.184f, -0.973f, 4.239f, -1.364f, 7.469f)
                curveToRelative(-2.716f, 1.791f, -5.931f, 4.432f, -6.077f, 4.552f)
                lineToRelative(-0.921f, 0.759f)
                lineToRelative(1.957f, 3.927f)
                lineToRelative(1.16f, -0.279f)
                curveToRelative(0.167f, -0.04f, 3.362f, -0.812f, 6.22f, -1.745f)
                verticalLineToRelative(5.155f)
                horizontalLineToRelative(-3.522f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.045f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.523f)
                verticalLineToRelative(-5.146f)
                curveToRelative(2.851f, 0.93f, 6.026f, 1.696f, 6.193f, 1.736f)
                lineToRelative(1.16f, 0.279f)
                lineToRelative(1.957f, -3.927f)
                lineToRelative(-0.921f, -0.759f)
                close()
                moveTo(12.551f, 12.331f)
                lineToRelative(-0.552f, -0.219f)
                lineToRelative(-0.552f, 0.219f)
                curveToRelative(-1.678f, 0.664f, -4.026f, 1.339f, -5.718f, 1.793f)
                curveToRelative(1.315f, -1.025f, 3.148f, -2.404f, 4.653f, -3.346f)
                lineToRelative(0.625f, -0.392f)
                lineToRelative(0.072f, -0.734f)
                curveToRelative(0.172f, -1.765f, 0.588f, -4.022f, 0.919f, -5.657f)
                curveToRelative(0.331f, 1.634f, 0.748f, 3.89f, 0.919f, 5.657f)
                lineToRelative(0.072f, 0.734f)
                lineToRelative(0.625f, 0.392f)
                curveToRelative(1.503f, 0.941f, 3.338f, 2.321f, 4.653f, 3.346f)
                curveToRelative(-1.691f, -0.454f, -4.04f, -1.13f, -5.717f, -1.793f)
                close()
            }
        }
        .build()
        return _windTurbine!!
    }

private var _windTurbine: ImageVector? = null

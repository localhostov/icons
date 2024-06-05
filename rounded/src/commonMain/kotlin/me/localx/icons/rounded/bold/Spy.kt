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

public val Icons.Bold.Spy: ImageVector
    get() {
        if (_spy != null) {
            return _spy!!
        }
        _spy = Builder(name = "Spy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.57f, 14.952f)
                lineToRelative(1.659f, -2.262f)
                curveToRelative(0.503f, -0.713f, 0.282f, -1.694f, -0.472f, -2.132f)
                curveToRelative(-0.253f, -0.147f, -0.68f, -0.3f, -1.146f, -0.451f)
                curveToRelative(0.247f, -0.657f, 0.389f, -1.365f, 0.389f, -2.107f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.544f)
                curveToRelative(-0.255f, -1.763f, -1.69f, -5.0f, -3.456f, -5.0f)
                curveToRelative(-1.036f, 0.0f, -1.679f, 0.794f, -2.196f, 1.432f)
                curveToRelative(-0.084f, 0.104f, -0.196f, 0.242f, -0.304f, 0.365f)
                curveToRelative(-0.107f, -0.123f, -0.22f, -0.262f, -0.304f, -0.365f)
                curveToRelative(-0.518f, -0.638f, -1.16f, -1.432f, -2.196f, -1.432f)
                curveToRelative(-1.765f, 0.0f, -3.201f, 3.237f, -3.456f, 5.0f)
                horizontalLineToRelative(-0.544f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.824f, 0.167f, 1.61f, 0.47f, 2.326f)
                curveToRelative(-0.439f, 0.26f, -0.841f, 0.523f, -1.097f, 0.672f)
                curveToRelative(-0.754f, 0.438f, -0.975f, 1.419f, -0.472f, 2.132f)
                lineToRelative(1.441f, 1.896f)
                curveToRelative(-2.085f, 1.69f, -3.341f, 4.225f, -3.341f, 6.974f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.799f, 0.808f, -3.461f, 2.154f, -4.588f)
                lineToRelative(2.346f, 3.088f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                lineToRelative(2.296f, -3.13f)
                curveToRelative(1.376f, 1.127f, 2.204f, 2.808f, 2.204f, 4.63f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.789f, -1.291f, -5.359f, -3.43f, -7.048f)
                close()
                moveTo(15.0f, 8.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(10.413f, 13.78f)
                curveToRelative(0.507f, 0.139f, 1.037f, 0.22f, 1.587f, 0.22f)
                reflectiveCurveToRelative(1.081f, -0.081f, 1.587f, -0.22f)
                lineToRelative(-1.587f, 5.22f)
                lineToRelative(-1.587f, -5.22f)
                close()
            }
        }
        .build()
        return _spy!!
    }

private var _spy: ImageVector? = null

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

public val Icons.Outline.CarTunnel: ImageVector
    get() {
        if (_carTunnel != null) {
            return _carTunnel!!
        }
        _carTunnel = Builder(name = "CarTunnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-11.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(19.353f, 15.014f)
                curveToRelative(0.432f, 1.21f, 0.647f, 2.455f, 0.647f, 3.718f)
                curveToRelative(0.0f, 1.353f, -0.826f, 2.516f, -2.0f, 3.012f)
                verticalLineToRelative(0.756f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.756f)
                curveToRelative(-1.174f, -0.496f, -2.0f, -1.659f, -2.0f, -3.012f)
                curveToRelative(0.0f, -1.263f, 0.215f, -2.508f, 0.641f, -3.699f)
                lineToRelative(0.967f, -2.708f)
                curveToRelative(0.71f, -1.986f, 2.602f, -3.318f, 4.709f, -3.318f)
                horizontalLineToRelative(0.01f)
                lineToRelative(3.308f, 0.007f)
                curveToRelative(2.059f, 0.004f, 3.933f, 1.3f, 4.665f, 3.226f)
                lineToRelative(1.053f, 2.775f)
                close()
                moveTo(7.492f, 12.997f)
                lineToRelative(-0.358f, 1.003f)
                horizontalLineToRelative(9.695f)
                lineToRelative(-0.399f, -1.052f)
                curveToRelative(-0.438f, -1.155f, -1.563f, -1.933f, -2.798f, -1.936f)
                lineToRelative(-3.308f, -0.007f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-1.265f, 0.0f, -2.399f, 0.8f, -2.825f, 1.991f)
                close()
                moveTo(18.0f, 18.732f)
                curveToRelative(0.0f, -0.93f, -0.151f, -1.847f, -0.433f, -2.732f)
                horizontalLineToRelative(-1.567f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.567f)
                curveToRelative(-0.282f, 0.885f, -0.433f, 1.801f, -0.433f, 2.732f)
                curveToRelative(0.0f, 0.699f, 0.569f, 1.268f, 1.268f, 1.268f)
                horizontalLineToRelative(9.464f)
                curveToRelative(0.699f, 0.0f, 1.268f, -0.569f, 1.268f, -1.268f)
                close()
            }
        }
        .build()
        return _carTunnel!!
    }

private var _carTunnel: ImageVector? = null

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

public val Icons.Filled.GuitarElectric: ImageVector
    get() {
        if (_guitarElectric != null) {
            return _guitarElectric!!
        }
        _guitarElectric = Builder(name = "GuitarElectric", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 0.293f)
                curveToRelative(-0.296f, -0.296f, -0.732f, -0.368f, -1.096f, -0.214f)
                curveToRelative(-0.46f, 0.069f, -4.611f, 0.722f, -4.611f, 1.765f)
                curveToRelative(0.0f, 0.212f, 0.169f, 1.411f, 0.853f, 1.889f)
                lineToRelative(-5.367f, 5.367f)
                curveToRelative(-0.995f, -1.72f, -0.758f, -3.962f, 0.712f, -5.432f)
                curveToRelative(0.195f, -0.195f, 0.293f, -0.451f, 0.293f, -0.707f)
                reflectiveCurveToRelative(-0.098f, -0.512f, -0.293f, -0.707f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                curveToRelative(-0.64f, 0.64f, -1.051f, 1.02f, -1.351f, 1.298f)
                curveToRelative(-0.71f, 0.657f, -0.908f, 0.859f, -1.713f, 2.075f)
                curveToRelative(-1.075f, 1.625f, -2.094f, 2.283f, -4.361f, 2.819f)
                curveToRelative(-0.279f, 0.066f, -0.547f, 0.125f, -0.804f, 0.181f)
                curveToRelative(-1.22f, 0.267f, -2.273f, 0.498f, -2.953f, 1.177f)
                curveToRelative(-3.51f, 3.51f, -0.566f, 6.538f, 2.031f, 9.209f)
                lineToRelative(1.213f, 1.261f)
                curveToRelative(1.887f, 1.985f, 3.517f, 3.699f, 5.548f, 3.724f)
                curveToRelative(0.016f, 0.0f, 0.031f, 0.0f, 0.046f, 0.0f)
                curveToRelative(1.133f, 0.0f, 2.215f, -0.531f, 3.306f, -1.622f)
                curveToRelative(0.707f, -0.707f, 1.082f, -1.948f, 1.498f, -3.499f)
                curveToRelative(0.573f, -2.132f, 1.158f, -2.902f, 3.13f, -4.12f)
                curveToRelative(1.498f, -0.925f, 2.843f, -2.557f, 2.899f, -2.626f)
                curveToRelative(0.32f, -0.391f, 0.298f, -0.959f, -0.051f, -1.324f)
                curveToRelative(-0.349f, -0.365f, -0.915f, -0.412f, -1.321f, -0.11f)
                curveToRelative(-1.488f, 1.11f, -3.476f, 1.034f, -5.064f, -0.123f)
                lineTo(23.707f, 1.707f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(9.813f, 18.101f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.5f, -2.5f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(12.576f, 15.338f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.5f, -2.5f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _guitarElectric!!
    }

private var _guitarElectric: ImageVector? = null

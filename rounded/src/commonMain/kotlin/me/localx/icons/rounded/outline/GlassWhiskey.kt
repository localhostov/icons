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

public val Icons.Outline.GlassWhiskey: ImageVector
    get() {
        if (_glassWhiskey != null) {
            return _glassWhiskey!!
        }
        _glassWhiskey = Builder(name = "GlassWhiskey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.993f, 4.298f)
                curveToRelative(0.084f, -0.842f, -0.193f, -1.685f, -0.762f, -2.312f)
                curveToRelative(-0.567f, -0.627f, -1.378f, -0.986f, -2.224f, -0.986f)
                lineTo(3.007f, 1.0f)
                curveToRelative(-0.842f, 0.001f, -1.65f, 0.358f, -2.218f, 0.981f)
                curveTo(0.223f, 2.604f, -0.059f, 3.441f, 0.02f, 4.28f)
                lineToRelative(1.324f, 14.186f)
                curveToRelative(0.241f, 2.586f, 2.381f, 4.536f, 4.979f, 4.536f)
                horizontalLineToRelative(11.275f)
                curveToRelative(2.58f, -0.001f, 4.72f, -1.937f, 4.976f, -4.504f)
                lineToRelative(1.42f, -14.199f)
                close()
                moveTo(2.268f, 3.328f)
                curveToRelative(0.192f, -0.211f, 0.454f, -0.327f, 0.739f, -0.327f)
                horizontalLineToRelative(18.001f)
                curveToRelative(0.286f, -0.001f, 0.549f, 0.115f, 0.741f, 0.327f)
                curveToRelative(0.192f, 0.212f, 0.282f, 0.486f, 0.254f, 0.771f)
                lineToRelative(-0.99f, 9.9f)
                lineTo(2.936f, 13.999f)
                reflectiveCurveToRelative(-0.925f, -9.906f, -0.925f, -9.906f)
                curveToRelative(-0.027f, -0.284f, 0.064f, -0.556f, 0.256f, -0.766f)
                close()
                moveTo(17.598f, 21.0f)
                lineTo(6.322f, 21.0f)
                curveToRelative(-1.559f, 0.001f, -2.843f, -1.168f, -2.986f, -2.72f)
                lineToRelative(-0.213f, -2.279f)
                horizontalLineToRelative(17.69f)
                reflectiveCurveToRelative(-0.23f, 2.298f, -0.23f, 2.298f)
                curveToRelative(-0.153f, 1.54f, -1.438f, 2.701f, -2.985f, 2.701f)
                close()
            }
        }
        .build()
        return _glassWhiskey!!
    }

private var _glassWhiskey: ImageVector? = null

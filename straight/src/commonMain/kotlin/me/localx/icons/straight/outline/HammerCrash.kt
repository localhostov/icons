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

public val Icons.Outline.HammerCrash: ImageVector
    get() {
        if (_hammerCrash != null) {
            return _hammerCrash!!
        }
        _hammerCrash = Builder(name = "HammerCrash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.795f, 9.652f)
                lineToRelative(0.924f, -1.774f)
                curveToRelative(0.635f, -1.223f, 0.156f, -2.735f, -1.08f, -3.379f)
                lineTo(10.825f, 1.092f)
                curveTo(6.037f, -1.396f, 2.349f, 0.967f, 1.067f, 2.562f)
                lineToRelative(-0.77f, 0.959f)
                lineToRelative(6.789f, 3.459f)
                lineTo(0.016f, 21.205f)
                lineToRelative(5.325f, 2.768f)
                lineToRelative(7.083f, -14.273f)
                lineToRelative(2.001f, 1.019f)
                curveToRelative(0.361f, 0.188f, 0.754f, 0.282f, 1.149f, 0.282f)
                curveToRelative(0.254f, 0.0f, 0.509f, -0.039f, 0.757f, -0.117f)
                curveToRelative(0.637f, -0.201f, 1.157f, -0.639f, 1.464f, -1.231f)
                close()
                moveTo(4.455f, 21.258f)
                lineToRelative(-1.774f, -0.922f)
                lineTo(8.868f, 7.888f)
                lineToRelative(1.774f, 0.904f)
                lineToRelative(-6.187f, 12.466f)
                close()
                moveTo(16.944f, 6.956f)
                lineToRelative(-0.924f, 1.774f)
                curveToRelative(-0.083f, 0.16f, -0.219f, 0.223f, -0.292f, 0.246f)
                curveToRelative(-0.075f, 0.024f, -0.225f, 0.048f, -0.389f, -0.036f)
                lineTo(3.605f, 2.962f)
                curveToRelative(1.17f, -0.791f, 3.341f, -1.631f, 6.312f, -0.088f)
                lineToRelative(6.813f, 3.406f)
                curveToRelative(0.245f, 0.128f, 0.341f, 0.431f, 0.215f, 0.676f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(18.72f, 11.682f)
                lineToRelative(1.85f, 2.362f)
                lineToRelative(-1.574f, 1.232f)
                lineToRelative(-1.85f, -2.362f)
                lineToRelative(1.574f, -1.232f)
                close()
                moveTo(20.836f, 8.629f)
                lineToRelative(2.613f, 1.473f)
                lineToRelative(-0.982f, 1.742f)
                lineToRelative(-2.613f, -1.473f)
                lineToRelative(0.982f, -1.742f)
                close()
            }
        }
        .build()
        return _hammerCrash!!
    }

private var _hammerCrash: ImageVector? = null

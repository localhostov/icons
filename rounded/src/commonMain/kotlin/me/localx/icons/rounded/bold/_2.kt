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

public val Icons.Bold._2: ImageVector
    get() {
        if (__2 != null) {
            return __2!!
        }
        __2 = Builder(name = "_2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 24.0f)
                horizontalLineTo(6.893f)
                curveToRelative(-1.064f, 0.0f, -2.039f, -0.582f, -2.544f, -1.517f)
                curveToRelative(-0.508f, -0.942f, -0.458f, -2.083f, 0.131f, -2.98f)
                curveToRelative(1.198f, -1.825f, 3.409f, -3.025f, 5.75f, -4.296f)
                curveToRelative(4.335f, -2.354f, 7.146f, -4.179f, 6.728f, -7.962f)
                curveToRelative(-0.264f, -2.38f, -2.441f, -4.245f, -4.958f, -4.245f)
                curveToRelative(-2.757f, 0.0f, -5.001f, 2.244f, -5.001f, 5.001f)
                verticalLineToRelative(0.496f)
                curveToRelative(0.002f, 0.829f, -0.667f, 1.501f, -1.496f, 1.503f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.827f, 0.0f, -1.499f, -0.669f, -1.5f, -1.497f)
                verticalLineToRelative(-0.499f)
                curveToRelative(0.0f, -4.415f, 3.588f, -8.004f, 8.0f, -8.004f)
                curveToRelative(4.09f, 0.0f, 7.503f, 2.973f, 7.939f, 6.915f)
                curveToRelative(0.671f, 6.07f, -4.291f, 8.764f, -8.277f, 10.929f)
                curveToRelative(-1.916f, 1.04f, -3.73f, 2.025f, -4.569f, 3.157f)
                horizontalLineToRelative(11.407f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return __2!!
    }

private var __2: ImageVector? = null

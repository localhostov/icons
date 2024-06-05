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

public val Icons.Bold.Messages: ImageVector
    get() {
        if (_messages != null) {
            return _messages!!
        }
        _messages = Builder(name = "Messages", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.385f, 6.613f)
                curveToRelative(-1.042f, -1.042f, -2.421f, -1.615f, -3.887f, -1.615f)
                horizontalLineToRelative(-0.521f)
                curveToRelative(-0.115f, -1.28f, -0.668f, -2.469f, -1.588f, -3.389f)
                curveTo(15.35f, 0.57f, 13.969f, -0.002f, 12.5f, -0.002f)
                horizontalLineToRelative(-7.0f)
                curveTo(4.035f, -0.002f, 2.655f, 0.571f, 1.613f, 1.613f)
                curveTo(0.572f, 2.654f, 0.0f, 4.035f, 0.0f, 5.501f)
                lineToRelative(0.004f, 11.624f)
                curveToRelative(0.002f, 1.03f, 0.84f, 1.869f, 1.868f, 1.869f)
                curveToRelative(0.184f, 0.0f, 0.366f, -0.027f, 0.542f, -0.081f)
                curveToRelative(0.048f, -0.015f, 3.657f, -1.526f, 3.657f, -1.526f)
                curveToRelative(0.426f, 2.611f, 2.698f, 4.611f, 5.428f, 4.611f)
                horizontalLineToRelative(5.5f)
                reflectiveCurveToRelative(4.537f, 1.9f, 4.585f, 1.915f)
                curveToRelative(0.176f, 0.054f, 0.358f, 0.081f, 0.542f, 0.081f)
                curveToRelative(1.03f, 0.0f, 1.867f, -0.84f, 1.867f, -1.871f)
                lineToRelative(0.005f, -11.622f)
                curveToRelative(0.0f, -1.466f, -0.572f, -2.847f, -1.613f, -3.888f)
                close()
                moveTo(3.0f, 5.499f)
                curveToRelative(0.0f, -0.663f, 0.261f, -1.29f, 0.735f, -1.765f)
                curveToRelative(0.474f, -0.475f, 1.101f, -0.736f, 1.765f, -0.736f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.668f, 0.0f, 1.296f, 0.26f, 1.768f, 0.732f)
                reflectiveCurveToRelative(0.732f, 1.101f, 0.732f, 1.769f)
                verticalLineToRelative(5.999f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.802f)
                curveToRelative(-0.199f, 0.0f, -0.396f, 0.04f, -0.58f, 0.117f)
                lineToRelative(-3.113f, 1.306f)
                lineToRelative(-0.004f, -9.922f)
                close()
                moveTo(20.994f, 20.421f)
                lineToRelative(-3.113f, -1.306f)
                curveToRelative(-0.184f, -0.077f, -0.381f, -0.117f, -0.58f, -0.117f)
                horizontalLineToRelative(-5.802f)
                curveToRelative(-1.207f, 0.0f, -2.217f, -0.86f, -2.45f, -2.0f)
                horizontalLineToRelative(3.45f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(0.499f)
                curveToRelative(0.664f, 0.0f, 1.291f, 0.262f, 1.765f, 0.736f)
                curveToRelative(0.475f, 0.475f, 0.736f, 1.102f, 0.735f, 1.765f)
                lineToRelative(-0.004f, 9.922f)
                close()
            }
        }
        .build()
        return _messages!!
    }

private var _messages: ImageVector? = null

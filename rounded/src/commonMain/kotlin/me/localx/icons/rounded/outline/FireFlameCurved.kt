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

public val Icons.Outline.FireFlameCurved: ImageVector
    get() {
        if (_fireFlameCurved != null) {
            return _fireFlameCurved!!
        }
        _fireFlameCurved = Builder(name = "FireFlameCurved", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.044f, 5.529f)
                curveToRelative(-1.098f, -1.426f, -2.233f, -2.9f, -3.036f, -4.495f)
                curveTo(14.669f, 0.359f, 13.995f, -0.048f, 13.256f, -0.008f)
                curveToRelative(-0.713f, 0.041f, -1.314f, 0.496f, -1.569f, 1.188f)
                curveToRelative(-0.342f, 0.933f, -0.687f, 2.638f, -0.687f, 4.345f)
                curveToRelative(0.0f, 2.209f, 0.688f, 3.701f, 1.24f, 4.901f)
                curveToRelative(0.469f, 1.017f, 0.839f, 1.82f, 0.746f, 2.847f)
                curveToRelative(-0.09f, 0.979f, -0.946f, 1.735f, -2.027f, 1.727f)
                curveToRelative(-2.585f, -0.029f, -3.243f, -3.303f, -3.338f, -6.043f)
                curveToRelative(-0.032f, -0.897f, -0.637f, -1.655f, -1.505f, -1.885f)
                curveToRelative(-0.868f, -0.229f, -1.77f, 0.132f, -2.241f, 0.896f)
                curveToRelative(-1.208f, 1.961f, -1.874f, 4.103f, -1.874f, 6.031f)
                curveToRelative(0.0f, 5.514f, 4.523f, 10.0f, 10.006f, 10.0f)
                curveToRelative(5.511f, -0.033f, 9.994f, -4.52f, 9.994f, -9.983f)
                curveToRelative(0.056f, -3.276f, -1.983f, -5.925f, -3.956f, -8.487f)
                close()
                moveTo(11.994f, 22.0f)
                curveToRelative(-4.38f, 0.0f, -7.994f, -3.589f, -7.994f, -8.0f)
                curveToRelative(0.0f, -1.54f, 0.575f, -3.356f, 1.622f, -4.973f)
                curveToRelative(0.179f, 5.104f, 2.066f, 7.936f, 5.315f, 7.973f)
                horizontalLineToRelative(0.047f)
                curveToRelative(2.061f, 0.0f, 3.811f, -1.548f, 3.994f, -3.544f)
                curveToRelative(0.142f, -1.56f, -0.398f, -2.732f, -0.921f, -3.866f)
                curveToRelative(-0.52f, -1.128f, -1.057f, -2.294f, -1.057f, -4.064f)
                curveToRelative(0.0f, -1.153f, 0.196f, -2.384f, 0.423f, -3.206f)
                curveToRelative(0.863f, 1.606f, 1.967f, 3.04f, 3.037f, 4.431f)
                curveToRelative(1.843f, 2.395f, 3.584f, 4.656f, 3.541f, 7.25f)
                curveToRelative(0.0f, 4.385f, -3.591f, 7.974f, -8.006f, 8.0f)
                close()
            }
        }
        .build()
        return _fireFlameCurved!!
    }

private var _fireFlameCurved: ImageVector? = null

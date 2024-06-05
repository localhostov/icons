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

public val Icons.Filled.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 1.711f)
                lineToRelative(-22.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.293f, 22.293f)
                lineToRelative(5.043f, -5.041f)
                curveTo(1.147f, 12.594f, -2.236f, 6.317f, 1.784f, 1.868f)
                lineToRelative(1.15f, -1.0f)
                arcTo(3.081f, 3.081f, 0.0f, false, true, 7.26f, 0.911f)
                curveToRelative(0.031f, 0.03f, 1.884f, 2.437f, 1.884f, 2.437f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -0.007f, 4.281f)
                lineToRelative(-1.6f, 1.9f)
                arcTo(14.2f, 14.2f, 0.0f, false, false, 9.65f, 12.938f)
                lineTo(22.293f, 0.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.707f, 1.711f)
                close()
                moveTo(20.656f, 14.858f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -4.281f, 0.006f)
                lineTo(14.469f, 16.47f)
                curveToRelative(-0.4f, -0.17f, -0.785f, -0.359f, -1.157f, -0.562f)
                arcToRelative(0.983f, 0.983f, 0.0f, false, false, -1.162f, 0.178f)
                lineTo(9.089f, 19.147f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.1f, 1.509f)
                curveToRelative(4.408f, 2.976f, 9.111f, 5.042f, 12.99f, 1.51f)
                lineToRelative(0.91f, -1.048f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.0f, -4.377f)
                curveTo(23.062f, 16.709f, 20.656f, 14.858f, 20.656f, 14.858f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null

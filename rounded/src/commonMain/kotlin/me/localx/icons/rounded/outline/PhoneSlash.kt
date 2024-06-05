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

public val Icons.Outline.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.7f, 0.307f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.413f, 0.0f)
                lineTo(10.093f, 12.494f)
                arcTo(14.192f, 14.192f, 0.0f, false, true, 7.981f, 9.085f)
                lineTo(9.139f, 7.631f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.007f, -4.277f)
                reflectiveCurveTo(7.294f, 0.95f, 7.264f, 0.92f)
                arcTo(3.08f, 3.08f, 0.0f, false, false, 2.94f, 0.873f)
                lineToRelative(-1.149f, 1.0f)
                curveTo(-2.225f, 6.321f, 1.153f, 12.587f, 5.34f, 17.244f)
                lineTo(0.3f, 22.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.413f, 1.413f)
                lineTo(23.7f, 1.72f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.7f, 0.307f)
                close()
                moveTo(2.007f, 6.245f)
                arcTo(4.116f, 4.116f, 0.0f, false, true, 3.153f, 3.336f)
                lineToRelative(1.149f, -1.0f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 1.509f, -0.039f)
                reflectiveCurveTo(7.652f, 4.686f, 7.682f, 4.716f)
                arcToRelative(1.094f, 1.094f, 0.0f, false, true, 0.0f, 1.547f)
                curveTo(7.656f, 6.289f, 6.048f, 8.3f, 6.048f, 8.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.9f, 9.3f)
                arcToRelative(16.393f, 16.393f, 0.0f, false, false, 2.766f, 4.618f)
                lineTo(6.752f, 15.833f)
                curveTo(3.809f, 12.674f, 2.007f, 9.087f, 2.007f, 6.245f)
                close()
                moveTo(23.085f, 16.733f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 0.0f, 4.373f)
                lineToRelative(-0.91f, 1.048f)
                curveTo(18.3f, 25.681f, 13.6f, 23.618f, 9.2f, 20.645f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.2f, -1.6f)
                curveToRelative(3.509f, 2.315f, 7.332f, 4.342f, 10.32f, 1.749f)
                lineToRelative(0.911f, -1.049f)
                arcToRelative(1.118f, 1.118f, 0.0f, false, false, 0.085f, -1.558f)
                reflectiveCurveToRelative(-2.392f, -1.84f, -2.422f, -1.87f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.548f, 0.0f)
                curveToRelative(-0.027f, 0.027f, -2.043f, 1.633f, -2.043f, 1.633f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, -0.964f, 0.157f)
                arcToRelative(15.425f, 15.425f, 0.0f, false, true, -1.912f, -0.881f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.932f, -1.763f)
                curveToRelative(0.371f, 0.2f, 0.756f, 0.391f, 1.156f, 0.561f)
                lineToRelative(1.462f, -1.163f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 4.278f, -0.006f)
                reflectiveCurveTo(23.054f, 16.7f, 23.085f, 16.733f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null

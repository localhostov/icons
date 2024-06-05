package me.localx.icons.straight.bold

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

public val Icons.Bold.MaskFace: ImageVector
    get() {
        if (_maskFace != null) {
            return _maskFace!!
        }
        _maskFace = Builder(name = "MaskFace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.042f, 0.986f)
                curveToRelative(-1.246f, -0.937f, -2.818f, -1.226f, -4.312f, -0.79f)
                lineToRelative(-8.472f, 2.452f)
                curveToRelative(-0.373f, 0.107f, -0.758f, 0.182f, -1.147f, 0.219f)
                curveToRelative(-1.27f, 0.126f, -2.973f, 0.465f, -3.876f, 1.369f)
                curveToRelative(-0.952f, 0.953f, -1.265f, 2.837f, -1.367f, 3.876f)
                curveToRelative(-0.038f, 0.388f, -0.112f, 0.772f, -0.219f, 1.144f)
                lineTo(0.197f, 17.729f)
                curveToRelative(-0.433f, 1.496f, -0.145f, 3.067f, 0.791f, 4.312f)
                curveToRelative(0.936f, 1.245f, 2.366f, 1.959f, 3.923f, 1.959f)
                horizontalLineToRelative(6.121f)
                curveToRelative(0.182f, 0.0f, 4.493f, -0.049f, 8.707f, -4.263f)
                curveToRelative(4.214f, -4.214f, 4.263f, -8.525f, 4.263f, -8.707f)
                verticalLineToRelative(-6.121f)
                curveToRelative(0.0f, -1.557f, -0.714f, -2.987f, -1.959f, -3.923f)
                close()
                moveTo(18.564f, 3.077f)
                curveToRelative(0.581f, -0.167f, 1.191f, -0.057f, 1.675f, 0.308f)
                curveToRelative(0.484f, 0.364f, 0.762f, 0.919f, 0.762f, 1.524f)
                verticalLineToRelative(3.456f)
                lineToRelative(-4.648f, -4.648f)
                lineToRelative(2.211f, -0.64f)
                close()
                moveTo(3.386f, 20.239f)
                curveToRelative(-0.364f, -0.484f, -0.476f, -1.095f, -0.308f, -1.676f)
                lineToRelative(0.64f, -2.21f)
                lineToRelative(4.647f, 4.647f)
                horizontalLineToRelative(-3.455f)
                curveToRelative(-0.605f, 0.0f, -1.161f, -0.277f, -1.524f, -0.761f)
                close()
                moveTo(17.617f, 17.616f)
                curveToRelative(-2.014f, 2.014f, -3.982f, 2.827f, -5.236f, 3.157f)
                lineToRelative(-7.711f, -7.71f)
                lineToRelative(0.861f, -2.973f)
                curveToRelative(0.159f, -0.548f, 0.267f, -1.115f, 0.323f, -1.686f)
                curveToRelative(0.105f, -1.07f, 0.358f, -1.838f, 0.505f, -2.047f)
                curveToRelative(0.208f, -0.146f, 0.975f, -0.398f, 2.044f, -0.504f)
                curveToRelative(0.57f, -0.056f, 1.137f, -0.164f, 1.687f, -0.323f)
                lineToRelative(2.973f, -0.861f)
                lineToRelative(7.71f, 7.71f)
                curveToRelative(-0.331f, 1.257f, -1.144f, 3.224f, -3.156f, 5.236f)
                close()
                moveTo(14.561f, 9.56f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(18.003f, 13.118f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _maskFace!!
    }

private var _maskFace: ImageVector? = null

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

public val Icons.Bold.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(name = "Stars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.206f, 24.018f)
                arcToRelative(3.268f, 3.268f, 0.0f, false, true, -1.946f, -0.653f)
                lineTo(9.985f, 21.448f)
                lineTo(7.69f, 23.32f)
                arcToRelative(3.288f, 3.288f, 0.0f, false, true, -3.928f, 0.065f)
                arcToRelative(3.235f, 3.235f, 0.0f, false, true, -1.2f, -3.675f)
                lineToRelative(0.7f, -2.379f)
                lineTo(1.354f, 15.938f)
                arcTo(3.285f, 3.285f, 0.0f, false, true, 3.292f, 10.0f)
                horizontalLineTo(5.967f)
                lineToRelative(0.9f, -2.731f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 6.253f, 0.012f)
                lineTo(14.02f, 10.0f)
                horizontalLineToRelative(2.688f)
                arcToRelative(3.286f, 3.286f, 0.0f, false, true, 1.939f, 5.938f)
                lineToRelative(-1.935f, 1.413f)
                lineToRelative(0.645f, 2.437f)
                arcToRelative(3.207f, 3.207f, 0.0f, false, true, -1.226f, 3.6f)
                arcTo(3.29f, 3.29f, 0.0f, false, true, 14.206f, 24.018f)
                close()
                moveTo(10.0f, 18.0f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, 0.967f, 0.354f)
                lineToRelative(3.151f, 2.658f)
                curveToRelative(0.045f, 0.029f, 0.136f, 0.027f, 0.26f, -0.062f)
                arcToRelative(0.245f, 0.245f, 0.0f, false, false, 0.1f, -0.317f)
                lineToRelative(-0.929f, -3.506f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.565f, -1.595f)
                lineToRelative(2.762f, -2.016f)
                arcTo(0.286f, 0.286f, 0.0f, false, false, 16.708f, 13.0f)
                horizontalLineTo(12.936f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.425f, -1.029f)
                lineTo(10.269f, 8.209f)
                arcTo(0.279f, 0.279f, 0.0f, false, false, 9.722f, 8.2f)
                lineTo(8.476f, 11.971f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.051f, 13.0f)
                horizontalLineTo(3.292f)
                arcToRelative(0.286f, 0.286f, 0.0f, false, false, -0.168f, 0.516f)
                lineToRelative(2.761f, 2.016f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.553f, 1.637f)
                lineTo(5.424f, 20.6f)
                curveToRelative(-0.058f, 0.179f, -0.029f, 0.265f, 0.093f, 0.354f)
                arcToRelative(0.268f, 0.268f, 0.0f, false, false, 0.335f, 0.0f)
                lineToRelative(3.2f, -2.612f)
                arcTo(1.492f, 1.492f, 0.0f, false, true, 10.0f, 18.0f)
                close()
                moveTo(20.0f, 7.146f)
                lineToRelative(1.481f, 1.089f)
                arcToRelative(0.809f, 0.809f, 0.0f, false, false, 1.25f, -0.9f)
                lineToRelative(-0.572f, -1.771f)
                lineToRelative(1.506f, -1.1f)
                arcTo(0.809f, 0.809f, 0.0f, false, false, 23.188f, 3.0f)
                horizontalLineTo(21.334f)
                lineToRelative(-0.563f, -1.756f)
                arcToRelative(0.813f, 0.813f, 0.0f, false, false, -1.542f, 0.0f)
                lineTo(18.666f, 3.0f)
                horizontalLineTo(16.813f)
                arcToRelative(0.809f, 0.809f, 0.0f, false, false, -0.478f, 1.463f)
                lineToRelative(1.506f, 1.1f)
                lineToRelative(-0.572f, 1.771f)
                arcToRelative(0.788f, 0.788f, 0.0f, false, false, 0.3f, 0.906f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.953f, -0.005f)
                close()
            }
        }
        .build()
        return _stars!!
    }

private var _stars: ImageVector? = null

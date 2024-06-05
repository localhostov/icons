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

public val Icons.Bold.CameraCctv: ImageVector
    get() {
        if (_cameraCctv != null) {
            return _cameraCctv!!
        }
        _cameraCctv = Builder(name = "CameraCctv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.985f, 8.929f)
                lineTo(8.68f, 0.418f)
                curveToRelative(-1.69f, -0.912f, -3.814f, -0.284f, -4.736f, 1.404f)
                lineToRelative(-1.927f, 3.539f)
                curveToRelative(-0.448f, 0.82f, -0.549f, 1.766f, -0.285f, 2.663f)
                curveToRelative(0.264f, 0.897f, 0.861f, 1.638f, 1.665f, 2.076f)
                lineToRelative(5.602f, 3.149f)
                lineToRelative(-1.465f, 4.396f)
                curveToRelative(-0.068f, 0.205f, -0.259f, 0.342f, -0.475f, 0.342f)
                lineTo(3.0f, 17.987f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 14.987f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.059f)
                curveToRelative(1.509f, 0.0f, 2.843f, -0.962f, 3.32f, -2.394f)
                lineToRelative(1.283f, -3.848f)
                lineToRelative(5.414f, 3.044f)
                lineToRelative(1.031f, -1.892f)
                lineToRelative(2.572f, 1.403f)
                lineToRelative(2.527f, -4.658f)
                lineToRelative(-2.505f, -1.366f)
                lineToRelative(3.284f, -2.348f)
                close()
                moveTo(4.85f, 7.476f)
                curveToRelative(-0.158f, -0.086f, -0.218f, -0.224f, -0.24f, -0.298f)
                curveToRelative(-0.021f, -0.074f, -0.045f, -0.222f, 0.042f, -0.381f)
                lineToRelative(1.927f, -3.539f)
                curveToRelative(0.092f, -0.168f, 0.268f, -0.263f, 0.442f, -0.263f)
                curveToRelative(0.075f, 0.0f, 0.149f, 0.018f, 0.217f, 0.054f)
                lineToRelative(11.145f, 6.197f)
                lineToRelative(-0.112f, 0.081f)
                lineToRelative(-2.375f, 4.359f)
                lineTo(4.85f, 7.476f)
                close()
            }
        }
        .build()
        return _cameraCctv!!
    }

private var _cameraCctv: ImageVector? = null

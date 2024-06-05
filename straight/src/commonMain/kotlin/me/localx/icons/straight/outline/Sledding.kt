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

public val Icons.Outline.Sledding: ImageVector
    get() {
        if (_sledding != null) {
            return _sledding!!
        }
        _sledding = Builder(name = "Sledding", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.729f)
                arcToRelative(3.968f, 3.968f, 0.0f, false, true, -2.278f, 2.044f)
                arcToRelative(3.972f, 3.972f, 0.0f, false, true, -3.058f, -0.167f)
                lineTo(0.036f, 14.769f)
                lineToRelative(0.857f, -1.807f)
                lineTo(19.525f, 21.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.672f, -0.936f)
                close()
                moveTo(18.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 16.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 5.0f)
                close()
                moveTo(8.584f, 11.159f)
                arcTo(3.272f, 3.272f, 0.0f, false, false, 8.363f, 14.5f)
                arcTo(2.877f, 2.877f, 0.0f, false, false, 10.947f, 16.0f)
                horizontalLineTo(16.2f)
                lineToRelative(0.483f, 2.23f)
                lineToRelative(2.28f, 1.082f)
                lineTo(17.809f, 14.0f)
                horizontalLineTo(10.946f)
                arcToRelative(0.866f, 0.866f, 0.0f, false, true, -0.823f, -0.448f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 0.151f, -1.324f)
                lineTo(13.72f, 6.584f)
                lineToRelative(1.076f, 0.687f)
                arcToRelative(1.182f, 1.182f, 0.0f, false, true, -0.11f, 1.458f)
                lineToRelative(0.007f, 0.006f)
                curveToRelative(-0.012f, 0.015f, -0.03f, 0.023f, -0.042f, 0.039f)
                lineTo(12.628f, 12.0f)
                horizontalLineTo(15.08f)
                lineToRelative(1.2f, -2.068f)
                curveToRelative(0.0f, -0.006f, 0.0f, -0.012f, 0.008f, -0.017f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -0.169f, -4.149f)
                lineTo(13.391f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(7.731f)
                close()
            }
        }
        .build()
        return _sledding!!
    }

private var _sledding: ImageVector? = null

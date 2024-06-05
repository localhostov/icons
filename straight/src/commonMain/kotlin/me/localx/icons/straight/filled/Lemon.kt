package me.localx.icons.straight.filled

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

public val Icons.Filled.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.0f)
                arcTo(2.98f, 2.98f, 0.0f, false, false, 23.12f, 0.879f)
                arcToRelative(3.072f, 3.072f, 0.0f, false, false, -4.069f, -0.16f)
                curveTo(15.1f, -0.578f, 8.2f, -0.446f, 3.875f, 3.875f)
                reflectiveCurveTo(-0.579f, 15.1f, 0.72f, 19.051f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.16f, 4.07f)
                arcToRelative(3.071f, 3.071f, 0.0f, false, false, 4.069f, 0.159f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 4.86f, 0.72f)
                arcToRelative(14.51f, 14.51f, 0.0f, false, false, 10.316f, -3.875f)
                curveTo(24.445f, 15.8f, 24.579f, 8.9f, 23.28f, 4.949f)
                arcTo(2.979f, 2.979f, 0.0f, false, false, 24.0f, 3.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 12.0f)
                close()
                moveTo(18.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 15.0f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null

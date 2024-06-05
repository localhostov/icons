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

public val Icons.Bold.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.268f, 0.733f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, false, -2.307f, -0.673f)
                arcToRelative(15.964f, 15.964f, 0.0f, false, false, -6.821f, 4.14f)
                lineToRelative(-8.218f, 8.222f)
                arcToRelative(15.07f, 15.07f, 0.0f, false, false, -4.21f, -1.407f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.429f, 2.969f)
                arcToRelative(12.287f, 12.287f, 0.0f, false, true, 4.667f, 1.944f)
                lineToRelative(-2.95f, 2.951f)
                lineToRelative(-0.439f, -0.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 2.122f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                lineToRelative(-0.44f, -0.439f)
                lineToRelative(2.95f, -2.951f)
                arcToRelative(12.285f, 12.285f, 0.0f, false, true, 1.945f, 4.667f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.484f, 1.284f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, false, 0.214f, -0.015f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.273f, -1.7f)
                arcToRelative(15.07f, 15.07f, 0.0f, false, false, -1.407f, -4.21f)
                lineToRelative(8.22f, -8.216f)
                arcToRelative(17.745f, 17.745f, 0.0f, false, false, 4.144f, -6.82f)
                arcToRelative(2.491f, 2.491f, 0.0f, false, false, -0.676f, -2.306f)
                close()
                moveTo(17.676f, 7.738f)
                lineTo(9.9f, 15.514f)
                curveToRelative(-0.212f, -0.252f, -0.432f, -0.5f, -0.673f, -0.742f)
                reflectiveCurveToRelative(-0.489f, -0.461f, -0.741f, -0.672f)
                lineToRelative(7.775f, -7.776f)
                arcToRelative(13.942f, 13.942f, 0.0f, false, true, 4.364f, -2.949f)
                arcToRelative(13.949f, 13.949f, 0.0f, false, true, -2.949f, 4.363f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null

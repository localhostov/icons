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

public val Icons.Bold.PhoneFlip: ImageVector
    get() {
        if (_phoneFlip != null) {
            return _phoneFlip!!
        }
        _phoneFlip = Builder(name = "PhoneFlip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.24f, 3.74f)
                lineTo(18.59f, 0.09f)
                lineToRelative(-6.64f, 6.64f)
                lineToRelative(2.96f, 2.96f)
                curveToRelative(-1.16f, 2.41f, -2.88f, 4.13f, -5.21f, 5.23f)
                lineToRelative(-2.97f, -2.97f)
                lineTo(0.09f, 18.59f)
                lineToRelative(3.64f, 3.64f)
                curveToRelative(1.14f, 1.14f, 2.67f, 1.77f, 4.32f, 1.77f)
                curveToRelative(7.15f, 0.0f, 15.94f, -8.79f, 15.94f, -15.94f)
                curveToRelative(0.0f, -1.65f, -0.63f, -3.19f, -1.76f, -4.32f)
                close()
                moveTo(8.06f, 21.0f)
                curveToRelative(-0.85f, 0.0f, -1.63f, -0.31f, -2.2f, -0.89f)
                lineToRelative(-1.52f, -1.52f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(2.25f, 2.25f)
                lineToRelative(0.91f, -0.35f)
                curveToRelative(3.85f, -1.47f, 6.61f, -4.22f, 8.19f, -8.18f)
                lineToRelative(0.37f, -0.92f)
                lineToRelative(-2.27f, -2.27f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(1.53f, 1.52f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.35f, 0.88f, 2.2f)
                curveToRelative(0.0f, 5.88f, -7.95f, 12.94f, -12.94f, 12.94f)
                close()
            }
        }
        .build()
        return _phoneFlip!!
    }

private var _phoneFlip: ImageVector? = null

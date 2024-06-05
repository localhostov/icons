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

public val Icons.Outline.PhoneFlip: ImageVector
    get() {
        if (_phoneFlip != null) {
            return _phoneFlip!!
        }
        _phoneFlip = Builder(name = "PhoneFlip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.28f, 3.29f)
                lineTo(19.11f, 0.12f)
                lineToRelative(-6.26f, 6.27f)
                lineToRelative(3.41f, 3.41f)
                curveToRelative(-1.37f, 3.06f, -3.49f, 5.19f, -6.45f, 6.47f)
                lineToRelative(-3.41f, -3.41f)
                lineTo(0.12f, 19.11f)
                lineToRelative(3.17f, 3.17f)
                curveToRelative(1.11f, 1.11f, 2.6f, 1.72f, 4.21f, 1.72f)
                curveToRelative(7.25f, 0.0f, 16.5f, -9.25f, 16.5f, -16.5f)
                curveToRelative(0.0f, -1.61f, -0.61f, -3.1f, -1.72f, -4.21f)
                close()
                moveTo(7.5f, 22.0f)
                curveToRelative(-1.07f, 0.0f, -2.07f, -0.4f, -2.79f, -1.13f)
                lineToRelative(-1.76f, -1.76f)
                lineToRelative(3.44f, -3.44f)
                lineToRelative(2.93f, 2.93f)
                lineToRelative(0.61f, -0.23f)
                curveToRelative(3.96f, -1.51f, 6.81f, -4.35f, 8.45f, -8.44f)
                lineToRelative(0.25f, -0.61f)
                lineToRelative(-2.93f, -2.94f)
                lineToRelative(3.44f, -3.44f)
                lineToRelative(1.76f, 1.76f)
                curveToRelative(0.73f, 0.73f, 1.13f, 1.72f, 1.13f, 2.79f)
                curveToRelative(0.0f, 6.23f, -8.27f, 14.5f, -14.5f, 14.5f)
                close()
            }
        }
        .build()
        return _phoneFlip!!
    }

private var _phoneFlip: ImageVector? = null

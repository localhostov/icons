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

public val Icons.Filled.PhoneFlip: ImageVector
    get() {
        if (_phoneFlip != null) {
            return _phoneFlip!!
        }
        _phoneFlip = Builder(name = "PhoneFlip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 24.0f)
                curveToRelative(-1.61f, 0.0f, -3.1f, -0.61f, -4.21f, -1.72f)
                lineTo(0.12f, 19.11f)
                lineToRelative(6.26f, -6.27f)
                lineToRelative(3.41f, 3.41f)
                curveToRelative(2.96f, -1.28f, 5.08f, -3.41f, 6.45f, -6.47f)
                lineToRelative(-3.41f, -3.41f)
                lineTo(19.11f, 0.12f)
                lineToRelative(3.17f, 3.17f)
                curveToRelative(1.11f, 1.1f, 1.72f, 2.6f, 1.72f, 4.21f)
                curveToRelative(0.0f, 7.25f, -9.25f, 16.5f, -16.5f, 16.5f)
                close()
            }
        }
        .build()
        return _phoneFlip!!
    }

private var _phoneFlip: ImageVector? = null

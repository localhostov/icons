package me.localx.icons.rounded.filled

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
                moveTo(24.0f, 6.24f)
                curveToRelative(0.0f, 7.64f, -10.13f, 17.76f, -17.76f, 17.76f)
                curveToRelative(-1.67f, 0.0f, -3.23f, -0.63f, -4.38f, -1.78f)
                lineToRelative(-1.0f, -1.15f)
                curveToRelative(-1.16f, -1.16f, -1.16f, -3.12f, 0.05f, -4.33f)
                curveToRelative(0.03f, -0.03f, 2.44f, -1.88f, 2.44f, -1.88f)
                curveToRelative(1.2f, -1.14f, 3.09f, -1.14f, 4.28f, 0.0f)
                lineToRelative(1.46f, 1.17f)
                curveToRelative(3.2f, -1.36f, 5.47f, -3.64f, 6.93f, -6.95f)
                lineToRelative(-1.16f, -1.46f)
                curveToRelative(-1.15f, -1.19f, -1.15f, -3.09f, 0.0f, -4.28f)
                curveToRelative(0.0f, 0.0f, 1.85f, -2.41f, 1.88f, -2.44f)
                curveToRelative(1.21f, -1.21f, 3.17f, -1.21f, 4.38f, 0.0f)
                lineToRelative(1.05f, 0.91f)
                curveToRelative(1.2f, 1.19f, 1.83f, 2.75f, 1.83f, 4.42f)
                close()
            }
        }
        .build()
        return _phoneFlip!!
    }

private var _phoneFlip: ImageVector? = null

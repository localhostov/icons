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

public val Icons.Filled.PenClip: ImageVector
    get() {
        if (_penClip != null) {
            return _penClip!!
        }
        _penClip = Builder(name = "PenClip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.24f, 7.95f)
                lineTo(6.18f, 22.11f)
                curveToRelative(-0.93f, 0.93f, -2.32f, 1.12f, -3.45f, 0.58f)
                lineToRelative(-1.02f, 1.02f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(1.02f, -1.02f)
                curveToRelative(-0.54f, -1.13f, -0.36f, -2.52f, 0.58f, -3.46f)
                lineTo(14.39f, 5.26f)
                curveToRelative(-1.09f, -0.43f, -2.42f, -0.23f, -3.28f, 0.63f)
                lineToRelative(-3.03f, 3.03f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(3.03f, -3.03f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
                curveToRelative(1.19f, 0.0f, 2.3f, 0.43f, 3.19f, 1.18f)
                curveToRelative(0.04f, 0.0f, 3.81f, 3.76f, 3.81f, 3.76f)
                close()
                moveTo(22.84f, 0.65f)
                curveToRelative(-1.18f, -0.97f, -3.0f, -0.84f, -4.13f, 0.3f)
                lineToRelative(-1.33f, 1.33f)
                lineToRelative(4.27f, 4.27f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(0.6f, -0.6f, 0.92f, -1.44f, 0.88f, -2.29f)
                curveToRelative(-0.04f, -0.85f, -0.45f, -1.65f, -1.11f, -2.19f)
                close()
            }
        }
        .build()
        return _penClip!!
    }

private var _penClip: ImageVector? = null

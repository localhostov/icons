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
                moveTo(22.14f, 1.94f)
                reflectiveCurveToRelative(-1.09f, -0.95f, -1.09f, -0.95f)
                curveToRelative(-1.37f, -1.32f, -3.56f, -1.31f, -4.95f, 0.08f)
                lineToRelative(-2.07f, 2.24f)
                curveToRelative(-0.66f, 0.66f, -1.03f, 1.54f, -1.03f, 2.48f)
                reflectiveCurveToRelative(0.36f, 1.81f, 1.02f, 2.47f)
                lineToRelative(0.4f, 0.4f)
                curveToRelative(-1.27f, 2.68f, -3.17f, 4.58f, -5.76f, 5.78f)
                lineToRelative(-0.41f, -0.4f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.47f, -1.02f)
                reflectiveCurveToRelative(-1.81f, 0.36f, -2.44f, 0.99f)
                lineToRelative(-2.32f, 2.15f)
                curveToRelative(-0.66f, 0.66f, -1.03f, 1.54f, -1.03f, 2.48f)
                reflectiveCurveToRelative(0.35f, 1.78f, 0.98f, 2.43f)
                curveToRelative(0.0f, 0.0f, 0.93f, 1.07f, 0.95f, 1.09f)
                curveToRelative(1.2f, 1.2f, 2.82f, 1.86f, 4.56f, 1.86f)
                curveToRelative(7.52f, 0.0f, 17.5f, -9.98f, 17.5f, -17.5f)
                curveToRelative(0.0f, -1.74f, -0.66f, -3.36f, -1.86f, -4.56f)
                close()
                moveTo(6.5f, 21.0f)
                curveToRelative(-0.92f, 0.0f, -1.78f, -0.34f, -2.41f, -0.95f)
                curveToRelative(0.0f, 0.0f, -0.92f, -1.06f, -0.95f, -1.08f)
                curveToRelative(-0.13f, -0.13f, -0.15f, -0.28f, -0.15f, -0.35f)
                reflectiveCurveToRelative(0.02f, -0.23f, 0.11f, -0.31f)
                lineToRelative(2.32f, -2.15f)
                curveToRelative(0.13f, -0.13f, 0.28f, -0.15f, 0.35f, -0.15f)
                reflectiveCurveToRelative(0.23f, 0.02f, 0.35f, 0.15f)
                lineToRelative(1.13f, 1.12f)
                curveToRelative(0.42f, 0.41f, 1.04f, 0.54f, 1.59f, 0.33f)
                curveToRelative(4.1f, -1.56f, 7.04f, -4.5f, 8.73f, -8.72f)
                curveToRelative(0.22f, -0.55f, 0.1f, -1.19f, -0.32f, -1.61f)
                lineToRelative(-1.12f, -1.14f)
                curveToRelative(-0.13f, -0.13f, -0.15f, -0.28f, -0.15f, -0.35f)
                reflectiveCurveToRelative(0.02f, -0.23f, 0.19f, -0.39f)
                lineToRelative(2.07f, -2.24f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.0f)
                curveToRelative(0.02f, 0.02f, 1.08f, 0.95f, 1.08f, 0.95f)
                curveToRelative(0.61f, 0.63f, 0.95f, 1.48f, 0.95f, 2.41f)
                curveToRelative(0.0f, 6.4f, -8.99f, 14.5f, -14.5f, 14.5f)
                close()
            }
        }
        .build()
        return _phoneFlip!!
    }

private var _phoneFlip: ImageVector? = null

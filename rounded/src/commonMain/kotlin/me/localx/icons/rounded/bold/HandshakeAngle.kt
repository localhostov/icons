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

public val Icons.Bold.HandshakeAngle: ImageVector
    get() {
        if (_handshakeAngle != null) {
            return _handshakeAngle!!
        }
        _handshakeAngle = Builder(name = "HandshakeAngle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.59f, 8.25f)
                curveToRelative(-0.57f, -0.6f, -1.52f, -0.63f, -2.12f, -0.06f)
                lineToRelative(-0.85f, 0.81f)
                horizontalLineToRelative(-5.62f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.72f)
                curveToRelative(0.0f, -1.6f, 1.08f, -2.99f, 2.62f, -3.39f)
                lineToRelative(4.0f, -1.03f)
                curveToRelative(0.26f, -0.07f, 0.5f, -0.2f, 0.68f, -0.39f)
                lineToRelative(0.9f, -0.9f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f)
                lineToRelative(-0.61f, 0.61f)
                lineToRelative(-3.6f, 0.93f)
                curveToRelative(-2.46f, 0.64f, -4.27f, 2.63f, -4.74f, 5.05f)
                curveToRelative(-2.39f, 0.2f, -4.37f, 1.88f, -4.91f, 4.25f)
                lineToRelative(-0.83f, 3.7f)
                lineToRelative(-0.95f, 0.95f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(1.26f, -1.26f)
                curveToRelative(0.2f, -0.2f, 0.34f, -0.45f, 0.4f, -0.73f)
                lineToRelative(0.93f, -4.12f)
                curveToRelative(0.21f, -0.95f, 0.94f, -1.65f, 1.85f, -1.87f)
                verticalLineToRelative(2.92f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.98f)
                lineToRelative(-1.45f, 5.17f)
                curveToRelative(-0.3f, 1.08f, -1.29f, 1.83f, -2.41f, 1.83f)
                horizontalLineToRelative(-5.13f)
                curveToRelative(-0.41f, 0.0f, -0.79f, 0.16f, -1.08f, 0.46f)
                lineToRelative(-1.95f, 2.01f)
                curveToRelative(-0.58f, 0.59f, -0.56f, 1.54f, 0.03f, 2.12f)
                curveToRelative(0.29f, 0.28f, 0.67f, 0.42f, 1.04f, 0.42f)
                reflectiveCurveToRelative(0.78f, -0.15f, 1.08f, -0.46f)
                lineToRelative(1.51f, -1.56f)
                horizontalLineToRelative(4.49f)
                curveToRelative(2.46f, 0.0f, 4.63f, -1.65f, 5.3f, -4.02f)
                lineToRelative(1.78f, -6.37f)
                reflectiveCurveToRelative(0.03f, -0.02f, 0.04f, -0.03f)
                lineToRelative(1.28f, -1.22f)
                curveToRelative(0.6f, -0.57f, 0.63f, -1.52f, 0.06f, -2.12f)
                close()
            }
        }
        .build()
        return _handshakeAngle!!
    }

private var _handshakeAngle: ImageVector? = null

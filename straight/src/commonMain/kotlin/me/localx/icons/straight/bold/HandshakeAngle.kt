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
                moveTo(23.99f, 9.46f)
                lineToRelative(-2.06f, -2.18f)
                lineToRelative(-1.81f, 1.72f)
                horizontalLineToRelative(-5.12f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.99f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(7.5f)
                curveToRelative(0.0f, -1.14f, 0.77f, -2.14f, 1.92f, -2.43f)
                lineToRelative(4.62f, -1.33f)
                lineToRelative(1.53f, -1.53f)
                lineTo(15.94f, 0.09f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(-3.83f, 1.11f)
                curveToRelative(-2.27f, 0.58f, -3.88f, 2.53f, -4.08f, 4.83f)
                curveToRelative(-2.48f, 0.03f, -4.65f, 1.71f, -5.28f, 4.16f)
                lineToRelative(-0.87f, 3.82f)
                lineTo(-0.06f, 15.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.56f, -1.56f)
                lineToRelative(1.06f, -4.62f)
                curveToRelative(0.28f, -1.07f, 1.22f, -1.82f, 2.32f, -1.87f)
                verticalLineToRelative(1.98f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(3.99f, -1.79f, 4.0f, -3.99f)
                horizontalLineToRelative(3.48f)
                lineToRelative(-1.46f, 5.19f)
                curveToRelative(-0.3f, 1.08f, -1.27f, 1.8f, -2.39f, 1.81f)
                horizontalLineToRelative(-5.77f)
                lineToRelative(-2.9f, 2.99f)
                lineToRelative(2.15f, 2.09f)
                lineToRelative(2.02f, -2.08f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.44f, -0.01f, 4.61f, -1.66f, 5.27f, -4.0f)
                lineToRelative(1.79f, -6.37f)
                lineToRelative(2.3f, -2.18f)
                close()
            }
        }
        .build()
        return _handshakeAngle!!
    }

private var _handshakeAngle: ImageVector? = null

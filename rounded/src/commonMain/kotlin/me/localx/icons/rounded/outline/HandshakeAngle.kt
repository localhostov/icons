package me.localx.icons.rounded.outline

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

public val Icons.Outline.HandshakeAngle: ImageVector
    get() {
        if (_handshakeAngle != null) {
            return _handshakeAngle!!
        }
        _handshakeAngle = Builder(name = "HandshakeAngle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.73f, 8.41f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.04f)
                lineToRelative(-1.71f, 1.62f)
                horizontalLineToRelative(-7.6f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(7.87f)
                curveToRelative(0.0f, -1.82f, 1.23f, -3.42f, 3.0f, -3.87f)
                lineToRelative(3.47f, -0.9f)
                curveToRelative(0.52f, -0.13f, 0.99f, -0.4f, 1.37f, -0.78f)
                lineToRelative(0.61f, -0.61f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-0.61f, 0.61f)
                curveToRelative(-0.13f, 0.13f, -0.29f, 0.22f, -0.46f, 0.26f)
                lineToRelative(-3.47f, 0.9f)
                curveToRelative(-2.38f, 0.61f, -4.12f, 2.61f, -4.44f, 4.99f)
                curveToRelative(-2.38f, 0.33f, -4.38f, 2.06f, -4.99f, 4.44f)
                lineToRelative(-0.9f, 3.47f)
                curveToRelative(-0.04f, 0.17f, -0.14f, 0.33f, -0.26f, 0.46f)
                lineToRelative(-0.61f, 0.61f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(0.62f, -0.61f)
                curveToRelative(0.38f, -0.38f, 0.65f, -0.85f, 0.78f, -1.37f)
                lineToRelative(0.9f, -3.47f)
                curveToRelative(0.38f, -1.48f, 1.56f, -2.58f, 3.0f, -2.9f)
                verticalLineToRelative(3.9f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.42f)
                lineToRelative(-1.44f, 5.1f)
                curveToRelative(-0.48f, 1.71f, -2.06f, 2.91f, -3.83f, 2.92f)
                lineToRelative(-3.33f, 0.02f)
                curveToRelative(-0.79f, 0.0f, -1.57f, 0.33f, -2.12f, 0.9f)
                lineToRelative(-1.34f, 1.37f)
                curveToRelative(-0.39f, 0.39f, -0.38f, 1.03f, 0.01f, 1.41f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.29f, 0.7f, 0.29f)
                reflectiveCurveToRelative(0.52f, -0.1f, 0.71f, -0.3f)
                lineToRelative(1.34f, -1.37f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.3f, 0.71f, -0.3f)
                lineToRelative(3.33f, -0.02f)
                curveToRelative(2.66f, -0.01f, 5.02f, -1.81f, 5.75f, -4.37f)
                curveToRelative(0.0f, 0.0f, 1.73f, -5.88f, 1.78f, -5.92f)
                lineToRelative(2.0f, -1.9f)
                curveToRelative(0.4f, -0.38f, 0.42f, -1.01f, 0.04f, -1.41f)
                close()
            }
        }
        .build()
        return _handshakeAngle!!
    }

private var _handshakeAngle: ImageVector? = null

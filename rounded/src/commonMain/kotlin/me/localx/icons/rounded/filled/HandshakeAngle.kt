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

public val Icons.Filled.HandshakeAngle: ImageVector
    get() {
        if (_handshakeAngle != null) {
            return _handshakeAngle!!
        }
        _handshakeAngle = Builder(name = "HandshakeAngle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                curveToRelative(0.33f, -2.38f, 2.12f, -4.32f, 4.5f, -4.94f)
                lineToRelative(3.47f, -0.9f)
                curveToRelative(0.17f, -0.04f, 0.33f, -0.14f, 0.46f, -0.26f)
                lineToRelative(0.61f, -0.61f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.29f, 0.71f, -0.29f)
                horizontalLineToRelative(6.26f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                lineTo(24.01f, 9.1f)
                curveToRelative(0.0f, 0.27f, -0.11f, 0.54f, -0.31f, 0.73f)
                lineToRelative(-1.24f, 1.17f)
                lineTo(13.0f, 11.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, 0.0f, -0.02f, -6.0f, 0.0f, -6.0f)
                close()
                moveTo(13.0f, 13.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                lineTo(5.0f, 7.73f)
                curveToRelative(-1.42f, 0.78f, -2.51f, 2.12f, -2.94f, 3.77f)
                lineToRelative(-0.9f, 3.47f)
                curveToRelative(-0.04f, 0.17f, -0.14f, 0.33f, -0.26f, 0.46f)
                lineToRelative(-0.61f, 0.61f)
                curveToRelative(-0.19f, 0.19f, -0.29f, 0.44f, -0.29f, 0.71f)
                verticalLineToRelative(6.26f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.07f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.3f)
                lineToRelative(1.34f, -1.37f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.3f, 0.71f, -0.3f)
                lineToRelative(3.33f, -0.02f)
                curveToRelative(2.66f, -0.01f, 5.02f, -1.81f, 5.75f, -4.37f)
                lineToRelative(1.31f, -4.64f)
                lineTo(13.0f, 13.01f)
                close()
            }
        }
        .build()
        return _handshakeAngle!!
    }

private var _handshakeAngle: ImageVector? = null

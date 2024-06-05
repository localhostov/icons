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

public val Icons.Outline.HandLizard: ImageVector
    get() {
        if (_handLizard != null) {
            return _handLizard!!
        }
        _handLizard = Builder(name = "HandLizard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 23.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.88f, 0.0f, -1.71f, -0.39f, -2.29f, -1.06f)
                curveToRelative(-0.57f, -0.67f, -0.82f, -1.56f, -0.67f, -2.44f)
                curveToRelative(0.23f, -1.43f, 1.55f, -2.5f, 3.07f, -2.5f)
                horizontalLineToRelative(3.39f)
                curveToRelative(0.43f, 0.0f, 0.82f, -0.18f, 1.11f, -0.49f)
                curveToRelative(0.29f, -0.32f, 0.42f, -0.73f, 0.38f, -1.17f)
                curveToRelative(-0.08f, -0.75f, -0.79f, -1.34f, -1.63f, -1.34f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.88f, 0.0f, -1.71f, -0.39f, -2.29f, -1.06f)
                curveTo(0.14f, 5.27f, -0.1f, 4.38f, 0.04f, 3.5f)
                curveTo(0.27f, 2.08f, 1.59f, 1.0f, 3.11f, 1.0f)
                horizontalLineTo(12.18f)
                curveToRelative(3.35f, 0.0f, 6.46f, 1.66f, 8.32f, 4.45f)
                lineToRelative(1.82f, 2.73f)
                curveToRelative(1.1f, 1.65f, 1.68f, 3.57f, 1.68f, 5.55f)
                verticalLineToRelative(5.28f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(6.11f, 12.0f)
                curveToRelative(-0.54f, 0.0f, -1.02f, 0.36f, -1.09f, 0.82f)
                curveToRelative(-0.05f, 0.3f, 0.03f, 0.6f, 0.22f, 0.82f)
                curveToRelative(0.19f, 0.22f, 0.47f, 0.35f, 0.76f, 0.35f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-5.28f)
                curveToRelative(0.0f, -1.59f, -0.46f, -3.12f, -1.34f, -4.44f)
                lineToRelative(-1.82f, -2.73f)
                curveToRelative(-1.49f, -2.23f, -3.98f, -3.56f, -6.66f, -3.56f)
                horizontalLineTo(3.11f)
                curveToRelative(-0.54f, 0.0f, -1.02f, 0.36f, -1.09f, 0.82f)
                curveToRelative(-0.05f, 0.3f, 0.03f, 0.6f, 0.22f, 0.82f)
                curveToRelative(0.19f, 0.22f, 0.47f, 0.35f, 0.76f, 0.35f)
                horizontalLineToRelative(6.36f)
                curveToRelative(1.86f, 0.0f, 3.45f, 1.38f, 3.62f, 3.14f)
                curveToRelative(0.1f, 0.99f, -0.22f, 1.97f, -0.89f, 2.71f)
                curveToRelative(-0.66f, 0.73f, -1.61f, 1.15f, -2.6f, 1.15f)
                horizontalLineToRelative(-3.39f)
                close()
            }
        }
        .build()
        return _handLizard!!
    }

private var _handLizard: ImageVector? = null

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

public val Icons.Outline.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.89f, 9.65f)
                curveToRelative(-0.36f, -0.42f, -0.32f, -1.05f, 0.1f, -1.41f)
                curveToRelative(0.42f, -0.36f, 1.05f, -0.32f, 1.41f, 0.1f)
                curveToRelative(1.07f, 1.24f, 1.85f, 2.71f, 2.32f, 4.38f)
                curveToRelative(0.15f, 0.53f, -0.16f, 1.08f, -0.69f, 1.23f)
                curveToRelative(-0.09f, 0.03f, -0.18f, 0.04f, -0.27f, 0.04f)
                curveToRelative(-0.44f, 0.0f, -0.84f, -0.29f, -0.96f, -0.73f)
                curveToRelative(-0.39f, -1.39f, -1.04f, -2.6f, -1.91f, -3.62f)
                close()
                moveTo(23.95f, 17.31f)
                curveToRelative(-1.36f, 4.08f, -4.31f, 4.68f, -5.95f, 4.68f)
                curveToRelative(-1.41f, 0.0f, -2.64f, -0.62f, -3.66f, -1.55f)
                curveToRelative(-1.18f, 0.93f, -2.63f, 1.55f, -4.34f, 1.55f)
                reflectiveCurveToRelative(-3.22f, -0.95f, -4.63f, -2.4f)
                curveToRelative(-1.25f, 1.2f, -3.33f, 2.4f, -4.37f, 2.4f)
                curveToRelative(-0.46f, 0.0f, -0.88f, -0.33f, -0.98f, -0.8f)
                curveToRelative(-0.11f, -0.54f, 0.24f, -1.07f, 0.78f, -1.18f)
                curveToRelative(1.15f, -0.24f, 2.26f, -0.96f, 3.27f, -1.96f)
                curveTo(1.64f, 14.78f, 0.0f, 10.24f, 0.0f, 7.5f)
                curveTo(0.0f, 4.57f, 2.54f, 2.0f, 5.43f, 2.0f)
                reflectiveCurveToRelative(5.57f, 2.62f, 5.57f, 5.5f)
                curveToRelative(0.0f, 2.69f, -1.65f, 7.29f, -4.29f, 10.61f)
                curveToRelative(1.08f, 1.15f, 2.22f, 1.89f, 3.29f, 1.89f)
                curveToRelative(1.17f, 0.0f, 2.19f, -0.42f, 3.02f, -1.06f)
                curveToRelative(-1.31f, -1.86f, -2.02f, -4.12f, -2.02f, -5.48f)
                curveToRelative(0.0f, -1.84f, 1.64f, -3.45f, 3.51f, -3.45f)
                reflectiveCurveToRelative(3.49f, 1.61f, 3.49f, 3.45f)
                curveToRelative(0.0f, 1.51f, -0.77f, 3.77f, -2.23f, 5.58f)
                curveToRelative(0.67f, 0.59f, 1.42f, 0.97f, 2.23f, 0.97f)
                curveToRelative(1.95f, 0.0f, 3.32f, -1.12f, 4.05f, -3.32f)
                curveToRelative(0.17f, -0.52f, 0.74f, -0.81f, 1.27f, -0.63f)
                curveToRelative(0.52f, 0.17f, 0.81f, 0.74f, 0.63f, 1.27f)
                close()
                moveTo(9.0f, 7.5f)
                curveToRelative(0.0f, -1.8f, -1.74f, -3.5f, -3.57f, -3.5f)
                reflectiveCurveToRelative(-3.43f, 1.67f, -3.43f, 3.5f)
                curveToRelative(0.0f, 2.39f, 1.47f, 6.2f, 3.41f, 8.99f)
                curveToRelative(2.14f, -2.88f, 3.59f, -6.79f, 3.59f, -8.99f)
                close()
                moveTo(14.45f, 17.46f)
                curveToRelative(1.02f, -1.4f, 1.55f, -3.05f, 1.55f, -4.0f)
                curveToRelative(0.0f, -0.73f, -0.74f, -1.45f, -1.49f, -1.45f)
                reflectiveCurveToRelative(-1.51f, 0.73f, -1.51f, 1.45f)
                curveToRelative(0.0f, 0.95f, 0.55f, 2.6f, 1.45f, 4.0f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null

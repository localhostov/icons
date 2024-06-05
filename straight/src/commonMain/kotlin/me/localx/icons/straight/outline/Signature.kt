package me.localx.icons.straight.outline

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
                moveTo(22.02f, 14.19f)
                curveToRelative(-0.35f, -1.78f, -1.07f, -3.31f, -2.13f, -4.54f)
                lineToRelative(1.51f, -1.31f)
                curveToRelative(1.29f, 1.5f, 2.16f, 3.33f, 2.58f, 5.46f)
                lineToRelative(-1.96f, 0.39f)
                close()
                moveTo(22.05f, 16.68f)
                lineToRelative(1.9f, 0.63f)
                curveToRelative(-1.36f, 4.08f, -4.31f, 4.68f, -5.95f, 4.68f)
                curveToRelative(-1.41f, 0.0f, -2.64f, -0.62f, -3.66f, -1.55f)
                curveToRelative(-1.18f, 0.93f, -2.63f, 1.55f, -4.34f, 1.55f)
                reflectiveCurveToRelative(-3.27f, -0.98f, -4.69f, -2.46f)
                curveToRelative(-1.58f, 1.49f, -3.39f, 2.46f, -5.31f, 2.46f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.41f, 0.0f, 2.79f, -0.79f, 4.03f, -2.0f)
                curveTo(1.62f, 14.74f, 0.0f, 10.23f, 0.0f, 7.5f)
                curveTo(0.0f, 4.57f, 2.54f, 2.0f, 5.43f, 2.0f)
                reflectiveCurveToRelative(5.57f, 2.62f, 5.57f, 5.5f)
                reflectiveCurveToRelative(-1.71f, 7.35f, -4.33f, 10.57f)
                curveToRelative(1.09f, 1.17f, 2.24f, 1.93f, 3.33f, 1.93f)
                curveToRelative(1.17f, 0.0f, 2.19f, -0.42f, 3.02f, -1.06f)
                curveToRelative(-1.31f, -1.86f, -2.02f, -4.12f, -2.02f, -5.48f)
                curveToRelative(0.0f, -1.84f, 1.64f, -3.45f, 3.51f, -3.45f)
                reflectiveCurveToRelative(3.49f, 1.61f, 3.49f, 3.45f)
                curveToRelative(0.0f, 1.51f, -0.77f, 3.77f, -2.23f, 5.58f)
                curveToRelative(0.67f, 0.59f, 1.42f, 0.97f, 2.23f, 0.97f)
                curveToRelative(1.95f, 0.0f, 3.32f, -1.12f, 4.05f, -3.32f)
                close()
                moveTo(5.39f, 16.45f)
                curveToRelative(2.14f, -2.83f, 3.61f, -6.68f, 3.61f, -8.95f)
                curveToRelative(0.0f, -1.8f, -1.74f, -3.5f, -3.57f, -3.5f)
                reflectiveCurveToRelative(-3.43f, 1.67f, -3.43f, 3.5f)
                curveToRelative(0.0f, 2.38f, 1.46f, 6.17f, 3.39f, 8.95f)
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

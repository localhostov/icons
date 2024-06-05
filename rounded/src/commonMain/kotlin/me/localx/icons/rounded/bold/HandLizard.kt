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

public val Icons.Bold.HandLizard: ImageVector
    get() {
        if (_handLizard != null) {
            return _handLizard!!
        }
        _handLizard = Builder(name = "HandLizard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 24.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.48f, 0.0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.13f, 0.0f, -2.21f, -0.48f, -2.97f, -1.32f)
                curveToRelative(-0.76f, -0.84f, -1.13f, -1.96f, -1.01f, -3.09f)
                curveToRelative(0.2f, -1.98f, 2.05f, -3.59f, 4.12f, -3.59f)
                horizontalLineToRelative(1.86f)
                curveToRelative(0.29f, 0.0f, 0.55f, -0.12f, 0.74f, -0.33f)
                curveToRelative(0.11f, -0.12f, 0.29f, -0.39f, 0.25f, -0.78f)
                curveToRelative(-0.05f, -0.49f, -0.56f, -0.89f, -1.14f, -0.89f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.13f, 0.0f, -2.21f, -0.48f, -2.97f, -1.32f)
                curveTo(0.28f, 5.85f, -0.09f, 4.72f, 0.02f, 3.59f)
                curveTo(0.22f, 1.61f, 2.07f, 0.0f, 4.14f, 0.0f)
                horizontalLineToRelative(7.54f)
                curveToRelative(3.52f, 0.0f, 6.79f, 1.75f, 8.74f, 4.68f)
                lineToRelative(1.82f, 2.73f)
                curveToRelative(1.15f, 1.73f, 1.76f, 3.74f, 1.76f, 5.82f)
                verticalLineToRelative(6.27f)
                curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(8.14f, 13.0f)
                curveToRelative(-0.51f, 0.0f, -1.09f, 0.46f, -1.14f, 0.89f)
                curveToRelative(-0.04f, 0.39f, 0.14f, 0.66f, 0.25f, 0.78f)
                curveToRelative(0.19f, 0.21f, 0.46f, 0.33f, 0.74f, 0.33f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.27f)
                curveToRelative(0.0f, -1.49f, -0.44f, -2.92f, -1.26f, -4.16f)
                lineToRelative(-1.82f, -2.73f)
                curveToRelative(-1.39f, -2.09f, -3.73f, -3.34f, -6.24f, -3.34f)
                horizontalLineTo(4.14f)
                curveToRelative(-0.51f, 0.0f, -1.09f, 0.46f, -1.14f, 0.89f)
                curveToRelative(-0.04f, 0.39f, 0.14f, 0.66f, 0.25f, 0.78f)
                curveToRelative(0.19f, 0.21f, 0.46f, 0.33f, 0.74f, 0.33f)
                horizontalLineToRelative(5.86f)
                curveToRelative(2.11f, 0.0f, 3.92f, 1.58f, 4.12f, 3.59f)
                curveToRelative(0.11f, 1.13f, -0.26f, 2.25f, -1.01f, 3.09f)
                reflectiveCurveToRelative(-1.84f, 1.32f, -2.97f, 1.32f)
                horizontalLineToRelative(-1.86f)
                close()
            }
        }
        .build()
        return _handLizard!!
    }

private var _handLizard: ImageVector? = null

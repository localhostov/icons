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

public val Icons.Bold.BullseyeArrow: ImageVector
    get() {
        if (_bullseyeArrow != null) {
            return _bullseyeArrow!!
        }
        _bullseyeArrow = Builder(name = "BullseyeArrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.62f, -5.38f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                curveToRelative(0.19f, 0.0f, 0.38f, 0.0f, 0.57f, 0.01f)
                curveToRelative(0.83f, 0.04f, 1.47f, 0.74f, 1.43f, 1.57f)
                curveToRelative(-0.04f, 0.83f, -0.72f, 1.45f, -1.57f, 1.43f)
                curveToRelative(-0.14f, 0.0f, -0.29f, -0.01f, -0.43f, -0.01f)
                curveTo(7.04f, 3.0f, 3.0f, 7.04f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.04f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.04f, 9.0f, -9.0f)
                curveToRelative(0.0f, -0.14f, 0.0f, -0.29f, -0.01f, -0.43f)
                curveToRelative(-0.04f, -0.83f, 0.6f, -1.53f, 1.43f, -1.57f)
                curveToRelative(0.85f, -0.03f, 1.53f, 0.6f, 1.57f, 1.43f)
                curveToRelative(0.0f, 0.19f, 0.01f, 0.38f, 0.01f, 0.57f)
                close()
                moveTo(10.91f, 8.15f)
                curveToRelative(0.8f, -0.23f, 1.26f, -1.05f, 1.04f, -1.85f)
                reflectiveCurveToRelative(-1.06f, -1.26f, -1.85f, -1.04f)
                curveToRelative(-3.0f, 0.85f, -5.09f, 3.62f, -5.09f, 6.74f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                curveToRelative(3.12f, 0.0f, 5.89f, -2.09f, 6.74f, -5.09f)
                curveToRelative(0.23f, -0.8f, -0.24f, -1.63f, -1.04f, -1.85f)
                curveToRelative(-0.8f, -0.23f, -1.63f, 0.24f, -1.85f, 1.04f)
                curveToRelative(-0.48f, 1.71f, -2.07f, 2.91f, -3.85f, 2.91f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.78f, 1.2f, -3.37f, 2.91f, -3.85f)
                close()
                moveTo(10.94f, 10.94f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(5.06f, -5.06f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.4f, 0.0f, 0.78f, -0.16f, 1.06f, -0.44f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.43f, -0.43f, 0.56f, -1.07f, 0.33f, -1.63f)
                curveToRelative(-0.23f, -0.56f, -0.78f, -0.93f, -1.39f, -0.93f)
                horizontalLineToRelative(-1.5f)
                lineTo(21.0f, 1.5f)
                curveToRelative(0.0f, -0.61f, -0.37f, -1.15f, -0.93f, -1.39f)
                curveToRelative(-0.56f, -0.23f, -1.21f, -0.1f, -1.63f, 0.33f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.28f, 0.28f, -0.44f, 0.66f, -0.44f, 1.06f)
                verticalLineToRelative(2.38f)
                lineToRelative(-5.06f, 5.06f)
                close()
            }
        }
        .build()
        return _bullseyeArrow!!
    }

private var _bullseyeArrow: ImageVector? = null

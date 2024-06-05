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

public val Icons.Filled.BullseyeArrow: ImageVector
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
                curveToRelative(0.73f, 0.0f, 1.47f, 0.07f, 2.18f, 0.2f)
                curveToRelative(0.54f, 0.1f, 0.9f, 0.62f, 0.8f, 1.16f)
                curveToRelative(-0.1f, 0.54f, -0.62f, 0.9f, -1.16f, 0.8f)
                curveToRelative(-0.59f, -0.11f, -1.21f, -0.16f, -1.82f, -0.16f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.49f, 10.0f, -10.0f)
                curveToRelative(0.0f, -0.61f, -0.06f, -1.22f, -0.16f, -1.82f)
                curveToRelative(-0.1f, -0.54f, 0.26f, -1.06f, 0.8f, -1.16f)
                curveToRelative(0.55f, -0.1f, 1.06f, 0.26f, 1.16f, 0.8f)
                curveToRelative(0.13f, 0.71f, 0.2f, 1.45f, 0.2f, 2.18f)
                close()
                moveTo(12.86f, 6.06f)
                curveToRelative(0.55f, 0.08f, 1.05f, -0.3f, 1.13f, -0.85f)
                reflectiveCurveToRelative(-0.3f, -1.05f, -0.85f, -1.13f)
                curveToRelative(-0.38f, -0.05f, -0.76f, -0.08f, -1.14f, -0.08f)
                curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f)
                curveToRelative(0.0f, -0.38f, -0.03f, -0.76f, -0.08f, -1.14f)
                curveToRelative(-0.08f, -0.55f, -0.58f, -0.93f, -1.13f, -0.85f)
                curveToRelative(-0.55f, 0.08f, -0.93f, 0.58f, -0.85f, 1.13f)
                curveToRelative(0.04f, 0.28f, 0.06f, 0.57f, 0.06f, 0.86f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f)
                curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.06f)
                close()
                moveTo(10.75f, 9.1f)
                curveToRelative(-0.37f, -0.41f, -1.0f, -0.45f, -1.41f, -0.08f)
                curveToRelative(-0.85f, 0.76f, -1.33f, 1.85f, -1.33f, 2.98f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(1.14f, 0.0f, 2.22f, -0.49f, 2.98f, -1.33f)
                curveToRelative(0.37f, -0.41f, 0.33f, -1.04f, -0.08f, -1.41f)
                curveToRelative(-0.41f, -0.37f, -1.04f, -0.33f, -1.41f, 0.08f)
                curveToRelative(-0.38f, 0.42f, -0.92f, 0.67f, -1.49f, 0.67f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.57f, 0.24f, -1.11f, 0.67f, -1.49f)
                curveToRelative(0.41f, -0.37f, 0.45f, -1.0f, 0.08f, -1.41f)
                close()
                moveTo(12.3f, 10.3f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(4.71f, -4.71f)
                horizontalLineToRelative(2.59f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.29f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.29f, -0.29f, 0.37f, -0.72f, 0.22f, -1.09f)
                curveToRelative(-0.15f, -0.37f, -0.52f, -0.62f, -0.92f, -0.62f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.03f, 1.0f)
                curveToRelative(0.0f, -0.4f, -0.24f, -0.77f, -0.62f, -0.92f)
                curveToRelative(-0.38f, -0.16f, -0.8f, -0.07f, -1.09f, 0.22f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.19f, 0.19f, -0.29f, 0.44f, -0.29f, 0.71f)
                verticalLineToRelative(2.59f)
                lineToRelative(-4.71f, 4.71f)
                close()
            }
        }
        .build()
        return _bullseyeArrow!!
    }

private var _bullseyeArrow: ImageVector? = null

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
                moveTo(23.17f, 7.66f)
                curveToRelative(0.53f, 1.35f, 0.83f, 2.81f, 0.83f, 4.34f)
                curveToRelative(0.0f, 6.62f, -5.38f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                curveToRelative(1.53f, 0.0f, 3.0f, 0.3f, 4.34f, 0.83f)
                lineToRelative(-1.34f, 1.34f)
                verticalLineToRelative(1.35f)
                curveToRelative(-0.94f, -0.33f, -1.95f, -0.53f, -3.0f, -0.53f)
                curveTo(7.04f, 3.0f, 3.0f, 7.04f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.04f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.04f, 9.0f, -9.0f)
                curveToRelative(0.0f, -1.05f, -0.19f, -2.06f, -0.53f, -3.0f)
                horizontalLineToRelative(1.35f)
                lineToRelative(1.34f, -1.34f)
                close()
                moveTo(10.86f, 8.19f)
                lineToRelative(2.94f, -2.94f)
                curveToRelative(-0.58f, -0.15f, -1.18f, -0.24f, -1.81f, -0.24f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                curveToRelative(0.0f, -0.63f, -0.09f, -1.23f, -0.24f, -1.81f)
                lineToRelative(-2.94f, 2.94f)
                curveToRelative(-0.49f, 1.65f, -2.01f, 2.87f, -3.82f, 2.87f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.81f, 1.22f, -3.32f, 2.87f, -3.82f)
                close()
                moveTo(11.87f, 10.01f)
                curveToRelative(-1.05f, 0.06f, -1.87f, 0.93f, -1.87f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(1.93f, -0.83f, 2.0f, -1.87f)
                lineToRelative(5.13f, -5.13f)
                horizontalLineToRelative(1.88f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(20.01f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(1.88f)
                lineToRelative(-5.13f, 5.13f)
                close()
            }
        }
        .build()
        return _bullseyeArrow!!
    }

private var _bullseyeArrow: ImageVector? = null

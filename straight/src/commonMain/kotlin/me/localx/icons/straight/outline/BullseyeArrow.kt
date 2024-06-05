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

public val Icons.Outline.BullseyeArrow: ImageVector
    get() {
        if (_bullseyeArrow != null) {
            return _bullseyeArrow!!
        }
        _bullseyeArrow = Builder(name = "BullseyeArrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                curveToRelative(0.0f, -0.54f, -0.08f, -1.05f, -0.21f, -1.55f)
                lineToRelative(1.57f, -1.57f)
                curveToRelative(0.41f, 0.96f, 0.64f, 2.01f, 0.64f, 3.12f)
                curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f)
                reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f)
                curveToRelative(1.11f, 0.0f, 2.16f, 0.23f, 3.12f, 0.64f)
                lineToRelative(-1.57f, 1.57f)
                curveToRelative(-0.49f, -0.13f, -1.01f, -0.21f, -1.55f, -0.21f)
                close()
                moveTo(21.6f, 9.23f)
                curveToRelative(0.26f, 0.88f, 0.4f, 1.81f, 0.4f, 2.77f)
                curveToRelative(0.0f, 5.51f, -4.49f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.51f, 2.0f, 12.0f)
                reflectiveCurveTo(6.49f, 2.0f, 12.0f, 2.0f)
                curveToRelative(0.96f, 0.0f, 1.89f, 0.14f, 2.77f, 0.4f)
                lineToRelative(1.57f, -1.57f)
                curveToRelative(-1.35f, -0.53f, -2.81f, -0.83f, -4.34f, -0.83f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                curveToRelative(0.0f, -1.53f, -0.3f, -3.0f, -0.83f, -4.34f)
                lineToRelative(-1.57f, 1.57f)
                close()
                moveTo(11.73f, 8.03f)
                curveToRelative(-2.08f, 0.14f, -3.73f, 1.86f, -3.73f, 3.97f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(3.83f, -1.65f, 3.97f, -3.73f)
                lineToRelative(-1.14f, 1.14f)
                curveToRelative(-1.17f, 1.17f, -3.07f, 1.17f, -4.24f, 0.0f)
                reflectiveCurveToRelative(-1.17f, -3.07f, 0.0f, -4.24f)
                lineToRelative(1.14f, -1.14f)
                close()
                moveTo(11.29f, 11.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.71f, -5.71f)
                horizontalLineToRelative(2.59f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(20.0f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(2.59f)
                lineToRelative(-5.71f, 5.71f)
                close()
            }
        }
        .build()
        return _bullseyeArrow!!
    }

private var _bullseyeArrow: ImageVector? = null

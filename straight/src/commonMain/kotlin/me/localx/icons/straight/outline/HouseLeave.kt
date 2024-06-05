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

public val Icons.Outline.HouseLeave: ImageVector
    get() {
        if (_houseLeave != null) {
            return _houseLeave!!
        }
        _houseLeave = Builder(name = "HouseLeave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(20.0f, 12.773f)
                verticalLineToRelative(3.84f)
                lineToRelative(2.028f, 1.354f)
                lineToRelative(-0.028f, 6.038f)
                lineToRelative(-2.0f, -0.01f)
                lineToRelative(0.023f, -4.962f)
                lineToRelative(-4.726f, -3.156f)
                curveToRelative(-0.82f, -0.574f, -1.298f, -1.492f, -1.298f, -2.47f)
                verticalLineToRelative(-3.746f)
                lineToRelative(-2.0f, 1.367f)
                verticalLineToRelative(3.972f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.028f)
                lineToRelative(4.548f, -3.107f)
                curveToRelative(0.302f, -0.275f, 1.104f, -0.848f, 2.548f, -0.848f)
                curveToRelative(1.244f, 0.0f, 2.5f, 0.9f, 2.859f, 2.049f)
                lineToRelative(0.785f, 2.802f)
                lineToRelative(3.165f, 2.063f)
                lineToRelative(-1.092f, 1.676f)
                lineToRelative(-2.813f, -1.834f)
                close()
                moveTo(18.0f, 15.277f)
                verticalLineToRelative(-6.729f)
                curveToRelative(-0.146f, -0.266f, -0.57f, -0.532f, -0.904f, -0.532f)
                curveToRelative(-0.599f, 0.0f, -0.941f, 0.154f, -1.096f, 0.249f)
                verticalLineToRelative(5.142f)
                curveToRelative(0.0f, 0.326f, 0.16f, 0.632f, 0.427f, 0.82f)
                lineToRelative(1.573f, 1.05f)
                close()
                moveTo(14.661f, 17.644f)
                lineToRelative(-2.559f, 6.356f)
                horizontalLineToRelative(2.162f)
                lineToRelative(2.074f, -5.174f)
                reflectiveCurveToRelative(-1.624f, -1.144f, -1.677f, -1.182f)
                close()
                moveTo(7.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.758f, 5.0f)
                curveToRelative(-0.39f, -0.583f, -0.648f, -1.262f, -0.729f, -1.994f)
                lineToRelative(-3.072f, -2.375f)
                curveToRelative(-0.966f, -0.756f, -2.11f, -0.838f, -2.913f, -0.21f)
                lineTo(1.207f, 4.988f)
                curveToRelative(-0.767f, 0.599f, -1.207f, 1.501f, -1.207f, 2.475f)
                verticalLineToRelative(9.537f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(-7.537f)
                curveToRelative(0.0f, -0.354f, 0.16f, -0.682f, 0.438f, -0.9f)
                lineToRelative(5.819f, -4.56f)
                curveToRelative(0.06f, -0.009f, 0.257f, -0.156f, 0.486f, 0.022f)
                lineToRelative(4.272f, 3.465f)
                reflectiveCurveToRelative(0.667f, -0.447f, 0.742f, -0.491f)
                close()
            }
        }
        .build()
        return _houseLeave!!
    }

private var _houseLeave: ImageVector? = null

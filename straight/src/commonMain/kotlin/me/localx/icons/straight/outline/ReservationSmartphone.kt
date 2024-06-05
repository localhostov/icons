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

public val Icons.Outline.ReservationSmartphone: ImageVector
    get() {
        if (_reservationSmartphone != null) {
            return _reservationSmartphone!!
        }
        _reservationSmartphone = Builder(name = "ReservationSmartphone", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.316f, 3.271f)
                curveToRelative(-0.402f, 0.375f, -0.421f, 1.008f, -0.048f, 1.41f)
                curveToRelative(0.019f, 0.02f, 3.443f, 4.32f, 3.443f, 4.32f)
                horizontalLineToRelative(-11.712f)
                curveToRelative(-0.294f, 0.0f, -0.572f, 0.128f, -0.762f, 0.353f)
                curveToRelative(-0.193f, 0.228f, -0.272f, 0.52f, -0.224f, 0.823f)
                curveToRelative(0.076f, 0.462f, 0.556f, 0.825f, 1.093f, 0.825f)
                horizontalLineToRelative(6.433f)
                lineToRelative(2.615f, 7.0f)
                horizontalLineToRelative(2.845f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.232f)
                lineToRelative(-2.615f, -7.0f)
                horizontalLineToRelative(-5.045f)
                curveToRelative(-1.516f, 0.0f, -2.834f, -1.076f, -3.066f, -2.503f)
                curveToRelative(-0.143f, -0.879f, 0.103f, -1.768f, 0.674f, -2.439f)
                curveToRelative(0.571f, -0.672f, 1.404f, -1.057f, 2.286f, -1.057f)
                horizontalLineToRelative(7.563f)
                lineToRelative(-0.804f, -1.017f)
                curveToRelative(-1.072f, -1.21f, -0.997f, -3.064f, 0.191f, -4.174f)
                curveToRelative(1.208f, -1.13f, 3.11f, -1.066f, 4.23f, 0.13f)
                lineToRelative(0.818f, 0.849f)
                verticalLineToRelative(2.881f)
                lineToRelative(-2.268f, -2.352f)
                curveToRelative(-0.378f, -0.403f, -1.013f, -0.424f, -1.416f, -0.046f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(2.0f, 18.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 18.0f)
                close()
                moveTo(10.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _reservationSmartphone!!
    }

private var _reservationSmartphone: ImageVector? = null

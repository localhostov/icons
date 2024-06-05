package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.ReservationSmartphone: ImageVector
    get() {
        if (_reservationSmartphone != null) {
            return _reservationSmartphone!!
        }
        _reservationSmartphone = Builder(name = "ReservationSmartphone", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.538f)
                verticalLineToRelative(16.462f)
                horizontalLineToRelative(-0.593f)
                curveToRelative(-2.055f, 0.0f, -3.901f, -1.258f, -4.653f, -3.171f)
                lineToRelative(-2.292f, -5.829f)
                horizontalLineToRelative(-5.462f)
                curveToRelative(-0.996f, 0.0f, -1.92f, -0.681f, -2.08f, -1.664f)
                curveToRelative(-0.204f, -1.253f, 0.758f, -2.336f, 1.973f, -2.336f)
                horizontalLineToRelative(9.924f)
                curveToRelative(-0.886f, -1.076f, -1.752f, -2.111f, -1.784f, -2.145f)
                curveToRelative(-0.861f, -0.922f, -0.813f, -2.373f, 0.109f, -3.235f)
                curveToRelative(0.923f, -0.863f, 2.372f, -0.819f, 3.23f, 0.098f)
                lineToRelative(1.628f, 1.821f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 17.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 17.0f)
                close()
                moveTo(9.0f, 21.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 9.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-6.0f)
                curveTo(2.239f, 0.0f, 0.0f, 2.239f, 0.0f, 5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _reservationSmartphone!!
    }

private var _reservationSmartphone: ImageVector? = null

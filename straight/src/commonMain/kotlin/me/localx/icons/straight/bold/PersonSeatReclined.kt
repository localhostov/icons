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

public val Icons.Bold.PersonSeatReclined: ImageVector
    get() {
        if (_personSeatReclined != null) {
            return _personSeatReclined!!
        }
        _personSeatReclined = Builder(name = "PersonSeatReclined", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(20.946f, 21.0f)
                lineToRelative(-3.5f, -7.0f)
                horizontalLineToRelative(-7.219f)
                curveToRelative(-0.235f, 0.0f, -0.441f, -0.167f, -0.489f, -0.397f)
                lineToRelative(-0.336f, -1.603f)
                horizontalLineToRelative(6.598f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.227f)
                lineToRelative(-0.419f, -2.0f)
                horizontalLineToRelative(-3.065f)
                lineToRelative(1.513f, 7.218f)
                curveToRelative(0.338f, 1.612f, 1.779f, 2.782f, 3.426f, 2.782f)
                horizontalLineToRelative(5.365f)
                lineToRelative(3.5f, 7.0f)
                horizontalLineToRelative(3.927f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.073f)
                close()
                moveTo(10.145f, 19.0f)
                curveToRelative(-2.57f, 0.0f, -4.831f, -1.823f, -5.375f, -4.334f)
                lineToRelative(-1.662f, -7.666f)
                lineTo(0.039f, 7.0f)
                lineToRelative(1.799f, 8.302f)
                curveToRelative(0.842f, 3.881f, 4.335f, 6.698f, 8.307f, 6.698f)
                horizontalLineToRelative(5.71f)
                lineToRelative(-1.5f, -3.0f)
                horizontalLineToRelative(-4.21f)
                close()
            }
        }
        .build()
        return _personSeatReclined!!
    }

private var _personSeatReclined: ImageVector? = null

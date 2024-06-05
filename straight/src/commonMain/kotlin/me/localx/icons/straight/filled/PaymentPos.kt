package me.localx.icons.straight.filled

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

public val Icons.Filled.PaymentPos: ImageVector
    get() {
        if (_paymentPos != null) {
            return _paymentPos!!
        }
        _paymentPos = Builder(name = "PaymentPos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.621f, 24.0f)
                horizontalLineToRelative(-10.137f)
                lineToRelative(0.015f, -0.022f)
                verticalLineToRelative(-4.116f)
                curveToRelative(0.0f, -1.061f, 0.421f, -2.078f, 1.172f, -2.828f)
                lineToRelative(3.253f, -3.287f)
                curveToRelative(0.817f, -0.817f, 2.127f, -1.011f, 3.069f, -0.342f)
                curveToRelative(1.097f, 0.78f, 1.299f, 2.272f, 0.525f, 3.306f)
                lineToRelative(-2.901f, 2.908f)
                lineToRelative(1.347f, 1.417f)
                lineToRelative(3.035f, -3.035f)
                lineToRelative(-0.015f, -2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.738f, 0.0f, 1.422f, -0.215f, 2.016f, -0.565f)
                verticalLineToRelative(6.186f)
                lineToRelative(-2.379f, 2.379f)
                moveToRelative(0.363f, -24.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(10.863f)
                lineToRelative(0.518f, -0.524f)
                curveToRelative(1.555f, -1.553f, 3.927f, -1.789f, 5.649f, -0.564f)
                curveToRelative(0.782f, 0.556f, 1.331f, 1.334f, 1.613f, 2.226f)
                horizontalLineToRelative(0.219f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                lineTo(23.983f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(9.541f)
                curveToRelative(-0.344f, 0.591f, -0.556f, 1.268f, -0.556f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.984f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(7.984f)
                verticalLineToRelative(6.885f)
                lineToRelative(-0.727f, 0.734f)
                curveToRelative(-0.679f, 0.679f, -1.171f, 1.493f, -1.46f, 2.381f)
                horizontalLineToRelative(-1.798f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 24.0f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _paymentPos!!
    }

private var _paymentPos: ImageVector? = null

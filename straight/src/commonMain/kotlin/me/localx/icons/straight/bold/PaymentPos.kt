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

public val Icons.Bold.PaymentPos: ImageVector
    get() {
        if (_paymentPos != null) {
            return _paymentPos!!
        }
        _paymentPos = Builder(name = "PaymentPos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 21.0f)
                horizontalLineToRelative(5.984f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(9.041f)
                curveToRelative(-0.344f, 0.591f, -0.556f, 1.268f, -0.556f, 2.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(11.985f, 5.0f)
                horizontalLineToRelative(-6.985f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.985f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(12.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 11.065f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.589f)
                curveToRelative(0.338f, 0.42f, 0.602f, 0.893f, 0.766f, 1.411f)
                horizontalLineToRelative(0.219f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                lineTo(23.985f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(10.863f)
                lineToRelative(0.519f, -0.524f)
                curveToRelative(0.708f, -0.707f, 1.588f, -1.126f, 2.497f, -1.274f)
                close()
                moveTo(21.984f, 16.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(0.015f, 2.0f)
                lineToRelative(-3.035f, 3.035f)
                lineToRelative(-1.347f, -1.417f)
                lineToRelative(2.901f, -2.908f)
                curveToRelative(0.775f, -1.033f, 0.572f, -2.526f, -0.525f, -3.306f)
                curveToRelative(-0.942f, -0.669f, -2.252f, -0.475f, -3.069f, 0.342f)
                lineToRelative(-3.253f, 3.287f)
                curveToRelative(-0.75f, 0.75f, -1.172f, 1.768f, -1.172f, 2.828f)
                verticalLineToRelative(4.116f)
                lineToRelative(-0.015f, 0.022f)
                horizontalLineToRelative(10.137f)
                lineToRelative(2.379f, -2.379f)
                verticalLineToRelative(-6.186f)
                curveToRelative(-0.594f, 0.35f, -1.277f, 0.565f, -2.016f, 0.565f)
                close()
            }
        }
        .build()
        return _paymentPos!!
    }

private var _paymentPos: ImageVector? = null

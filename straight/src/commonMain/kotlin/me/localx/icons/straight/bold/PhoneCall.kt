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

public val Icons.Bold.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.0f)
                lineTo(21.0f, 10.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, -7.0f, -7.0f)
                lineTo(14.0f, 0.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 24.0f, 10.0f)
                close()
                moveTo(14.0f, 5.0f)
                lineTo(14.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 14.0f, 5.0f)
                close()
                moveTo(20.265f, 22.235f)
                lineTo(23.91f, 18.59f)
                lineToRelative(-6.641f, -6.642f)
                lineTo(14.3f, 14.923f)
                arcTo(10.7f, 10.7f, 0.0f, false, true, 9.088f, 9.694f)
                lineToRelative(2.964f, -2.963f)
                lineTo(5.41f, 0.09f)
                lineTo(1.766f, 3.734f)
                arcTo(6.055f, 6.055f, 0.0f, false, false, 0.0f, 8.058f)
                curveTo(0.0f, 15.209f, 8.791f, 24.0f, 15.942f, 24.0f)
                arcTo(6.055f, 6.055f, 0.0f, false, false, 20.265f, 22.235f)
                close()
                moveTo(7.809f, 6.731f)
                lineTo(5.541f, 9.0f)
                lineToRelative(0.369f, 0.919f)
                arcToRelative(13.938f, 13.938f, 0.0f, false, false, 8.2f, 8.182f)
                lineToRelative(0.908f, 0.346f)
                lineToRelative(2.255f, -2.256f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(-1.524f, 1.525f)
                arcToRelative(3.076f, 3.076f, 0.0f, false, true, -2.2f, 0.885f)
                curveTo(10.949f, 21.0f, 3.0f, 13.934f, 3.0f, 8.058f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, true, 0.886f, -2.2f)
                lineTo(5.41f, 4.332f)
                close()
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null

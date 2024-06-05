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

public val Icons.Bold.AddressCard: ImageVector
    get() {
        if (_addressCard != null) {
            return _addressCard!!
        }
        _addressCard = Builder(name = "AddressCard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.5f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.5f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8.0f, 22.409f)
                verticalLineToRelative(-6.409f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                lineTo(8.0f, 1.594f)
                lineToRelative(9.118f, 8.343f)
                curveToRelative(0.586f, 0.583f, 0.883f, 1.298f, 0.882f, 2.06f)
                reflectiveCurveToRelative(-0.298f, 1.477f, -0.838f, 2.014f)
                lineToRelative(-9.162f, 8.398f)
                close()
                moveTo(11.0f, 13.0f)
                verticalLineToRelative(2.591f)
                lineToRelative(3.924f, -3.597f)
                lineToRelative(-3.924f, -3.589f)
                verticalLineToRelative(2.595f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _addressCard!!
    }

private var _addressCard: ImageVector? = null

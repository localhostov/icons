package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(8.008f, 8.008f, 0.0f, false, false, -8.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 24.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 11.0f)
                close()
                moveTo(20.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(22.183f, 22.164f)
                lineTo(23.093f, 21.115f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.0f, -4.377f)
                curveToRelative(-0.031f, -0.031f, -2.437f, -1.882f, -2.437f, -1.882f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -4.281f, 0.006f)
                lineToRelative(-1.906f, 1.606f)
                arcTo(12.784f, 12.784f, 0.0f, false, true, 7.537f, 9.524f)
                lineToRelative(1.6f, -1.9f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.007f, -4.282f)
                reflectiveCurveTo(7.291f, 0.939f, 7.26f, 0.908f)
                arcTo(3.082f, 3.082f, 0.0f, false, false, 2.934f, 0.862f)
                lineToRelative(-1.15f, 1.0f)
                curveTo(-5.01f, 9.744f, 9.62f, 24.261f, 17.762f, 24.0f)
                arcTo(6.155f, 6.155f, 0.0f, false, false, 22.183f, 22.164f)
                close()
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null

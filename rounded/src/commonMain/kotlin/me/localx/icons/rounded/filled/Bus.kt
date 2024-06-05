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

public val Icons.Filled.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 9.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(18.35f, 0.83f)
                arcToRelative(24.742f, 24.742f, 0.0f, false, false, -12.7f, 0.0f)
                arcTo(5.057f, 5.057f, 0.0f, false, false, 2.287f, 4.0f)
                lineTo(21.713f, 4.0f)
                arcTo(5.057f, 5.057f, 0.0f, false, false, 18.35f, 0.83f)
                close()
                moveTo(18.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(16.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(6.0f, 16.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, 2.0f, 3.975f)
                lineTo(4.0f, 21.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.949f, 0.5f)
                horizontalLineToRelative(6.1f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.0f, 21.5f)
                verticalLineToRelative(-0.525f)
                arcTo(4.98f, 4.98f, 0.0f, false, false, 22.0f, 17.0f)
                lineTo(22.0f, 16.0f)
                lineTo(18.0f, 16.0f)
                close()
                moveTo(22.0f, 9.0f)
                lineTo(22.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null

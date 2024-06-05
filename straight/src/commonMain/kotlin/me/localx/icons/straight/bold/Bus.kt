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

public val Icons.Bold.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                lineTo(22.0f, 4.583f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -2.054f, -3.135f)
                arcTo(20.208f, 20.208f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(20.208f, 20.208f, 0.0f, false, false, 4.054f, 1.448f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 2.0f, 4.583f)
                lineTo(2.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(20.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 10.0f)
                close()
                moveTo(13.5f, 12.012f)
                lineTo(13.5f, 6.0f)
                lineTo(19.0f, 6.0f)
                verticalLineToRelative(6.012f)
                close()
                moveTo(5.0f, 12.012f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6.012f)
                close()
                moveTo(5.0f, 19.0f)
                lineTo(5.0f, 15.012f)
                lineTo(7.0f, 15.012f)
                lineTo(7.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 17.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 15.5f)
                verticalLineToRelative(-0.488f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 17.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 15.5f)
                verticalLineToRelative(-0.488f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null

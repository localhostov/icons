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

public val Icons.Filled.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.0f)
                lineTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.0f)
                close()
                moveTo(24.0f, 8.0f)
                lineTo(24.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(18.0f, 2.0f)
                lineTo(18.0f, 0.0f)
                lineTo(16.0f, 0.0f)
                lineTo(16.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                lineTo(8.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                lineTo(6.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 5.0f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 14.0f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 16.0f)
                close()
                moveTo(18.0f, 18.0f)
                lineTo(16.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 20.0f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null

package me.localx.icons.rounded.bold

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

public val Icons.Bold.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                lineTo(18.0f, 2.0f)
                lineTo(18.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 1.5f)
                lineTo(15.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                lineTo(9.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 1.5f)
                lineTo(6.0f, 2.0f)
                lineTo(5.5f, 2.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 0.0f, 7.5f)
                verticalLineToRelative(11.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 24.0f, 18.5f)
                lineTo(24.0f, 7.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 18.5f, 2.0f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                lineTo(3.0f, 10.0f)
                lineTo(21.0f, 10.0f)
                verticalLineToRelative(8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 21.0f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null

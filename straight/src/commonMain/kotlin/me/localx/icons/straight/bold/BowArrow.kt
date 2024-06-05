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

public val Icons.Bold.BowArrow: ImageVector
    get() {
        if (_bowArrow != null) {
            return _bowArrow!!
        }
        _bowArrow = Builder(name = "BowArrow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.879f)
                lineTo(16.462f, 5.417f)
                arcTo(11.661f, 11.661f, 0.0f, false, false, 1.126f, 6.41f)
                lineTo(0.065f, 7.47f)
                lineToRelative(7.172f, 7.172f)
                lineTo(4.879f, 17.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(1.879f)
                lineTo(0.033f, 21.846f)
                lineToRelative(2.121f, 2.121f)
                lineTo(4.0f, 22.121f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.121f)
                lineToRelative(2.358f, -2.358f)
                lineToRelative(7.172f, 7.172f)
                lineToRelative(1.06f, -1.061f)
                arcToRelative(11.66f, 11.66f, 0.0f, false, false, 0.993f, -15.336f)
                lineTo(21.0f, 5.121f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(4.4f, 7.562f)
                arcToRelative(8.667f, 8.667f, 0.0f, false, true, 9.916f, 0.0f)
                lineTo(9.358f, 12.521f)
                close()
                moveTo(16.437f, 19.6f)
                lineToRelative(-4.958f, -4.958f)
                lineToRelative(4.958f, -4.958f)
                arcTo(8.666f, 8.666f, 0.0f, false, true, 16.437f, 19.6f)
                close()
            }
        }
        .build()
        return _bowArrow!!
    }

private var _bowArrow: ImageVector? = null

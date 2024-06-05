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

public val Icons.Bold.Frame: ImageVector
    get() {
        if (_frame != null) {
            return _frame!!
        }
        _frame = Builder(name = "Frame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(21.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 3.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _frame!!
    }

private var _frame: ImageVector? = null

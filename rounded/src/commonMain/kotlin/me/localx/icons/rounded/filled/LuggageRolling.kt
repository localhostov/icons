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

public val Icons.Filled.LuggageRolling: ImageVector
    get() {
        if (_luggageRolling != null) {
            return _luggageRolling!!
        }
        _luggageRolling = Builder(name = "LuggageRolling", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                lineTo(17.0f, 5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 5.0f)
                lineTo(7.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 3.0f, 4.576f)
                lineTo(3.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(5.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(21.0f, 21.576f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 24.0f, 17.0f)
                lineTo(24.0f, 13.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 8.0f)
                close()
                moveTo(9.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineTo(15.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                close()
                moveTo(16.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _luggageRolling!!
    }

private var _luggageRolling: ImageVector? = null

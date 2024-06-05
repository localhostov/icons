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
                moveTo(24.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(17.0f, 8.0f)
                lineTo(17.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(10.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 3.0f)
                lineTo(7.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 24.0f)
                lineTo(4.0f, 22.0f)
                lineTo(20.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(15.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                close()
                moveTo(17.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                lineTo(7.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _luggageRolling!!
    }

private var _luggageRolling: ImageVector? = null

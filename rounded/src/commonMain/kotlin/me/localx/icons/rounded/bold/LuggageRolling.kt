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

public val Icons.Bold.LuggageRolling: ImageVector
    get() {
        if (_luggageRolling != null) {
            return _luggageRolling!!
        }
        _luggageRolling = Builder(name = "LuggageRolling", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.484f)
                lineTo(3.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-0.409f)
                lineTo(18.0f, 22.091f)
                lineTo(18.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(21.0f, 21.484f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 3.0f, -4.893f)
                lineTo(24.0f, 12.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 18.5f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 5.0f)
                lineTo(7.0f, 7.0f)
                lineTo(5.5f, 7.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 12.5f)
                verticalLineToRelative(4.091f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 3.0f, 21.484f)
                close()
                moveTo(10.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                lineTo(14.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                close()
                moveTo(3.0f, 12.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 10.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 12.5f)
                verticalLineToRelative(4.091f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(5.5f, 19.091f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                close()
                moveTo(7.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 12.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 13.5f)
                close()
            }
        }
        .build()
        return _luggageRolling!!
    }

private var _luggageRolling: ImageVector? = null

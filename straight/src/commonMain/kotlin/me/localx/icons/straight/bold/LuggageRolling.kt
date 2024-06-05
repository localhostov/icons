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
                moveTo(20.5f, 7.0f)
                lineTo(18.0f, 7.0f)
                lineTo(18.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.0f, 3.5f)
                lineTo(6.0f, 7.0f)
                lineTo(3.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 10.5f)
                lineTo(0.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 7.0f)
                close()
                moveTo(9.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(15.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                close()
                moveTo(3.0f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 15.0f)
                close()
            }
        }
        .build()
        return _luggageRolling!!
    }

private var _luggageRolling: ImageVector? = null

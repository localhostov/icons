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

public val Icons.Bold.KeyboardLeft: ImageVector
    get() {
        if (_keyboardLeft != null) {
            return _keyboardLeft!!
        }
        _keyboardLeft = Builder(name = "KeyboardLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(11.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(21.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(0.371f, 12.825f)
                lineToRelative(3.629f, 3.321f)
                lineTo(4.0f, 7.843f)
                lineTo(0.371f, 11.164f)
                curveToRelative(-0.494f, 0.443f, -0.494f, 1.217f, 0.0f, 1.66f)
                close()
            }
        }
        .build()
        return _keyboardLeft!!
    }

private var _keyboardLeft: ImageVector? = null

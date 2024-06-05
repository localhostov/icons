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

public val Icons.Filled.KeyboardLeft: ImageVector
    get() {
        if (_keyboardLeft != null) {
            return _keyboardLeft!!
        }
        _keyboardLeft = Builder(name = "KeyboardLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.012f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.988f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.988f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.988f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.988f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.988f)
                lineTo(24.0f, 3.0f)
                horizontalLineToRelative(-14.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-8.988f)
                close()
                moveTo(16.012f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.012f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.012f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3.879f, 16.707f)
                lineToRelative(-3.293f, -3.293f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.048f, 0.0f, -2.828f)
                lineToRelative(3.293f, -3.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _keyboardLeft!!
    }

private var _keyboardLeft: ImageVector? = null

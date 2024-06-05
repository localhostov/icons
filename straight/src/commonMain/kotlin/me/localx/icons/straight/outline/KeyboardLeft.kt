package me.localx.icons.straight.outline

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

public val Icons.Outline.KeyboardLeft: ImageVector
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
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-14.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 21.0f)
                lineTo(7.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(14.5f)
                close()
                moveTo(14.012f, 11.036f)
                lineToRelative(-3.0f, -0.036f)
                lineToRelative(-0.024f, 2.0f)
                lineToRelative(3.0f, 0.036f)
                lineToRelative(0.024f, -2.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.988f, 6.964f)
                lineToRelative(-3.0f, 0.036f)
                lineToRelative(0.024f, 2.0f)
                lineToRelative(3.0f, -0.036f)
                lineToRelative(-0.024f, -2.0f)
                close()
                moveTo(19.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 17.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.879f, 7.293f)
                lineToRelative(-3.293f, 3.293f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.048f, 0.0f, 2.828f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(3.293f, -3.293f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _keyboardLeft!!
    }

private var _keyboardLeft: ImageVector? = null

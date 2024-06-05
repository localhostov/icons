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

public val Icons.Outline.Lipstick: ImageVector
    get() {
        if (_lipstick != null) {
            return _lipstick!!
        }
        _lipstick = Builder(name = "Lipstick", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 13.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.895f, -1.788f)
                lineToRelative(-3.447f, 1.724f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, false, -1.658f, 2.683f)
                verticalLineToRelative(4.381f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(10.0f, 4.619f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.553f, -0.894f)
                lineToRelative(3.447f, -1.725f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(17.0f, 22.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _lipstick!!
    }

private var _lipstick: ImageVector? = null

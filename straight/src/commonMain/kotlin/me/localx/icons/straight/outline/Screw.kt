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

public val Icons.Outline.Screw: ImageVector
    get() {
        if (_screw != null) {
            return _screw!!
        }
        _screw = Builder(name = "Screw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                verticalLineToRelative(3.914f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(14.058f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                lineTo(15.0f, 6.914f)
                lineToRelative(3.0f, -3.0f)
                lineTo(18.0f, 0.0f)
                close()
                moveTo(11.0f, 13.414f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(2.682f)
                lineToRelative(-2.0f, 2.073f)
                verticalLineToRelative(-2.755f)
                close()
                moveTo(13.0f, 8.586f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-3.586f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.586f)
                close()
                moveTo(12.0f, 21.144f)
                lineToRelative(-1.0f, -1.0f)
                verticalLineToRelative(-1.094f)
                lineToRelative(2.0f, -2.073f)
                verticalLineToRelative(3.167f)
                lineToRelative(-1.0f, 1.0f)
                close()
                moveTo(16.0f, 3.086f)
                lineToRelative(-1.914f, 1.914f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(-1.914f, -1.914f)
                verticalLineToRelative(-1.086f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.086f)
                close()
            }
        }
        .build()
        return _screw!!
    }

private var _screw: ImageVector? = null

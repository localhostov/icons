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

public val Icons.Outline.StateCountry: ImageVector
    get() {
        if (_stateCountry != null) {
            return _stateCountry!!
        }
        _stateCountry = Builder(name = "StateCountry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-6.0f, -2.0f)
                lineToRelative(-6.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-6.0f, -2.0f)
                lineToRelative(-6.0f, 2.0f)
                close()
                moveTo(3.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(20.914f, 19.0f)
                lineToRelative(3.086f, 3.086f)
                verticalLineToRelative(1.914f)
                horizontalLineToRelative(-0.914f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(-6.086f)
                verticalLineToRelative(-5.555f)
                lineToRelative(-7.0f, -5.945f)
                verticalLineToRelative(-4.5f)
                lineTo(2.586f, 5.0f)
                lineTo(0.0f, 2.414f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(0.414f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(5.586f)
                verticalLineToRelative(5.556f)
                lineToRelative(7.0f, 5.944f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(4.914f)
                close()
            }
        }
        .build()
        return _stateCountry!!
    }

private var _stateCountry: ImageVector? = null

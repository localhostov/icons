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

public val Icons.Bold.StateCountry: ImageVector
    get() {
        if (_stateCountry != null) {
            return _stateCountry!!
        }
        _stateCountry = Builder(name = "StateCountry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-5.5f, -2.0f)
                lineToRelative(-5.5f, 2.0f)
                close()
                moveTo(7.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-5.5f, -2.0f)
                lineToRelative(-5.5f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(20.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(20.621f, 18.0f)
                lineToRelative(3.379f, 3.379f)
                verticalLineToRelative(2.621f)
                horizontalLineToRelative(-1.621f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(-5.379f)
                verticalLineToRelative(-5.002f)
                lineToRelative(-8.0f, -6.579f)
                verticalLineToRelative(-3.419f)
                horizontalLineToRelative(-3.121f)
                lineTo(0.0f, 3.121f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(1.121f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(4.879f)
                verticalLineToRelative(5.002f)
                lineToRelative(8.0f, 6.578f)
                verticalLineToRelative(3.42f)
                horizontalLineToRelative(3.621f)
                close()
            }
        }
        .build()
        return _stateCountry!!
    }

private var _stateCountry: ImageVector? = null

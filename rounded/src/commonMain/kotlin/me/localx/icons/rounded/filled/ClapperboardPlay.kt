package me.localx.icons.rounded.filled

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

public val Icons.Filled.ClapperboardPlay: ImageVector
    get() {
        if (_clapperboardPlay != null) {
            return _clapperboardPlay!!
        }
        _clapperboardPlay = Builder(name = "ClapperboardPlay", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.914f, 1.0f)
                horizontalLineToRelative(2.086f)
                curveToRelative(0.621f, 0.0f, 1.215f, 0.114f, 1.764f, 0.322f)
                lineToRelative(-5.678f, 5.678f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(6.0f, -6.0f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.4f, -0.579f, -2.668f, -1.51f, -3.576f)
                lineToRelative(-4.576f, 4.576f)
                horizontalLineToRelative(6.086f)
                close()
                moveTo(10.522f, 1.0f)
                lineToRelative(-6.084f, 6.0f)
                horizontalLineToRelative(3.648f)
                lineTo(14.086f, 1.0f)
                horizontalLineToRelative(-3.564f)
                close()
                moveTo(1.59f, 7.0f)
                lineTo(7.674f, 1.0f)
                horizontalLineToRelative(-2.674f)
                curveTo(2.243f, 1.0f, 0.0f, 3.243f, 0.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.59f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(15.047f, 15.2f)
                lineToRelative(-4.634f, -2.48f)
                curveToRelative(-0.622f, -0.373f, -1.413f, 0.075f, -1.413f, 0.8f)
                verticalLineToRelative(4.961f)
                curveToRelative(0.0f, 0.725f, 0.791f, 1.173f, 1.413f, 0.8f)
                lineToRelative(4.634f, -2.48f)
                curveToRelative(0.604f, -0.362f, 0.604f, -1.238f, 0.0f, -1.6f)
                close()
            }
        }
        .build()
        return _clapperboardPlay!!
    }

private var _clapperboardPlay: ImageVector? = null

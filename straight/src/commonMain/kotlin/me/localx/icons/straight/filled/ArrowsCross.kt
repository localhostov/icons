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

public val Icons.Filled.ArrowsCross: ImageVector
    get() {
        if (_arrowsCross != null) {
            return _arrowsCross!!
        }
        _arrowsCross = Builder(name = "ArrowsCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.162f, 10.576f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineTo(10.576f, 9.162f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(22.0f, 20.586f)
                lineToRelative(-7.162f, -7.162f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(7.162f, 7.162f)
                horizontalLineToRelative(-4.586f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.586f)
                close()
                moveTo(22.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(4.586f)
                lineTo(0.043f, 22.543f)
                lineToRelative(1.414f, 1.414f)
                lineTo(22.0f, 3.414f)
                verticalLineToRelative(4.586f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _arrowsCross!!
    }

private var _arrowsCross: ImageVector? = null

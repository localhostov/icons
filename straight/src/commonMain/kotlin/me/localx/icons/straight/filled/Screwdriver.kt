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

public val Icons.Filled.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.578f, 9.0f)
                lineToRelative(3.396f, -5.891f)
                lineTo(20.891f, 0.025f)
                lineToRelative(-5.891f, 3.396f)
                verticalLineToRelative(4.164f)
                lineToRelative(-5.01f, 5.01f)
                lineToRelative(-1.411f, -1.398f)
                lineTo(0.898f, 18.879f)
                curveToRelative(-1.168f, 1.17f, -1.168f, 3.072f, 0.0f, 4.242f)
                curveToRelative(0.566f, 0.566f, 1.32f, 0.879f, 2.122f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                lineToRelative(7.701f, -7.701f)
                lineToRelative(-1.431f, -1.417f)
                lineToRelative(5.003f, -5.003f)
                horizontalLineToRelative(4.164f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null

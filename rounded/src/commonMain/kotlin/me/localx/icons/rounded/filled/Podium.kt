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

public val Icons.Filled.Podium: ImageVector
    get() {
        if (_podium != null) {
            return _podium!!
        }
        _podium = Builder(name = "Podium", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(0.184f)
                curveToRelative(0.414f, 1.161f, 1.514f, 2.0f, 2.816f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(3.957f, -0.104f, 3.954f, -5.897f, 0.0f, -6.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.302f, 0.0f, -2.402f, 0.839f, -2.816f, 2.0f)
                horizontalLineToRelative(-0.184f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(1.0f)
                curveToRelative(-1.308f, 0.006f, -1.307f, 1.994f, 0.0f, 2.0f)
                horizontalLineToRelative(1.153f)
                lineToRelative(1.304f, 7.821f)
                curveToRelative(0.403f, 2.422f, 2.478f, 4.179f, 4.932f, 4.179f)
                horizontalLineToRelative(7.223f)
                curveToRelative(2.455f, 0.0f, 4.529f, -1.757f, 4.932f, -4.179f)
                lineToRelative(1.304f, -7.821f)
                horizontalLineToRelative(1.153f)
                curveToRelative(1.308f, -0.006f, 1.307f, -1.994f, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _podium!!
    }

private var _podium: ImageVector? = null

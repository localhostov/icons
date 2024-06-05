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

public val Icons.Filled.Leave: ImageVector
    get() {
        if (_leave != null) {
            return _leave!!
        }
        _leave = Builder(name = "Leave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.473f, 16.247f)
                lineToRelative(-2.862f, 2.863f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.696f, -1.696f)
                horizontalLineToRelative(-6.892f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.956f)
                lineToRelative(-1.76f, -1.761f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.862f, 2.862f)
                curveToRelative(0.706f, 0.706f, 0.706f, 1.854f, 0.0f, 2.56f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.999f)
                lineTo(0.0f, 23.999f)
                lineTo(0.0f, 4.199f)
                curveTo(0.0f, 2.775f, 1.014f, 1.538f, 2.411f, 1.258f)
                lineTo(8.412f, 0.057f)
                curveToRelative(0.886f, -0.174f, 1.793f, 0.051f, 2.491f, 0.622f)
                curveToRelative(0.428f, 0.351f, 0.728f, 0.812f, 0.908f, 1.319f)
                horizontalLineToRelative(1.19f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(7.001f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.001f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.999f)
                close()
                moveTo(9.001f, 12.499f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.501f, -1.501f, -1.501f)
                reflectiveCurveToRelative(-1.501f, 0.672f, -1.501f, 1.501f)
                reflectiveCurveToRelative(0.672f, 1.501f, 1.501f, 1.501f)
                reflectiveCurveToRelative(1.501f, -0.672f, 1.501f, -1.501f)
                close()
            }
        }
        .build()
        return _leave!!
    }

private var _leave: ImageVector? = null

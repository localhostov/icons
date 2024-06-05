package me.localx.icons.rounded.bold

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

public val Icons.Bold.Screw: ImageVector
    get() {
        if (_screw != null) {
            return _screw!!
        }
        _screw = Builder(name = "Screw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.879f, 0.0f)
                horizontalLineToRelative(-7.759f)
                curveToRelative(-1.171f, 0.0f, -2.121f, 0.949f, -2.121f, 2.121f)
                curveToRelative(0.0f, 0.563f, 0.224f, 1.103f, 0.622f, 1.501f)
                lineToRelative(1.378f, 1.375f)
                verticalLineToRelative(13.346f)
                curveToRelative(0.0f, 1.469f, 0.572f, 2.85f, 1.611f, 3.889f)
                lineToRelative(1.329f, 1.329f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(1.329f, -1.329f)
                curveToRelative(1.039f, -1.039f, 1.611f, -2.419f, 1.611f, -3.889f)
                lineTo(16.001f, 5.022f)
                lineToRelative(1.387f, -1.403f)
                curveToRelative(0.393f, -0.397f, 0.613f, -0.933f, 0.613f, -1.491f)
                verticalLineToRelative(-0.008f)
                curveToRelative(0.0f, -1.171f, -0.949f, -2.121f, -2.121f, -2.121f)
                close()
                moveTo(13.0f, 18.343f)
                curveToRelative(0.0f, 0.658f, -0.267f, 1.302f, -0.732f, 1.768f)
                lineToRelative(-0.268f, 0.268f)
                lineToRelative(-0.268f, -0.268f)
                curveToRelative(-0.465f, -0.465f, -0.732f, -1.109f, -0.732f, -1.768f)
                verticalLineToRelative(-0.782f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(2.782f)
                close()
                moveTo(13.0f, 12.733f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-2.819f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(2.819f)
                close()
                moveTo(13.0f, 7.086f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-4.076f)
                lineToRelative(2.0f, 0.006f)
                verticalLineToRelative(2.07f)
                close()
            }
        }
        .build()
        return _screw!!
    }

private var _screw: ImageVector? = null

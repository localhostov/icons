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

public val Icons.Outline.HandBackPointRibbon: ImageVector
    get() {
        if (_handBackPointRibbon != null) {
            return _handBackPointRibbon!!
        }
        _handBackPointRibbon = Builder(name = "HandBackPointRibbon", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.18f)
                lineTo(12.0f, 3.107f)
                curveTo(12.0f, 1.591f, 10.924f, 0.273f, 9.497f, 0.041f)
                curveToRelative(-0.879f, -0.142f, -1.768f, 0.103f, -2.439f, 0.674f)
                curveToRelative(-0.672f, 0.571f, -1.057f, 1.404f, -1.057f, 2.286f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 4.001f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(6.0f, 8.001f)
                verticalLineToRelative(2.581f)
                lineTo(1.879f, 14.636f)
                curveToRelative(-0.567f, 0.567f, -0.879f, 1.32f, -0.879f, 2.122f)
                reflectiveCurveToRelative(0.312f, 1.555f, 0.879f, 2.121f)
                lineToRelative(5.121f, 5.122f)
                horizontalLineToRelative(15.0f)
                lineTo(22.0f, 10.18f)
                lineToRelative(-10.0f, -2.0f)
                close()
                moveTo(8.0f, 3.0f)
                curveToRelative(0.0f, -0.294f, 0.128f, -0.572f, 0.353f, -0.762f)
                curveToRelative(0.228f, -0.193f, 0.518f, -0.273f, 0.823f, -0.224f)
                curveToRelative(0.462f, 0.076f, 0.825f, 0.556f, 0.825f, 1.093f)
                verticalLineToRelative(0.893f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(7.828f, 22.0f)
                lineToRelative(-4.535f, -4.536f)
                curveToRelative(-0.189f, -0.188f, -0.293f, -0.439f, -0.293f, -0.707f)
                reflectiveCurveToRelative(0.104f, -0.518f, 0.287f, -0.701f)
                lineToRelative(2.713f, -2.669f)
                verticalLineToRelative(3.613f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.82f)
                lineToRelative(10.0f, 2.0f)
                verticalLineToRelative(10.18f)
                close()
            }
        }
        .build()
        return _handBackPointRibbon!!
    }

private var _handBackPointRibbon: ImageVector? = null

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

public val Icons.Outline.HandBackPointRight: ImageVector
    get() {
        if (_handBackPointRight != null) {
            return _handBackPointRight!!
        }
        _handBackPointRight = Builder(name = "HandBackPointRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.286f, 7.057f)
                curveToRelative(-0.571f, -0.672f, -1.404f, -1.057f, -2.286f, -1.057f)
                horizontalLineToRelative(-7.581f)
                lineTo(9.364f, 1.879f)
                curveToRelative(-1.134f, -1.134f, -3.11f, -1.134f, -4.243f, 0.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(15.0f)
                lineTo(13.82f, 22.0f)
                lineToRelative(2.0f, -10.0f)
                horizontalLineToRelative(5.073f)
                curveToRelative(1.516f, 0.0f, 2.834f, -1.076f, 3.066f, -2.503f)
                curveToRelative(0.143f, -0.879f, -0.103f, -1.768f, -0.674f, -2.439f)
                close()
                moveTo(21.986f, 9.175f)
                curveToRelative(-0.076f, 0.462f, -0.556f, 0.825f, -1.093f, 0.825f)
                horizontalLineToRelative(-6.713f)
                lineToRelative(-2.0f, 10.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 7.828f)
                lineTo(6.536f, 3.293f)
                curveToRelative(0.377f, -0.378f, 1.042f, -0.372f, 1.408f, -0.006f)
                lineToRelative(2.669f, 2.713f)
                horizontalLineToRelative(-3.613f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.294f, 0.0f, 0.572f, 0.128f, 0.762f, 0.353f)
                curveToRelative(0.193f, 0.228f, 0.272f, 0.52f, 0.224f, 0.823f)
                close()
            }
        }
        .build()
        return _handBackPointRight!!
    }

private var _handBackPointRight: ImageVector? = null

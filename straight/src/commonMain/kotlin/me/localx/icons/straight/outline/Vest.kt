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

public val Icons.Outline.Vest: ImageVector
    get() {
        if (_vest != null) {
            return _vest!!
        }
        _vest = Builder(name = "Vest", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                lineTo(21.0f, 3.394f)
                curveToRelative(0.0f, -1.358f, -0.905f, -2.549f, -2.202f, -2.896f)
                curveToRelative(-1.847f, -0.492f, -3.719f, -0.498f, -3.798f, -0.498f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.079f, 0.0f, -1.951f, 0.006f, -3.798f, 0.498f)
                curveToRelative(-1.297f, 0.347f, -2.202f, 1.537f, -2.202f, 2.896f)
                verticalLineToRelative(4.606f)
                curveToRelative(0.0f, 0.933f, -1.319f, 2.832f, -2.0f, 3.632f)
                verticalLineToRelative(12.368f)
                lineTo(23.0f, 24.0f)
                lineTo(23.0f, 11.631f)
                curveToRelative(-0.574f, -0.673f, -2.0f, -2.658f, -2.0f, -3.631f)
                close()
                moveTo(11.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(-2.644f)
                curveToRelative(0.595f, -0.754f, 2.0f, -2.71f, 2.0f, -4.356f)
                lineTo(5.0f, 3.394f)
                curveToRelative(0.0f, -0.454f, 0.295f, -0.85f, 0.718f, -0.963f)
                curveToRelative(0.556f, -0.148f, 1.123f, -0.246f, 1.626f, -0.309f)
                lineToRelative(3.656f, 10.055f)
                verticalLineToRelative(9.824f)
                close()
                moveTo(9.427f, 2.0f)
                horizontalLineToRelative(5.145f)
                lineToRelative(-2.573f, 7.074f)
                lineToRelative(-2.573f, -7.074f)
                close()
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 12.176f)
                lineToRelative(3.656f, -10.055f)
                curveToRelative(0.503f, 0.064f, 1.071f, 0.161f, 1.626f, 0.309f)
                curveToRelative(0.423f, 0.113f, 0.718f, 0.509f, 0.718f, 0.963f)
                verticalLineToRelative(4.606f)
                curveToRelative(0.0f, 1.646f, 1.405f, 3.602f, 2.0f, 4.356f)
                verticalLineToRelative(2.644f)
                close()
            }
        }
        .build()
        return _vest!!
    }

private var _vest: ImageVector? = null

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

public val Icons.Outline.BoothCurtain: ImageVector
    get() {
        if (_boothCurtain != null) {
            return _boothCurtain!!
        }
        _boothCurtain = Builder(name = "BoothCurtain", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-14.806f)
                curveToRelative(2.004f, 3.472f, 5.091f, 5.217f, 7.281f, 6.06f)
                curveToRelative(-1.884f, 1.61f, -4.281f, 4.327f, -4.281f, 7.746f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(10.0f)
                lineTo(2.0f, 12.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 22.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(8.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(13.027f, 2.0f)
                horizontalLineToRelative(1.933f)
                curveToRelative(0.302f, 5.11f, 2.904f, 7.643f, 5.041f, 8.877f)
                verticalLineToRelative(-2.377f)
                curveToRelative(-1.407f, -1.14f, -2.788f, -3.124f, -3.023f, -6.5f)
                horizontalLineToRelative(4.023f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(10.759f)
                curveToRelative(-2.557f, -0.711f, -8.536f, -3.274f, -8.973f, -11.759f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-3.905f)
                curveToRelative(0.456f, -2.425f, 2.469f, -4.419f, 3.905f, -5.568f)
                verticalLineToRelative(5.568f)
                close()
                moveTo(4.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _boothCurtain!!
    }

private var _boothCurtain: ImageVector? = null

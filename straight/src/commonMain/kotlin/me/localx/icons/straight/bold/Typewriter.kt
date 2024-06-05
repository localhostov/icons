package me.localx.icons.straight.bold

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

public val Icons.Bold.Typewriter: ImageVector
    get() {
        if (_typewriter != null) {
            return _typewriter!!
        }
        _typewriter = Builder(name = "Typewriter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(7.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineToRelative(-2.314f)
                curveToRelative(0.194f, 0.377f, 0.313f, 0.797f, 0.313f, 1.25f)
                curveToRelative(0.0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.519f, 0.0f, -2.75f, -1.231f, -2.75f, -2.75f)
                curveToRelative(0.0f, -0.453f, 0.12f, -0.873f, 0.313f, -1.25f)
                horizontalLineToRelative(-2.313f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                lineTo(18.999f, 9.0f)
                close()
            }
        }
        .build()
        return _typewriter!!
    }

private var _typewriter: ImageVector? = null

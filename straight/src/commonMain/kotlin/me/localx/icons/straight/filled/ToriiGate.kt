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

public val Icons.Filled.ToriiGate: ImageVector
    get() {
        if (_toriiGate != null) {
            return _toriiGate!!
        }
        _toriiGate = Builder(name = "ToriiGate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.173f, 2.968f)
                lineToRelative(0.827f, -1.754f)
                lineToRelative(-1.339f, -0.928f)
                lineToRelative(-0.314f, 0.262f)
                curveToRelative(-1.124f, 0.937f, -2.55f, 1.453f, -4.013f, 1.453f)
                lineTo(5.666f, 2.001f)
                curveToRelative(-1.463f, 0.0f, -2.889f, -0.516f, -4.013f, -1.453f)
                lineToRelative(-0.316f, -0.263f)
                lineToRelative(-1.337f, 0.93f)
                lineToRelative(0.827f, 1.754f)
                curveToRelative(0.655f, 1.528f, 1.776f, 2.718f, 3.173f, 3.398f)
                verticalLineToRelative(2.634f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.634f)
                curveToRelative(1.397f, -0.68f, 2.518f, -1.87f, 3.173f, -3.398f)
                close()
                moveTo(6.0f, 6.941f)
                curveToRelative(0.259f, 0.031f, 0.519f, 0.059f, 0.787f, 0.059f)
                horizontalLineToRelative(4.213f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.059f)
                close()
                moveTo(18.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.213f)
                curveToRelative(0.268f, 0.0f, 0.528f, -0.027f, 0.787f, -0.059f)
                verticalLineToRelative(2.059f)
                close()
            }
        }
        .build()
        return _toriiGate!!
    }

private var _toriiGate: ImageVector? = null

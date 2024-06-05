package me.localx.icons.rounded.outline

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

public val Icons.Outline.Q: ImageVector
    get() {
        if (_q != null) {
            return _q!!
        }
        _q = Builder(name = "Q", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.707f, 22.293f)
                lineToRelative(-2.541f, -2.541f)
                curveToRelative(1.151f, -1.629f, 1.834f, -3.611f, 1.834f, -5.752f)
                verticalLineToRelative(-4.0f)
                curveTo(21.496f, -3.251f, 2.5f, -3.241f, 2.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(-0.065f, 8.706f, 10.661f, 13.26f, 16.851f, 7.265f)
                lineToRelative(2.442f, 2.442f)
                curveToRelative(0.929f, 0.921f, 2.335f, -0.486f, 1.414f, -1.414f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.377f, -10.591f, 15.627f, -10.583f, 16.0f, 0.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.589f, -0.471f, 3.067f, -1.273f, 4.313f)
                lineToRelative(-2.02f, -2.02f)
                curveToRelative(-0.929f, -0.921f, -2.335f, 0.486f, -1.414f, 1.414f)
                lineToRelative(2.144f, 2.144f)
                curveToRelative(-1.429f, 1.329f, -3.337f, 2.149f, -5.437f, 2.149f)
                close()
            }
        }
        .build()
        return _q!!
    }

private var _q: ImageVector? = null

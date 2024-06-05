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

public val Icons.Outline.O: ImageVector
    get() {
        if (_o != null) {
            return _o!!
        }
        _o = Builder(name = "O", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.021f, 24.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.504f, -13.251f, 19.5f, -13.241f, 20.0f, 0.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.021f, 2.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.377f, 10.591f, 15.627f, 10.583f, 16.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _o!!
    }

private var _o: ImageVector? = null

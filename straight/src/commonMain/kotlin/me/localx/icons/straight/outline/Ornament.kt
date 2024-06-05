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

public val Icons.Outline.Ornament: ImageVector
    get() {
        if (_ornament != null) {
            return _ornament!!
        }
        _ornament = Builder(name = "Ornament", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 4.836f)
                verticalLineToRelative(-1.836f)
                horizontalLineToRelative(-2.271f)
                curveToRelative(0.17f, -0.294f, 0.268f, -0.636f, 0.268f, -1.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.364f, 0.098f, 0.706f, 0.268f, 1.0f)
                horizontalLineToRelative(-2.266f)
                verticalLineToRelative(1.836f)
                curveToRelative(-3.529f, 1.546f, -6.0f, 5.072f, -6.0f, 9.164f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -4.093f, -2.471f, -7.618f, -6.0f, -9.164f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                curveToRelative(0.0f, 0.185f, -0.007f, 0.367f, -0.019f, 0.549f)
                lineToRelative(-3.963f, -3.963f)
                lineToRelative(-4.038f, 4.039f)
                lineToRelative(-3.846f, -3.846f)
                lineToRelative(-4.086f, 4.086f)
                curveToRelative(-0.031f, -0.284f, -0.047f, -0.573f, -0.047f, -0.865f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-3.309f, 0.0f, -6.155f, -2.019f, -7.371f, -4.89f)
                lineToRelative(3.504f, -3.504f)
                lineToRelative(3.846f, 3.846f)
                lineToRelative(4.038f, -4.039f)
                lineToRelative(3.451f, 3.451f)
                curveToRelative(-1.155f, 3.0f, -4.067f, 5.135f, -7.469f, 5.135f)
                close()
            }
        }
        .build()
        return _ornament!!
    }

private var _ornament: ImageVector? = null

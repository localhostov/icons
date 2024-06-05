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

public val Icons.Bold.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 507.506f, viewportHeight = 507.506f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.865f, 436.934f)
                curveToRelative(-14.406f, 0.006f, -28.222f, -5.72f, -38.4f, -15.915f)
                lineTo(9.369f, 304.966f)
                curveToRelative(-12.492f, -12.496f, -12.492f, -32.752f, 0.0f, -45.248f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(12.496f, -12.492f, 32.752f, -12.492f, 45.248f, 0.0f)
                lineToRelative(109.248f, 109.248f)
                lineTo(452.889f, 79.942f)
                curveToRelative(12.496f, -12.492f, 32.752f, -12.492f, 45.248f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(12.492f, 12.496f, 12.492f, 32.752f, 0.0f, 45.248f)
                lineTo(202.265f, 421.019f)
                curveTo(192.087f, 431.214f, 178.271f, 436.94f, 163.865f, 436.934f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null

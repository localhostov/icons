package me.localx.icons.rounded.filled

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

public val Icons.Filled.Sushi: ImageVector
    get() {
        if (_sushi != null) {
            return _sushi!!
        }
        _sushi = Builder(name = "Sushi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 11.0f)
                curveToRelative(0.067f, 1.293f, 7.938f, 1.291f, 8.0f, 0.0f)
                curveTo(12.433f, 9.707f, 4.562f, 9.709f, 4.5f, 11.0f)
                close()
                moveTo(11.5f, 5.0f)
                curveToRelative(0.067f, 1.293f, 7.938f, 1.291f, 8.0f, 0.0f)
                curveTo(19.433f, 3.707f, 11.562f, 3.709f, 11.5f, 5.0f)
                close()
                moveTo(8.5f, 6.0f)
                curveTo(3.733f, 6.0f, 0.0f, 8.2f, 0.0f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.162f, 6.6f, 16.839f, 6.6f, 17.0f, 0.0f)
                lineTo(17.0f, 11.0f)
                curveTo(17.0f, 8.2f, 13.267f, 6.0f, 8.5f, 6.0f)
                close()
                moveTo(8.5f, 8.0f)
                curveToRelative(8.572f, 0.227f, 8.572f, 5.774f, 0.0f, 6.0f)
                curveTo(-0.072f, 13.773f, -0.072f, 8.226f, 8.5f, 8.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.059f, -2.015f, 3.8f, -5.0f, 4.569f)
                lineTo(19.0f, 11.0f)
                arcToRelative(5.351f, 5.351f, 0.0f, false, false, -1.112f, -3.224f)
                curveTo(24.743f, 6.326f, 22.182f, 2.023f, 15.5f, 2.0f)
                curveToRelative(-2.96f, 0.0f, -5.22f, 0.945f, -6.1f, 2.028f)
                arcToRelative(15.806f, 15.806f, 0.0f, false, false, -2.252f, 0.03f)
                curveTo(8.812f, -1.6f, 23.83f, -1.262f, 24.0f, 5.0f)
                close()
            }
        }
        .build()
        return _sushi!!
    }

private var _sushi: ImageVector? = null

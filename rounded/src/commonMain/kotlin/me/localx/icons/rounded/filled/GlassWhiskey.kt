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

public val Icons.Filled.GlassWhiskey: ImageVector
    get() {
        if (_glassWhiskey != null) {
            return _glassWhiskey!!
        }
        _glassWhiskey = Builder(name = "GlassWhiskey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.02f, 4.28f)
                curveToRelative(-0.078f, -0.838f, 0.203f, -1.676f, 0.77f, -2.299f)
                curveToRelative(0.567f, -0.623f, 1.376f, -0.979f, 2.218f, -0.979f)
                horizontalLineToRelative(18.001f)
                curveToRelative(0.846f, -0.001f, 1.656f, 0.358f, 2.224f, 0.985f)
                curveToRelative(0.568f, 0.627f, 0.846f, 1.47f, 0.762f, 2.312f)
                lineToRelative(-0.97f, 9.702f)
                lineTo(0.927f, 14.001f)
                reflectiveCurveTo(0.02f, 4.28f, 0.02f, 4.28f)
                close()
                moveTo(1.114f, 16.001f)
                lineToRelative(0.23f, 2.465f)
                curveToRelative(0.241f, 2.586f, 2.381f, 4.536f, 4.979f, 4.536f)
                horizontalLineToRelative(11.275f)
                curveToRelative(2.58f, -0.001f, 4.72f, -1.937f, 4.976f, -4.504f)
                lineToRelative(0.25f, -2.497f)
                lineTo(1.114f, 16.001f)
                close()
            }
        }
        .build()
        return _glassWhiskey!!
    }

private var _glassWhiskey: ImageVector? = null

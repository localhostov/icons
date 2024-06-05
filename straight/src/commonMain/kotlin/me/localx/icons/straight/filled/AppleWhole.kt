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

public val Icons.Filled.AppleWhole: ImageVector
    get() {
        if (_appleWhole != null) {
            return _appleWhole!!
        }
        _appleWhole = Builder(name = "AppleWhole", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.409f, 7.026f)
                curveTo(16.289f, 8.38f, 15.893f, 7.893f, 13.0f, 8.0f)
                lineTo(13.0f, 6.0f)
                arcTo(9.871f, 9.871f, 0.0f, false, false, 11.432f, 0.473f)
                curveToRelative(-0.088f, -0.149f, -0.17f, -0.288f, -0.242f, -0.421f)
                lineTo(9.435f, 1.01f)
                curveToRelative(0.081f, 0.15f, 0.174f, 0.308f, 0.273f, 0.477f)
                arcTo(7.887f, 7.887f, 0.0f, false, true, 11.0f, 6.0f)
                verticalLineToRelative(0.409f)
                curveTo(5.55f, 4.563f, -0.067f, 9.1f, 0.0f, 15.0f)
                curveToRelative(-0.107f, 6.331f, 6.417f, 10.953f, 12.0f, 8.2f)
                curveTo(22.459f, 27.619f, 28.793f, 12.444f, 19.409f, 7.026f)
                close()
                moveTo(19.533f, 4.486f)
                arcTo(6.656f, 6.656f, 0.0f, false, true, 15.0f, 6.0f)
                curveTo(14.876f, 2.227f, 17.165f, -0.187f, 20.992f, 0.008f)
                arcTo(6.393f, 6.393f, 0.0f, false, true, 19.533f, 4.486f)
                close()
            }
        }
        .build()
        return _appleWhole!!
    }

private var _appleWhole: ImageVector? = null

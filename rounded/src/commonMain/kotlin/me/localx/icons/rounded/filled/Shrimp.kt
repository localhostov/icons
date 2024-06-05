package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Shrimp: ImageVector
    get() {
        if (_shrimp != null) {
            return _shrimp!!
        }
        _shrimp = Builder(name = "Shrimp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.92f, 8.941f)
                arcToRelative(8.013f, 8.013f, 0.0f, false, false, 7.016f, -6.92f)
                lineToRelative(1.064f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineToRelative(-1.8f, 0.0f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, false, -0.39f, 0.0f)
                lineTo(15.433f, 0.007f)
                curveTo(9.894f, 0.191f, 9.458f, 8.147f, 14.92f, 8.941f)
                close()
                moveTo(15.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.411f, 10.945f)
                arcTo(4.448f, 4.448f, 0.0f, false, false, 12.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcToRelative(2.377f, 2.377f, 0.0f, false, true, -1.791f, -0.986f)
                arcToRelative(6.934f, 6.934f, 0.0f, false, true, 1.105f, -0.549f)
                arcTo(6.546f, 6.546f, 0.0f, false, true, 10.709f, 0.122f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, -8.6f, 5.222f)
                arcTo(7.048f, 7.048f, 0.0f, false, false, 8.411f, 10.945f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.429f, 15.911f)
                curveToRelative(0.523f, 0.48f, 4.33f, 2.208f, 4.571f, 0.089f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(3.683f, 3.683f, 0.0f, false, true, -2.789f, -1.048f)
                arcTo(6.472f, 6.472f, 0.0f, false, true, 7.6f, 12.881f)
                arcTo(9.1f, 9.1f, 0.0f, false, true, 0.815f, 7.751f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, -0.728f, 5.6f)
                curveTo(0.443f, 14.376f, 3.1f, 16.526f, 6.429f, 15.911f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                curveToRelative(-2.059f, 0.0f, -6.039f, 2.977f, -7.348f, 4.0f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, true, -6.241f, -4.224f)
                arcTo(9.628f, 9.628f, 0.0f, false, true, 1.1f, 17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 24.0f)
                horizontalLineToRelative(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 18.0f)
                close()
            }
        }
        .build()
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null

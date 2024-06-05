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

public val Icons.Filled.Paw: ImageVector
    get() {
        if (_paw != null) {
            return _paw!!
        }
        _paw = Builder(name = "Paw", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.164f, 8.0f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, -1.579f, -0.594f)
                arcTo(4.832f, 4.832f, 0.0f, false, true, 5.028f, 4.145f)
                curveTo(4.785f, 1.651f, 6.145f, 0.181f, 7.614f, 0.017f)
                arcTo(2.651f, 2.651f, 0.0f, false, true, 9.6f, 0.611f)
                arcToRelative(4.177f, 4.177f, 0.0f, false, true, 1.376f, 2.9f)
                curveTo(11.2f, 5.834f, 9.962f, 8.0f, 8.164f, 8.0f)
                close()
                moveTo(2.853f, 14.0f)
                arcToRelative(2.118f, 2.118f, 0.0f, false, true, -1.423f, -0.594f)
                arcToRelative(5.041f, 5.041f, 0.0f, false, true, -1.4f, -3.261f)
                curveToRelative(-0.22f, -2.494f, 1.006f, -3.964f, 2.331f, -4.128f)
                arcToRelative(2.234f, 2.234f, 0.0f, false, true, 1.786f, 0.594f)
                arcToRelative(4.364f, 4.364f, 0.0f, false, true, 1.241f, 2.9f)
                curveTo(5.589f, 11.834f, 4.359f, 14.0f, 2.853f, 14.0f)
                close()
                moveTo(15.836f, 8.0f)
                curveToRelative(-1.81f, 0.0f, -3.034f, -2.166f, -2.807f, -4.492f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.177f, 4.177f, 0.0f, false, true, 1.376f, -2.9f)
                arcTo(2.654f, 2.654f, 0.0f, false, true, 16.386f, 0.017f)
                curveToRelative(1.469f, 0.164f, 2.829f, 1.634f, 2.586f, 4.128f)
                arcToRelative(4.835f, 4.835f, 0.0f, false, true, -1.557f, 3.262f)
                arcTo(2.494f, 2.494f, 0.0f, false, true, 15.836f, 8.0f)
                close()
                moveTo(21.053f, 14.0f)
                curveToRelative(-1.886f, 0.0f, -2.827f, -2.166f, -2.615f, -4.492f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 1.281f, -2.9f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, true, 1.846f, -0.594f)
                curveToRelative(1.368f, 0.164f, 2.635f, 1.634f, 2.409f, 4.128f)
                arcToRelative(4.976f, 4.976f, 0.0f, false, true, -1.451f, 3.262f)
                arcTo(2.23f, 2.23f, 0.0f, false, true, 21.053f, 14.0f)
                close()
                moveTo(16.0f, 24.0f)
                arcToRelative(4.865f, 4.865f, 0.0f, false, true, -2.447f, -0.605f)
                arcToRelative(3.332f, 3.332f, 0.0f, false, false, -3.106f, 0.0f)
                curveTo(7.434f, 25.082f, 3.922f, 23.227f, 4.0f, 19.0f)
                curveToRelative(0.0f, -4.636f, 4.507f, -9.0f, 8.0f, -9.0f)
                reflectiveCurveToRelative(8.0f, 4.364f, 8.0f, 9.0f)
                curveTo(20.0f, 21.944f, 18.355f, 24.0f, 16.0f, 24.0f)
                close()
            }
        }
        .build()
        return _paw!!
    }

private var _paw: ImageVector? = null

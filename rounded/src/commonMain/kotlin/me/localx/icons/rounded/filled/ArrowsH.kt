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

public val Icons.Filled.ArrowsH: ImageVector
    get() {
        if (_arrowsH != null) {
            return _arrowsH!!
        }
        _arrowsH = Builder(name = "ArrowsH", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.312f, 10.012f)
                curveToRelative(-0.29f, -0.327f, -0.574f, -0.637f, -0.771f, -0.834f)
                lineTo(19.713f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.426f, 1.4f)
                lineToRelative(2.834f, 2.885f)
                curveToRelative(0.108f, 0.108f, 0.244f, 0.255f, 0.389f, 0.414f)
                horizontalLineTo(2.555f)
                curveToRelative(0.146f, -0.16f, 0.284f, -0.308f, 0.4f, -0.42f)
                lineTo(5.779f, 7.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.353f, 6.3f)
                lineTo(1.53f, 9.172f)
                curveToRelative(-0.2f, 0.2f, -0.487f, 0.513f, -0.777f, 0.84f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 0.0f, 11.994f)
                verticalLineToRelative(0.012f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.754f, 1.983f)
                curveToRelative(0.289f, 0.326f, 0.573f, 0.636f, 0.769f, 0.833f)
                lineTo(4.353f, 17.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.426f, -1.4f)
                lineTo(2.944f, 13.414f)
                curveToRelative(-0.108f, -0.108f, -0.244f, -0.255f, -0.389f, -0.414f)
                horizontalLineTo(21.51f)
                curveToRelative(-0.145f, 0.16f, -0.283f, 0.308f, -0.4f, 0.42f)
                lineTo(18.287f, 16.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.426f, 1.4f)
                lineToRelative(2.822f, -2.873f)
                curveToRelative(0.2f, -0.2f, 0.486f, -0.513f, 0.777f, -0.84f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 23.312f, 10.012f)
                close()
            }
        }
        .build()
        return _arrowsH!!
    }

private var _arrowsH: ImageVector? = null

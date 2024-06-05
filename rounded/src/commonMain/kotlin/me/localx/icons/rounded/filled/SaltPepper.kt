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

public val Icons.Filled.SaltPepper: ImageVector
    get() {
        if (_saltPepper != null) {
            return _saltPepper!!
        }
        _saltPepper = Builder(name = "SaltPepper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.006f, 21.623f)
                arcTo(6.8f, 6.8f, 0.0f, false, false, 8.612f, 24.0f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.764f, 0.121f, -5.5f, -4.0f, -5.5f, -7.0f)
                curveToRelative(-0.081f, -4.193f, 3.85f, -6.149f, 4.0f, -10.0f)
                lineTo(4.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.142f, -2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.713f, -1.771f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.184f, 5.0f)
                lineTo(6.0f, 5.0f)
                lineTo(6.0f, 7.0f)
                arcToRelative(8.989f, 8.989f, 0.0f, false, true, -1.8f, 5.0f)
                lineTo(7.456f, 12.0f)
                arcTo(10.242f, 10.242f, 0.0f, false, false, 7.006f, 21.623f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.006f, 3.0f, -1.733f, 7.122f, -5.5f, 7.0f)
                lineTo(13.5f, 24.0f)
                curveToRelative(-3.763f, 0.122f, -5.506f, -4.0f, -5.5f, -7.0f)
                curveToRelative(-0.081f, -4.193f, 3.85f, -6.149f, 4.0f, -10.0f)
                lineTo(12.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.142f, -2.0f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, true, 7.716f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 20.0f, 5.0f)
                lineTo(20.0f, 7.0f)
                curveTo(20.15f, 10.852f, 24.081f, 12.807f, 24.0f, 17.0f)
                close()
                moveTo(19.8f, 12.0f)
                arcTo(8.981f, 8.981f, 0.0f, false, true, 18.0f, 7.0f)
                lineTo(18.0f, 5.0f)
                lineTo(14.0f, 5.0f)
                lineTo(14.0f, 7.0f)
                arcToRelative(8.989f, 8.989f, 0.0f, false, true, -1.8f, 5.0f)
                close()
                moveTo(17.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 17.0f)
                close()
                moveTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 20.0f)
                close()
                moveTo(21.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 17.0f)
                close()
            }
        }
        .build()
        return _saltPepper!!
    }

private var _saltPepper: ImageVector? = null

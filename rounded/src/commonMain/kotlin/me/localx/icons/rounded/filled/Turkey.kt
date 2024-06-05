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

public val Icons.Filled.Turkey: ImageVector
    get() {
        if (_turkey != null) {
            return _turkey!!
        }
        _turkey = Builder(name = "Turkey", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.41f, 8.808f)
                curveToRelative(1.537f, -1.566f, 5.79f, -3.515f, 7.929f, -2.561f)
                lineToRelative(1.44f, -1.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.063f, -0.649f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.649f, 2.063f)
                lineTo(19.749f, 7.665f)
                curveToRelative(0.981f, 2.39f, -1.1f, 6.474f, -2.555f, 7.927f)
                curveTo(12.6f, 19.949f, 6.055f, 13.4f, 10.41f, 8.808f)
                close()
                moveTo(18.61f, 17.008f)
                curveToRelative(-6.831f, 6.361f, -16.1f, -3.669f, -9.21f, -9.981f)
                arcTo(8.942f, 8.942f, 0.0f, false, false, 0.0f, 16.0f)
                verticalLineToRelative(2.568f)
                curveTo(0.168f, 23.879f, 5.723f, 23.808f, 9.0f, 24.0f)
                curveToRelative(9.0f, 0.149f, 20.246f, -2.311f, 12.416f, -11.777f)
                arcTo(13.057f, 13.057f, 0.0f, false, true, 18.607f, 17.006f)
                close()
                moveTo(8.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 3.0f)
                lineTo(9.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 1.0f)
                lineTo(7.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 4.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
                moveTo(4.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 3.0f)
                lineTo(5.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 1.0f)
                lineTo(3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _turkey!!
    }

private var _turkey: ImageVector? = null

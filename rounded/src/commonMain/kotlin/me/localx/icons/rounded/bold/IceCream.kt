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

public val Icons.Bold.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9f, 4.032f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -9.8f, 0.0f)
                arcToRelative(5.787f, 5.787f, 0.0f, false, false, -4.275f, 8.7f)
                lineToRelative(5.866f, 9.412f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, 6.617f, 0.008f)
                lineTo(21.2f, 12.7f)
                curveTo(23.354f, 9.209f, 20.923f, 4.317f, 16.9f, 4.032f)
                close()
                moveTo(18.981f, 9.6f)
                curveToRelative(-1.168f, 0.113f, -3.362f, 0.3f, -5.47f, 0.376f)
                lineTo(13.5f, 9.8f)
                arcTo(2.743f, 2.743f, 0.0f, false, true, 18.981f, 9.6f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.931f, 1.507f)
                arcToRelative(5.79f, 5.79f, 0.0f, false, false, -1.925f, 1.409f)
                arcToRelative(5.827f, 5.827f, 0.0f, false, false, -1.937f, -1.41f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(7.705f, 7.0f)
                arcToRelative(2.821f, 2.821f, 0.0f, false, true, 2.8f, 2.883f)
                lineToRelative(0.006f, 0.089f)
                curveTo(8.393f, 9.9f, 6.191f, 9.709f, 5.019f, 9.6f)
                arcTo(2.7f, 2.7f, 0.0f, false, true, 7.705f, 7.0f)
                close()
                moveTo(12.755f, 20.578f)
                arcToRelative(0.886f, 0.886f, 0.0f, false, true, -1.515f, -0.009f)
                lineTo(6.352f, 12.728f)
                arcToRelative(62.676f, 62.676f, 0.0f, false, false, 11.3f, 0.0f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null

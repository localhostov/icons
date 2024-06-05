package me.localx.icons.rounded.outline

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

public val Icons.Outline.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9f, 4.02f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -9.8f, 0.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -4.325f, 8.257f)
                lineTo(9.019f, 22.333f)
                arcToRelative(3.521f, 3.521f, 0.0f, false, false, 5.96f, 0.0f)
                lineTo(21.24f, 12.253f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 16.9f, 4.02f)
                close()
                moveTo(20.0f, 9.5f)
                arcToRelative(3.331f, 3.331f, 0.0f, false, true, -0.056f, 0.573f)
                arcToRelative(34.663f, 34.663f, 0.0f, false, true, -6.624f, 0.884f)
                curveTo(11.329f, 5.647f, 19.593f, 3.842f, 20.0f, 9.5f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.893f, 2.249f)
                arcTo(5.52f, 5.52f, 0.0f, false, false, 12.0f, 6.341f)
                arcTo(5.52f, 5.52f, 0.0f, false, false, 9.107f, 4.249f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(7.5f, 6.0f)
                arcToRelative(3.517f, 3.517f, 0.0f, false, true, 3.181f, 4.955f)
                arcToRelative(35.968f, 35.968f, 0.0f, false, true, -6.624f, -0.88f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.5f, 6.0f)
                close()
                moveTo(13.278f, 21.286f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, -2.558f, 0.0f)
                lineTo(5.17f, 12.346f)
                arcToRelative(37.938f, 37.938f, 0.0f, false, false, 13.656f, 0.0f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null

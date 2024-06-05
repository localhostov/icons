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

public val Icons.Filled.HandHoldingHeart: ImageVector
    get() {
        if (_handHoldingHeart != null) {
            return _handHoldingHeart!!
        }
        _handHoldingHeart = Builder(name = "HandHoldingHeart", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.75f)
                curveToRelative(0.0f, 2.163f, -2.82f, 4.851f, -4.225f, 5.978f)
                arcToRelative(1.239f, 1.239f, 0.0f, false, true, -1.55f, 0.0f)
                curveTo(8.82f, 7.6f, 6.0f, 4.913f, 6.0f, 2.75f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 8.5f, 0.0f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 11.0f, 2.75f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 13.5f, 0.0f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 16.0f, 2.75f)
                close()
                moveTo(23.338f, 12.35f)
                lineTo(15.638f, 20.759f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 8.262f, 24.0f)
                lineTo(4.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(0.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(7.787f)
                arcToRelative(2.218f, 2.218f, 0.0f, false, true, 2.164f, 2.685f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, -1.94f, 1.732f)
                lineTo(7.848f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 17.131f)
                lineTo(7.0f, 17.131f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.131f, 0.849f)
                lineToRelative(4.252f, -0.6f)
                arcTo(4.234f, 4.234f, 0.0f, false, false, 16.0f, 13.213f)
                arcToRelative(4.081f, 4.081f, 0.0f, false, false, -0.065f, -0.638f)
                lineToRelative(3.542f, -3.737f)
                arcToRelative(2.606f, 2.606f, 0.0f, false, true, 3.671f, -0.157f)
                arcTo(2.616f, 2.616f, 0.0f, false, true, 23.338f, 12.345f)
                close()
            }
        }
        .build()
        return _handHoldingHeart!!
    }

private var _handHoldingHeart: ImageVector? = null

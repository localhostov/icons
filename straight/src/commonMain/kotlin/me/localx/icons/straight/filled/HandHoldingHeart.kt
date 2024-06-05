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
                moveTo(11.0f, 9.167f)
                reflectiveCurveTo(6.0f, 5.63f, 6.0f, 2.75f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 8.5f, 0.0f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 11.0f, 2.75f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 13.5f, 0.0f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 16.0f, 2.75f)
                curveTo(16.0f, 5.63f, 11.0f, 9.167f, 11.0f, 9.167f)
                close()
                moveTo(23.148f, 8.681f)
                arcToRelative(2.606f, 2.606f, 0.0f, false, false, -3.671f, 0.157f)
                lineToRelative(-3.542f, 3.737f)
                arcToRelative(4.081f, 4.081f, 0.0f, false, true, 0.065f, 0.638f)
                arcToRelative(4.234f, 4.234f, 0.0f, false, true, -3.617f, 4.171f)
                lineToRelative(-4.241f, 0.606f)
                lineToRelative(-0.284f, -1.98f)
                lineTo(12.1f, 15.4f)
                arcToRelative(2.213f, 2.213f, 0.0f, false, false, -0.313f, -4.4f)
                lineTo(3.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(9.664f)
                lineTo(23.338f, 12.345f)
                arcTo(2.616f, 2.616f, 0.0f, false, false, 23.148f, 8.681f)
                close()
            }
        }
        .build()
        return _handHoldingHeart!!
    }

private var _handHoldingHeart: ImageVector? = null

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

public val Icons.Filled.StarRatingCall: ImageVector
    get() {
        if (_starRatingCall != null) {
            return _starRatingCall!!
        }
        _starRatingCall = Builder(name = "StarRatingCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.284f, 10.158f)
                lineToRelative(-0.601f, -0.452f)
                lineToRelative(1.086f, -3.396f)
                lineToRelative(-2.769f, -1.54f)
                verticalLineToRelative(-0.769f)
                horizontalLineToRelative(3.625f)
                lineToRelative(0.981f, -3.75f)
                horizontalLineToRelative(0.809f)
                lineToRelative(0.98f, 3.75f)
                horizontalLineToRelative(3.605f)
                verticalLineToRelative(0.764f)
                lineToRelative(-2.75f, 1.591f)
                lineToRelative(1.105f, 3.357f)
                lineToRelative(-0.625f, 0.436f)
                lineToRelative(-2.717f, -2.101f)
                lineToRelative(-2.729f, 2.11f)
                close()
                moveTo(13.48f, 16.98f)
                curveToRelative(-2.96f, -1.282f, -5.08f, -3.407f, -6.453f, -6.468f)
                lineToRelative(4.125f, -4.125f)
                lineTo(4.887f, 0.122f)
                lineTo(1.716f, 3.292f)
                curveToRelative(-1.106f, 1.105f, -1.716f, 2.6f, -1.716f, 4.208f)
                curveToRelative(0.0f, 7.248f, 9.252f, 16.5f, 16.5f, 16.5f)
                curveToRelative(1.607f, 0.0f, 3.102f, -0.609f, 4.207f, -1.716f)
                lineToRelative(3.171f, -3.171f)
                lineToRelative(-6.265f, -6.266f)
                lineToRelative(-4.133f, 4.132f)
                close()
            }
        }
        .build()
        return _starRatingCall!!
    }

private var _starRatingCall: ImageVector? = null

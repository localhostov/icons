package me.localx.icons.straight.outline

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

public val Icons.Outline.StarRatingCall: ImageVector
    get() {
        if (_starRatingCall != null) {
            return _starRatingCall!!
        }
        _starRatingCall = Builder(name = "StarRatingCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.0f)
                verticalLineToRelative(0.764f)
                lineToRelative(-2.75f, 1.591f)
                lineToRelative(1.105f, 3.357f)
                lineToRelative(-0.625f, 0.436f)
                lineToRelative(-2.717f, -2.101f)
                lineToRelative(-2.729f, 2.11f)
                lineToRelative(-0.601f, -0.453f)
                lineToRelative(1.086f, -3.396f)
                lineToRelative(-2.769f, -1.54f)
                verticalLineToRelative(-0.769f)
                horizontalLineToRelative(3.625f)
                lineToRelative(0.981f, -3.75f)
                horizontalLineToRelative(0.809f)
                lineToRelative(0.98f, 3.75f)
                horizontalLineToRelative(3.605f)
                close()
                moveTo(17.613f, 12.849f)
                lineToRelative(6.266f, 6.265f)
                lineToRelative(-3.172f, 3.171f)
                curveToRelative(-1.103f, 1.106f, -2.598f, 1.716f, -4.207f, 1.716f)
                curveTo(9.252f, 24.0f, 0.0f, 14.748f, 0.0f, 7.5f)
                curveTo(0.0f, 5.892f, 0.61f, 4.397f, 1.716f, 3.292f)
                lineTo(4.887f, 0.122f)
                lineToRelative(6.265f, 6.265f)
                lineToRelative(-3.406f, 3.406f)
                curveToRelative(1.374f, 3.062f, 3.493f, 5.187f, 6.453f, 6.469f)
                lineToRelative(3.414f, -3.413f)
                close()
                moveTo(21.05f, 19.114f)
                lineToRelative(-3.437f, -3.437f)
                lineToRelative(-2.927f, 2.927f)
                lineToRelative(-0.605f, -0.23f)
                curveToRelative(-3.964f, -1.514f, -6.806f, -4.353f, -8.447f, -8.438f)
                lineToRelative(-0.246f, -0.613f)
                lineToRelative(2.936f, -2.936f)
                lineToRelative(-3.437f, -3.437f)
                lineToRelative(-1.757f, 1.757f)
                curveToRelative(-0.729f, 0.728f, -1.129f, 1.719f, -1.129f, 2.793f)
                curveToRelative(0.0f, 6.233f, 8.266f, 14.5f, 14.5f, 14.5f)
                curveToRelative(1.074f, 0.0f, 2.066f, -0.401f, 2.792f, -1.129f)
                lineToRelative(1.758f, -1.758f)
                close()
            }
        }
        .build()
        return _starRatingCall!!
    }

private var _starRatingCall: ImageVector? = null

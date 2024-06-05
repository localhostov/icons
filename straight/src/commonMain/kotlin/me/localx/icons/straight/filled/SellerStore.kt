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

public val Icons.Filled.SellerStore: ImageVector
    get() {
        if (_sellerStore != null) {
            return _sellerStore!!
        }
        _sellerStore = Builder(name = "SellerStore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(18.619f, 20.414f)
                curveToRelative(-0.378f, 0.378f, -0.88f, 0.586f, -1.414f, 0.586f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.534f, 0.0f, -1.036f, -0.209f, -1.413f, -0.587f)
                lineToRelative(-2.012f, -2.012f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.013f, 2.013f)
                lineToRelative(3.615f, -3.615f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.615f, 3.615f)
                close()
                moveTo(21.802f, 0.0f)
                lineToRelative(2.198f, 6.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.193f, 0.0f, -2.267f, -0.525f, -3.0f, -1.357f)
                curveToRelative(-0.733f, 0.832f, -1.807f, 1.357f, -3.0f, 1.357f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.2f, 0.0f, -2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.8f, 1.382f, -3.0f, 1.382f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineToRelative(0.024f, -0.717f)
                lineTo(2.198f, 0.0f)
                horizontalLineToRelative(4.802f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(4.802f)
                close()
                moveTo(12.726f, 24.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-8.813f)
                curveToRelative(0.884f, 0.514f, 1.907f, 0.813f, 3.0f, 0.813f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.062f, 0.0f, 2.095f, -0.288f, 3.0f, -0.818f)
                curveToRelative(0.905f, 0.53f, 1.939f, 0.818f, 3.0f, 0.818f)
                horizontalLineToRelative(0.765f)
                curveToRelative(-1.102f, 1.371f, -1.765f, 3.109f, -1.765f, 5.0f)
                curveToRelative(0.0f, 2.39f, 1.059f, 4.533f, 2.726f, 6.0f)
                close()
            }
        }
        .build()
        return _sellerStore!!
    }

private var _sellerStore: ImageVector? = null

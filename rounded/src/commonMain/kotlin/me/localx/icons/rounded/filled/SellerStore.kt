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
                moveTo(21.683f, 17.712f)
                lineToRelative(-2.703f, 2.614f)
                curveToRelative(-0.452f, 0.446f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.203f, -0.225f, -1.663f, -0.674f)
                lineToRelative(-1.354f, -1.332f)
                curveToRelative(-0.395f, -0.387f, -0.4f, -1.02f, -0.014f, -1.414f)
                curveToRelative(0.386f, -0.395f, 1.019f, -0.401f, 1.414f, -0.014f)
                lineToRelative(1.354f, 1.331f)
                curveToRelative(0.144f, 0.142f, 0.38f, 0.139f, 0.522f, -0.002f)
                lineToRelative(2.713f, -2.624f)
                curveToRelative(0.397f, -0.381f, 1.031f, -0.37f, 1.414f, 0.029f)
                curveToRelative(0.382f, 0.398f, 0.369f, 1.031f, -0.029f, 1.414f)
                close()
                moveTo(0.0f, 8.02f)
                curveToRelative(0.0f, -0.011f, 0.0f, -0.022f, 0.0f, -0.033f)
                curveToRelative(0.013f, -0.09f, 0.025f, -0.172f, 0.039f, -0.262f)
                lineTo(1.209f, 3.627f)
                curveTo(1.822f, 1.48f, 3.784f, 0.0f, 6.017f, 0.0f)
                horizontalLineToRelative(0.983f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(0.982f)
                curveToRelative(2.232f, 0.0f, 4.194f, 1.48f, 4.808f, 3.626f)
                lineToRelative(1.171f, 4.096f)
                curveToRelative(0.013f, 0.086f, 0.026f, 0.173f, 0.039f, 0.259f)
                curveToRelative(0.006f, 1.359f, -0.669f, 2.556f, -1.7f, 3.284f)
                curveToRelative(-1.243f, -0.797f, -2.717f, -1.265f, -4.3f, -1.265f)
                curveToRelative(-2.021f, 0.0f, -3.864f, 0.759f, -5.274f, 2.0f)
                horizontalLineToRelative(-1.726f)
                curveToRelative(-1.2f, 0.0f, -2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.8f, 1.382f, -3.0f, 1.382f)
                horizontalLineToRelative(-1.046f)
                curveTo(1.762f, 12.0f, -0.01f, 10.211f, 0.0f, 8.02f)
                close()
                moveTo(12.726f, 24.0f)
                horizontalLineToRelative(-7.726f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                verticalLineToRelative(-6.79f)
                curveToRelative(0.89f, 0.512f, 1.9f, 0.79f, 2.954f, 0.79f)
                horizontalLineToRelative(1.046f)
                curveToRelative(1.062f, 0.0f, 2.095f, -0.288f, 3.0f, -0.818f)
                curveToRelative(0.905f, 0.53f, 1.938f, 0.818f, 3.0f, 0.818f)
                horizontalLineToRelative(0.082f)
                curveToRelative(-0.684f, 1.178f, -1.082f, 2.542f, -1.082f, 4.0f)
                curveToRelative(0.0f, 2.39f, 1.059f, 4.533f, 2.726f, 6.0f)
                close()
            }
        }
        .build()
        return _sellerStore!!
    }

private var _sellerStore: ImageVector? = null

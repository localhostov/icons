package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.SearchHeart: ImageVector
    get() {
        if (_searchHeart != null) {
            return _searchHeart!!
        }
        _searchHeart = Builder(name = "SearchHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.7197f, 22.3002f)
                    lineTo(17.7593f, 16.3398f)
                    curveTo(21.2557f, 12.0636f, 20.6236f, 5.7625f, 16.3473f, 2.2661f)
                    curveTo(12.071f, -1.2303f, 5.7701f, -0.5982f, 2.2736f, 3.6781f)
                    curveTo(-1.2228f, 7.9543f, -0.5907f, 14.2553f, 3.6856f, 17.7518f)
                    curveTo(7.3689f, 20.7635f, 12.664f, 20.7635f, 16.3474f, 17.7518f)
                    lineTo(22.3077f, 23.7122f)
                    curveTo(22.7044f, 24.0953f, 23.3366f, 24.0843f, 23.7197f, 23.6876f)
                    curveTo(24.0934f, 23.3007f, 24.0934f, 22.6872f, 23.7197f, 22.3002f)
                    close()
                    moveTo(2.0439f, 10.0249f)
                    curveTo(2.0439f, 5.613f, 5.6205f, 2.0364f, 10.0324f, 2.0364f)
                    curveTo(14.4443f, 2.0364f, 18.0209f, 5.613f, 18.0209f, 10.0249f)
                    curveTo(18.0209f, 14.4368f, 14.4443f, 18.0134f, 10.0324f, 18.0134f)
                    curveTo(5.6225f, 18.0084f, 2.0489f, 14.4348f, 2.0439f, 10.0249f)
                    close()
                    moveTo(12.0296f, 6.0307f)
                    curveTo(11.2836f, 6.034f, 10.5679f, 6.326f, 10.0324f, 6.8455f)
                    curveTo(9.497f, 6.3261f, 8.7813f, 6.034f, 8.0353f, 6.0307f)
                    curveTo(6.3275f, 6.0898f, 4.9886f, 7.518f, 5.0396f, 9.226f)
                    curveTo(5.0396f, 11.2231f, 7.0777f, 13.2832f, 8.7882f, 14.6582f)
                    curveTo(9.5163f, 15.2381f, 10.5485f, 15.2381f, 11.2766f, 14.6582f)
                    curveTo(12.9872f, 13.2832f, 15.0252f, 11.2231f, 15.0252f, 9.226f)
                    curveTo(15.0762f, 7.518f, 13.7374f, 6.0898f, 12.0296f, 6.0307f)
                    close()
                    moveTo(10.0384f, 13.1005f)
                    curveTo(8.1871f, 11.6126f, 7.0367f, 10.1248f, 7.0367f, 9.2261f)
                    curveTo(6.9869f, 8.6211f, 7.4312f, 8.0879f, 8.0353f, 8.0278f)
                    curveTo(8.6393f, 8.0879f, 9.0837f, 8.6211f, 9.0339f, 9.2261f)
                    curveTo(9.0339f, 9.7776f, 9.4809f, 10.2247f, 10.0324f, 10.2247f)
                    curveTo(10.5839f, 10.2247f, 11.031f, 9.7776f, 11.031f, 9.2261f)
                    curveTo(10.9812f, 8.6211f, 11.4255f, 8.0879f, 12.0296f, 8.0278f)
                    curveTo(12.6336f, 8.0879f, 13.078f, 8.6211f, 13.0282f, 9.2261f)
                    curveTo(13.0281f, 10.1248f, 11.8778f, 11.6126f, 10.0384f, 13.1005f)
                    close()
                }
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null

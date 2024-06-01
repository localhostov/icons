package me.localx.icons.rounded.filled

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

public val Icons.Filled.SearchHeart: ImageVector
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
                    moveTo(23.7197f, 22.3082f)
                    lineTo(17.7593f, 16.3478f)
                    curveTo(21.2557f, 12.0715f, 20.6236f, 5.7705f, 16.3473f, 2.2741f)
                    curveTo(12.071f, -1.2224f, 5.7701f, -0.5902f, 2.2736f, 3.686f)
                    curveTo(-1.2228f, 7.9623f, -0.5907f, 14.2633f, 3.6856f, 17.7597f)
                    curveTo(7.3689f, 20.7714f, 12.664f, 20.7714f, 16.3474f, 17.7597f)
                    lineTo(22.3077f, 23.7201f)
                    curveTo(22.7044f, 24.1032f, 23.3366f, 24.0923f, 23.7197f, 23.6956f)
                    curveTo(24.0934f, 23.3086f, 24.0934f, 22.6952f, 23.7197f, 22.3082f)
                    close()
                    moveTo(11.2766f, 14.6652f)
                    curveTo(10.5485f, 15.2451f, 9.5163f, 15.2451f, 8.7882f, 14.6652f)
                    curveTo(7.0777f, 13.2912f, 5.0396f, 11.2311f, 5.0396f, 9.234f)
                    curveTo(4.9886f, 7.5259f, 6.3275f, 6.0978f, 8.0353f, 6.0386f)
                    curveTo(8.7813f, 6.042f, 9.497f, 6.334f, 10.0324f, 6.8535f)
                    curveTo(10.5678f, 6.334f, 11.2835f, 6.042f, 12.0295f, 6.0386f)
                    curveTo(13.7373f, 6.0978f, 15.0762f, 7.526f, 15.0252f, 9.234f)
                    curveTo(15.0252f, 11.2311f, 12.9872f, 13.2912f, 11.2766f, 14.6652f)
                    close()
                    moveTo(13.0281f, 9.234f)
                    curveTo(13.0281f, 10.1327f, 11.8777f, 11.6206f, 10.0384f, 13.1084f)
                    curveTo(8.1871f, 11.6206f, 7.0367f, 10.1327f, 7.0367f, 9.234f)
                    curveTo(6.9869f, 8.6291f, 7.4312f, 8.0958f, 8.0353f, 8.0358f)
                    curveTo(8.6393f, 8.0958f, 9.0837f, 8.6291f, 9.0339f, 9.234f)
                    curveTo(9.0339f, 9.7855f, 9.4809f, 10.2326f, 10.0324f, 10.2326f)
                    curveTo(10.5839f, 10.2326f, 11.031f, 9.7856f, 11.031f, 9.234f)
                    curveTo(10.9812f, 8.6291f, 11.4255f, 8.0958f, 12.0296f, 8.0358f)
                    curveTo(12.6336f, 8.0958f, 13.0779f, 8.6291f, 13.0281f, 9.234f)
                    close()
                }
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null

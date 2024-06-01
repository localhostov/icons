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

public val Icons.Filled.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.6068f, 18.0f)
                curveTo(2.4339f, 19.4356f, 4.2683f, 19.9288f, 5.7039f, 19.1017f)
                curveTo(5.7049f, 19.1011f, 5.7058f, 19.1005f, 5.7068f, 19.1f)
                lineTo(6.1518f, 18.843f)
                curveTo(6.9918f, 19.5616f, 7.9573f, 20.119f, 8.9998f, 20.487f)
                verticalLineTo(21.0f)
                curveTo(8.9998f, 22.6568f, 10.3429f, 24.0f, 11.9998f, 24.0f)
                curveTo(13.6566f, 24.0f, 14.9998f, 22.6568f, 14.9998f, 21.0f)
                verticalLineTo(20.487f)
                curveTo(16.0424f, 20.1184f, 17.0079f, 19.5604f, 17.8478f, 18.841f)
                lineTo(18.2948f, 19.099f)
                curveTo(19.7307f, 19.9274f, 21.5664f, 19.4349f, 22.3948f, 17.999f)
                curveTo(23.2232f, 16.563f, 22.7307f, 14.7274f, 21.2948f, 13.899f)
                lineTo(20.8508f, 13.643f)
                curveTo(21.0506f, 12.5554f, 21.0506f, 11.4405f, 20.8508f, 10.353f)
                lineTo(21.2948f, 10.097f)
                curveTo(22.7307f, 9.2685f, 23.2232f, 7.4329f, 22.3948f, 5.997f)
                curveTo(21.5664f, 4.561f, 19.7307f, 4.0685f, 18.2948f, 4.8969f)
                lineTo(17.8498f, 5.154f)
                curveTo(17.0089f, 4.4362f, 16.0427f, 3.8798f, 14.9998f, 3.513f)
                verticalLineTo(3.0f)
                curveTo(14.9998f, 1.3432f, 13.6566f, 0.0f, 11.9998f, 0.0f)
                curveTo(10.3429f, 0.0f, 8.9998f, 1.3432f, 8.9998f, 3.0f)
                verticalLineTo(3.513f)
                curveTo(7.9572f, 3.8816f, 6.9916f, 4.4396f, 6.1518f, 5.159f)
                lineTo(5.7048f, 4.9f)
                curveTo(4.2688f, 4.0716f, 2.4332f, 4.5641f, 1.6048f, 6.0f)
                curveTo(0.7764f, 7.4359f, 1.2688f, 9.2716f, 2.7048f, 10.1f)
                lineTo(3.1488f, 10.356f)
                curveTo(2.9489f, 11.4435f, 2.9489f, 12.5584f, 3.1488f, 13.646f)
                lineTo(2.7048f, 13.902f)
                curveTo(1.2728f, 14.7326f, 0.7819f, 16.5647f, 1.6068f, 18.0f)
                close()
                moveTo(11.9998f, 8.0f)
                curveTo(14.2089f, 8.0f, 15.9998f, 9.7909f, 15.9998f, 12.0f)
                curveTo(15.9998f, 14.2091f, 14.2089f, 16.0f, 11.9998f, 16.0f)
                curveTo(9.7907f, 16.0f, 7.9998f, 14.2091f, 7.9998f, 12.0f)
                curveTo(7.9998f, 9.7909f, 9.7907f, 8.0f, 11.9998f, 8.0f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null

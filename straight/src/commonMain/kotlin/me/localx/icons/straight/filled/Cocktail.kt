package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9821f, 3.0f)
                    horizontalLineTo(0.0181f)
                    curveTo(0.0123f, 2.4016f, 0.1865f, 1.8152f, 0.5181f, 1.317f)
                    curveTo(0.7929f, 0.9115f, 1.1628f, 0.5795f, 1.5954f, 0.35f)
                    curveTo(2.0281f, 0.1204f, 2.5104f, 2.0E-4f, 3.0001f, 0.0f)
                    horizontalLineTo(21.0001f)
                    curveTo(21.4908f, -6.0E-4f, 21.9741f, 0.1192f, 22.4077f, 0.3488f)
                    curveTo(22.8412f, 0.5784f, 23.2119f, 0.9108f, 23.4871f, 1.317f)
                    curveTo(23.817f, 1.8158f, 23.9894f, 2.4021f, 23.9821f, 3.0f)
                    close()
                    moveTo(11.0001f, 11.962f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(6.0002f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.0001f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(11.962f)
                    curveTo(15.1882f, 11.8089f, 17.2981f, 11.0858f, 19.12f, 9.8644f)
                    curveTo(20.942f, 8.643f, 22.4124f, 6.9659f, 23.3851f, 5.0f)
                    horizontalLineTo(0.6151f)
                    curveTo(1.5879f, 6.9659f, 3.0583f, 8.643f, 4.8802f, 9.8644f)
                    curveTo(6.7022f, 11.0858f, 8.8121f, 11.8089f, 11.0001f, 11.962f)
                    close()
                }
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null

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

public val Icons.Filled.ShieldExclamation: ImageVector
    get() {
        if (_shieldExclamation != null) {
            return _shieldExclamation!!
        }
        _shieldExclamation = Builder(name = "ShieldExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9442f, 2.634f)
                    lineTo(12.0002f, 0.0f)
                    lineTo(4.0561f, 2.634f)
                    curveTo(3.4576f, 2.8324f, 2.9368f, 3.2144f, 2.5677f, 3.7256f)
                    curveTo(2.1987f, 4.2369f, 2.0001f, 4.8514f, 2.0001f, 5.482f)
                    verticalLineTo(11.991f)
                    curveTo(2.0001f, 19.515f, 11.2002f, 23.67f, 11.5942f, 23.843f)
                    lineTo(11.9482f, 24.0f)
                    lineTo(12.3162f, 23.878f)
                    curveTo(12.7112f, 23.747f, 22.0002f, 20.568f, 22.0002f, 11.991f)
                    verticalLineTo(5.482f)
                    curveTo(22.0002f, 4.8514f, 21.8016f, 4.2369f, 21.4326f, 3.7256f)
                    curveTo(21.0635f, 3.2144f, 20.5427f, 2.8324f, 19.9442f, 2.634f)
                    close()
                    moveTo(13.0002f, 19.052f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(17.052f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(19.052f)
                    close()
                    moveTo(13.0002f, 15.0f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(15.0f)
                    close()
                }
            }
        }
        .build()
        return _shieldExclamation!!
    }

private var _shieldExclamation: ImageVector? = null

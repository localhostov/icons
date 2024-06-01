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

public val Icons.Filled.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(21.0f)
                    curveTo(3.0598f, 19.2706f, 3.4868f, 17.5738f, 4.2526f, 16.0221f)
                    curveTo(5.0185f, 14.4704f, 6.1057f, 13.0993f, 7.442f, 12.0f)
                    curveTo(6.1057f, 10.9007f, 5.0185f, 9.5296f, 4.2526f, 7.9779f)
                    curveTo(3.4868f, 6.4262f, 3.0598f, 4.7294f, 3.0f, 3.0f)
                    curveTo(3.0f, 2.2043f, 3.3161f, 1.4413f, 3.8787f, 0.8787f)
                    curveTo(4.4413f, 0.3161f, 5.2043f, 0.0f, 6.0f, 0.0f)
                    lineTo(18.0f, 0.0f)
                    curveTo(18.7956f, 0.0f, 19.5587f, 0.3161f, 20.1213f, 0.8787f)
                    curveTo(20.6839f, 1.4413f, 21.0f, 2.2043f, 21.0f, 3.0f)
                    curveTo(20.941f, 4.7278f, 20.516f, 6.4234f, 19.7532f, 7.9748f)
                    curveTo(18.9905f, 9.5262f, 17.9072f, 10.8982f, 16.575f, 12.0f)
                    curveTo(17.9072f, 13.1018f, 18.9905f, 14.4738f, 19.7532f, 16.0252f)
                    curveTo(20.516f, 17.5766f, 20.941f, 19.2722f, 21.0f, 21.0f)
                    verticalLineTo(24.0f)
                    close()
                }
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null

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

public val Icons.Filled.SearchAlt: ImageVector
    get() {
        if (_searchAlt != null) {
            return _searchAlt!!
        }
        _searchAlt = Builder(name = "SearchAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0001f, 17.5f)
                    curveTo(11.0014f, 16.2264f, 11.3767f, 14.9813f, 12.0796f, 13.9192f)
                    curveTo(12.7824f, 12.8572f, 13.7818f, 12.025f, 14.9536f, 11.526f)
                    curveTo(16.1253f, 11.0271f, 17.4178f, 10.8833f, 18.6706f, 11.1127f)
                    curveTo(19.9233f, 11.342f, 21.0811f, 11.9343f, 22.0001f, 12.816f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(5.0001f)
                    curveTo(4.2045f, 0.0f, 3.4414f, 0.3161f, 2.8788f, 0.8787f)
                    curveTo(2.3162f, 1.4413f, 2.0001f, 2.2043f, 2.0001f, 3.0f)
                    verticalLineTo(21.0f)
                    curveTo(2.0001f, 21.7956f, 2.3162f, 22.5587f, 2.8788f, 23.1213f)
                    curveTo(3.4414f, 23.6839f, 4.2045f, 24.0f, 5.0001f, 24.0f)
                    horizontalLineTo(17.5001f)
                    curveTo(15.7762f, 24.0f, 14.1229f, 23.3152f, 12.9039f, 22.0962f)
                    curveTo(11.6849f, 20.8772f, 11.0001f, 19.2239f, 11.0001f, 17.5f)
                    close()
                    moveTo(7.0001f, 5.0f)
                    horizontalLineTo(17.0001f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(22.5431f, 23.957f)
                    lineTo(19.8861f, 21.3f)
                    curveTo(19.1733f, 21.755f, 18.3458f, 21.9977f, 17.5001f, 22.0f)
                    curveTo(16.6101f, 22.0f, 15.7401f, 21.7361f, 15.0001f, 21.2416f)
                    curveTo(14.26f, 20.7471f, 13.6833f, 20.0443f, 13.3427f, 19.2221f)
                    curveTo(13.0021f, 18.3998f, 12.913f, 17.495f, 13.0866f, 16.6221f)
                    curveTo(13.2602f, 15.7492f, 13.6888f, 14.9474f, 14.3181f, 14.318f)
                    curveTo(14.9475f, 13.6887f, 15.7493f, 13.2601f, 16.6222f, 13.0865f)
                    curveTo(17.4951f, 12.9128f, 18.3999f, 13.0019f, 19.2222f, 13.3425f)
                    curveTo(20.0445f, 13.6831f, 20.7473f, 14.2599f, 21.2417f, 14.9999f)
                    curveTo(21.7362f, 15.74f, 22.0001f, 16.61f, 22.0001f, 17.5f)
                    curveTo(21.9979f, 18.3456f, 21.7551f, 19.1732f, 21.3001f, 19.886f)
                    lineTo(23.9571f, 22.543f)
                    lineTo(22.5431f, 23.957f)
                    close()
                }
            }
        }
        .build()
        return _searchAlt!!
    }

private var _searchAlt: ImageVector? = null

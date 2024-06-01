package me.localx.icons.rounded.bold

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

public val Icons.Bold.GraphicTablet: ImageVector
    get() {
        if (_graphicTablet != null) {
            return _graphicTablet!!
        }
        _graphicTablet = Builder(name = "GraphicTablet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 3.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0413f, 3.0f, 2.6424f, 3.5795f, 1.6109f, 4.6109f)
                    curveTo(0.5795f, 5.6424f, 0.0f, 7.0413f, 0.0f, 8.5f)
                    lineTo(0.0f, 11.0f)
                    horizontalLineTo(2.006f)
                    curveTo(2.2696f, 11.0f, 2.5224f, 11.1047f, 2.7089f, 11.2911f)
                    curveTo(2.8953f, 11.4775f, 3.0f, 11.7304f, 3.0f, 11.994f)
                    curveTo(3.0f, 12.1245f, 2.9743f, 12.2537f, 2.9243f, 12.3742f)
                    curveTo(2.8744f, 12.4948f, 2.8011f, 12.6043f, 2.7088f, 12.6965f)
                    curveTo(2.6165f, 12.7887f, 2.5069f, 12.8619f, 2.3863f, 12.9117f)
                    curveTo(2.2657f, 12.9615f, 2.1365f, 12.9871f, 2.006f, 12.987f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(15.5f)
                    curveTo(0.0f, 16.9587f, 0.5795f, 18.3576f, 1.6109f, 19.3891f)
                    curveTo(2.6424f, 20.4205f, 4.0413f, 21.0f, 5.5f, 21.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9587f, 21.0f, 21.3576f, 20.4205f, 22.3891f, 19.3891f)
                    curveTo(23.4205f, 18.3576f, 24.0f, 16.9587f, 24.0f, 15.5f)
                    verticalLineTo(8.5f)
                    curveTo(24.0f, 7.0413f, 23.4205f, 5.6424f, 22.3891f, 4.6109f)
                    curveTo(21.3576f, 3.5795f, 19.9587f, 3.0f, 18.5f, 3.0f)
                    close()
                    moveTo(21.0f, 15.5f)
                    curveTo(21.0102f, 16.1518f, 20.7614f, 16.781f, 20.3083f, 17.2497f)
                    curveTo(19.8552f, 17.7183f, 19.2348f, 17.9882f, 18.583f, 18.0f)
                    horizontalLineTo(6.981f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(18.581f)
                    curveTo(19.2331f, 6.0113f, 19.8541f, 6.2809f, 20.3076f, 6.7496f)
                    curveTo(20.7612f, 7.2183f, 21.0102f, 7.8479f, 21.0f, 8.5f)
                    verticalLineTo(15.5f)
                    close()
                }
            }
        }
        .build()
        return _graphicTablet!!
    }

private var _graphicTablet: ImageVector? = null

package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.AppsSort: ImageVector
    get() {
        if (_appsSort != null) {
            return _appsSort!!
        }
        _appsSort = Builder(name = "AppsSort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 19.056f)
                    verticalLineTo(4.925f)
                    horizontalLineTo(23.989f)
                    lineTo(19.461f, 0.4f)
                    curveTo(19.203f, 0.1425f, 18.8535f, -0.0021f, 18.489f, -0.0021f)
                    curveTo(18.1246f, -0.0021f, 17.775f, 0.1425f, 17.517f, 0.4f)
                    lineTo(12.989f, 4.925f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(19.056f)
                    horizontalLineTo(12.96f)
                    lineTo(17.506f, 23.596f)
                    curveTo(17.6341f, 23.7241f, 17.7862f, 23.8258f, 17.9535f, 23.8952f)
                    curveTo(18.1209f, 23.9646f, 18.3003f, 24.0003f, 18.4815f, 24.0003f)
                    curveTo(18.6627f, 24.0003f, 18.8421f, 23.9646f, 19.0095f, 23.8952f)
                    curveTo(19.1769f, 23.8258f, 19.3289f, 23.7241f, 19.457f, 23.596f)
                    lineTo(24.0f, 19.056f)
                    horizontalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 3.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    horizontalLineTo(0.0f)
                    close()
                    moveTo(3.0f, 3.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 21.0f)
                    curveTo(0.0f, 21.7956f, 0.3161f, 22.5587f, 0.8787f, 23.1213f)
                    curveTo(1.4413f, 23.6839f, 2.2043f, 24.0f, 3.0f, 24.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(3.0f, 16.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _appsSort!!
    }

private var _appsSort: ImageVector? = null

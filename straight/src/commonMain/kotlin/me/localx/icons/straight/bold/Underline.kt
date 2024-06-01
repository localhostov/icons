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

public val Icons.Bold.Underline: ImageVector
    get() {
        if (_underline != null) {
            return _underline!!
        }
        _underline = Builder(name = "Underline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 18.5f)
                    curveTo(14.3861f, 18.4971f, 16.6735f, 17.5479f, 18.3607f, 15.8607f)
                    curveTo(20.0479f, 14.1735f, 20.9971f, 11.8861f, 21.0f, 9.5f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(9.5f)
                    curveTo(18.0f, 11.0913f, 17.3679f, 12.6174f, 16.2426f, 13.7426f)
                    curveTo(15.1174f, 14.8679f, 13.5913f, 15.5f, 12.0f, 15.5f)
                    curveTo(10.4087f, 15.5f, 8.8826f, 14.8679f, 7.7574f, 13.7426f)
                    curveTo(6.6321f, 12.6174f, 6.0f, 11.0913f, 6.0f, 9.5f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.5f)
                    curveTo(3.0029f, 11.8861f, 3.9521f, 14.1735f, 5.6392f, 15.8607f)
                    curveTo(7.3264f, 17.5479f, 9.6139f, 18.4971f, 12.0f, 18.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 21.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _underline!!
    }

private var _underline: ImageVector? = null

package me.localx.icons.straight.outline

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

public val Icons.Outline.Interlining: ImageVector
    get() {
        if (_interlining != null) {
            return _interlining!!
        }
        _interlining = Builder(name = "Interlining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0003f, 4.0004f)
                    horizontalLineTo(10.0003f)
                    verticalLineTo(6.0004f)
                    horizontalLineTo(24.0003f)
                    verticalLineTo(4.0004f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0003f, 11.0007f)
                    horizontalLineTo(10.0003f)
                    verticalLineTo(13.0007f)
                    horizontalLineTo(24.0003f)
                    verticalLineTo(11.0007f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0003f, 18.0f)
                    horizontalLineTo(10.0003f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(24.0003f)
                    verticalLineTo(18.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.0f, 6.0003f)
                    lineTo(4.707f, 2.7073f)
                    curveTo(4.5195f, 2.5199f, 4.2652f, 2.4146f, 4.0f, 2.4146f)
                    curveTo(3.7348f, 2.4146f, 3.4805f, 2.5199f, 3.293f, 2.7073f)
                    lineTo(0.0f, 6.0003f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(18.0003f)
                    horizontalLineTo(0.0f)
                    lineTo(3.293f, 21.2933f)
                    curveTo(3.4805f, 21.4808f, 3.7348f, 21.5861f, 4.0f, 21.5861f)
                    curveTo(4.2652f, 21.5861f, 4.5195f, 21.4808f, 4.707f, 21.2933f)
                    lineTo(8.0f, 18.0003f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(6.0003f)
                    horizontalLineTo(8.0f)
                    close()
                }
            }
        }
        .build()
        return _interlining!!
    }

private var _interlining: ImageVector? = null

package me.localx.icons.straight.filled

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

public val Icons.Filled.LetterCase: ImageVector
    get() {
        if (_letterCase != null) {
            return _letterCase!!
        }
        _letterCase = Builder(name = "LetterCase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0002f, 7.9996f)
                    verticalLineTo(9.0256f)
                    curveTo(21.1398f, 8.3638f, 20.0856f, 8.0033f, 19.0002f, 7.9996f)
                    curveTo(17.6741f, 7.9996f, 16.4023f, 8.5264f, 15.4646f, 9.4641f)
                    curveTo(14.5269f, 10.4018f, 14.0002f, 11.6736f, 14.0002f, 12.9996f)
                    curveTo(14.0002f, 14.3257f, 14.5269f, 15.5975f, 15.4646f, 16.5352f)
                    curveTo(16.4023f, 17.4728f, 17.6741f, 17.9996f, 19.0002f, 17.9996f)
                    curveTo(20.0856f, 17.996f, 21.1398f, 17.6354f, 22.0002f, 16.9736f)
                    verticalLineTo(17.9996f)
                    horizontalLineTo(24.0002f)
                    verticalLineTo(7.9996f)
                    horizontalLineTo(22.0002f)
                    close()
                    moveTo(19.0002f, 15.9996f)
                    curveTo(18.4068f, 15.9996f, 17.8268f, 15.8237f, 17.3334f, 15.494f)
                    curveTo(16.8401f, 15.1644f, 16.4556f, 14.6959f, 16.2285f, 14.1477f)
                    curveTo(16.0015f, 13.5995f, 15.942f, 12.9963f, 16.0578f, 12.4144f)
                    curveTo(16.1736f, 11.8324f, 16.4593f, 11.2979f, 16.8788f, 10.8783f)
                    curveTo(17.2984f, 10.4588f, 17.8329f, 10.173f, 18.4149f, 10.0573f)
                    curveTo(18.9968f, 9.9415f, 19.6f, 10.0009f, 20.1482f, 10.228f)
                    curveTo(20.6964f, 10.4551f, 21.1649f, 10.8396f, 21.4946f, 11.3329f)
                    curveTo(21.8242f, 11.8263f, 22.0002f, 12.4063f, 22.0002f, 12.9996f)
                    curveTo(22.0002f, 13.7953f, 21.6841f, 14.5583f, 21.1215f, 15.121f)
                    curveTo(20.5589f, 15.6836f, 19.7958f, 15.9996f, 19.0002f, 15.9996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 17.9998f)
                    horizontalLineTo(14.236f)
                    lineTo(7.118f, 3.7638f)
                    lineTo(0.0f, 17.9998f)
                    horizontalLineTo(2.236f)
                    lineTo(4.236f, 13.9998f)
                    horizontalLineTo(10.0f)
                    lineTo(12.0f, 17.9998f)
                    close()
                    moveTo(5.236f, 11.9998f)
                    lineTo(7.118f, 8.2358f)
                    lineTo(9.0f, 11.9998f)
                    horizontalLineTo(5.236f)
                    close()
                }
            }
        }
        .build()
        return _letterCase!!
    }

private var _letterCase: ImageVector? = null

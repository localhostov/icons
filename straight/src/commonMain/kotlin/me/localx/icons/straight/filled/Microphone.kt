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

public val Icons.Filled.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 13.0003f)
                    curveTo(21.9974f, 15.3864f, 21.0483f, 17.6741f, 19.361f, 19.3613f)
                    curveTo(17.6738f, 21.0486f, 15.3861f, 21.9976f, 13.0f, 22.0003f)
                    horizontalLineTo(11.0f)
                    curveTo(8.6139f, 21.9974f, 6.3264f, 21.0482f, 4.6392f, 19.361f)
                    curveTo(2.9521f, 17.6738f, 2.0029f, 15.3864f, 2.0f, 13.0003f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0034f, 15.9166f, 1.1635f, 18.7125f, 3.2256f, 20.7747f)
                    curveTo(5.2878f, 22.8368f, 8.0837f, 23.9969f, 11.0f, 24.0003f)
                    horizontalLineTo(13.0f)
                    curveTo(15.9163f, 23.9969f, 18.7122f, 22.8368f, 20.7744f, 20.7747f)
                    curveTo(22.8365f, 18.7125f, 23.9966f, 15.9166f, 24.0f, 13.0003f)
                    horizontalLineTo(22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0001f, 13.0f)
                    horizontalLineTo(5.0711f)
                    curveTo(5.3104f, 14.6672f, 6.1427f, 16.1922f, 7.4154f, 17.2952f)
                    curveTo(8.6881f, 18.3983f, 10.3159f, 19.0056f, 12.0001f, 19.0056f)
                    curveTo(13.6843f, 19.0056f, 15.3121f, 18.3983f, 16.5848f, 17.2952f)
                    curveTo(17.8575f, 16.1922f, 18.6899f, 14.6672f, 18.9291f, 13.0f)
                    horizontalLineTo(15.0001f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(19.0001f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(15.0001f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(18.9291f)
                    curveTo(18.6899f, 4.3329f, 17.8575f, 2.8079f, 16.5848f, 1.7048f)
                    curveTo(15.3121f, 0.6017f, 13.6843f, -0.0055f, 12.0001f, -0.0055f)
                    curveTo(10.3159f, -0.0055f, 8.6881f, 0.6017f, 7.4154f, 1.7048f)
                    curveTo(6.1427f, 2.8079f, 5.3104f, 4.3329f, 5.0711f, 6.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(5.0001f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(13.0f)
                    close()
                }
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null

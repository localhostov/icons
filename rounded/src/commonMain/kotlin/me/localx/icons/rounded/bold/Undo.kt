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

public val Icons.Bold.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0001f, 21.9492f)
                    curveTo(21.0001f, 19.464f, 18.9854f, 17.4492f, 16.5001f, 17.4492f)
                    horizontalLineTo(10.8321f)
                    verticalLineTo(19.1292f)
                    curveTo(10.8298f, 20.352f, 9.8366f, 21.3413f, 8.6139f, 21.339f)
                    curveTo(8.002f, 21.3378f, 7.4179f, 21.0834f, 7.0002f, 20.6362f)
                    lineTo(0.7781f, 13.9413f)
                    curveTo(-0.259f, 12.8153f, -0.259f, 11.0822f, 0.7781f, 9.9563f)
                    lineTo(7.0001f, 3.2613f)
                    curveTo(7.8318f, 2.3649f, 9.2326f, 2.3125f, 10.129f, 3.1441f)
                    curveTo(10.5808f, 3.5633f, 10.8374f, 4.1519f, 10.8371f, 4.7682f)
                    verticalLineTo(6.4492f)
                    horizontalLineTo(14.5001f)
                    curveTo(19.7443f, 6.4553f, 23.9941f, 10.7051f, 24.0001f, 15.9492f)
                    verticalLineTo(21.9492f)
                    curveTo(24.0001f, 22.7777f, 23.3285f, 23.4492f, 22.5001f, 23.4492f)
                    curveTo(21.6717f, 23.4492f, 21.0001f, 22.7777f, 21.0001f, 21.9492f)
                    close()
                    moveTo(21.0001f, 15.9492f)
                    curveTo(20.9957f, 12.3612f, 18.0882f, 9.4536f, 14.5001f, 9.4492f)
                    horizontalLineTo(9.3321f)
                    curveTo(8.5037f, 9.4492f, 7.8321f, 8.7776f, 7.8321f, 7.9492f)
                    verticalLineTo(6.7492f)
                    lineTo(2.9771f, 11.9003f)
                    lineTo(7.8321f, 17.1283f)
                    verticalLineTo(15.9493f)
                    curveTo(7.8321f, 15.1209f, 8.5037f, 14.4493f, 9.3321f, 14.4493f)
                    horizontalLineTo(16.5001f)
                    curveTo(18.1237f, 14.4473f, 19.7036f, 14.9749f, 21.0001f, 15.9523f)
                    verticalLineTo(15.9492f)
                    close()
                }
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null

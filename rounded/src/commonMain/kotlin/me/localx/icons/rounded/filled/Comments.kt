package me.localx.icons.rounded.filled

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

public val Icons.Filled.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.7f, 17.9999f)
                    horizontalLineTo(3.0f)
                    curveTo(1.507f, 17.9999f, 0.0f, 16.8659f, 0.0f, 14.3339f)
                    verticalLineTo(9.2939f)
                    curveTo(0.021f, 6.9961f, 0.8814f, 4.7852f, 2.4192f, 3.0776f)
                    curveTo(3.9569f, 1.3701f, 6.0659f, 0.2836f, 8.349f, 0.0229f)
                    curveTo(9.6374f, -0.0706f, 10.9308f, 0.1143f, 12.1413f, 0.565f)
                    curveTo(13.3518f, 1.0158f, 14.4512f, 1.7219f, 15.3646f, 2.6353f)
                    curveTo(16.278f, 3.5487f, 16.9841f, 4.648f, 17.4348f, 5.8586f)
                    curveTo(17.8856f, 7.0691f, 18.0705f, 8.3625f, 17.977f, 9.6509f)
                    curveTo(17.7159f, 11.9349f, 16.6286f, 14.0446f, 14.9198f, 15.5824f)
                    curveTo(13.211f, 17.1203f, 10.9988f, 17.9801f, 8.7f, 17.9999f)
                    close()
                    moveTo(20.0f, 9.0799f)
                    horizontalLineTo(19.988f)
                    curveTo(19.988f, 9.3169f, 19.988f, 9.5539f, 19.976f, 9.7919f)
                    curveTo(19.59f, 15.1999f, 14.647f, 19.7779f, 9.084f, 19.9809f)
                    verticalLineTo(19.9959f)
                    curveTo(9.7846f, 21.211f, 10.7924f, 22.2206f, 12.0062f, 22.9233f)
                    curveTo(13.2201f, 23.6261f, 14.5974f, 23.9973f, 16.0f, 23.9999f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 23.9999f, 22.5587f, 23.6838f, 23.1213f, 23.1212f)
                    curveTo(23.6839f, 22.5586f, 24.0f, 21.7955f, 24.0f, 20.9999f)
                    verticalLineTo(15.9999f)
                    curveTo(23.9986f, 14.597f, 23.6282f, 13.2191f, 22.9262f, 12.0045f)
                    curveTo(22.2241f, 10.79f, 21.215f, 9.7813f, 20.0f, 9.0799f)
                    close()
                }
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null

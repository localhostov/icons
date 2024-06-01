package me.localx.icons.straight.bold

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

public val Icons.Bold.CommentHeart: ImageVector
    get() {
        if (_commentHeart != null) {
            return _commentHeart!!
        }
        _commentHeart = Builder(name = "CommentHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(12.0f)
                    curveTo(9.6266f, 24.0f, 7.3066f, 23.2962f, 5.3332f, 21.9776f)
                    curveTo(3.3598f, 20.6591f, 1.8217f, 18.7849f, 0.9135f, 16.5922f)
                    curveTo(0.0052f, 14.3995f, -0.2324f, 11.9867f, 0.2306f, 9.6589f)
                    curveTo(0.6936f, 7.3312f, 1.8365f, 5.1929f, 3.5147f, 3.5147f)
                    curveTo(5.1929f, 1.8365f, 7.3312f, 0.6936f, 9.6589f, 0.2306f)
                    curveTo(11.9867f, -0.2324f, 14.3995f, 0.0052f, 16.5922f, 0.9135f)
                    curveTo(18.7849f, 1.8217f, 20.6591f, 3.3598f, 21.9776f, 5.3332f)
                    curveTo(23.2962f, 7.3066f, 24.0f, 9.6266f, 24.0f, 12.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(12.0f, 3.0f)
                    curveTo(9.6131f, 3.0f, 7.3239f, 3.9482f, 5.636f, 5.636f)
                    curveTo(3.9482f, 7.3239f, 3.0f, 9.6131f, 3.0f, 12.0f)
                    curveTo(3.0f, 14.387f, 3.9482f, 16.6761f, 5.636f, 18.364f)
                    curveTo(7.3239f, 20.0518f, 9.6131f, 21.0f, 12.0f, 21.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(12.0f)
                    curveTo(20.9974f, 9.6139f, 20.0483f, 7.3262f, 18.361f, 5.639f)
                    curveTo(16.6738f, 3.9517f, 14.3861f, 3.0027f, 12.0f, 3.0f)
                    close()
                    moveTo(14.5f, 8.0f)
                    curveTo(13.8044f, 8.0347f, 13.1508f, 8.3435f, 12.6823f, 8.8589f)
                    curveTo(12.2138f, 9.3743f, 11.9685f, 10.0542f, 12.0f, 10.75f)
                    curveTo(12.0315f, 10.0542f, 11.7862f, 9.3743f, 11.3177f, 8.8589f)
                    curveTo(10.8492f, 8.3435f, 10.1956f, 8.0347f, 9.5f, 8.0f)
                    curveTo(8.8044f, 8.0347f, 8.1508f, 8.3435f, 7.6823f, 8.8589f)
                    curveTo(7.2138f, 9.3743f, 6.9685f, 10.0542f, 7.0f, 10.75f)
                    curveTo(7.0f, 13.63f, 12.0f, 17.0f, 12.0f, 17.0f)
                    curveTo(12.0f, 17.0f, 17.0f, 13.63f, 17.0f, 10.75f)
                    curveTo(17.0315f, 10.0542f, 16.7862f, 9.3743f, 16.3177f, 8.8589f)
                    curveTo(15.8492f, 8.3435f, 15.1956f, 8.0347f, 14.5f, 8.0f)
                    close()
                }
            }
        }
        .build()
        return _commentHeart!!
    }

private var _commentHeart: ImageVector? = null

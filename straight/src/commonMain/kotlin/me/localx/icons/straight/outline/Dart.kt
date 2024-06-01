package me.localx.icons.straight.outline

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

public val Icons.Outline.Dart: ImageVector
    get() {
        if (_dart != null) {
            return _dart!!
        }
        _dart = Builder(name = "Dart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 0.0f)
                    horizontalLineTo(16.586f)
                    lineTo(11.0f, 5.586f)
                    verticalLineTo(10.705f)
                    curveTo(7.734f, 13.12f, 3.419f, 16.338f, 2.879f, 16.879f)
                    curveTo(2.4439f, 17.317f, 2.1549f, 17.8789f, 2.0516f, 18.4875f)
                    curveTo(1.9483f, 19.0962f, 2.0358f, 19.722f, 2.302f, 20.279f)
                    lineTo(0.0f, 22.586f)
                    lineTo(1.414f, 24.0f)
                    lineTo(3.714f, 21.7f)
                    curveTo(4.2712f, 21.9718f, 4.8994f, 22.062f, 5.5106f, 21.9582f)
                    curveTo(6.1217f, 21.8543f, 6.6849f, 21.5615f, 7.121f, 21.121f)
                    curveTo(7.662f, 20.58f, 10.88f, 16.266f, 13.3f, 13.0f)
                    horizontalLineTo(18.419f)
                    lineTo(24.0f, 7.414f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(5.707f, 19.707f)
                    curveTo(5.5169f, 19.8895f, 5.2635f, 19.9914f, 5.0f, 19.9914f)
                    curveTo(4.7365f, 19.9914f, 4.4831f, 19.8895f, 4.293f, 19.707f)
                    curveTo(4.1055f, 19.5195f, 4.0002f, 19.2652f, 4.0002f, 19.0f)
                    curveTo(4.0002f, 18.7348f, 4.1055f, 18.4805f, 4.293f, 18.293f)
                    curveTo(4.632f, 17.957f, 7.293f, 15.95f, 10.241f, 13.759f)
                    curveTo(8.049f, 16.706f, 6.042f, 19.369f, 5.707f, 19.707f)
                    close()
                    moveTo(22.0f, 6.586f)
                    lineTo(17.586f, 11.0f)
                    horizontalLineTo(14.771f)
                    lineTo(15.762f, 9.652f)
                    lineTo(20.707f, 4.707f)
                    lineTo(19.293f, 3.293f)
                    lineTo(14.349f, 8.237f)
                    lineTo(13.0f, 9.229f)
                    verticalLineTo(6.414f)
                    lineTo(17.414f, 2.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 2.0f, 21.5196f, 2.1054f, 21.7071f, 2.2929f)
                    curveTo(21.8946f, 2.4804f, 22.0f, 2.7348f, 22.0f, 3.0f)
                    verticalLineTo(6.586f)
                    close()
                }
            }
        }
        .build()
        return _dart!!
    }

private var _dart: ImageVector? = null

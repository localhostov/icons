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

public val Icons.Bold.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.9999f, 8.0006f)
                    verticalLineTo(7.1516f)
                    curveTo(7.9991f, 6.2655f, 8.2925f, 5.4043f, 8.8341f, 4.703f)
                    curveTo(9.3756f, 4.0017f, 10.1347f, 3.5001f, 10.9922f, 3.2769f)
                    curveTo(11.8496f, 3.0537f, 12.7569f, 3.1215f, 13.5717f, 3.4696f)
                    curveTo(14.3865f, 3.8178f, 15.0626f, 4.4266f, 15.4939f, 5.2006f)
                    lineTo(18.1119f, 3.7356f)
                    curveTo(17.3564f, 2.3823f, 16.1731f, 1.318f, 14.7476f, 0.7096f)
                    curveTo(13.3221f, 0.1013f, 11.735f, -0.0168f, 10.2352f, 0.3739f)
                    curveTo(8.7353f, 0.7647f, 7.4076f, 1.6422f, 6.4601f, 2.8687f)
                    curveTo(5.5127f, 4.0953f, 4.9991f, 5.6017f, 4.9999f, 7.1516f)
                    verticalLineTo(8.0006f)
                    horizontalLineTo(1.9999f)
                    verticalLineTo(21.0006f)
                    curveTo(1.9999f, 21.7962f, 2.316f, 22.5593f, 2.8786f, 23.1219f)
                    curveTo(3.4412f, 23.6845f, 4.2043f, 24.0006f, 4.9999f, 24.0006f)
                    horizontalLineTo(18.9999f)
                    curveTo(19.7956f, 24.0006f, 20.5587f, 23.6845f, 21.1213f, 23.1219f)
                    curveTo(21.6839f, 22.5593f, 21.9999f, 21.7962f, 21.9999f, 21.0006f)
                    verticalLineTo(8.0006f)
                    horizontalLineTo(7.9999f)
                    close()
                    moveTo(4.9999f, 21.0006f)
                    verticalLineTo(11.0006f)
                    horizontalLineTo(18.9999f)
                    verticalLineTo(21.0006f)
                    horizontalLineTo(4.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0001f, 14.0006f)
                    horizontalLineTo(10.0001f)
                    verticalLineTo(17.0006f)
                    horizontalLineTo(14.0001f)
                    verticalLineTo(14.0006f)
                    close()
                }
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null

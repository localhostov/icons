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

public val Icons.Outline.TrainSide: ImageVector
    get() {
        if (_trainSide != null) {
            return _trainSide!!
        }
        _trainSide = Builder(name = "TrainSide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 2.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(4.0006f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(7.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.0006f)
                    horizontalLineTo(19.732f)
                    curveTo(21.0071f, 10.7604f, 21.7771f, 12.8351f, 21.959f, 15.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(17.0006f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(16.0006f)
                    curveTo(23.996f, 12.2888f, 22.5198f, 8.7302f, 19.8951f, 6.1055f)
                    curveTo(17.2705f, 3.4808f, 13.7118f, 2.0046f, 10.0f, 2.0006f)
                    close()
                    moveTo(17.914f, 7.0006f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(4.0006f)
                    curveTo(12.9158f, 4.0006f, 15.7309f, 5.0677f, 17.914f, 7.0006f)
                    close()
                    moveTo(5.0f, 4.0006f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(7.0006f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(4.0006f)
                    close()
                    moveTo(0.0f, 20.0006f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(22.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0006f)
                    close()
                }
            }
        }
        .build()
        return _trainSide!!
    }

private var _trainSide: ImageVector? = null

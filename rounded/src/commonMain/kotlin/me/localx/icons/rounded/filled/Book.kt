package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 0.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(5.0f)
                    curveTo(22.0002f, 3.6739f, 21.4734f, 2.4021f, 20.5357f, 1.4645f)
                    curveTo(19.598f, 0.5268f, 18.3262f, 0.0f, 17.0002f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.3952f, 16.061f)
                    curveTo(4.5943f, 16.0203f, 4.7969f, 15.9999f, 5.0002f, 16.0f)
                    horizontalLineTo(6.0002f)
                    verticalLineTo(0.1f)
                    curveTo(4.8708f, 0.3305f, 3.8558f, 0.9442f, 3.1268f, 1.8371f)
                    curveTo(2.3979f, 2.73f, 1.9999f, 3.8473f, 2.0001f, 5.0f)
                    verticalLineTo(17.025f)
                    curveTo(2.6992f, 16.4975f, 3.5256f, 16.1649f, 4.3952f, 16.061f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0002f, 18.0f)
                    horizontalLineTo(5.0002f)
                    curveTo(4.2045f, 18.0f, 3.4414f, 18.3161f, 2.8788f, 18.8787f)
                    curveTo(2.3162f, 19.4413f, 2.0001f, 20.2044f, 2.0001f, 21.0f)
                    curveTo(2.0001f, 21.7956f, 2.3162f, 22.5587f, 2.8788f, 23.1213f)
                    curveTo(3.4414f, 23.6839f, 4.2045f, 24.0f, 5.0002f, 24.0f)
                    horizontalLineTo(17.0002f)
                    curveTo(17.6568f, 24.0f, 18.3069f, 23.8707f, 18.9136f, 23.6194f)
                    curveTo(19.5202f, 23.3681f, 20.0714f, 22.9998f, 20.5357f, 22.5355f)
                    curveTo(21.0f, 22.0712f, 21.3683f, 21.52f, 21.6196f, 20.9134f)
                    curveTo(21.8708f, 20.3068f, 22.0002f, 19.6566f, 22.0002f, 19.0f)
                    verticalLineTo(18.0f)
                    close()
                }
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null

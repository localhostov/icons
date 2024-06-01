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

public val Icons.Filled.Following: ImageVector
    get() {
        if (_following != null) {
            return _following!!
        }
        _following = Builder(name = "Following", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0f, 12.0f)
                    curveTo(12.3137f, 12.0f, 15.0f, 9.3137f, 15.0f, 6.0f)
                    curveTo(15.0f, 2.6863f, 12.3137f, 0.0f, 9.0f, 0.0f)
                    curveTo(5.6863f, 0.0f, 3.0f, 2.6863f, 3.0f, 6.0f)
                    curveTo(3.0f, 9.3137f, 5.6863f, 12.0f, 9.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.043f, 13.9996f)
                    horizontalLineTo(4.957f)
                    curveTo(3.6428f, 14.0012f, 2.3829f, 14.524f, 1.4536f, 15.4533f)
                    curveTo(0.5244f, 16.3825f, 0.0016f, 17.6424f, 0.0f, 18.9566f)
                    lineTo(0.0f, 23.9996f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(18.9566f)
                    curveTo(17.9984f, 17.6424f, 17.4756f, 16.3825f, 16.5464f, 15.4533f)
                    curveTo(15.6171f, 14.524f, 14.3572f, 14.0012f, 13.043f, 13.9996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9999f, 7.875f)
                    curveTo(21.4433f, 7.9027f, 20.9205f, 8.1498f, 20.5456f, 8.5621f)
                    curveTo(20.1708f, 8.9744f, 19.9746f, 9.5184f, 19.9999f, 10.075f)
                    curveTo(20.0252f, 9.5184f, 19.8289f, 8.9744f, 19.4541f, 8.5621f)
                    curveTo(19.0793f, 8.1498f, 18.5564f, 7.9027f, 17.9999f, 7.875f)
                    curveTo(17.4434f, 7.9027f, 16.9205f, 8.1498f, 16.5457f, 8.5621f)
                    curveTo(16.1708f, 8.9744f, 15.9746f, 9.5184f, 15.9999f, 10.075f)
                    curveTo(15.9999f, 12.375f, 19.9999f, 15.208f, 19.9999f, 15.208f)
                    curveTo(19.9999f, 15.208f, 23.9999f, 12.379f, 23.9999f, 10.075f)
                    curveTo(24.0251f, 9.5184f, 23.8289f, 8.9744f, 23.4541f, 8.5621f)
                    curveTo(23.0793f, 8.1498f, 22.5564f, 7.9027f, 21.9999f, 7.875f)
                    close()
                }
            }
        }
        .build()
        return _following!!
    }

private var _following: ImageVector? = null

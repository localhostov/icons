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

public val Icons.Outline.ArrowFromBottom: ImageVector
    get() {
        if (_arrowFromBottom != null) {
            return _arrowFromBottom!!
        }
        _arrowFromBottom = Builder(name = "ArrowFromBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.9997f, 22.0f)
                    verticalLineTo(2.823f)
                    lineTo(17.2997f, 7.123f)
                    lineTo(18.7137f, 5.709f)
                    lineTo(13.7677f, 0.763f)
                    curveTo(13.5355f, 0.5308f, 13.2599f, 0.3466f, 12.9566f, 0.2209f)
                    curveTo(12.6532f, 0.0952f, 12.3281f, 0.0305f, 11.9997f, 0.0305f)
                    curveTo(11.6713f, 0.0305f, 11.3462f, 0.0952f, 11.0428f, 0.2209f)
                    curveTo(10.7395f, 0.3466f, 10.4639f, 0.5308f, 10.2317f, 0.763f)
                    lineTo(5.2817f, 5.713f)
                    lineTo(6.6997f, 7.127f)
                    lineTo(10.9997f, 2.827f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(4.9997f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.9997f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(12.9997f)
                    close()
                }
            }
        }
        .build()
        return _arrowFromBottom!!
    }

private var _arrowFromBottom: ImageVector? = null

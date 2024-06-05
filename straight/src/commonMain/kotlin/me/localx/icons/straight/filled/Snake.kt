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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Snake: ImageVector
    get() {
        if (_snake != null) {
            return _snake!!
        }
        _snake = Builder(name = "Snake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 19.0f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.469f, 17.0f)
                horizontalLineToRelative(6.561f)
                lineToRelative(-3.611f, -4.272f)
                curveToRelative(-0.883f, -1.061f, -4.922f, -1.728f, -4.922f, -1.728f)
                curveToRelative(0.0f, 0.0f, 0.195f, 3.865f, 1.078f, 4.926f)
                lineToRelative(0.894f, 1.074f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.269f, 2.794f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-0.988f, -0.988f, -2.354f, -1.453f, -3.671f, -1.357f)
                curveToRelative(-0.988f, -0.039f, -1.979f, 0.284f, -2.775f, 0.976f)
                lineToRelative(-1.028f, 0.489f)
                curveToRelative(-1.27f, 0.076f, -3.153f, 0.424f, -4.573f, 1.71f)
                curveToRelative(-0.825f, 0.746f, -1.808f, 2.096f, -1.808f, 4.291f)
                curveToRelative(0.0f, 3.352f, 2.397f, 7.442f, 4.507f, 9.503f)
                lineToRelative(7.493f, 0.008f)
                curveToRelative(-1.622f, -0.928f, -3.445f, -2.813f, -4.638f, -4.252f)
                curveToRelative(-1.862f, -2.248f, -2.362f, -4.248f, -2.362f, -5.259f)
                curveToRelative(0.0f, -0.708f, 0.654f, -0.917f, 1.253f, -0.984f)
                lineToRelative(1.238f, 1.238f)
                curveToRelative(1.755f, 1.755f, 4.609f, 1.755f, 6.364f, 0.0f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(0.975f, -0.975f, 0.975f, -2.561f, 0.0f, -3.536f)
                close()
                moveTo(19.0f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _snake!!
    }

private var _snake: ImageVector? = null

package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.FlagAlt: ImageVector
    get() {
        if (_flagAlt != null) {
            return _flagAlt!!
        }
        _flagAlt = Builder(name = "FlagAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.358f, 7.5f)
                lineToRelative(3.237f, -4.297f)
                curveToRelative(0.459f, -0.609f, 0.533f, -1.413f, 0.192f, -2.096f)
                reflectiveCurveToRelative(-1.026f, -1.107f, -1.79f, -1.107f)
                horizontalLineTo(4.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineTo(23.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.998f)
                curveToRelative(0.764f, 0.0f, 1.449f, -0.425f, 1.79f, -1.107f)
                reflectiveCurveToRelative(0.267f, -1.486f, -0.192f, -2.096f)
                lineToRelative(-3.237f, -4.297f)
                close()
                moveTo(2.0f, 13.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineTo(21.998f)
                lineToRelative(-3.69f, 4.898f)
                curveToRelative(-0.268f, 0.356f, -0.268f, 0.847f, 0.0f, 1.203f)
                lineToRelative(3.69f, 4.898f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _flagAlt!!
    }

private var _flagAlt: ImageVector? = null

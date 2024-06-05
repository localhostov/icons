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

public val Icons.Outline.ArrowAltLeft: ImageVector
    get() {
        if (_arrowAltLeft != null) {
            return _arrowAltLeft!!
        }
        _arrowAltLeft = Builder(name = "ArrowAltLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-3.361f)
                curveToRelative(0.0f, -0.695f, -0.852f, -1.044f, -1.35f, -0.552f)
                lineTo(0.232f, 11.448f)
                curveToRelative(-0.309f, 0.305f, -0.309f, 0.799f, 0.0f, 1.104f)
                lineToRelative(4.418f, 4.361f)
                curveToRelative(0.498f, 0.492f, 1.35f, 0.143f, 1.35f, -0.552f)
                verticalLineToRelative(-3.361f)
                horizontalLineTo(23.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _arrowAltLeft!!
    }

private var _arrowAltLeft: ImageVector? = null

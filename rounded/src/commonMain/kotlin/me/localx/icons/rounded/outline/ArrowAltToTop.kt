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

public val Icons.Outline.ArrowAltToTop: ImageVector
    get() {
        if (_arrowAltToTop != null) {
            return _arrowAltToTop!!
        }
        _arrowAltToTop = Builder(name = "ArrowAltToTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.448f, 2.232f)
                curveToRelative(0.152f, -0.154f, 0.352f, -0.232f, 0.552f, -0.232f)
                reflectiveCurveToRelative(0.4f, 0.077f, 0.552f, 0.232f)
                lineToRelative(4.361f, 4.418f)
                curveToRelative(0.492f, 0.498f, 0.143f, 1.35f, -0.552f, 1.35f)
                horizontalLineToRelative(-3.361f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-3.361f)
                curveToRelative(-0.695f, 0.0f, -1.044f, -0.852f, -0.552f, -1.35f)
                lineTo(11.448f, 2.232f)
                close()
                moveTo(20.0f, 0.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(20.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _arrowAltToTop!!
    }

private var _arrowAltToTop: ImageVector? = null

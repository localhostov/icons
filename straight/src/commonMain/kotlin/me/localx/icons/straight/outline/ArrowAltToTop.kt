package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.77f)
                curveToRelative(-0.28f, 0.056f, -0.547f, 0.212f, -0.753f, 0.445f)
                lineToRelative(-5.017f, 5.555f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(12.983f, 2.445f)
                curveToRelative(-0.206f, -0.233f, -0.473f, -0.389f, -0.753f, -0.445f)
                horizontalLineToRelative(8.77f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _arrowAltToTop!!
    }

private var _arrowAltToTop: ImageVector? = null

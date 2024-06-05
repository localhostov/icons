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

public val Icons.Outline.Pyramid: ImageVector
    get() {
        if (_pyramid != null) {
            return _pyramid!!
        }
        _pyramid = Builder(name = "Pyramid", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.01f)
                curveToRelative(0.057f, 0.0f, 0.065f, 0.017f, 0.077f, 0.044f)
                lineTo(20.925f, 22.0f)
                horizontalLineTo(3.075f)
                lineTo(11.919f, 2.062f)
                curveToRelative(0.016f, -0.035f, 0.024f, -0.052f, 0.081f, -0.052f)
                moveToRelative(0.0f, -2.0f)
                arcToRelative(2.061f, 2.061f, 0.0f, false, false, -1.9f, 1.233f)
                lineTo(0.0f, 24.0f)
                horizontalLineTo(24.0f)
                lineTo(13.905f, 1.243f)
                arcTo(2.061f, 2.061f, 0.0f, false, false, 12.0f, 0.01f)
                close()
            }
        }
        .build()
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null

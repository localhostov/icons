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

public val Icons.Outline.Pennant: ImageVector
    get() {
        if (_pennant != null) {
            return _pennant!!
        }
        _pennant = Builder(name = "Pennant", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.93f, 9.147f)
                lineTo(3.43f, 3.4f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 1.0f, 3.732f)
                lineTo(1.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(3.0f, 20.736f)
                lineToRelative(18.949f, -5.89f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.019f, -5.7f)
                close()
                moveTo(1.03f, 3.747f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveTo(1.03f, 3.753f, 1.029f, 3.749f)
                close()
                moveTo(21.337f, 12.94f)
                lineTo(3.0f, 18.642f)
                lineTo(3.0f, 5.358f)
                lineToRelative(18.316f, 5.693f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.02f, 1.891f)
                close()
            }
        }
        .build()
        return _pennant!!
    }

private var _pennant: ImageVector? = null

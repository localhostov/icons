package me.localx.icons.rounded.filled

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

public val Icons.Filled.FlagAlt: ImageVector
    get() {
        if (_flagAlt != null) {
            return _flagAlt!!
        }
        _flagAlt = Builder(name = "FlagAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                curveTo(0.0f, 1.794f, 1.794f, 0.0f, 4.0f, 0.0f)
                horizontalLineTo(21.998f)
                curveToRelative(1.6f, -0.055f, 2.604f, 1.958f, 1.598f, 3.203f)
                lineToRelative(-3.237f, 4.297f)
                lineToRelative(3.237f, 4.297f)
                curveToRelative(1.007f, 1.245f, 0.003f, 3.258f, -1.598f, 3.203f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _flagAlt!!
    }

private var _flagAlt: ImageVector? = null

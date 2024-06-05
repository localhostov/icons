package me.localx.icons.straight.filled

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

public val Icons.Filled.ArrowsAltV: ImageVector
    get() {
        if (_arrowsAltV != null) {
            return _arrowsAltV!!
        }
        _arrowsAltV = Builder(name = "ArrowsAltV", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                horizontalLineToRelative(5.159f)
                lineTo(13.076f, 0.445f)
                curveToRelative(-0.532f, -0.593f, -1.461f, -0.593f, -1.993f, 0.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(6.0f)
                lineToRelative(5.083f, 5.555f)
                curveToRelative(0.532f, 0.593f, 1.461f, 0.593f, 1.993f, 0.0f)
                lineToRelative(5.083f, -5.555f)
                horizontalLineToRelative(-5.159f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _arrowsAltV!!
    }

private var _arrowsAltV: ImageVector? = null

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

public val Icons.Filled.LaughSquint: ImageVector
    get() {
        if (_laughSquint != null) {
            return _laughSquint!!
        }
        _laughSquint = Builder(name = "LaughSquint", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(6.375f, 7.781f)
                lineToRelative(1.25f, -1.562f)
                lineTo(11.1f, 9.0f)
                lineTo(7.625f, 11.781f)
                lineToRelative(-1.25f, -1.562f)
                lineTo(7.9f, 9.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(8.993f, 19.0f, 7.044f, 16.0f, 6.993f, 14.0f)
                horizontalLineToRelative(10.0f)
                curveTo(16.993f, 16.0f, 14.993f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(17.625f, 10.219f)
                lineTo(16.375f, 11.781f)
                lineTo(12.9f, 9.0f)
                lineToRelative(3.476f, -2.781f)
                lineToRelative(1.25f, 1.562f)
                lineTo(16.1f, 9.0f)
                close()
            }
        }
        .build()
        return _laughSquint!!
    }

private var _laughSquint: ImageVector? = null

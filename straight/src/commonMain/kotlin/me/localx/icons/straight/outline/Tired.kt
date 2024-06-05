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

public val Icons.Outline.Tired: ImageVector
    get() {
        if (_tired != null) {
            return _tired!!
        }
        _tired = Builder(name = "Tired", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                arcToRelative(21.923f, 21.923f, 0.0f, false, false, -6.007f, -1.0f)
                arcToRelative(21.841f, 21.841f, 0.0f, false, false, -6.0f, 1.0f)
                curveToRelative(0.615f, -2.28f, 2.671f, -5.0f, 6.007f, -5.0f)
                reflectiveCurveTo(17.385f, 15.72f, 18.0f, 18.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 12.0f, 22.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(17.625f, 10.219f)
                lineTo(16.1f, 9.0f)
                lineToRelative(1.524f, -1.219f)
                lineToRelative(-1.25f, -1.562f)
                lineTo(12.9f, 9.0f)
                lineToRelative(3.476f, 2.781f)
                close()
                moveTo(7.625f, 11.781f)
                lineTo(11.1f, 9.0f)
                lineTo(7.625f, 6.219f)
                lineTo(6.375f, 7.781f)
                lineTo(7.9f, 9.0f)
                lineTo(6.375f, 10.219f)
                close()
            }
        }
        .build()
        return _tired!!
    }

private var _tired: ImageVector? = null

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

public val Icons.Filled.PenFancySlash: ImageVector
    get() {
        if (_penFancySlash != null) {
            return _penFancySlash!!
        }
        _penFancySlash = Builder(name = "PenFancySlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.028f, 12.25f)
                lineToRelative(3.836f, 3.836f)
                lineToRelative(-1.204f, 5.42f)
                lineToRelative(-9.132f, 2.495f)
                lineToRelative(6.009f, -6.009f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(0.113f, 22.586f)
                lineToRelative(2.495f, -9.132f)
                lineToRelative(5.42f, -1.204f)
                close()
                moveTo(23.256f, 4.383f)
                curveToRelative(0.479f, -0.48f, 0.744f, -1.117f, 0.744f, -1.795f)
                reflectiveCurveToRelative(-0.264f, -1.316f, -0.744f, -1.795f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-8.73f, 8.73f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-9.431f, -9.431f)
                lineToRelative(8.73f, -8.73f)
                close()
            }
        }
        .build()
        return _penFancySlash!!
    }

private var _penFancySlash: ImageVector? = null

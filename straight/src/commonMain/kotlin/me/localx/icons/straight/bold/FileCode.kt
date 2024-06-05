package me.localx.icons.straight.bold

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

public val Icons.Bold.FileCode: ImageVector
    get() {
        if (_fileCode != null) {
            return _fileCode!!
        }
        _fileCode = Builder(name = "FileCode", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.218f, 13.561f)
                lineToRelative(-2.006f, 2.006f)
                lineToRelative(1.849f, 1.849f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.21f, -2.21f)
                curveToRelative(-0.47f, -0.47f, -0.729f, -1.095f, -0.729f, -1.759f)
                reflectiveCurveToRelative(0.259f, -1.29f, 0.729f, -1.76f)
                lineToRelative(2.368f, -2.368f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(14.903f, 11.44f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.006f, 2.006f)
                lineToRelative(-1.872f, 1.873f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.234f, -2.234f)
                curveToRelative(0.47f, -0.47f, 0.729f, -1.095f, 0.729f, -1.759f)
                reflectiveCurveToRelative(-0.259f, -1.29f, -0.729f, -1.76f)
                lineToRelative(-2.368f, -2.368f)
                close()
                moveTo(22.0f, 5.665f)
                lineTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.346f, 3.346f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(11.381f)
                lineToRelative(5.619f, 5.665f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null

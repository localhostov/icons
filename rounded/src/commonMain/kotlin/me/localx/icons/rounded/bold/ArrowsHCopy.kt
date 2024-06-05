package me.localx.icons.rounded.bold

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

public val Icons.Bold.ArrowsHCopy: ImageVector
    get() {
        if (_arrowsHCopy != null) {
            return _arrowsHCopy!!
        }
        _arrowsHCopy = Builder(name = "ArrowsHCopy", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.558f, 1.0f)
                lineToRelative(-3.1f, 3.049f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.1f, 2.141f)
                lineToRelative(1.933f, -1.9f)
                verticalLineTo(19.743f)
                lineTo(8.544f, 17.828f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.1f, 2.139f)
                lineToRelative(3.1f, 3.05f)
                arcToRelative(3.489f, 3.489f, 0.0f, false, false, 2.447f, 0.99f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.493f, 3.493f, 0.0f, false, false, 2.449f, -0.99f)
                curveToRelative(0.205f, -0.2f, 0.39f, -0.383f, 0.511f, -0.5f)
                lineToRelative(2.591f, -2.546f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.1f, -2.139f)
                lineToRelative(-1.95f, 1.915f)
                verticalLineTo(4.258f)
                lineToRelative(1.964f, 1.931f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.1f, -2.141f)
                lineTo(14.458f, 1.0f)
                arcTo(3.522f, 3.522f, 0.0f, false, false, 9.558f, 1.0f)
                close()
            }
        }
        .build()
        return _arrowsHCopy!!
    }

private var _arrowsHCopy: ImageVector? = null

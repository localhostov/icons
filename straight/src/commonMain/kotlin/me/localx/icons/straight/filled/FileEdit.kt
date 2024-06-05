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

public val Icons.Filled.FileEdit: ImageVector
    get() {
        if (_fileEdit != null) {
            return _fileEdit!!
        }
        _fileEdit = Builder(name = "FileEdit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(15.0f, 0.586f)
                lineToRelative(4.414f, 4.414f)
                close()
                moveTo(24.0f, 14.537f)
                curveToRelative(0.0f, 0.678f, -0.264f, 1.316f, -0.744f, 1.795f)
                lineToRelative(-7.667f, 7.667f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                lineToRelative(7.668f, -7.667f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0.0f)
                curveToRelative(0.479f, 0.479f, 0.744f, 1.117f, 0.744f, 1.795f)
                close()
                moveTo(9.999f, 19.581f)
                lineToRelative(8.253f, -8.252f)
                curveToRelative(0.5f, -0.5f, 1.096f, -0.869f, 1.748f, -1.089f)
                verticalLineToRelative(-3.239f)
                horizontalLineToRelative(-7.0f)
                lineTo(13.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(9.999f)
                verticalLineToRelative(-4.419f)
                close()
            }
        }
        .build()
        return _fileEdit!!
    }

private var _fileEdit: ImageVector? = null

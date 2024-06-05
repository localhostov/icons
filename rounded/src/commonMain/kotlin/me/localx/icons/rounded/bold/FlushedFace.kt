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

public val Icons.Bold.FlushedFace: ImageVector
    get() {
        if (_flushedFace != null) {
            return _flushedFace!!
        }
        _flushedFace = Builder(name = "FlushedFace", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, true, 11.0f, 9.667f)
                curveTo(11.0f, 11.0f, 9.881f, 11.0f, 8.5f, 11.0f)
                reflectiveCurveTo(6.0f, 11.0f, 6.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, true, 8.5f, 7.0f)
                close()
                moveTo(13.0f, 9.667f)
                curveTo(13.0f, 11.0f, 14.119f, 11.0f, 15.5f, 11.0f)
                reflectiveCurveTo(18.0f, 11.0f, 18.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 15.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 13.0f, 9.667f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -9.0f, -9.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 21.0f, 12.0f)
                close()
                moveTo(17.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 14.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 15.5f)
                close()
            }
        }
        .build()
        return _flushedFace!!
    }

private var _flushedFace: ImageVector? = null

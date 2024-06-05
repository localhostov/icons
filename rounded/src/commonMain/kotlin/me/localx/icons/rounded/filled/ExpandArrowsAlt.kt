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

public val Icons.Filled.ExpandArrowsAlt: ImageVector
    get() {
        if (_expandArrowsAlt != null) {
            return _expandArrowsAlt!!
        }
        _expandArrowsAlt = Builder(name = "ExpandArrowsAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 4.724f)
                lineToRelative(1.595f, 1.594f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 5.613f)
                lineToRelative(0.0f, -4.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(18.393f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, 1.705f)
                lineToRelative(1.6f, 1.595f)
                lineTo(12.0f, 10.587f)
                lineTo(4.709f, 3.3f)
                lineTo(6.314f, 1.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.607f, -0.008f)
                lineTo(1.0f, -0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.709f, 6.3f)
                lineTo(3.3f, 4.714f)
                lineTo(10.587f, 12.0f)
                lineTo(3.305f, 19.276f)
                lineToRelative(-1.6f, -1.595f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 18.387f)
                lineToRelative(0.0f, 4.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(5.607f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -1.7f)
                lineTo(4.719f, 20.689f)
                lineTo(12.0f, 13.413f)
                lineToRelative(7.282f, 7.275f)
                lineToRelative(-1.6f, 1.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, 1.7f)
                lineToRelative(4.605f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.707f, -0.707f)
                lineTo(20.7f, 19.275f)
                lineTo(13.414f, 12.0f)
                close()
            }
        }
        .build()
        return _expandArrowsAlt!!
    }

private var _expandArrowsAlt: ImageVector? = null

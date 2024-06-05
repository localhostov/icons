package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.TimePast: ImageVector
    get() {
        if (_timePast != null) {
            return _timePast!!
        }
        _timePast = Builder(name = "TimePast", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.034f, 12.034f, 0.0f, false, false, 4.04f, 3.04f)
                lineTo(2.707f, 1.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 2.414f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 8.0f)
                horizontalLineTo(6.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -1.707f)
                lineTo(6.158f, 5.158f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 21.0f, 12.26f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.1f, 13.316f)
                arcTo(1.51f, 1.51f, 0.0f, false, false, 1.613f, 12.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.489f, 1.489f, 0.0f, false, false, 0.115f, 13.663f)
                arcTo(12.018f, 12.018f, 0.0f, false, false, 12.474f, 23.991f)
                arcTo(12.114f, 12.114f, 0.0f, false, false, 23.991f, 12.474f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 7.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 8.5f)
                verticalLineToRelative(4.293f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, 1.414f)
                lineTo(12.379f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 13.879f)
                lineToRelative(-1.5f, -1.5f)
                verticalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 7.0f)
                close()
            }
        }
        .build()
        return _timePast!!
    }

private var _timePast: ImageVector? = null

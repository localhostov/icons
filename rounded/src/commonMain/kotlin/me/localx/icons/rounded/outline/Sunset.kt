package me.localx.icons.rounded.outline

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

public val Icons.Outline.Sunset: ImageVector
    get() {
        if (_sunset != null) {
            return _sunset!!
        }
        _sunset = Builder(name = "Sunset", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 24.0f)
                horizontalLineTo(18.922f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.972f, -1.712f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, -9.9f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.079f, 24.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(5.079f)
                arcToRelative(6.842f, 6.842f, 0.0f, false, true, 0.428f, -1.608f)
                lineTo(1.982f, 18.35f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.731f)
                lineToRelative(3.529f, 2.045f)
                arcToRelative(7.056f, 7.056f, 0.0f, false, true, 1.151f, -1.147f)
                lineTo(5.618f, 13.986f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.731f, -1.0f)
                lineTo(9.393f, 16.51f)
                arcTo(6.964f, 6.964f, 0.0f, false, true, 11.0f, 16.073f)
                verticalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(4.072f)
                arcToRelative(6.943f, 6.943f, 0.0f, false, true, 1.606f, 0.437f)
                lineToRelative(2.045f, -3.527f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.731f, 1.0f)
                lineToRelative(-2.047f, 3.531f)
                arcToRelative(7.055f, 7.055f, 0.0f, false, true, 1.151f, 1.147f)
                lineToRelative(3.53f, -2.045f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.731f)
                lineTo(18.5f, 20.391f)
                arcToRelative(6.873f, 6.873f, 0.0f, false, true, 0.436f, 1.618f)
                lineTo(23.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3f, 5.708f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.3f, 4.293f)
                lineTo(13.0f, 5.586f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(5.586f)
                lineTo(9.7f, 4.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.291f, 5.708f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _sunset!!
    }

private var _sunset: ImageVector? = null

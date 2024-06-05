package me.localx.icons.rounded.outline

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

public val Icons.Outline.SunriseAlt: ImageVector
    get() {
        if (_sunriseAlt != null) {
            return _sunriseAlt!!
        }
        _sunriseAlt = Builder(name = "SunriseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 24.0f)
                horizontalLineTo(18.922f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.972f, -1.711f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, -9.9f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.079f, 24.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(5.079f)
                arcToRelative(6.821f, 6.821f, 0.0f, false, true, 0.428f, -1.607f)
                lineTo(1.982f, 18.349f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.731f)
                lineToRelative(3.529f, 2.046f)
                arcToRelative(7.062f, 7.062f, 0.0f, false, true, 1.151f, -1.148f)
                lineTo(5.618f, 13.984f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.731f, -1.0f)
                lineToRelative(2.044f, 3.527f)
                arcTo(6.915f, 6.915f, 0.0f, false, true, 11.0f, 16.072f)
                verticalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(4.072f)
                arcToRelative(6.915f, 6.915f, 0.0f, false, true, 1.607f, 0.437f)
                lineToRelative(2.044f, -3.528f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.731f, 1.0f)
                lineToRelative(-2.047f, 3.531f)
                arcToRelative(7.062f, 7.062f, 0.0f, false, true, 1.151f, 1.148f)
                lineToRelative(3.529f, -2.046f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.731f)
                lineTo(18.5f, 20.391f)
                arcToRelative(6.852f, 6.852f, 0.0f, false, true, 0.436f, 1.617f)
                lineTo(23.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 24.0f)
                close()
                moveTo(15.705f, 3.292f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.705f, 4.707f)
                lineTo(11.0f, 3.414f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(3.414f)
                lineToRelative(1.3f, 1.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.71f, 3.292f)
                horizontalLineToRelative(-0.005f)
                close()
            }
        }
        .build()
        return _sunriseAlt!!
    }

private var _sunriseAlt: ImageVector? = null

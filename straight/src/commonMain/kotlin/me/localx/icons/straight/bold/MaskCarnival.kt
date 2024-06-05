package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.MaskCarnival: ImageVector
    get() {
        if (_maskCarnival != null) {
            return _maskCarnival!!
        }
        _maskCarnival = Builder(name = "MaskCarnival", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 11.281f)
                verticalLineToRelative(-0.676f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 19.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.5f, 3.605f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.605f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 5.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 7.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.5f, 3.605f)
                verticalLineToRelative(0.676f)
                arcTo(34.254f, 34.254f, 0.0f, false, false, 1.5f, 10.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.5f)
                curveTo(0.0f, 22.376f, 4.528f, 24.0f, 7.227f, 24.0f)
                arcToRelative(5.492f, 5.492f, 0.0f, false, false, 3.245f, -1.27f)
                arcTo(2.909f, 2.909f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(2.911f, 2.911f, 0.0f, false, true, 1.527f, 0.729f)
                arcTo(5.491f, 5.491f, 0.0f, false, false, 16.772f, 24.0f)
                curveTo(19.472f, 24.0f, 24.0f, 22.376f, 24.0f, 11.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.5f)
                arcTo(34.254f, 34.254f, 0.0f, false, false, 13.5f, 11.281f)
                close()
                moveTo(16.772f, 21.0f)
                arcToRelative(2.911f, 2.911f, 0.0f, false, true, -1.527f, -0.729f)
                arcTo(5.486f, 5.486f, 0.0f, false, false, 12.0f, 19.0f)
                arcToRelative(5.492f, 5.492f, 0.0f, false, false, -3.245f, 1.27f)
                arcTo(2.905f, 2.905f, 0.0f, false, true, 7.227f, 21.0f)
                curveToRelative(-3.182f, 0.0f, -4.022f, -4.456f, -4.191f, -7.955f)
                arcToRelative(31.639f, 31.639f, 0.0f, false, true, 8.427f, 1.689f)
                lineToRelative(0.538f, 0.2f)
                lineToRelative(0.536f, -0.2f)
                arcToRelative(31.639f, 31.639f, 0.0f, false, true, 8.427f, -1.689f)
                curveTo(20.8f, 16.544f, 19.955f, 21.0f, 16.772f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.686f, 15.371f)
                arcToRelative(28.61f, 28.61f, 0.0f, false, false, -5.21f, 1.347f)
                lineToRelative(-0.8f, 0.315f)
                curveToRelative(1.858f, 0.182f, 3.075f, 1.717f, 4.053f, 1.967f)
                curveTo(18.009f, 19.328f, 18.293f, 17.713f, 18.686f, 15.371f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.314f, 15.371f)
                curveToRelative(0.393f, 2.342f, 0.677f, 3.957f, 1.958f, 3.629f)
                curveToRelative(0.978f, -0.25f, 2.2f, -1.785f, 4.053f, -1.967f)
                lineToRelative(-0.8f, -0.315f)
                arcTo(28.61f, 28.61f, 0.0f, false, false, 5.314f, 15.371f)
                close()
            }
        }
        .build()
        return _maskCarnival!!
    }

private var _maskCarnival: ImageVector? = null

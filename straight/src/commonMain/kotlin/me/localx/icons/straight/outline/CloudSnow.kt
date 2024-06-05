package me.localx.icons.straight.outline

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

public val Icons.Outline.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) {
            return _cloudSnow!!
        }
        _cloudSnow = Builder(name = "CloudSnow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.374f, 15.534f)
                lineTo(14.5f, 14.01f)
                lineToRelative(-0.874f, 1.524f)
                lineToRelative(-1.734f, -1.0f)
                lineTo(12.774f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.774f)
                lineToRelative(-0.882f, -1.539f)
                lineToRelative(1.734f, -1.0f)
                lineTo(14.5f, 9.99f)
                lineToRelative(0.874f, -1.524f)
                lineToRelative(1.734f, 1.0f)
                lineTo(16.226f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(16.226f)
                lineToRelative(0.882f, 1.539f)
                close()
                moveTo(13.108f, 17.5f)
                lineToRelative(-1.734f, -1.0f)
                lineTo(10.5f, 18.027f)
                lineTo(9.626f, 16.5f)
                lineToRelative(-1.734f, 1.0f)
                lineToRelative(0.882f, 1.538f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.774f)
                lineToRelative(-0.882f, 1.539f)
                lineToRelative(1.734f, 1.0f)
                lineToRelative(0.874f, -1.524f)
                lineToRelative(0.874f, 1.524f)
                lineToRelative(1.734f, -1.0f)
                lineToRelative(-0.882f, -1.539f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(12.226f)
                close()
                moveTo(17.44f, 5.059f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 2.0f, 8.0f)
                arcToRelative(7.961f, 7.961f, 0.0f, false, false, 0.266f, 2.049f)
                arcTo(5.479f, 5.479f, 0.0f, false, false, 0.0f, 14.5f)
                arcTo(5.274f, 5.274f, 0.0f, false, false, 5.0f, 20.0f)
                verticalLineTo(18.0f)
                arcToRelative(3.283f, 3.283f, 0.0f, false, true, -3.0f, -3.5f)
                arcToRelative(3.489f, 3.489f, 0.0f, false, true, 1.911f, -3.12f)
                lineToRelative(0.8f, -0.407f)
                lineToRelative(-0.318f, -0.839f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 15.752f, 6.289f)
                lineToRelative(0.206f, 0.691f)
                lineTo(16.679f, 7.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 16.5f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.94f, -14.941f)
                close()
            }
        }
        .build()
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null

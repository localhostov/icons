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

public val Icons.Bold.HelicopterSide: ImageVector
    get() {
        if (_helicopterSide != null) {
            return _helicopterSide!!
        }
        _helicopterSide = Builder(name = "HelicopterSide", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.182f, 19.0f)
                arcTo(4.824f, 4.824f, 0.0f, false, false, 24.0f, 14.182f)
                arcToRelative(8.193f, 8.193f, 0.0f, false, false, -7.0f, -8.1f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(16.914f)
                arcToRelative(1.511f, 1.511f, 0.0f, false, false, -2.828f, 0.0f)
                horizontalLineTo(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(6.822f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, false, 3.315f, 4.342f)
                lineToRelative(3.685f, 1.0f)
                verticalLineToRelative(0.559f)
                arcToRelative(6.282f, 6.282f, 0.0f, false, false, 4.0f, 5.847f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.448f, 2.448f, 0.0f, false, false, 24.0f, 21.5f)
                arcToRelative(1.505f, 1.505f, 0.0f, false, false, -2.915f, -0.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(10.0f, 12.727f)
                verticalLineToRelative(-1.7f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.9f, 9.576f)
                lineTo(6.784f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.832f, 1.832f, 0.0f, false, true, -1.814f, 2.0f)
                horizontalLineToRelative(-5.91f)
                arcTo(3.276f, 3.276f, 0.0f, false, true, 10.0f, 12.727f)
                close()
                moveTo(16.0f, 21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _helicopterSide!!
    }

private var _helicopterSide: ImageVector? = null

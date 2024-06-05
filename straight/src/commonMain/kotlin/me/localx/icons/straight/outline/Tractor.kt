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

public val Icons.Outline.Tractor: ImageVector
    get() {
        if (_tractor != null) {
            return _tractor!!
        }
        _tractor = Builder(name = "Tractor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.17f, 15.244f)
                lineToRelative(0.78f, -0.78f)
                lineTo(9.536f, 13.05f)
                lineToRelative(-0.78f, 0.78f)
                arcTo(4.952f, 4.952f, 0.0f, false, false, 7.0f, 13.1f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(1.1f)
                arcToRelative(4.952f, 4.952f, 0.0f, false, false, -1.756f, 0.729f)
                lineToRelative(-0.78f, -0.78f)
                lineTo(1.05f, 14.464f)
                lineToRelative(0.78f, 0.78f)
                arcTo(4.952f, 4.952f, 0.0f, false, false, 1.1f, 17.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.1f)
                arcToRelative(4.952f, 4.952f, 0.0f, false, false, 0.729f, 1.756f)
                lineToRelative(-0.78f, 0.78f)
                lineTo(2.464f, 22.95f)
                lineToRelative(0.78f, -0.78f)
                arcTo(4.952f, 4.952f, 0.0f, false, false, 5.0f, 22.9f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.9f)
                arcToRelative(4.952f, 4.952f, 0.0f, false, false, 1.756f, -0.729f)
                lineToRelative(0.78f, 0.78f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.78f, -0.78f)
                arcTo(4.952f, 4.952f, 0.0f, false, false, 10.9f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.9f)
                arcTo(4.952f, 4.952f, 0.0f, false, false, 10.17f, 15.244f)
                close()
                moveTo(6.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 21.0f)
                close()
                moveTo(24.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.554f)
                lineTo(11.436f, 1.41f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 8.892f, 0.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(1.721f)
                arcToRelative(8.021f, 8.021f, 0.0f, false, true, 2.0f, -1.642f)
                verticalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.667f)
                lineToRelative(-1.955f, 2.606f)
                curveToRelative(-6.729f, -2.0f, -8.559f, 8.3f, -1.545f, 8.727f)
                arcToRelative(4.522f, 4.522f, 0.0f, false, false, 3.226f, -7.634f)
                lineTo(24.0f, 13.333f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineTo(8.892f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, true, 0.847f, 0.47f)
                lineTo(13.2f, 8.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(18.5f, 22.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 22.0f)
                close()
            }
        }
        .build()
        return _tractor!!
    }

private var _tractor: ImageVector? = null

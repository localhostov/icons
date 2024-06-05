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

public val Icons.Filled.Tractor: ImageVector
    get() {
        if (_tractor != null) {
            return _tractor!!
        }
        _tractor = Builder(name = "Tractor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                curveToRelative(-0.134f, 5.276f, -7.867f, 5.275f, -8.0f, 0.0f)
                curveTo(14.134f, 14.724f, 21.867f, 14.725f, 22.0f, 20.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(4.961f, 4.961f, 0.0f, false, true, -0.732f, 1.753f)
                lineToRelative(0.076f, 0.076f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.414f)
                lineToRelative(-0.076f, -0.076f)
                arcTo(4.961f, 4.961f, 0.0f, false, true, 7.0f, 22.9f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-0.1f)
                arcToRelative(4.961f, 4.961f, 0.0f, false, true, -1.753f, -0.732f)
                lineToRelative(-0.076f, 0.076f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(0.076f, -0.076f)
                arcTo(4.961f, 4.961f, 0.0f, false, true, 1.1f, 19.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(0.1f)
                arcToRelative(4.961f, 4.961f, 0.0f, false, true, 0.732f, -1.753f)
                lineToRelative(-0.076f, -0.076f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(0.076f, 0.076f)
                arcTo(4.961f, 4.961f, 0.0f, false, true, 5.0f, 13.1f)
                verticalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(0.1f)
                arcToRelative(4.961f, 4.961f, 0.0f, false, true, 1.753f, 0.732f)
                lineToRelative(0.076f, -0.076f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineToRelative(-0.076f, 0.076f)
                arcTo(4.961f, 4.961f, 0.0f, false, true, 10.9f, 17.0f)
                horizontalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 18.0f)
                close()
                moveTo(7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                close()
                moveTo(12.023f, 2.35f)
                arcTo(4.971f, 4.971f, 0.0f, false, false, 7.783f, 0.0f)
                horizontalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.3f)
                close()
                moveTo(20.0f, 8.0f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(1.721f)
                curveTo(3.978f, 7.96f, 12.165f, 9.85f, 13.693f, 15.828f)
                arcToRelative(6.057f, 6.057f, 0.0f, false, true, 8.514f, -0.1f)
                lineTo(23.2f, 14.4f)
                arcTo(4.025f, 4.025f, 0.0f, false, false, 20.0f, 8.0f)
                close()
            }
        }
        .build()
        return _tractor!!
    }

private var _tractor: ImageVector? = null

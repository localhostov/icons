package me.localx.icons.straight.filled

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
                moveTo(10.167f, 15.247f)
                lineToRelative(0.783f, -0.783f)
                lineTo(9.536f, 13.05f)
                lineToRelative(-0.783f, 0.783f)
                arcTo(4.961f, 4.961f, 0.0f, false, false, 7.0f, 13.1f)
                lineTo(7.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(1.1f)
                arcToRelative(4.961f, 4.961f, 0.0f, false, false, -1.753f, 0.732f)
                lineToRelative(-0.783f, -0.783f)
                lineTo(1.05f, 14.464f)
                lineToRelative(0.783f, 0.783f)
                arcTo(4.961f, 4.961f, 0.0f, false, false, 1.1f, 17.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.1f, 19.0f)
                arcToRelative(4.961f, 4.961f, 0.0f, false, false, 0.732f, 1.753f)
                lineToRelative(-0.783f, 0.783f)
                lineTo(2.464f, 22.95f)
                lineToRelative(0.783f, -0.783f)
                arcTo(4.961f, 4.961f, 0.0f, false, false, 5.0f, 22.9f)
                lineTo(5.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineTo(7.0f, 22.9f)
                arcToRelative(4.961f, 4.961f, 0.0f, false, false, 1.753f, -0.732f)
                lineToRelative(0.783f, 0.783f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.783f, -0.783f)
                arcTo(4.961f, 4.961f, 0.0f, false, false, 10.9f, 19.0f)
                lineTo(12.0f, 19.0f)
                lineTo(12.0f, 17.0f)
                lineTo(10.9f, 17.0f)
                arcTo(4.961f, 4.961f, 0.0f, false, false, 10.167f, 15.247f)
                close()
                moveTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 19.0f)
                close()
                moveTo(22.0f, 20.0f)
                curveToRelative(-0.138f, 5.275f, -7.862f, 5.273f, -8.0f, 0.0f)
                curveTo(14.138f, 14.725f, 21.862f, 14.727f, 22.0f, 20.0f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(2.333f)
                lineToRelative(-1.793f, 2.392f)
                arcToRelative(6.056f, 6.056f, 0.0f, false, false, -8.514f, 0.1f)
                curveTo(12.165f, 9.847f, 3.976f, 7.962f, 0.0f, 12.721f)
                lineTo(0.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 8.0f)
                lineTo(18.0f, 8.0f)
                lineTo(18.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 24.0f, 11.0f)
                close()
                moveTo(14.3f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 0.0f)
                lineTo(8.892f, 0.0f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, true, 2.544f, 1.41f)
                close()
            }
        }
        .build()
        return _tractor!!
    }

private var _tractor: ImageVector? = null

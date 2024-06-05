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

public val Icons.Outline.GrinSquintTears: ImageVector
    get() {
        if (_grinSquintTears != null) {
            return _grinSquintTears!!
        }
        _grinSquintTears = Builder(name = "GrinSquintTears", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.167f, 17.662f)
                arcToRelative(21.9f, 21.9f, 0.0f, false, false, 4.95f, -3.536f)
                arcToRelative(21.962f, 21.962f, 0.0f, false, false, 3.54f, -4.954f)
                curveToRelative(1.178f, 2.047f, 1.649f, 5.416f, -0.707f, 7.778f)
                reflectiveCurveTo(11.214f, 18.839f, 9.167f, 17.662f)
                close()
                moveTo(11.006f, 4.818f)
                lineToRelative(-0.491f, 4.425f)
                lineToRelative(4.424f, -0.492f)
                lineToRelative(-0.221f, -1.987f)
                lineToRelative(-1.94f, 0.215f)
                lineToRelative(0.216f, -1.94f)
                close()
                moveTo(6.979f, 12.778f)
                lineTo(6.764f, 14.718f)
                lineTo(8.751f, 14.939f)
                lineTo(9.243f, 10.515f)
                lineTo(4.818f, 11.006f)
                lineTo(5.039f, 12.994f)
                close()
                moveTo(21.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                curveTo(19.9f, 5.0f, 16.54f, 7.0f, 16.54f, 7.0f)
                reflectiveCurveTo(19.9f, 9.0f, 21.0f, 9.0f)
                close()
                moveTo(5.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                curveToRelative(0.0f, -1.105f, -2.0f, -4.46f, -2.0f, -4.46f)
                reflectiveCurveTo(5.0f, 19.9f, 5.0f, 21.0f)
                close()
                moveTo(23.8f, 9.852f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, true, -1.864f, 1.027f)
                arcTo(10.117f, 10.117f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(10.117f, 10.117f, 0.0f, false, true, -1.121f, -0.067f)
                arcTo(3.994f, 3.994f, 0.0f, false, true, 9.852f, 23.8f)
                arcTo(11.954f, 11.954f, 0.0f, false, false, 23.8f, 9.852f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(9.926f, 9.926f, 0.0f, false, true, 5.935f, 1.971f)
                arcToRelative(12.14f, 12.14f, 0.0f, false, true, 2.137f, -0.825f)
                arcTo(11.98f, 11.98f, 0.0f, false, false, 3.146f, 20.072f)
                arcToRelative(12.14f, 12.14f, 0.0f, false, true, 0.825f, -2.137f)
                arcTo(9.98f, 9.98f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _grinSquintTears!!
    }

private var _grinSquintTears: ImageVector? = null

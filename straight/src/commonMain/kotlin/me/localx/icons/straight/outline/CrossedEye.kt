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

public val Icons.Outline.CrossedEye: ImageVector
    get() {
        if (_crossedEye != null) {
            return _crossedEye!!
        }
        _crossedEye = Builder(name = "CrossedEye", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.821f, 11.181f)
                verticalLineToRelative(0.0f)
                arcToRelative(15.736f, 15.736f, 0.0f, false, false, -4.145f, -5.44f)
                lineToRelative(3.032f, -3.032f)
                lineTo(21.293f, 1.293f)
                lineTo(18.0f, 4.583f)
                arcTo(11.783f, 11.783f, 0.0f, false, false, 12.0f, 3.0f)
                curveTo(4.5f, 3.0f, 1.057f, 9.261f, 0.179f, 11.181f)
                arcToRelative(1.969f, 1.969f, 0.0f, false, false, 0.0f, 1.64f)
                arcToRelative(15.736f, 15.736f, 0.0f, false, false, 4.145f, 5.44f)
                lineTo(1.293f, 21.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(6.0f, 19.417f)
                arcTo(11.783f, 11.783f, 0.0f, false, false, 12.0f, 21.0f)
                curveToRelative(7.5f, 0.0f, 10.943f, -6.261f, 11.821f, -8.181f)
                arcTo(1.968f, 1.968f, 0.0f, false, false, 23.821f, 11.181f)
                close()
                moveTo(2.0f, 12.011f)
                curveTo(2.75f, 10.366f, 5.693f, 5.0f, 12.0f, 5.0f)
                arcToRelative(9.847f, 9.847f, 0.0f, false, true, 4.518f, 1.068f)
                lineTo(14.753f, 7.833f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, false, -6.92f, 6.92f)
                lineTo(5.754f, 16.832f)
                arcTo(13.647f, 13.647f, 0.0f, false, true, 2.0f, 12.011f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                arcToRelative(2.951f, 2.951f, 0.0f, false, true, -1.285f, -0.3f)
                lineTo(14.7f, 10.715f)
                arcTo(2.951f, 2.951f, 0.0f, false, true, 15.0f, 12.0f)
                close()
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                arcToRelative(2.951f, 2.951f, 0.0f, false, true, 1.285f, 0.3f)
                lineTo(9.3f, 13.285f)
                arcTo(2.951f, 2.951f, 0.0f, false, true, 9.0f, 12.0f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(9.847f, 9.847f, 0.0f, false, true, -4.518f, -1.068f)
                lineToRelative(1.765f, -1.765f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, false, 6.92f, -6.92f)
                lineToRelative(2.078f, -2.078f)
                arcTo(13.584f, 13.584f, 0.0f, false, true, 22.0f, 12.0f)
                curveTo(21.236f, 13.657f, 18.292f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _crossedEye!!
    }

private var _crossedEye: ImageVector? = null

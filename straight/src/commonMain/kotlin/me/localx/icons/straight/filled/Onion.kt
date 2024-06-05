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

public val Icons.Filled.Onion: ImageVector
    get() {
        if (_onion != null) {
            return _onion!!
        }
        _onion = Builder(name = "Onion", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveToRelative(-1.239f, 0.0f, -2.0f, -2.912f, -2.0f, -5.0f)
                arcToRelative(13.443f, 13.443f, 0.0f, false, true, 2.0f, -7.354f)
                arcTo(13.451f, 13.451f, 0.0f, false, true, 14.0f, 15.0f)
                curveTo(14.0f, 17.088f, 13.239f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(15.0f, 3.237f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.233f)
                horizontalLineTo(9.0f)
                curveTo(7.329f, 5.715f, 5.0f, 9.6f, 5.0f, 13.0f)
                curveToRelative(0.0f, 2.548f, 1.749f, 4.473f, 3.559f, 5.654f)
                arcTo(12.379f, 12.379f, 0.0f, false, true, 8.0f, 15.0f)
                curveToRelative(0.0f, -6.341f, 3.158f, -9.572f, 3.293f, -9.707f)
                lineTo(12.0f, 4.586f)
                lineToRelative(0.707f, 0.707f)
                curveTo(12.842f, 5.428f, 16.0f, 8.659f, 16.0f, 15.0f)
                arcToRelative(12.379f, 12.379f, 0.0f, false, true, -0.559f, 3.654f)
                curveTo(17.251f, 17.473f, 19.0f, 15.548f, 19.0f, 13.0f)
                curveTo(19.0f, 9.6f, 16.67f, 5.719f, 15.0f, 3.237f)
                close()
                moveTo(24.0f, 13.0f)
                curveToRelative(0.0f, -4.285f, -2.937f, -6.862f, -5.593f, -8.324f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 21.0f, 13.0f)
                curveToRelative(0.0f, 5.6f, -6.251f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveToRelative(-9.0f, -3.4f, -9.0f, -9.0f)
                arcTo(18.133f, 18.133f, 0.0f, false, true, 5.609f, 4.648f)
                curveTo(2.948f, 6.1f, 0.0f, 8.676f, 0.0f, 13.0f)
                curveToRelative(0.0f, 4.523f, 4.038f, 7.981f, 9.581f, 8.441f)
                lineToRelative(-1.358f, 0.867f)
                lineToRelative(1.1f, 1.666f)
                lineTo(11.0f, 22.864f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(22.868f)
                lineTo(14.7f, 24.0f)
                lineToRelative(1.11f, -1.664f)
                lineToRelative(-1.392f, -0.894f)
                curveTo(20.058f, 21.0f, 24.0f, 17.525f, 24.0f, 13.0f)
                close()
            }
        }
        .build()
        return _onion!!
    }

private var _onion: ImageVector? = null

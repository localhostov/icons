package me.localx.icons.straight.bold

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

public val Icons.Bold.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 9.0f)
                horizontalLineTo(18.134f)
                lineTo(14.309f, 1.823f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.236f, 0.0f)
                horizontalLineToRelative(-4.8f)
                lineTo(9.181f, 9.0f)
                horizontalLineTo(7.017f)
                lineTo(4.892f, 7.285f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -4.5f, 0.661f)
                arcTo(2.848f, 2.848f, 0.0f, false, false, 0.355f, 10.79f)
                lineTo(3.575f, 17.0f)
                horizontalLineTo(9.187f)
                lineToRelative(-3.0f, 7.0f)
                horizontalLineToRelative(5.049f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.018f, -1.727f)
                lineTo(18.1f, 17.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 9.0f)
                close()
                moveTo(10.487f, 3.0f)
                horizontalLineToRelative(0.749f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.432f, 0.247f)
                lineTo(14.734f, 9.0f)
                horizontalLineTo(12.317f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineTo(16.569f)
                lineToRelative(-4.79f, 6.575f)
                lineToRelative(-0.1f, 0.164f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.439f, 0.261f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(3.0f, -7.0f)
                horizontalLineTo(5.391f)
                lineTo(3.13f, 9.719f)
                lineTo(5.957f, 12.0f)
                horizontalLineTo(20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null

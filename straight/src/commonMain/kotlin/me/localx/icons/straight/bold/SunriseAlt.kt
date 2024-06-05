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

public val Icons.Bold.SunriseAlt: ImageVector
    get() {
        if (_sunriseAlt != null) {
            return _sunriseAlt!!
        }
        _sunriseAlt = Builder(name = "SunriseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.938f, 21.0f)
                arcToRelative(7.949f, 7.949f, 0.0f, false, false, -1.126f, -3.191f)
                lineToRelative(2.947f, -2.947f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.852f, 2.852f)
                arcTo(7.967f, 7.967f, 0.0f, false, false, 13.5f, 14.142f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.142f)
                arcToRelative(7.967f, 7.967f, 0.0f, false, false, -3.286f, 1.451f)
                lineTo(4.362f, 12.741f)
                lineTo(2.241f, 14.862f)
                lineTo(5.188f, 17.81f)
                arcTo(7.939f, 7.939f, 0.0f, false, false, 4.062f, 21.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, 4.9f, 4.0f)
                horizontalLineTo(7.1f)
                arcTo(5.009f, 5.009f, 0.0f, false, true, 12.0f, 17.0f)
                close()
                moveTo(10.5f, 4.0f)
                horizontalLineTo(7.538f)
                lineTo(11.211f, 0.327f)
                arcToRelative(1.115f, 1.115f, 0.0f, false, true, 1.578f, 0.0f)
                lineTo(16.462f, 4.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _sunriseAlt!!
    }

private var _sunriseAlt: ImageVector? = null

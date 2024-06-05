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

public val Icons.Bold.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) {
            return _bookBookmark!!
        }
        _bookBookmark = Builder(name = "BookBookmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.794f, 0.0f, 1.0f, 1.794f, 1.0f, 4.0f)
                lineTo(1.0f, 20.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                lineTo(23.0f, 24.0f)
                lineTo(23.0f, 2.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.347f, 0.0f, -0.678f, 0.058f, -1.0f, 0.142f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(20.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(10.0f, 16.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 11.0f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.5f, 2.5f)
                lineTo(18.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null

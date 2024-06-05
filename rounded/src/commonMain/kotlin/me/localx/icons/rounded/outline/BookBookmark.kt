package me.localx.icons.rounded.outline

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

public val Icons.Outline.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) {
            return _bookBookmark!!
        }
        _bookBookmark = Builder(name = "BookBookmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(20.0f, 5.0f)
                verticalLineToRelative(11.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(12.0f, 10.347f)
                curveToRelative(0.0f, 0.623f, 0.791f, 0.89f, 1.169f, 0.395f)
                lineToRelative(1.331f, -1.743f)
                lineToRelative(1.331f, 1.743f)
                curveToRelative(0.378f, 0.495f, 1.169f, 0.228f, 1.169f, -0.395f)
                lineTo(17.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 2.184f)
                verticalLineToRelative(13.816f)
                curveToRelative(-0.732f, 0.0f, -1.409f, 0.212f, -2.0f, 0.556f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                close()
                moveTo(17.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-2.629f, -0.047f, -2.627f, -3.954f, 0.0f, -4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null

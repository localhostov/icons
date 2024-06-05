package me.localx.icons.rounded.bold

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

public val Icons.Bold.DiaryBookmarkDown: ImageVector
    get() {
        if (_diaryBookmarkDown != null) {
            return _diaryBookmarkDown!!
        }
        _diaryBookmarkDown = Builder(name = "DiaryBookmarkDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveTo(3.468f, 0.0f, 1.0f, 2.468f, 1.0f, 5.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.278f, 0.547f, 2.501f, 1.5f, 3.354f)
                curveToRelative(0.617f, 0.555f, 1.565f, 0.5f, 2.118f, -0.117f)
                curveToRelative(0.552f, -0.617f, 0.5f, -1.565f, -0.118f, -2.118f)
                curveToRelative(-0.322f, -0.288f, -0.5f, -0.686f, -0.5f, -1.118f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.347f)
                curveToRelative(0.0f, 0.623f, 0.791f, 0.89f, 1.169f, 0.395f)
                lineToRelative(1.331f, -1.743f)
                lineToRelative(1.331f, 1.743f)
                curveToRelative(0.378f, 0.495f, 1.169f, 0.228f, 1.169f, -0.395f)
                verticalLineToRelative(-5.347f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(23.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(4.0f, 15.257f)
                lineTo(4.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.526f, 0.0f, -1.031f, 0.091f, -1.5f, 0.257f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(-10.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(9.5f)
                close()
            }
        }
        .build()
        return _diaryBookmarkDown!!
    }

private var _diaryBookmarkDown: ImageVector? = null

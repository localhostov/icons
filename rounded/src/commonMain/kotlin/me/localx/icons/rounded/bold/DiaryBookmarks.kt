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

public val Icons.Bold.DiaryBookmarks: ImageVector
    get() {
        if (_diaryBookmarks != null) {
            return _diaryBookmarks!!
        }
        _diaryBookmarks = Builder(name = "DiaryBookmarks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.761f)
                curveToRelative(-1.01f, -1.221f, -2.535f, -2.0f, -4.239f, -2.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.864f, 0.0f, 5.224f, -2.201f, 5.477f, -5.0f)
                horizontalLineToRelative(0.523f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(19.0f, 5.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-10.0f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.526f, 0.0f, -1.031f, 0.091f, -1.5f, 0.257f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(16.5f, 21.0f)
                lineTo(4.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _diaryBookmarks!!
    }

private var _diaryBookmarks: ImageVector? = null

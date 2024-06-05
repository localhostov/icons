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

public val Icons.Outline.DiaryBookmarks: ImageVector
    get() {
        if (_diaryBookmarks != null) {
            return _diaryBookmarks!!
        }
        _diaryBookmarks = Builder(name = "DiaryBookmarks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.918f)
                curveToRelative(-0.773f, -1.764f, -2.536f, -3.0f, -4.582f, -3.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.414f, 0.0f, 4.435f, -1.721f, 4.899f, -4.0f)
                horizontalLineToRelative(0.601f)
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
                moveTo(20.0f, 5.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-12.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 2.172f)
                verticalLineToRelative(13.828f)
                curveToRelative(-0.728f, 0.0f, -1.411f, 0.196f, -2.0f, 0.537f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.304f, 0.836f, -2.415f, 2.0f, -2.828f)
                close()
                moveTo(17.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _diaryBookmarks!!
    }

private var _diaryBookmarks: ImageVector? = null

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

public val Icons.Outline.DiaryBookmarkDown: ImageVector
    get() {
        if (_diaryBookmarkDown != null) {
            return _diaryBookmarkDown!!
        }
        _diaryBookmarkDown = Builder(name = "DiaryBookmarkDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.137f, 0.486f, 2.224f, 1.333f, 2.981f)
                curveToRelative(0.412f, 0.368f, 1.044f, 0.335f, 1.412f, -0.078f)
                curveToRelative(0.368f, -0.411f, 0.333f, -1.044f, -0.078f, -1.412f)
                curveToRelative(-0.424f, -0.379f, -0.667f, -0.923f, -0.667f, -1.491f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(0.006f)
                lineToRelative(0.032f, 5.347f)
                curveToRelative(0.0f, 0.623f, 0.791f, 0.89f, 1.169f, 0.395f)
                lineToRelative(1.331f, -1.743f)
                lineToRelative(1.331f, 1.743f)
                curveToRelative(0.378f, 0.495f, 1.169f, 0.228f, 1.169f, -0.395f)
                lineToRelative(-0.032f, -5.347f)
                horizontalLineToRelative(8.994f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(4.0f, 16.537f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.304f, 0.836f, -2.415f, 2.0f, -2.828f)
                verticalLineToRelative(13.828f)
                curveToRelative(-0.728f, 0.0f, -1.411f, 0.196f, -2.0f, 0.537f)
                close()
                moveTo(8.0f, 16.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-12.0f)
                close()
            }
        }
        .build()
        return _diaryBookmarkDown!!
    }

private var _diaryBookmarkDown: ImageVector? = null

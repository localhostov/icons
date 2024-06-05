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

public val Icons.Filled.DiaryBookmarkDown: ImageVector
    get() {
        if (_diaryBookmarkDown != null) {
            return _diaryBookmarkDown!!
        }
        _diaryBookmarkDown = Builder(name = "DiaryBookmarkDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(15.765f)
                curveToRelative(0.549f, -0.494f, 1.262f, -0.766f, 2.0f, -0.765f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(15.0f, 24.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(20.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(14.0f)
                lineTo(22.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _diaryBookmarkDown!!
    }

private var _diaryBookmarkDown: ImageVector? = null

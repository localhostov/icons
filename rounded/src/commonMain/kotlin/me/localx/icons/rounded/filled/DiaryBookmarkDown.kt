package me.localx.icons.rounded.filled

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
                moveToRelative(13.0f, 18.0f)
                lineToRelative(0.038f, 5.348f)
                curveToRelative(0.0f, 0.623f, -0.791f, 0.89f, -1.169f, 0.395f)
                lineToRelative(-1.331f, -1.743f)
                lineToRelative(-1.331f, 1.743f)
                curveToRelative(-0.378f, 0.495f, -1.169f, 0.228f, -1.169f, -0.395f)
                lineToRelative(-0.038f, -5.348f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 0.1f)
                curveTo(3.672f, 0.575f, 2.0f, 2.624f, 2.0f, 5.0f)
                verticalLineToRelative(12.025f)
                curveToRelative(0.699f, -0.527f, 1.525f, -0.86f, 2.395f, -0.964f)
                curveToRelative(0.199f, -0.041f, 0.402f, -0.061f, 0.605f, -0.061f)
                close()
                moveTo(6.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(17.0f, 0.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(14.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(15.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _diaryBookmarkDown!!
    }

private var _diaryBookmarkDown: ImageVector? = null

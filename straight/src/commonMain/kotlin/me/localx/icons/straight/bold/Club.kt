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

public val Icons.Bold.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, false, -5.25f, -5.923f)
                arcTo(5.115f, 5.115f, 0.0f, false, false, 18.0f, 5.5f)
                curveTo(18.0f, 2.313f, 15.477f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(6.0f, 2.313f, 6.0f, 5.5f)
                arcToRelative(5.115f, 5.115f, 0.0f, false, false, 0.25f, 1.577f)
                arcTo(6.09f, 6.09f, 0.0f, false, false, 1.0f, 13.0f)
                arcToRelative(6.136f, 6.136f, 0.0f, false, false, 6.25f, 6.0f)
                arcToRelative(6.247f, 6.247f, 0.0f, false, false, 3.293f, -0.954f)
                curveTo(9.793f, 20.282f, 9.0f, 21.0f, 5.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                curveToRelative(-4.0f, 0.0f, -4.793f, -0.718f, -5.543f, -2.954f)
                arcTo(6.247f, 6.247f, 0.0f, false, false, 16.75f, 19.0f)
                arcTo(6.136f, 6.136f, 0.0f, false, false, 23.0f, 13.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.822f, 0.0f, 3.0f, 0.981f, 3.0f, 2.5f)
                curveToRelative(0.0f, 0.962f, -0.668f, 1.885f, -1.987f, 2.743f)
                lineToRelative(0.0f, 0.0f)
                arcTo(8.341f, 8.341f, 0.0f, false, false, 12.0f, 9.1f)
                arcToRelative(8.341f, 8.341f, 0.0f, false, false, -1.015f, -0.858f)
                lineToRelative(0.0f, 0.0f)
                curveTo(9.668f, 7.385f, 9.0f, 6.462f, 9.0f, 5.5f)
                curveTo(9.0f, 3.981f, 10.178f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(7.25f, 16.0f)
                arcTo(3.136f, 3.136f, 0.0f, false, true, 4.0f, 13.0f)
                arcToRelative(3.136f, 3.136f, 0.0f, false, true, 3.25f, -3.0f)
                curveTo(9.0f, 10.0f, 10.7f, 12.219f, 10.7f, 12.229f)
                lineToRelative(0.455f, 0.779f)
                lineToRelative(-0.451f, 0.757f)
                curveTo(10.693f, 13.786f, 9.35f, 16.0f, 7.25f, 16.0f)
                close()
                moveTo(13.3f, 13.771f)
                lineToRelative(-0.455f, -0.779f)
                lineToRelative(0.451f, -0.757f)
                curveTo(13.3f, 12.222f, 15.0f, 10.0f, 16.75f, 10.0f)
                arcTo(3.136f, 3.136f, 0.0f, false, true, 20.0f, 13.0f)
                arcToRelative(3.136f, 3.136f, 0.0f, false, true, -3.25f, 3.0f)
                curveTo(14.65f, 16.0f, 13.307f, 13.786f, 13.3f, 13.771f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null

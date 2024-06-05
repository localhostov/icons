package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Following: ImageVector
    get() {
        if (_following != null) {
            return _following!!
        }
        _following = Builder(name = "Following", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                horizontalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(19.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 11.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 2.0f, 6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 8.0f, 12.0f)
                close()
                moveTo(8.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 5.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 7.417f)
                arcTo(2.37f, 2.37f, 0.0f, false, false, 19.5f, 9.892f)
                arcToRelative(2.37f, 2.37f, 0.0f, false, false, -2.25f, -2.475f)
                arcTo(2.37f, 2.37f, 0.0f, false, false, 15.0f, 9.892f)
                curveToRelative(0.0f, 2.592f, 4.5f, 5.775f, 4.5f, 5.775f)
                reflectiveCurveTo(24.0f, 12.484f, 24.0f, 9.892f)
                arcTo(2.37f, 2.37f, 0.0f, false, false, 21.75f, 7.417f)
                close()
            }
        }
        .build()
        return _following!!
    }

private var _following: ImageVector? = null

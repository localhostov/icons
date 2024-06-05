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

public val Icons.Filled.RankingPodiumEmpty: ImageVector
    get() {
        if (_rankingPodiumEmpty != null) {
            return _rankingPodiumEmpty!!
        }
        _rankingPodiumEmpty = Builder(name = "RankingPodiumEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(4.5f, 9.0f)
                horizontalLineToRelative(-2.5f)
                curveTo(0.895f, 9.0f, 0.0f, 9.895f, 0.0f, 11.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.5f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _rankingPodiumEmpty!!
    }

private var _rankingPodiumEmpty: ImageVector? = null

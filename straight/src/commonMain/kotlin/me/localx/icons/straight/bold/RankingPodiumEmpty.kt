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

public val Icons.Bold.RankingPodiumEmpty: ImageVector
    get() {
        if (_rankingPodiumEmpty != null) {
            return _rankingPodiumEmpty!!
        }
        _rankingPodiumEmpty = Builder(name = "RankingPodiumEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 9.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(10.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 6.0f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _rankingPodiumEmpty!!
    }

private var _rankingPodiumEmpty: ImageVector? = null

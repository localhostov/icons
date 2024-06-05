package me.localx.icons.straight.outline

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

public val Icons.Outline.RankingPodiumEmpty: ImageVector
    get() {
        if (_rankingPodiumEmpty != null) {
            return _rankingPodiumEmpty!!
        }
        _rankingPodiumEmpty = Builder(name = "RankingPodiumEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 11.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.171f, 0.0f, -0.338f, 0.018f, -0.5f, 0.051f)
                verticalLineToRelative(-5.551f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(3.551f)
                curveToRelative(-0.162f, -0.033f, -0.329f, -0.051f, -0.5f, -0.051f)
                lineTo(2.5f, 9.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.0f, 11.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(9.0f, 5.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 5.5f)
                close()
                moveTo(22.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }
        .build()
        return _rankingPodiumEmpty!!
    }

private var _rankingPodiumEmpty: ImageVector? = null

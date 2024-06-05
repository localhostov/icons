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

public val Icons.Filled.RankingPodium: ImageVector
    get() {
        if (_rankingPodium != null) {
            return _rankingPodium!!
        }
        _rankingPodium = Builder(name = "RankingPodium", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.427f, 3.971f)
                lineToRelative(-1.437f, -1.391f)
                lineToRelative(2.499f, -2.58f)
                horizontalLineToRelative(1.51f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.62f)
                lineToRelative(-0.573f, 0.591f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(-2.405f)
                curveToRelative(1.145f, -0.65f, 2.405f, -1.485f, 2.405f, -3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(0.0f, 4.346f, 0.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.484f, -0.944f, 1.012f, -1.702f, 1.435f)
                curveToRelative(-1.077f, 0.601f, -2.298f, 1.282f, -2.298f, 2.565f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 11.5f)
                curveToRelative(0.0f, -0.72f, -0.306f, -1.369f, -0.794f, -1.825f)
                curveToRelative(0.187f, -0.35f, 0.294f, -0.75f, 0.294f, -1.175f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                close()
                moveTo(22.0f, 16.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(4.5f, 13.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.5f, 9.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _rankingPodium!!
    }

private var _rankingPodium: ImageVector? = null

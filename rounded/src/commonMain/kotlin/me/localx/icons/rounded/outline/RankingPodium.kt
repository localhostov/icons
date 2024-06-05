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

public val Icons.Outline.RankingPodium: ImageVector
    get() {
        if (_rankingPodium != null) {
            return _rankingPodium!!
        }
        _rankingPodium = Builder(name = "RankingPodium", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 16.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.0f, 12.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(2.0f, 20.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(22.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.0f, 11.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.424f, -0.107f, 0.824f, -0.294f, 1.175f)
                curveToRelative(0.488f, 0.456f, 0.794f, 1.105f, 0.794f, 1.825f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                close()
                moveTo(4.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.364f, -1.267f, 2.275f, -2.538f, 3.0f)
                horizontalLineToRelative(1.538f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(1.608f, 11.0f)
                curveToRelative(-0.765f, 0.0f, -1.376f, -0.416f, -1.557f, -1.06f)
                curveToRelative(-0.188f, -0.669f, 0.138f, -1.374f, 0.83f, -1.795f)
                curveToRelative(0.25f, -0.152f, 0.552f, -0.315f, 0.876f, -0.49f)
                curveToRelative(0.555f, -0.3f, 2.243f, -1.211f, 2.243f, -1.655f)
                close()
                moveTo(9.293f, 3.08f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.242f, -1.242f)
                curveToRelative(0.415f, -0.414f, 1.033f, -0.536f, 1.574f, -0.312f)
                curveToRelative(0.542f, 0.225f, 0.891f, 0.748f, 0.891f, 1.334f)
                verticalLineToRelative(5.555f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(11.0f, 2.787f)
                lineToRelative(-0.293f, 0.293f)
                curveToRelative(-0.39f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _rankingPodium!!
    }

private var _rankingPodium: ImageVector? = null

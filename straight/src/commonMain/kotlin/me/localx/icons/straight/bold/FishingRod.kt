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

public val Icons.Bold.FishingRod: ImageVector
    get() {
        if (_fishingRod != null) {
            return _fishingRod!!
        }
        _fishingRod = Builder(name = "FishingRod", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.834f, 22.683f)
                lineToRelative(0.166f, 1.317f)
                lineToRelative(-3.5f, -1.167f)
                lineToRelative(-3.5f, 1.167f)
                lineToRelative(0.166f, -1.317f)
                curveToRelative(0.188f, -1.492f, 1.09f, -2.723f, 1.795f, -3.479f)
                curveToRelative(-0.939f, -1.069f, -1.96f, -2.631f, -1.96f, -4.371f)
                curveToRelative(0.0f, -3.222f, 3.5f, -5.833f, 3.5f, -5.833f)
                curveToRelative(0.0f, 0.0f, 3.5f, 2.612f, 3.5f, 5.833f)
                curveToRelative(0.0f, 1.74f, -1.021f, 3.302f, -1.96f, 4.371f)
                curveToRelative(0.705f, 0.756f, 1.607f, 1.987f, 1.795f, 3.479f)
                close()
                moveTo(10.0f, 15.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                curveToRelative(-0.345f, 0.0f, -0.68f, -0.044f, -1.0f, -0.127f)
                verticalLineToRelative(2.627f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.88f, 0.457f, -1.654f, 1.146f, -2.1f)
                curveTo(1.915f, 6.787f, 5.996f, 0.0f, 19.5f, 0.0f)
                horizontalLineToRelative(1.5f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 3.031f)
                curveToRelative(-7.413f, 0.314f, -11.831f, 3.017f, -13.375f, 8.212f)
                curveToRelative(0.429f, -0.157f, 0.892f, -0.243f, 1.375f, -0.243f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(7.5f, 15.0f)
                curveToRelative(0.0f, -0.828f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _fishingRod!!
    }

private var _fishingRod: ImageVector? = null

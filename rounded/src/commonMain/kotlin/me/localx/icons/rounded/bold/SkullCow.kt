package me.localx.icons.rounded.bold

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

public val Icons.Bold.SkullCow: ImageVector
    get() {
        if (_skullCow != null) {
            return _skullCow!!
        }
        _skullCow = Builder(name = "SkullCow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.855f, 2.144f)
                curveToRelative(-0.777f, 1.637f, -2.402f, 2.715f, -4.196f, 2.833f)
                lineToRelative(2.075f, 5.501f)
                curveToRelative(0.759f, 2.165f, -0.202f, 4.535f, -2.223f, 5.546f)
                curveToRelative(-0.057f, 0.028f, -1.721f, 0.614f, -1.721f, 0.614f)
                lineToRelative(-0.985f, 4.596f)
                curveToRelative(-0.343f, 1.603f, -1.782f, 2.767f, -3.423f, 2.767f)
                horizontalLineToRelative(-2.766f)
                curveToRelative(-1.639f, 0.0f, -3.078f, -1.163f, -3.422f, -2.767f)
                lineToRelative(-0.984f, -4.596f)
                reflectiveCurveToRelative(-1.666f, -0.586f, -1.723f, -0.614f)
                curveToRelative(-2.02f, -1.011f, -2.98f, -3.381f, -2.234f, -5.513f)
                lineToRelative(2.087f, -5.534f)
                curveToRelative(-1.794f, -0.118f, -3.418f, -1.196f, -4.195f, -2.833f)
                curveTo(-0.21f, 1.396f, 0.108f, 0.5f, 0.856f, 0.145f)
                curveToRelative(0.75f, -0.354f, 1.644f, -0.035f, 1.999f, 0.712f)
                curveToRelative(0.33f, 0.694f, 1.04f, 1.144f, 1.808f, 1.144f)
                horizontalLineToRelative(14.674f)
                curveToRelative(0.769f, 0.0f, 1.479f, -0.449f, 1.808f, -1.144f)
                curveToRelative(0.356f, -0.747f, 1.251f, -1.066f, 1.999f, -0.712f)
                curveToRelative(0.748f, 0.355f, 1.066f, 1.251f, 0.712f, 1.999f)
                close()
                moveTo(18.915f, 11.502f)
                lineToRelative(-2.452f, -6.502f)
                lineTo(7.537f, 5.0f)
                lineToRelative(-2.465f, 6.536f)
                curveToRelative(-0.228f, 0.653f, 0.062f, 1.411f, 0.688f, 1.767f)
                lineToRelative(1.705f, 0.596f)
                curveToRelative(0.817f, 0.286f, 1.438f, 0.989f, 1.62f, 1.835f)
                lineToRelative(1.044f, 4.871f)
                curveToRelative(0.049f, 0.229f, 0.255f, 0.396f, 0.489f, 0.396f)
                horizontalLineToRelative(2.766f)
                curveToRelative(0.234f, 0.0f, 0.44f, -0.166f, 0.489f, -0.395f)
                lineToRelative(1.044f, -4.871f)
                curveToRelative(0.179f, -0.844f, 0.8f, -1.549f, 1.618f, -1.836f)
                lineToRelative(1.706f, -0.596f)
                curveToRelative(0.625f, -0.355f, 0.915f, -1.115f, 0.675f, -1.801f)
                close()
            }
        }
        .build()
        return _skullCow!!
    }

private var _skullCow: ImageVector? = null
